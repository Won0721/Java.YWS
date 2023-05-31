package fist;

import java.util.Random;
import java.util.Scanner;

public class PR2 {
	public static void main(String[] args) {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	// 1부터 50 사이의 수 1개를 임의로 뽑음
	int num = 25;
	int randomNumber = r.nextInt(num)+1;
	
	int n;
	int v=10;
	// 입력값 횟수
	int count=0;

	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	System.out.println(" 	 업다운 게임을 시작하겠습니다.");
	System.out.println(" 	   기회는 총 10번 입니다.  ");
	System.out.println("   임의의 숫자는 1부터 "+num+" 사이의 숫자입니다." );
	System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	
	while(true) {
		
		count++;
		System.out.println("남은 기회 : "+ v );
		v--;
		System.out.print("생각하고 계시는 숫자를 입력해주세요 : ");
		
		n =sc.nextInt();
		if(n>randomNumber) {
			System.out.print("오답! ");
			System.out.println("Down!");
			
		
		}
	
		else if(n<randomNumber) {
			System.out.print("오답! ");
			System.out.println("Up!");
				
		}
		else {
			System.out.println(count + " 회 만에 정답.");
			break;
		}
		
		if(v==0) {
			System.out.println("기회 10번 소진... 게임 종료!");
			break;
		}
	
	}
	
	
	
	
	
	
	
	
	}
}
