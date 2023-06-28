package day21.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Controller {
	private Scanner sc = new Scanner(System.in);
	private ArrayList<Player> playerList = new ArrayList<>();
	
	
	
	
	public void run() {
		int sel = 0;
		do {
			try {
				print();
				sel = sc.nextInt();
				runMenu(sel);				
			}catch(Exception e) {
				System.out.println("오류발생");
			}
			
		}while(sel !=3);
		
	}
	
	
	public void print() {
		System.out.println("======[menu]======");
		System.out.println("1. 게임 시작");
		System.out.println("2. 기록 확인");
		System.out.println("3. 게임 종료");
		
		System.out.print("메뉴 선택 >>>");
	}
	
	
	public void runMenu(int num) {
		switch(num) {
		case 1: play(); break;
		case 2: record(); break;
		case 3: System.out.println("게임을 종료합니다."); break;
		default : System.out.println("숫자 오입력");
		}
	}
	// 1. 게임시작 
	public void play() {
		int r = (int) (Math.random()*(10)+1);
		System.out.println("정답 : " + r);
		int count = 1;
		System.out.println("======[play]======");
		System.out.println("숫자 맞추기 게임 시작");
	
		int num = 0;
		do {	
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if(num > r) {
				System.out.println("-----[Down]-----");
				count++;
			}
			else if(num < r) {
				System.out.println("-----[Up]-----");
				count++;
			}
			else if(num == r) {
				System.out.println("================");
				System.out.println("정답!");
				System.out.println("================");
				
				if(playerList.size() >= 5 && playerList.get(4).getChanllege() <= count) {
					return;
				}

				String name = "";
				System.out.println("[기록 저장]");

				
				do {
					System.out.print("유저 이름 : ");
					name = sc.next();
					
				}while(check(name) != 1);

				playerList.add(new Player(name, count));
				System.out.println("======저장완료======");
				
				// 정렬기능 방법 1.
				
				playerList.sort(new Comparator<Player>() {
					
					public int compare(Player p1, Player p2) {
						return p1.getChanllege() - p2.getChanllege();
					}
				});
				
			}
		}
		while(num!=r);

	}
	
	// 2. 기록확인
	public void record() {
		System.out.println();
		System.out.println("======[record]======");
		System.out.println();
		if(playerList.size() == 0) {
			System.out.println("기록 결과가 없습니다.");
			System.out.println();
			return;
		}
		//정렬기능 방법 2.
		//Collections.sort(playerList);
		printRecord();
		

	}
	public void printRecord() {
		System.out.println("  [아이디]\t[도전횟수]");
		System.out.println();
		for(int i=0; i<playerList.size(); i++) {
			System.out.print(i+1 + ".");
			playerList.get(i).print();
			if(i==4) {
				return;
			}
		}
		
	}
	
	// 이름 중복체크
	public int check(String name) {
		for(int i=0; i<playerList.size(); i++) {
			if(playerList.get(i).getName().equals(name)) {
				System.out.println("이미 등록된 유저이름 입니다.");
				System.out.println("등록된 이름으로 기록을 갱신 하시겠습니까? Y/N");
				char ch = sc.next().charAt(0);
				if(ch == 'Y') {
					playerList.remove(i);
					return 1;
				}
				else {
					return -1;
				}
			}
		}
		return 1;
	}

}

class Player implements Comparable<Player>{
	private String name;
	private int chanllege;
	
	
	
	public Player(String name, int chanllege) {
		this.name = name;
		this.chanllege = chanllege;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChanllege() {
		return chanllege;
	}
	public void setChanllege(int chanllege) {
		this.chanllege = chanllege;
	}
	
	public void print() {
		System.out.println(" "+ name + "\t" + chanllege +"번");
	}
	
	
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", chanllege=" + chanllege + "]";
	}
	@Override
	public int compareTo(Player player) {
		if(player.chanllege < chanllege) {
			return 1;
		}
		else if(player.chanllege > chanllege) {
			return -1;
		}
		return 0;
	}
	
	
}
