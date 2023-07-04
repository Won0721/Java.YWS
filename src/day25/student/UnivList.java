package day25.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UnivList implements Program {
	private List<Student> uniList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	final int EXIT = 3;
	
	public void run() {
		int sel = 0;
		do {
			print();
			sel = sc.nextInt();
			runMenu(sel);
			
			
		}while(sel != EXIT);
		
	}
	
	
	public void print() {
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 확인");
		System.out.println("3. 종료");
	}
	
	public void runMenu(int num) {
		switch(num) {
		case 1 : insert(); break;
		case 2 : check(); break;
		case 3 : exit(); break;
		default : 
			System.err.println("오입력");
		}
		
		
	}
	
	
	public void insert() {
		System.out.print("학번 : ");
		int grade = sc.nextInt();
		System.out.print("학과 : ");
		sc.nextLine();
		String major = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.next();
		
		uniList.add(new Student(grade, major, name));
	}
	
	public void check() {
		
		System.out.print("학번 : ");
		int grade = sc.nextInt();
		System.out.print("학과 : ");
		sc.nextLine();
		String major = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.next();
		Stream<Student> st = uniList.stream();
		long count = st.filter(s -> s.getName().equals(name) && s.getGrade() == grade && s.getMajor().equals(major)).count();
		Stream<Student> st1 = uniList.stream();
		if(count !=0) {
			st1.filter(s -> s.getName().equals(name) && s.getGrade() == grade && s.getMajor().equals(major))
			.forEach(s -> System.out.println(s));
			
		}else {
			System.out.println("없는 학생");
		}
		
		
		   
		
//		if(contains(grade, major, name)) {
//			System.out.println("있는 학생");
//			return;
//		}
//		System.out.println("없는 학생");
		
	}
	
	
	public boolean contains(int grade, String major, String name) {
		for(Student i : uniList) {
			if(i.getGrade() == grade && i.getMajor() == major && i.getName() == name) {
				return true;
			}
		}
		return false;
	}
	
	public void exit() {
		System.out.println("시스템 종료");
		
	}
	

}
