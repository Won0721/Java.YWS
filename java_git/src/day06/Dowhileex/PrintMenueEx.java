package day06.Dowhileex;

import java.util.Scanner;

public class PrintMenueEx {
	public static void main(String[] args) {
		// 다음과 같은 메뉴를 출력하고 프로그램 종료를 선택하기 전 까지 반복적으로 실행되는 코드를 작성
		/* Menu
		 * 1. Start
		 * 2. Save
		 * 3. Exit
		 * Select Menu :
		 */
		Scanner sc = new Scanner(System.in);
		int menu;
		// 입력받은 메뉴가 3이 아니면 반복
		do { // 메뉴 출력 및 메뉴 입력
			System.out.println("Menu");
			System.out.println("1. Start");
			System.out.println("2. Save");
			System.out.println("3. Exit");
			System.out.print("Select Menu : ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Program Start");
				break;
			case 2:
				System.out.println("Program Save");
			case 3:
				System.out.println("Program Exit");
	
			}
			
		}while(menu != 3);
		
	}

}
