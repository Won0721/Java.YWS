package day16.homework;

import java.util.Scanner;

public class MachineManagement {
	private int totalAmount; // 매출액
	private Drink[] drinkList = new Drink[3];
	private Scanner sc = new Scanner(System.in);
	// 1. 금액 투입
	
	
	
	public void Run() {
		start();
	}
	
	// 초기에 자판기 설정
	public void setDrinkList() {
		drinkList[0] = new Drink("콜라",2000);
		drinkList[1] = new Drink("사이다",1500);
		drinkList[2] = new Drink("환타", 1300);
		
		for(int i=0; i<3; i++) {
			drinkList[i].add(10);
		}
	} 
	
	// 프로그램 메뉴얼
	public void menuPrint() {
		System.out.println("============");	
		System.out.println("이용하실 메뉴를 선택해 주세요");
		System.out.println("1. 음료수 구매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 프로그램 종료");
		System.out.println("============");	
		System.out.println("메뉴 선택 >>>");
	}
	
	// 프로그램 메뉴얼
	public void menu() {
		int sel;
		do {
			menuPrint();
			sel = sc.nextInt();
			switch(sel) {
				case 1: choiceMenu(); break;
				case 2: addDrink(); break;
				case 3: exit(); break;
				default : error(); break;
			}
		}while(sel != 3);
	}
	
	// 2. 메뉴 선택
	public void choiceMenu() {
		System.out.print("금액을 넣어주세요 :");
		int money = sc.nextInt();
		System.out.println("====================");
		System.out.println("음료수 선택");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 환타");
		System.out.println("====================");
		System.out.print("메뉴 선택 >>>");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: coke(money); break;
		case 2: cider(money); break;
		case 3: fanta(money); break;
		default : error();
		}
			
		
	}
	
	// 잔돈
	public void change(int change) {
		if(change ==0) {
			System.out.println("반환되는 잔액 없음.");
			return;
		}
		System.out.println("잔돈 : " + change);
	}
	
	
	// 음료수 선택 : 콜라 구매
	public void coke(int money) {
		System.out.print("출고 수량 : ");
		int acount = sc.nextInt();
		if(money < drinkList[0].getMoney() * acount) {
			System.out.println("금액 부족");
			return;
		}
		drinkList[0].release(acount);
		totalAmount += drinkList[0].getMoney() * acount;	
		
		int lastmoney = money - drinkList[0].getMoney() * acount;
		change(lastmoney);
	}

	// 음료수 선택 :사이다 구매
	public void cider(int money) {
		System.out.print("출고 수량 : ");
		int acount = sc.nextInt();
		if(money < drinkList[1].getMoney() * acount) {
			System.out.println("금액 부족");
			return;
		}
		drinkList[1].release(acount);
		totalAmount += drinkList[1].getMoney() * acount;	
		int lastmoney = money - drinkList[1].getMoney() * acount;
		change(lastmoney);
	}
	
	// 음료수 선택 : 환타 구매
	public void fanta(int money) {
		System.out.print("출고 수량 : ");
		int acount = sc.nextInt();
		if(money < drinkList[2].getMoney() * acount) {
			System.out.println("금액 부족");
			return;
		}
		drinkList[2].release(acount);
		totalAmount += drinkList[2].getMoney() * acount;	
		int lastmoney = money - drinkList[2].getMoney() * acount;
		change(lastmoney);
	}
	
	// 입고
	public void addDrink() {
		System.out.print("입고할 제품 : ");
		String menu = sc.next();
		int index = indexOf(menu);
		
		if(!drinkList[index].getName().equals(menu)) {
			error();
			return;
		}
		
		System.out.print("수량 : ");
		int amount = sc.nextInt();
		drinkList[index].add(amount);
		System.out.printf("%s 의 남은 수량 : %d 개 \n" , drinkList[index].getName(), drinkList[index].getAmount());
	}
	
	// 프로그램 종료
	public void exit() {
		System.out.println("프로그램을 종료 합니다.");
	}
	
	// 실행
	public void start() {
		System.out.println("프로그램을 실행합니다.");
		setDrinkList();
		menu();
	}
	
	// 에러
	public void error() {
		System.out.println("메뉴 오입력");
	}
	
	public int indexOf(String name){
		for(int i=0; i<3; i++) {
			drinkList[i].getName().equals(name);
			return i;
		}	
		return -1;
	
	}
	

	
	
	
	
	

}
