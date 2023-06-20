package day15.practice.test;

import java.util.Scanner;

public class Shop {
	/* 1 .제품 판매 : 어떤 고객이 어떤 제품을 구매했는지 관리
	 * 2. 제품 입고 : 새 제품이 추가됨, 어떤 제품이 몇개 추가됐는지 관리
	 * 3. 제품 조회 : 제품 정보 조회, 제품명으로 제품을 조회
	 * 4. 매출 조회 : 판매된 제품 매출 조회. 누적 매출
	 * 
	 */
	private Scanner sc = new Scanner(System.in);
	private Product[] productList; // 제품여러개를 관리하는 배열
	private int productListCount;  // 입고된 제품들의 종류
	private int moneyAccount;		// 매출액
	
	private Product[] sellProductList;  // 판매한거 배열 순서
	private int sellproductListCount;
	
	private Customer[] customer;
	private int customerCount;
	
	private final int MAX = 10; // 저장 가능한 제품의 수 
	public Shop() {
		productList = new Product[MAX];
		sellProductList = new Product[MAX];
	}

	public  void run() {
		int sel;
		System.out.println("상품 판매 관리 프로그램 ");
		do {
			runMenu();
			sel = sc.nextInt();
			
			switch(sel) {
			case 1: sellProduct(); break;
			case 2: addProduct(); break;
			case 3: printProduct(); break;
			case 4: print(); break;
			case 5: addCustomer(); break;
			default :System.out.println("======================="); 
				System.out.println("잘못된 숫자입력 ");
			break;
			}
			
			
		}while(true);
	}
	
	void runMenu() {
		System.out.println("=======================");
		System.out.println("1. 제품 판매");
		System.out.println("2. 제품 입고");
		System.out.println("3. 제품 조회");
		System.out.println("4. 매출 조회");
		System.out.println("5. 고객정보 등록");
		System.out.println("=======================");
		System.out.print("메뉴 입력 >> ");
	}
	
	// 1. 제품 판매
	void sellProduct() {
		System.out.println("[제품 판매]");
		if(productListCount == 0) {
			System.out.println("=======================");
			System.out.println("현재 남아있는 재고가 없습니다.");
			return;
		}
		sc.nextLine();
		
		System.out.print("판매할 제품 : ");
		String name = sc.nextLine();
		int index = indexOf(name);
		
	
		if(productList[index].getProductCount() == 0) {
			System.out.println("재고 소진, 발주 필요! ");
			for(int i=index; i< productListCount-1; i++) {
				productList[index] = productList[index+1];
			}
			productListCount--;
			productList[productListCount] = null;
		}
		
		else {
			System.out.print("판매할 개수 : ");
			int sellCount = sc.nextInt();
			productList[index].sell(sellCount);
			System.out.println("=======================");
			System.out.println("판매 완료");
			System.out.println("판매한 제품명 : " + productList[index].getName() );
			System.out.println("판매한 개수 : " + sellCount);
			System.out.println("총 판매 금액 : " + productList[index].getPrice() * sellCount);
			Product p = new Product(plist[index]);
			p.setProductCount(sellCount);
			
			sellProductList[index].store(sellCount);
			
			moneyAccount += sellCount * productList[index].getPrice();
		}
		
	}
	
	// 2. 제품 입고
	void addProduct(){
		sc.nextLine();
		System.out.println("=======================");
		System.out.println("[2. 제품 입고]");
		System.out.print("입고할 제품명 : ");
		String name = sc.nextLine();
		int index = indexOf(name);
		
		
		if(index == -1) {
			System.out.println("=======================");
			System.out.println("등록 이력 없음");
			System.out.println("=======================");
			System.out.println("제품 신규 등록 ");
			System.out.print("입고할 제품의 개수 : ");
			int count = sc.nextInt();
			System.out.print("입고할 제품의 가격 : ");
			int price = sc.nextInt();
			
			productList[productListCount++] = new Product(name, count, price);	
			sellProductList[sellproductListCount++] = new Product(name,price);
		}
		else {
			System.out.println("=======================");
			System.out.println("등록되어있는 제품입니다.");
			System.out.println("=======================");
			System.out.print("입고할 제품의 개수 : ");
			int count = sc.nextInt();
			productList[index].store(count);
		}
			
		
		
	}
	
	
	// 3. 제품 조회 기능
	void printProduct() {
		System.out.println("[제품 조회]");
		if(productListCount>0) {
			sc.nextLine();
			System.out.print("조회 할 제품명 :");
			String name = sc.nextLine();	
			
			if(productList[indexOf(name)].getName().equals(name)) {
				productList[indexOf(name)].info();
			}
			else {
				System.out.println("현재 입력하신 제품은 없는 제품입니다.");
			}
			
		}
		else {
			System.out.println("현재 남아있는 제품이 없습니다.");
		}
	}
	// 
	
	// 4. 매출 조회
	
	void print() {
		System.out.println("=======================");
		System.out.println("[매출 조회]");
		System.out.println("1.판매된 제품 매출 조회");
		System.out.println("2.누적 매출");
		System.out.println("=======================");
		int choice = sc.nextInt();
		
		switch(choice){
		case 1: printSellProduct(); break;
		case 2: printAccount(); break;
		}
		
	}
	public void printSellProduct() {
		System.out.print("조회할 상품 : ");
		String name = sc.nextLine();
		int index = indexOf(name);
		System.out.println("========================");
		System.out.print("판매 제품 : " + sellProductList[index].getName());
		System.out.print("판매 수량 : " + sellProductList[index].getProductCount());
		System.out.print("총 판매 금액 : " + sellProductList[index].getProductCount() * sellProductList[index].getPrice());

	}
	
	public void printAccount() {
		System.out.println("========================");
		System.out.println("누적 매출 : " + moneyAccount);
	
	}
	
	public int indexOf(String name) {
		for(int i=0; i< productListCount; i++) {
			if(productList[i].getName().equals(name)){
				return i;
			}
		}
		return -1;
	}
	
	// 5. 고객등록 기능
	public void addCustomer() {
		System.out.print("등록할 고객명 :");
		String name = sc.next();
		sc.nextLine();
		System.out.print("휴대전화 번호 입력 :");
		String tel = sc.nextLine();
		
		customer[customerCount++] = new Customer(name, tel);
		System.out.println("고객 등록 완료");
	}
}


