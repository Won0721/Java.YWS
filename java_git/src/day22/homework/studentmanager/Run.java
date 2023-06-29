package day22.homework.studentmanager;

import day22.homework.studentmanager.controller.StudentManage;

public class Run {
	/* 고등학생을 관리하는 프로그램을 작성
	 * - 학생 관리(입학, 전학(오는 학생, 가는학생),졸업, 진학)
	 * - 성적관리 : 과목당 점수
	 * - 면담 : 날짜, 상담내용, 
	 * 
	 * 1. 기능을 구체적으로 정리(요구사항 명세서)
	 * 2. 필요한 클래스를 추가(vo 패키지에 추가) 
	 * 3. 기능을 하나씩 구현 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		StudentManage s = new StudentManage();
		s.run();
	}

}
