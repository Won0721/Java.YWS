package day15.practice;

import java.util.Scanner;

import day15.practice.vo.Customer;
import day15.practice.vo.Product;
import day15.practice.vo.Sales;

public class ShopManager {

	private Scanner sc = new Scanner(System.in);
	private Product list[] = new Product[10];//제품 리스트
	private int count = 0;//저장된 제품 개수
	private Customer[] customerList = new Customer[10];
	private int customerCount = 0; // 저장된 고객 수
	private Sales[] salesHistroy = new Sales[100]; // 판매기록
	private int salesCount = 0; // 기록된 판매수
	private int totalPrice; // 매출금액
	
	
	public void run() {
		System.out.println("프로그램 시작!!");
		
		int menu = -1;
		final int EXIT = 8;
		//반복 : 선택한 메뉴가 종료가 아닐때
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 선택
			menu = sc.nextInt();
			
			//선택한 메뉴에 따른 기능을 실행
			runMenu(menu);
			
		}while(menu != EXIT);
		System.out.println("프로그램 종료!!");
	}
	
	private void printMenu() {
		System.out.println("================");
		System.out.println("메뉴");
		System.out.println("1. 제품 판매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 조회");
		System.out.println("4. 매출 조회");
		System.out.println("5. 고객 등록");
		System.out.println("6. 등록 고객 삭제");
		System.out.println("7. 등록 고객 조회");
		System.out.println("8. 프로그램 종료");
		System.out.print("메뉴 선택 : ");
	}
	
	private void runMenu(int menu) {
		System.out.println("================");
		
		switch(menu) {
		case 1:	sell(); break;
		case 2: store(); break;
		case 3:	printProduct(); break;
		case 4:	printSales(); break;
		case 5:	registerCustomer(); break;
		case 6:	deleteCustomer(); break;
		case 7: return;
		default: System.out.println("잘못된 메뉴!");
		}
	}
	
	private void printCustomer() {
		for(int i=0; i<customerCount; i++) {
			customerList[i].print();
		}
	}

	private void registerCustomer() {
		System.out.print("등록할 고객 명 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("등록할 휴대전화 번호 : ");
		String phoneNumber = sc.next();
		
		for(int i=0; i< customerCount; i++) {
			if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
					System.out.println("이미 등록된 고객입니다.");
					return;
			}			
		}
		// 이미 등록된 전화번호면 등록 X
		// 새 전화번호면 등록 
		customerList[customerCount++] = new Customer(name, phoneNumber);
		
	}
	private void deleteCustomer() {
		System.out.print("휴대전화 번호 : ");
		String phoneNumber = sc.next();
		int index = indexOfCustomer(phoneNumber);
		if(index == -1) {
			System.out.println("등록 고객이 아닙니다.");
			return;
		}
		
		for(int i= index; i<customerCount; i++) {
			customerList[index] = customerList[index + 1];
		}
		customerCount--;
		customerList[customerCount] = null;
		System.out.println("삭제 완료");
	
	}

	private void printSales() {
		System.out.println("1. 매출 내역 ");
		System.out.println("2. 누적 매출액 ");
		int num = sc.nextInt();
		
		switch(num){
			case 1: for(int i=0; i<salesCount; i++) {
				salesHistroy[i].print();} break;
			case 2: System.out.println("====================");
				System.out.println("누적 매출액 : " + totalPrice);
				System.out.println("===================="); break;		
		}
	
		
		
	}

	private void printProduct() {
		// 검색할 제품을 입력
		System.out.print("제품명 : ");
		sc.nextLine();// 엔터. 이전 입력에서 엔터를 쳤기 때문에 엔터 제거
		String name = sc.nextLine();
		
		int index = indexOf(name);
		// 입력한 검색어에 맞는 제품을 출력
		// 등록된 제품들 중에 검색어와 일치하는 제품이 어디있는지 확인
		// 제품이 있으면 제품 정보를 출력
		if(index>=0) {
			list[index].print();		
			return;
		}
		
		// 없으면 없는 제품이라고 출력
		System.out.println("없는 제품!");
	}

	private void store() {
		
		//입고할 제품명 입력
		System.out.print("제품명 : ");
		sc.nextLine();
		String name = sc.nextLine();
		int index = indexOf(name);
		
		//입고할 제품 수량
		System.out.print("수량  : ");
		int amount = sc.nextInt();
		
		if(amount < 0) {
			System.out.println("입고 수량 오류!");
			return;
		}
		
		//제품 리스트에서 입고할 제품명이 있는지 찾음
		//제품 배열에 있는 제품명과 입고할 제품명이 같은지를
		//확인해서 같으면 위치를 기억

		
		//있으면 입고할 제품 수량 만큼 해당 제품에 입고
		//위치가 0이상이면 
		if(index != -1) {
			list[index].store(amount);
			System.out.println("입고 완료!");
			return;
		}
		//없으면 제품 리스트에 제품 정보를 추가(입고할 수량도 함께)
		//위치가 -1이면
		//최대치로 등록되어 있으면
		if(count == list.length) {
			System.out.println("제품 리스트 다참!");
			return;
		}
		//모델명 입력
		System.out.println("새 제품 등록");
		System.out.print("모델명 : ");
		sc.nextLine();
		String modelName = sc.nextLine();
		//가격을 입력
		System.out.print("가격  : ");
		int price = sc.nextInt();
		//분류 입력
		System.out.print("분류  : ");
		String category = sc.next();
		
		//제품 리스트에 추가
		list[count++] = new Product(name, modelName, price, amount, category);
		
		System.out.println("제품 추가 후 입고 완료!");
	}

	/**제품 리스트에 제품명과 일치하는 제품이 있으면 번지를, 없으면
	 * -1을 알려주는 메서드
	 * 매개변수 : 제품명 => String name
	 * 리턴타입 : 제품이 있는 번지나 -1 => 정수 => int
	 * 메서드명 : indexOf
	 * */
	public int indexOf(String name) {
		for(int i = 0; i < count ; i++) {
			if(list[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexOfCustomer(String phoneNumber) {
		for(int i= 0; i< customerCount; i++) {
			if(customerList[i].getPhoneNumber().equals(phoneNumber)) {
				return i;
			}
		}
		return -1;
	}
	
	private void sell() {
		// 제품명 입력
		System.out.print("제품명 : ");
		sc.nextLine();
		String name= sc.nextLine();
		int index = indexOf(name);
		if(indexOf(name) > 0) {
			System.out.println("제품명 오류 !");
			return;
		}
		// 제품 개수 입력
		System.out.print("제품 수량");
		int amount = sc.nextInt();
		
		if(amount < 0) {
			System.out.println("제품 수량 오류!");
			return;
		}
		
		
		// 고객 정보 입력
		System.out.print("휴대폰 번호 : ");
		String phoneNumber = sc.next();
		int customerIndex= indexOfCustomer(phoneNumber);
		if(indexOfCustomer(phoneNumber) < 0) {
			System.out.println("전화번호 오류 !");
			return;
		}
		// 제품 정보
		Product product = new Product(list[index]);
		
		// 판매 내역에 추가
		
		
		Sales sales = new Sales(customerList[customerIndex], list[index]);
		salesHistroy[salesCount++] = sales;
		
		
		// 판매된 개수만큼 재고량에서 빼줘야함
		list[index].release(amount);
		
		// 매출금액을 추가
		totalPrice += list[index].getPrice() * amount;
		
	}
}

