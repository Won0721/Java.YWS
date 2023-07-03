package day22.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import day22.practice.vo.Student;

public class StudentManager3 {
	private Scanner sc = new Scanner(System.in);
	private List<Student> list = Arrays.asList(
			// 학년 반 번호 이름
			new Student(1, 1, 1, "Hong"),
			new Student(1, 1, 2, "Kim"),
			new Student(2, 1, 1, "Lee"),
			new Student(2, 1, 1, "Bang"),
			new Student(3, 2, 2, "KKK")
		);
	/* 학생 정보를 출력하는 기능 구현
	 * 1. 학생 전체 출력
	 * 2. 학생 학년 출력
	 * 3. 학생 검색 출력
	 * 4. 종료
	 */
	public void run() {
		int menu = 0;
		do {
			
			printMenu();
			menu = sc.nextInt();
			runMenu(menu);
			
		}while(menu != 4);
	}
	
	public void printMenu() {
		System.out.println("==================");
		System.out.println("1. 학생 전체 출력");
		System.out.println("2. 학생 학년 출력");
		System.out.println("3. 학생 검색 출력");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 선택 >>> ");
	}
		
	public void runMenu(int menu) {
		Stream<Student> std = list.stream();
		switch(menu) {
		case 1: 
			std.forEach(s -> System.out.println(s));
			break;
		case 2: 
			System.out.print("출력할 학년 : ");
			final int grade1 = sc.nextInt();
			/* // filter는 매개변수로 Predicate 인터페이스의 객체가 필요
			 * Predicate를 구현한 익명클래스를 람다식으로 만든 후에 객체를 생성ㅎ서 전달
			 */
			std 
				.filter(s -> s.getGrade() == grade1)
				.forEach(s -> System.out.println(s));
			break;
		case 3: 
			System.out.println("학년");
			final int grade2 = sc.nextInt();
			System.out.println("반");
			final int classNum2 = sc.nextInt();
			System.out.println("출석번호");
			final int num2 = sc.nextInt();
			std
				.filter(s -> s.equals(new Student(grade2, classNum2, num2, null)))
				.forEach(s -> System.out.println(s));
			break;
			
		case 4:
			break;
		
		}
		
		
	}
	



}
