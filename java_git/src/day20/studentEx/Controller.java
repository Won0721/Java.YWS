package day20.studentEx;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import day20.collection.Student;



public class Controller implements Program{
	
	private ArrayList<Student> list = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	
	public void run() {
		int menu = 0;
		System.out.println("==========================");
		System.out.println("    프로그램을 시작합니다.");
		System.out.println("==========================");
		
		do {
			try {
				printMenu();
				
			}catch(InputMismatchException e) {
				menu = -1;
				sc.nextLine(); // 앞에서 잘못 입력한 내용을 비워줌
				System.out.println("입력값 오류");
			}
		
		}while(menu != 5);
	}
	
	public void printMenu() {
		
		int num = 0;
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 삭제");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 조회");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴 선택 >> ");
		num = sc.nextInt();
		runMenu(num);
		
	
	}
	
	public void runMenu(int menu) {
		
		switch(menu) {
		case 1 : add(); break;
		case 2 : remove(); break;
		case 3 : replace(); break;
		case 4 : print(); break;
		case 5 : System.out.println("프로그램 종료");
		
		default : System.out.println("숫자 오입력");
		}
		
	}
	
	public void add() {
		System.out.println("==========================");
		System.out.println("[학생 추가]");
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int ClassNum = sc.nextInt();
		System.out.print("출석 번호 : ");
		int num = sc.nextInt();
		
		if(!check(grade, ClassNum, num)) {
			System.out.println("학생 정보는 중복으로 저장할 수 없습니다.");
			return;
		}
		
		System.out.print("이름 : ");
		String name= sc.next();
		list.add(new Student(grade, ClassNum, num, name));
		System.out.println("추가 완료");
	}
	
	public void remove() {
		if(list.size() == 0) {
			System.out.println("==========================");
			System.out.println("저장된 학생 리스트가 없습니다.");
			System.out.println("==========================");
			return;
		}
		System.out.println("==========================");
		System.out.println("[학생 삭제]");
		System.out.println("학생 명단 리스트");
		print();
		System.out.println("삭제하실 학생의 정보를 입력해 주세요");
		System.out.println("학년\t반\t출석번호\t이름");
		int grade = sc.nextInt();
		int classNum = sc.nextInt();
		int num = sc.nextInt();
		String name = sc.next();
		if(list.contains(new Student(grade, classNum, num, name))) {
			list.remove(new Student(grade, classNum, num, name));
			System.out.println("삭제 성공");
			return;
		}
		
		System.out.println("입력된 학생정보가 일치하지 않습니다.");
	}
	
	
	public void replace() {
		if(list.size() == 0) {
			System.out.println("==========================");
			System.out.println("저장된 학생 리스트가 없습니다.");
			System.out.println("==========================");
			return;
		}
		System.out.println("==========================");
		System.out.println("[학생 정보 수정]");
		System.out.println("학생 명단 리스트");
		print();
		
		System.out.println("[변경할 학생 정보]");
		System.out.println("학년 \t 반 \t 출석번호 \t 이름");
		int grade = sc.nextInt();
		int classNum = sc.nextInt();
		int num = sc.nextInt();
		String name= sc.next();
		
		System.out.println("[변경할 내용] ");
		System.out.println("학년\t반\t출석번호\t이름");
		int grade2 = sc.nextInt();
		int classNum2 = sc.nextInt();
		int num2 = sc.nextInt();
		String name2 = sc.next();
		Student tmp = new Student(grade2, classNum2, num2, name2);
		if(list.contains(tmp)) {
			System.out.println("업데이트 실패");
			return;
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name) && (list.get(i).getNum() == num) ) {
				list.get(i).update(grade2, classNum2, num2, name2);
				return;
			}
		}
		System.out.println("일치하는 정보가 없습니다.");
		
	}
	
	
	public void print() {
		System.out.println("==========================");
		System.out.println("[학생 조회]");
		System.out.println();
		System.out.println("학년\t반\t출석번호\t이름");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getGrade()+"\t"+list.get(i).getClassNum()+"\t"+list.get(i).getNum()+"\t"+list.get(i).getName());
		}
		System.out.println("==========================");
	}
	
	public boolean check(int ClassNum, int grade, int num) {
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getClassNum() == ClassNum && list.get(i).getGrade() == grade && list.get(i).getNum() == num) {
				return false;
			}
		}
		
		return true;
	}
	
}
