package day16.drink;

import java.util.Scanner;

public class Machine {
	private Drink[] drinkList;
	private int listCount;
	private int totalMoney;
	private Scanner sc = new Scanner(System.in);
	
	
	// 머신의 음료수 종류의 개수를 먼저 설정한 뒤 음료수의 인자를 하나씩 생성해서 자판기로 넣는(InsertDrinkIntoMachine) 방법
	public Machine(int num) {
		drinkList = new Drink[num];
		listCount = 0 ;
	}
	
	// 기본생성자 생성 후 set() 메서드를 통해 바로 생성하는 방법
/*	public Machine() {}
	public void set(int num) {
		drinkList = new Drink[num];
		listCount = 0;
		Coke coke = new Coke("콜라",3500);
		Cider sider = new Cider("사이다", 2500);
		Fanta fanta = new Fanta("환타", 2000);
		InsertDrinkIntoMachine(coke);
		InsertDrinkIntoMachine(sider);
		InsertDrinkIntoMachine(fanta);
	}*/
	
	public void run() {
		System.out.println("음료수 자판기 프로그램 시작");
		selectMenuPrint();
	}
	// 자판기에 들일 음료수 종류의 개수를 설정
	// 자판기에 들일 음료수의 종류를 넣을때마다 1 증가
	public void InsertDrinkIntoMachine(Drink drinklist) {
		drinkList[listCount] = drinklist;
		listCount++;
	}

	// 자판기 관리메뉴
	public void menu() {
		System.out.println("====================");
		System.out.println("이용하실 메뉴를 선택해 주세요");
		System.out.println("1. 음료수 구매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 재고 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("====================");	
		System.out.print("메뉴 선택 >>>");	
		}
	
	// 자판기 관리메뉴 선택 
	public void selectMenuPrint() {
		int sel = 0 ;
		do {
			menu();
			sel = sc.nextInt();
			switch(sel) {
			case 1: drinkPrint(); break;
			case 2: addDrink(); break;
			case 3: printAll(); break;
			case 4: exit(); break;
			default : error(); break;
			}
		}while(sel != 4);
	}
	
	// 1. 음료수 구매 메뉴
	public void drinkPrint() {
		System.out.print("지불할 금액을 입력해주세요 :");
		int payingMoney = sc.nextInt();
		if(payingMoney < big()){
			System.out.println("음료수의 최소 금액은 " + big() + "원 입니다.");
			System.out.println("금액이 "+ (big() - payingMoney) + "원 부족합니다.");
			return;
		}
		System.out.println("====================");
		System.out.println("[음료수 선택]");
		System.out.println("1. "+ drinkList[0].getName() +"(" + drinkList[0].getMoney()+")");
		System.out.println("2. " + drinkList[1].getName()+ "(" + drinkList[1].getMoney()+")");
		System.out.println("3. "+drinkList[2].getName() + "(" + drinkList[2].getMoney()+")");
		System.out.println("====================");
		System.out.print("메뉴 선택 >>>");
		int choice = sc.nextInt();
		
	
		
		buying(payingMoney, choice);
	}
	
	// 음료수 구매 희망 시
	public void buying(int payingMoney, int choice) {
		System.out.print("구매할 수량 : ");
		int account = sc.nextInt();
		if(payingMoney < drinkList[choice-1].getMoney() * account) {
			System.out.println("금액 부족");
			return;
		}
		drinkList[choice-1].release(account);
		totalMoney = drinkList[choice-1].getMoney() * account;
		change(choice, account, payingMoney);
	}
	
	// 2. 음료수 입고
	public void addDrink() {
		System.out.println("====================");
		System.out.println("[입고할 음료수 선택]");
		System.out.printf("1. %d\n",drinkList[0].getName());
		System.out.printf("2. %d\n",drinkList[1].getName());
		System.out.printf("3. %d\n",drinkList[2].getName());
		System.out.println("====================");
		int choice = sc.nextInt();
		
		if(!(choice < 1 && choice > 3 )) {
			error();
			return;
		}
		System.out.print("입고할 수량 :");
		int amount = sc.nextInt();
		drinkList[choice-1].add(amount);
		drinkList[choice-1].print();
		
	}
	// 3. 재고 상황
	public void printAll() {
		for(int i=0; i<listCount; i++) {
			drinkList[i].print();
		}
	}
	
	// 잔돈 
	public void change(int choice, int account, int payingMoney) {
		int lastMoney = payingMoney - drinkList[choice-1].getMoney() * account;
		if(lastMoney == 0) {
			System.out.println("금액에 맞게 현금을 넣어 잔돈반환이 없습니다.");
			return;
		}
		System.out.println("반환 금액 : " + lastMoney );
	}
	
	// 4. 프로그램 종료
	public void exit() {
		System.out.println("프로그램 종료!");
	}
	
	// 버튼 오입력 시 출력문
	public void error() {
		System.out.println("오입력");
	}
	
	public int big() {
		int a = Math.max(drinkList[0].getMoney(),drinkList[1].getMoney());
		int b = Math.max(drinkList[1].getMoney(),drinkList[2].getMoney());
		
		return Math.max(a, b);
	}
	
}
