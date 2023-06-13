package day09.classEx;

import java.util.Scanner;

public class StudentScoreManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
		// korScore를 인스턴스==객체 라고 표현
		Score1 korScore = new Score1(); // 우측 : 만드는 객체를 초기화 하는 역할 , 좌측 : 스택메모리 우측 : 힙 메모리
		korScore.title = "Korean";
		korScore.grade = 1;
		korScore.semester = 2;
		Score1 engScore = new Score1(1,2,"English");
		System.out.println(engScore.title);
		
	}

}

//성적 클래스

class Score1{
	String title; //과목명
	int grade; // 학년
	int semester; // 학기
	double total; // 총점수
	double midTerm; // 중간고사
	double finalExam; // 기말고사
	double performance; // 수행평가
	
	 // Score1 클래스의 기본생성자
	public Score1(){
		/* title의 기본값? null
		 * grade의 기본값? 0
		 * total의 기본값? 0.0
		 */
		title = "";
		grade = 1;
		semester = 1;
	}
	public Score1(int _grade, int _semester, String _title) {
		grade = _grade;
		semester = _semester;
		title = _title;
	
	}
	// getter, setter 만들기
	// 클래스 제일 하단 부에서 우클릭 + 소스 + generate getter setter
	
	// 생성자 만들기
	// 클래스 제일 하단 부에서 우클릭 + 소스 + generate constructor 
	
	
	
}



// 학생클래스
class Student1{
	String name;
	String residentNumber; //주민번호
	int grade; // 학년
	int semester; // 학기
	int classNum; //반
	int number; //번호
	int admissionYear; // 입학년도
	Score1 korScore, engScore, mathScore; // 국어, 영어, 수학 성적
}
