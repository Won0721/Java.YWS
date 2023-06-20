package day15.practice;

import java.util.Scanner;

import day15.practice.vo.Product;

public class ShopManager {
	
	private Scanner sc = new Scanner(System.in);
	private Product[] productList = new Product[10];
	private int productListCount;
	public void run() {
		System.out.println("프로그램을 시작합니다.");
		
		// 반복 : 선택한 메뉴가 종료가 아닐 때
		
		int menu = -1;
		final int EXIT = 6;
		System.out.println("프로그램 가동 중 ");
		do {
			// 메뉴 출력
			printMenu();
			
			// 메뉴 선택
			menu = 1;
			// 선택한 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("프로그램 종료");
	}
	
	private void printMenu() {
		System.out.println("===============");
		System.out.println("메뉴입니다.");
		System.out.println("1. 제품 판매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 조회");
		System.out.println("4. 매출 조회");
		System.out.println("5. 고객 등록");
		System.out.println("6. 프로그램 종료");
		System.out.println("메뉴 선택 ");
	}
	private void runMenu(int menu) {
		System.out.println("===============");
		System.out.println(menu+"를 선택");
		
		switch(menu) {
		case 1: System.out.println("제품 판매 기능 구현");
		break;
		case 2: store();
			break;
		case 3:
			break;
		case 4: 
			break;
		case 5:
			break;
		case 6:
			break;
		default :
		}
		
	}
	
	private void store() {
		System.out.println("입고하실 제품 이름 : ");
		String name = sc.nextLine();
		System.out.println("입고하실 제품 모델명 : ");
		String name2 = sc.next();
		System.out.println("입고하실 제품 가격 : ");
		System.out.println("입고하실 제품 수량 : ");
		System.out.println("입고하실 제품 분류 : ");
		productList[productListCount].store(num);
		
	}
	
}
