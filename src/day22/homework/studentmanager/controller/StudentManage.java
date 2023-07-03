package day22.homework.studentmanager.controller;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.HashPrintJobAttributeSet;

import day22.homework.studentmanager.vo.Program;
import day22.homework.studentmanager.vo.Student;
/* 고등학생을 관리하는 프로그램을 작성
 * - 학생 관리(입학, 전학(오는 학생, 가는학생),졸업, 진학)
 * - 성적관리 : 과목당 점수
 * - 면담 : 날짜, 상담내용, 
 * 
 * 1. 기능을 구체적으로 정리(요구사항 명세서)
 * 2. 필요한 클래스를 추가(vo 패키지에 추가) 
 * 3. 기능을 하나씩 구현 */

/* 필요 기능
 * 1. 학생 조회 관리 / 서브메뉴 1.입학, 전학(추가해야할 학생, 가는 학생), 졸업, 진학
 * 2. 학생 성적 관리 / 몇학년 몇반 몇번 학생 국어 영어 수학 점수 저장
 * 3. 학생 면담 일지 / 몇학년 몇반 몇번 학생 상담내용 
 */
public class StudentManage implements Program {
	private ArrayList<Student> present = new ArrayList<>();   // 재학생 관리 , 전학온 학생 관리
	private ArrayList<Student> graduate = new ArrayList<>();  // 졸업생 관리 
	private ArrayList<Student> gone = new ArrayList<>();	  // 전학간 학생 관리
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int menu;
		do {
			try {
				printMenu();
				menu = sc.nextInt();
				runMenu(menu);
				
			}catch(InputMismatchException e) {
				System.out.println("스캐너 입력 오류");
				sc.nextLine();
			}catch(IndexOutOfBoundsException e) {
				System.out.println("인덱스 오류");
			}catch(Exception e) {
				System.out.println("예외발생");
			}

		}while(true);
		
		
	}

	@Override
	public void printMenu() {
		// 입학, 전학, 졸업, 진학, 재학생 전체조회
		System.out.println("1. 학생 조회 관리"); 
		// 성적 저장, 학생 면담일지 작성, 면담내용 프린트, 특정학생 1~3학년간 반 번호 성적 확인
		System.out.println("2. 학생 세부 관리"); 
		System.out.println("3. 종료"); 
	}

	@Override
	public void runMenu(int menu) {
		
		switch(menu) {
		case 1: studentInfo(); break;
		case 2: manage(); break;
		case 3: break;
		
		}
	}
	
	// 1번기능
	public void studentInfo() {
		
		int sel = -1;
		System.out.println("1. 입학"); // add
		System.out.println("2. 전입"); // add
		System.out.println("3. 전학"); // remove
		System.out.println("4. 졸업"); // remove
		System.out.println("5. 진학"); // set
		System.out.println("6. 재학생 전체 조회");
		System.out.println("0. 상위 메뉴로 돌아가기");
		
		sel = sc.nextInt();
		runInfo(sel);
	}
	
	// 1번 세부기능
	public void runInfo(int sel) {
		int grade,classNum,num,index;
		String name,phone;
		switch(sel) {
		case 1: // 입학
		System.out.println("[학년]\t[반]\t[출석번호]\t[이름]\t[휴대폰번호]");
		grade = sc.nextInt();
		classNum = sc.nextInt();
		num = sc.nextInt();
		name = sc.next();
		phone = sc.next();
		present.add(new Student(grade, classNum, num, phone, name));
			break;
			
		case 2: // 학교에 전입
		grade = sc.nextInt();
		classNum = sc.nextInt();
		num = sc.nextInt();
		name = sc.next();
		phone = sc.next();	
		present.add(new Student(grade, classNum, num, phone, name));
			break;
			
		case 3: // 다른학교로 전학
		System.out.println("[학년]\t[반]\t[출석번호]");
		grade = sc.nextInt();
		classNum = sc.nextInt();
		num = sc.nextInt();
		index = indexOf(grade, classNum, num);
		if(index == -1) {
			System.out.println("오류 : 일치하는 학생 없음");
			return;
		}
		gone.add(present.get(index)); // 전학간 학생 리스트 추가
		present.remove(index); // 재학생 리스트에서 삭제
			break;
			
		case 4: //졸업
		System.out.println("졸업 관리");
		for(Student s : present) {
			if(s.getGrade() == 3) {
				graduate.add(s);
				present.remove(s);
			}
			
		}
		
			
			break;
		case 5: //진학
		System.out.println("[학년]\t[반]\t[출석번호]");
		grade = sc.nextInt();
		classNum = sc.nextInt();
		num = sc.nextInt();	
		int kor = 0;
		int eng = 0;
		int math = 0;
		index = indexOf(grade, classNum, num);
		if(index == -1) {
			System.out.println("오입력");
			return;
		}
		System.out.println("======== 수정 ==========");
		System.out.println("[학년]\t[반]\t[출석번호]");
		int updateGrade = sc.nextInt();
		int updateClassNum = sc.nextInt();
		int updateNum = sc.nextInt();	
		present.get(index).update(updateGrade, updateClassNum, updateNum);
		present.get(index).setInfo(updateGrade, updateClassNum, updateNum, kor, eng, math);
			break;
			
		case 6: 
		if(present.size() == 0) {
			System.out.println("재학생이 없습니다.");
			return;
		}	
		System.out.println("[학년]\t[반]\t[출석번호]");
		for(Student s : present) {
			s.print();
		}break;
		case 0: break;
		default: System.out.println("오입력"); break;
		}
		
	} 
	
	// 2번 기능
	public void manage() {
		int grade, classNum, num, index;
		System.out.println();
		System.out.println("[학생 관리 기능]");
		System.out.println("=============================================");
		System.out.println("관리할 학생 정보 입력");
		System.out.println("[학년]\t[반]\t[출석번호]");
		grade = sc.nextInt();
		classNum = sc.nextInt();
		num = sc.nextInt();
		index = indexOf(grade, classNum, num);
		if(index ==-1) {
			System.out.println("오류 : 정보 불일치");
			return;
		}
		System.out.println();
		System.out.println("불러오기 완료");
		System.out.println("=================");
		System.out.println("[학년]  [반]  [출석번호]  [이름]");
		present.get(index).print();
		System.out.println("=================");
		System.out.println("1. 학생 성적 저장");
		System.out.println("2. 상담 일지 작성");
		System.out.println("3. 상담 내용 출력");
		System.out.println("4. 특정 학생 기록 조회");
		System.out.println("0. 상위 메뉴로 돌아가기");
		int sel = sc.nextInt();
		runManage(grade, classNum, num, index, sel);
	}
	
	// 2번 세부기능
	public void runManage(int grade, int classNum, int num, int index , int sel) {
		switch(sel) {
		case 1:
			System.out.println("성적 입력");
			System.out.println("국어\t\t영어\t수학");
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			present.get(index).Inputscore(kor, eng, math);
			
			// 성적 기록
			present.get(index).setInfo(grade, classNum, num, kor, eng, math);
			System.out.println("성적 저장 완료");
			
			break;
		case 2: present.get(index).interview();
			break;
		case 3: present.get(index).interviewPrint();
		case 4: present.get(index).show();
		case 0: break;
		default : System.out.println("오입력");
		break;
		}
		
	}

	

	
	public int indexOf(int grade, int classNum, int num) {
		
		
		for(int i=0; i<present.size(); i++) {
			if( (present.get(i).getGrade() == grade) && (present.get(i).getClassNum() == classNum) && (present.get(i).getNum() == num) ) {
				return i;
			}
		}

		return -1;
	}

	

}
