package day5.practice;

import java.util.Scanner;

public class PrintMenuEx {
	public static void main(String[] args) {
		// 메뉴를 출력하는 예제
		/* 반복횟수 : menu가 3이 아닐때까지
		 * 규칙성 :
		 * -메뉴를 출력
		 * -메뉴를 입력
		 * -입력받은 메뉴에 따라 콘솔에 출력
		 * 	  - 입력받은 메뉴가 1이면 Program Satrt
		 */
		
		Scanner sc = new Scanner(System.in);
	
		int SelectNum =0;

		while(SelectNum != 3) {
		System.out.println("Menu");
		System.out.println("1. Start");
		System.out.println("2. Save");
		System.out.println("3. Exit");
		
		System.out.print("Select Menu : ");
		SelectNum = sc.nextInt();
			switch (SelectNum) {
			case 1: System.out.println("Program Strat !"); break;
			case 2:	System.out.println("Program Save !"); break;
			case 3:	System.out.println("Program Exit !"); break;
			}
			
		
		}
		
	
	}

}
