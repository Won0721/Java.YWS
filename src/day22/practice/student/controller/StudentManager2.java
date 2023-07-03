package day22.practice.student.controller;

import java.io.Serial;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import day22.practice.vo.Student;

public class StudentManager2 implements Program {
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
		int menu = 0;
		do { 
			try {
				printMenu();
				menu = sc.nextInt();
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("스캐너 입력 오류 예외처리");
			}catch(Exception e) {
				System.out.println("오류 예외처리");
			}
			
		}while(menu != EXIT);
		
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
	public void runMenu(int menu) {
		int grade = 1, classNum = 1, num = 1;
		switch(menu){
		case 1 :
			print(s->true); break;
			
		// 검색할 학년 입력
		case 2 :
			System.out.println("grade : ");
			final int grade1 = sc.nextInt();
			
			print(s-> s.getGrade() == grade1); break;
		
		//검색할 학년, 반, 번호 입력
		case 3 : 
		
		final int grade2 = sc.nextInt();
		final int classNum2 = sc.nextInt();
		final int num2 = sc.nextInt();
		
		print(s -> s.equals(new Student(grade2, classNum2, num2, ""))); break;
		case 5 : System.out.println("프로그램 종료"); break;
		default : System.out.println("오입력");
		}
		
	}
	
	private void print(Predicate<Student> p) {
		for(Student tmp : list) {
			if(p.test(tmp))
				System.out.println(tmp);
		}
		}
	}