package day27.student.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import day27.student.vo.Attendance;
import day27.student.vo.Student;

public class Controller {
	List<Student> studentList = new ArrayList<>();
	List<Attendance> AttendList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	public void run() {
		int menu = 0;
		do {
			try {
				printMenu();
				menu = sc.nextInt();
				runMenu(menu);
			}catch(Exception e) {
				System.out.println("예외처리");
			}
		}while(menu != 4);
		
	}
	
	
	public void printMenu() {
		System.out.println("1. 학생등록");
		System.out.println("2. 출석"); // 
		System.out.println("3. 출석부 확인"); // 누적 출석 조회
		System.out.println("4. 종료");
	}
	
	public void runMenu(int menu) {
		
		switch(menu) {
		case 1: break; // 1. 학생등록
		case 2: break;
		case 3: break;
		case 4: break;
		default : 
			System.out.println("오입력");
		}
		
	}
	// 1
	public void insert() {
		System.out.print("학번 :");
		int num = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		studentList.add(new Student(num, name));
		Student st = new Student(num, name);
		boolean check = false;
		Attendance tmp = new Attendance(st,check);
		AttendList.add(tmp);
	}
	
	// 2. 출석
	public void attend() {
		System.out.print("학번 :");
		int num = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		Student st = new Student(num, name);
		boolean check = false;
		Attendance tmp = new Attendance(st,check);
		AttendList.add(tmp);	// 출첵한 학생 리스트에 추가 
		int index = AttendList.indexOf(tmp); // 출첵한 학생 찾기
		AttendList.get(index).attend(); // 출석체크
	
			
		
	}
	
	// 3 
	public void printDate() {
		
	}

}
