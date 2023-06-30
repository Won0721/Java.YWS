package day22.practice.phoneList.controller;

import java.util.Scanner;

import day22.practice.phoneList.vo.Phone;
import day22.practice.phoneList.vo.PhoneBook;

public class Test implements Program {
	private Scanner sc = new Scanner(System.in);
	private final static int EXIT = 0;
	private PhoneBook pb = new PhoneBook();
	@Override
	public void run() {
		int menu;
		do {
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			
		}while(menu != EXIT);
		
	}

	@Override
	public void printMenu() {
		System.out.println("1. 전화번호 추가");
		System.out.println("2. 전화번호 수정");
		System.out.println("3. 전화번호 출력");
		System.out.println("0. 종료");
		
	}

	@Override
	public void runMenu(int menu) {

		switch(menu) {
		case 1: insert();

			break;
		case 2: update();

			break;
			
		case 3: serach();

			break;
		case 0: System.out.println("종료");
			break;
		default : System.out.println("오입력");
		}
	}

	private void serach() {
		
		System.out.println("name : ");
		String name = sc.next();
		pb.print(s -> s.getName().contains(name));
		
		// pb.print(s-> true) 전체 출력
	}

	private void update() {
		System.out.println("1. 이름 수정");
		System.out.println("2. 번호 수정");
		System.out.println("3. 전체 수정");
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1: name();break;
		case 2: phone(); break;
		case 3: all(); break;
		}
		
		
	}

	private void all() {
		System.out.println("이름 검색");
		String name = sc.next();
		
		System.out.println("이름 수정");
		String updateName = sc.next();
		System.out.println("번호 수정");
		String updatePhone = sc.next();
		if(pb.update(name, updateName, updatePhone)) {
			System.out.println("Success");
			
		}
		else {
			System.out.println("fail");
		}
	
		
		
	}

	private void phone() {
		System.out.println("이름 검색");
		String name = sc.next();
		
		System.out.println("번호 수정");
		String updatePhone = sc.next();
		
		if(pb.updateNumber(name, updatePhone)) {
			System.out.println("Success");
			
		}
		else {
			System.out.println("fail");
		}

		
	}

	private void name() {
		System.out.println("이름 검색");
		String name = sc.next();
		
		System.out.println("이름 수정");
		String updateName = sc.next();
		
		if(pb.updateName(name, updateName)) {
			System.out.println("Success");
			
		}
		else {
			System.out.println("fail");
		}
		
	}

	private void insert() {
		// 이름과 전화번호 입력 받음
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("phone : ");
		String phone = sc.next();
		if(pb.insert(name, phone)) {
			System.out.println("Insert Success");
		}
		else {
			System.out.println("Insert Fail");
		}
		
		
		
		// 전화번호부에 추가를 해서 성공하면 성공
		// 실패하면 실패했다고 출력
		
	}

}
