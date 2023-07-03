package day22.practice.phoneList.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import day22.practice.phoneList.vo.Phone;

public class PhoneManagement implements Program{
	/* 전화번호를 관리하는 프로그램
	 * 1. 전화번호 등록
	 * 2. 전화번호 수정
	 * 3. 전화번호 검색
	 * 4. 프로그램 종료
	 */
	private ArrayList<Phone> phoneList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	List<Phone> list = (List<Phone>) phoneList;
	

	@Override
	public void run() {
		int menu = 0;
		do {
			try {
				printMenu();
				menu = sc.nextInt();
				runMenu(menu);
				
				
			}catch(InputMismatchException e) {
				System.out.println("입력 오류 발생");
				sc.nextLine();
			}catch(Exception e ) {
				System.out.println("어떤오류인가요?");
			}
	
			
		}while(menu != 5);
		
	}

	@Override
	public void printMenu() {
		System.out.println("1. 전화번호 등록");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 검색");
		System.out.println("4. 프로그램 종료");
	}

	@Override
	public void runMenu(int menu) {
	
		switch(menu) {
		case 1: insert(); break;
		case 2: update(); break;
		case 3: search(); break;
		case 4: System.out.println("종료"); break;
		default : System.out.println("오입력");
		}
	}
	
	public void insert() {
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("휴대폰 번호 : ");
		String phone = sc.nextLine();
		
		if(checkPhone(phone) == -1) {
			phoneList.add(new Phone(name, phone));
			System.out.println("저장 완료");
			return;
		}
		else {
			System.out.println("저장되어 있는 번호");
			System.out.println("업데이트 Y/N");
			char ch = sc.next().charAt(0);
			
			if(ch == 'Y') {
				phoneList.remove(checkPhone(phone));
				phoneList.add(new Phone(name, phone));
				System.out.println("업데이트 완료");
				return;
			}	
			
			
		}

		
		
	}
	
	public void update() {
		if(phoneList.size() == 0) {
			System.out.println("저장된 연락처 없음");
			return;
		}
		
		
		System.out.print("이름 : ");
		String name = sc.next();
		sc.nextLine();
		System.out.print("휴대폰 번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("이름 변경 : ");
		String updateName = sc.next();
		sc.nextLine();
		System.out.print("휴대폰 번호 변경 : ");
		String updatePhone = sc.nextLine();
		
		if(checkPhone(updatePhone) == -1) {	
			phoneList.get(checkPhone(name)).setName(updateName);
			phoneList.get(checkPhone(phone)).setPhoneNumber(updatePhone);
			return;
		}
		System.out.println("저장 되어있는 휴대폰 번호");
		

	}
	
	public void search() {
		
		if(phoneList.size() == 0) {
			System.out.println("저장된 연락처 없음");
			return;
		}
		int sel = 0;
		System.out.println("1. 휴대폰번호 검색");
		System.out.println("2. 이름 검색");
		sel = sc.nextInt();
		
		switch(sel) {
		case 1: searchPhone(); break;
		case 2: searchName();
		case 3: 
			break;
		default : System.out.println("오입력");
		}
		
	}
	
	public void searchName() {
		sc.nextLine();
		System.out.println("이름 검색 :");
		String name = sc.next();
		
		int index = checkName(name);
		if(index != -1) {
			System.out.println("이름\t휴대폰번호");	
			phoneList.get(index).print();
			return;
		}
		System.out.println("검색 결과 없음");
	}
	

	
	public void searchPhone() {
		sc.nextLine();
		System.out.println("휴대폰 번호 검색 : ");
		String phone = sc.nextLine();
		int index = checkPhone(phone);
		if(checkPhone(phone) != -1) {
			System.out.println("이름\t휴대폰번호");	
			phoneList.get(index).print();
			return;
		}
		System.out.println("검색 결과 없음");

	}
	
	// 중복 휴대폰번호 찾기
	
	public int checkName(String name) {
		for(int i=0; i<phoneList.size(); i++) {
			if(phoneList.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;

	}
	public int checkPhone(String phoneNumber) {
		// 번호 있으면 i 없으면 -1
		for(int i=0; i<phoneList.size(); i++) {
			if(phoneList.get(i).getPhoneNumber().equals(phoneNumber)) {
				return i;
			}
		}
		return -1;

	}
	
	public void print() {
		System.out.println("=======================");
		System.out.println("이름/t휴대폰번호");		
		for(Phone s : phoneList) {
			s.print();
		}
	}
	
	
	
	
	

}
