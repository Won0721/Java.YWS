package day21.practice;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LottoControl extends Thread {
	private Scanner sc = new Scanner(System.in);
	private HashSet<Integer> user = new HashSet<>();
	private HashSet<Integer> lotto = new HashSet<>();
	public void run() {
		
		do {
			
			lotto(1,45);
			printMenu();
		}
		while(true);
		
	}
	public void print() {
			Iterator<Integer> it = lotto.iterator();
			while(it.hasNext()) {
				try {
					Integer tmp = it.next();
					Thread.sleep(1000);
					System.out.print(tmp + " ");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
	}
	
	public void printMenu() {
		System.out.println("로또 프로그램입니다.");
		System.out.print("당첨 번호를 입력해주세요 :");
		int count;
		for(int i=0; i<6; i++) {
			count = sc.nextInt();
			if(count > 45 || count < 1) {
				i--;
				System.out.println("1~45 사이의 수만 입력 가능");
				sc.nextLine();
				return;
			}
			else {
				user.add(count);				
			}
		}
		if(user.size() != 6) {
			System.out.println("6개의 숫자가 입력되지 않았습니다.");
			return;
		}
		System.out.print("보너스 번호 입력 : ");
		int bonus = sc.nextInt();

		System.out.println("============");
		System.out.println("[로또 번호 공개]");
		print();
		
		System.out.println("============");
		System.out.println("[결과]");
		
		switch(check(lotto,user)) {
		case 6: System.out.println("1등"); break;
		case 5: 
		if(lotto.contains(bonus)) {
			System.out.println("2등");
			break;
		}
		else {
			System.out.println("3등");
			break;
		}
		case 4: System.out.println("4등");break;
		default : System.out.println("꽝");
		
		}

	}
	
	public void lotto(int max, int min) {
		if(min > max) {
			int tmp = max;
			max = min;
			min = max;
		}
	
		while(lotto.size() < 6 ) {
			int r = (int) (Math.random()*((max - min + 1) + min));
			lotto.add(r);
		}
	}
	
	public int check(HashSet<Integer>lotto, HashSet<Integer>user) {
		
		int count = 0 ;
		
		for(int tmp : user) {
			if(lotto.contains(tmp)) {
				count++;
			}
		}
		return count;
	}
}
