package day22.practice.controller;

import java.io.Serial;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import day22.practice.vo.Student;

public class StudentManager implements Program {
	private Scanner sc = new Scanner(System.in);
	private List<Student> list = Arrays.asList(
			// 학년 반 번호 이름
			new Student(1, 1, 1, "Hong"),
			new Student(1, 1, 2, "Kim"),
			new Student(2, 1, 1, "Lee"),
			new Student(2, 1, 1, "Bang"),
			new Student(3, 2, 2, "KKK")
		);
	private static final int EXIT = 5;
	
	
	/* 학생 정보를 출력하는 기능 구현
	 * 1. 학생 전체 출력
	 * 2. 학생 학년 출력
	 * 3. 학생 검색 출력
	 * 4. 종료
	 */
	
	@Override
	public void run() {
		int sel = 0;
		do { 
			try {
				printMenu();
				sel = sc.nextInt();
				runMenu(sel);
			}catch(InputMismatchException e) {
				System.out.println("스캐너 입력 오류 예외처리");
			}catch(Exception e) {
				System.out.println("오류 예외처리");
			}
			
		}while(sel != EXIT);
		
	}

	@Override
	public void printMenu() {
		System.out.println("==================");
		System.out.println("1. 학생 전체 출력");
		System.out.println("2. 학생 학년 출력");
		System.out.println("3. 학생 검색 출력");
		System.out.println("4. 학생 디테일 검색");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 >>> ");
	}
	@Override
	public void runMenu(int num) {
		switch(num){
		case 1 : printStudent(); break;
		// 검색할 학년 입력
		case 2 : searchGrade(); break;
		
		//검색할 학년, 반, 번호 입력
		case 3 : searchName(); break;
		case 4 : searchDetail(); break;
		case 5 : System.out.println("프로그램 종료"); break;
		default : System.out.println("오입력");
		}
		
	}
	
	public void printStudent() {
		System.out.println();
		System.out.println("학년\t반\t출석번호\t이름");
		
	
		
		for(int i=0; i < list.size(); i++) {
			list.get(i).print();
		}
	}
	
	public void searchGrade() {
		System.out.print("검색할 학년 : ");
		int grade = sc.nextInt();
		printgrade(grade);
		
		/* for(Student i : list){
		 * 		if(i.getGrade == grade){
		 * 	 		프린트 
		 * 		}
		 * }
		 * 
		 */
	}
	
	public void printgrade(int grade) {
		System.out.println("학년\t반\t출석번호\t이름");
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).getGrade() == grade) {
				list.get(i).print();	
			}	
		}
		
		/* for(Stduent tmp : list){
		 * 		if(grade == tmp.getGrade()
		 * 			&& classNum == tmp.getClassNum()
		 * 			&& num == tmp.getNum() ){  프린트(tmp)  
		 * }
		 * 
		 */
	}
	
	public void searchDetail() {
		System.out.println("학년 반 번호 입력");
		int grade = sc.nextInt();
		int classNum= sc.nextInt();
		int num = sc.nextInt();
		String name = sc.next();
		Student search = new Student(grade, classNum, num, name);
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).equals(search)) {
				System.out.println("존재합니다.");
				return;
			}
		}
		System.out.println("없는 학생입니다.");
		search = null;
	}
	
	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		printName(name);
	}
	
	
	public void printName(String name) {

		System.out.println("학년\t반\t출석번호\t이름");
		for(int i=0; i< list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).print();	
			}	
		}
	}

}
