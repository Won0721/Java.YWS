package day02;

import java.util.Scanner;

public class Day7_CafeTest {
// 1. 카페프로그램 (무한반복, 문자열배열)
//	 1) 알고리즘 작성하기
//	 2) 알고리즘 토대로 코드 구현하기
//	키오스크 1. 주문하기 2. 취소하기 3. 결제하기 4. 끝내기 구현 
//  메뉴  1. 아메리카노 3800원 , 2. 에스프레소 2400원 , 3. 카페라떼 4200원 , 4. 밀크티 5100원
// 1. 주문가능한 메뉴를 출력, 
//	주문받을 메뉴를 입력받는다,
//	주문한 메뉴의 가격을 총 금액에 누적한다, 
//	주문한 메뉴를 전체 메뉴리스트에 포함한다, 
//	주문한 개수를 한개 증가한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; // 주문개수 누적
		String orderList[] = new String[5];	// 주문은 총 5개까지 가능
		int total = 0; // 주문금액 누적
		while(true) {
			System.out.println("☆★☆★☆★카페☆★☆★☆★");
			System.out.println("1. 주문하기");
			System.out.println("2. 취소하기");
			System.out.println("3. 결제하기");
			System.out.println("4. 끝내기");
			System.out.print("입력:");
			int num=sc.nextInt();
			if(num==1) {	// 주문하기 코드
				String menuName="";
				int menuPrice;
				System.out.println("1. 아메리카노\t3800원");
				System.out.println("2. 에스프레소\t2400원");
				System.out.println("3. 카페라떼\t4200원");
				System.out.println("4. 밀크티\t\t5100원");
				System.out.print("주문할 메뉴번호:");
				int menuNum=sc.nextInt();
				if(menuNum==1) {
					menuName="아메리카노";
					menuPrice = 3800;
				}
				else if(menuNum==2) {
					menuName = "에스프레소";
					menuPrice = 2400;	
				}
				else if(menuNum==3) {
					menuName = "카페라떼";
					menuPrice = 4200;	
				}
				else if(menuNum==4) {
					menuName = "밀크티";
					menuPrice = 5100;			
				}
				else {
					System.out.println("잘못 입력하셨습니다.");
					continue; // 반복의 처음으로 돌아가라
				}
				total += menuPrice;
				orderList[count] = menuName;
				count++;
				System.out.println("주문한 메뉴는 " + menuName +"입니다");
				System.out.println("가격은 " + menuPrice + "원 입니다.");
				
			}
			else if (num ==2) { // 취소하기 코드
				System.out.println("----주문한 메뉴 리스트----");
				for(int i=0; i<count; i++) {
					System.out.println((i+1) + ":" + orderList[i]);
				}
				System.out.print("취소할 메뉴 번호:");
				int cancelNum = sc.nextInt();
				if(1<=cancelNum && cancelNum<=count) {
					String delMenu = orderList[cancelNum-1];
					System.out.println(delMenu + " 메뉴 삭제!");
					for(int i = cancelNum-1; i<count; i++) { // 중간에 삭제한 메뉴가 있으면 그걸 주문메뉴리스트를 앞으로 땡겨오는 작업
						orderList[i] = orderList[i+1];
					}
					if(delMenu.equals("아메리카노")) {
						total -=3800;
					}
					else if(delMenu.equals("에스프레소")){
						total -= 2400;
					}
					else if(delMenu.equals("카페라떼")){
						total -= 4200;
					}
					else if(delMenu.equals("밀크티")){
						total -= 5100;
					}
					count--;
				} 
				
					
			}
			else if (num ==3) {	// 결제하기
				System.out.println("결제할 금액"+total+"원");
				System.out.println("지불할 금액:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("잔액이 부족합니다.");
					continue;
				}
				else {
					System.out.println("잔돈은 "+(money-total)+"입니다.");
					total =0;
					for(int i=0; i<5; i++) {
						orderList[i] = "";
					}
					count = 0;
					
				}
			}
			else if (num ==4) {
				System.out.println("반복종료!");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
