package day22.homework.studentmanager.vo;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Student {
	private int grade, classNum, num;
	private String phone;
	private String name;
	private int kor, eng, math;
	private ArrayList<StudentRecord> StudentRecordList = new ArrayList<>();
	private ArrayList<Interview> interviewList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	// 재학생을 졸업생으로 변경하기 위해 필요
	public Student(Student s) {
		this.grade = s.grade;
		this.classNum = s.classNum;
		this.num = s.num;
		this.phone = s.phone;
		this.name = s.name;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
		this.interviewList = s.interviewList;
	}
	
	// 입학 당시 정보 입력 , 전학생(오는) 정보 입력
	public Student(int grade, int classNum, int num, String phone, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
		this.phone = phone;
	}
	
	// 진학 (반 번호 번호 변경)
	public void update(int grade, int classNum, int num) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;	
		this.kor = 0;
		this.eng = 0;
		this.math = 0;
	}
	
	public void Inputscore(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 면담작성 
	public void interview() {
		System.out.println("날짜 : ");
		String date = sc.next();
		System.out.println("상담 내용 :");
		sc.nextLine();
		String text = sc.nextLine();
		interviewList.add(new Interview(date, text));
		System.out.println("일지 작성 완료");
	}
	
	// 면담일지 확인
	public void interviewPrint() {
		
		for(int i=0; i<interviewList.size(); i++) {
			System.out.println("날짜 : " + interviewList.get(i).getDate());
			System.out.println("[상담 내용]");
			System.out.println(interviewList.get(i).getText());
		}
	}
	

	// 학생 현재 정보 출력
	public void print() {	
		System.out.println("  "+ grade +"\t"+ classNum +"\t" + num + "     " + name);
	}
	
	
	public void setInfo(int grade, int classNum, int num, int kor, int eng, int math) {
		StudentRecord sr = new StudentRecord(grade, classNum, num, kor, eng, math);
		for(StudentRecord i : StudentRecordList) {
			if(i.getClassNum() == sr.getClassNum() && i.getClass() == sr.getClass()) {
				i = sr;
				return;
			}
		}
		StudentRecordList.add(sr);
	}
	
	public void insertInfo(StudentRecord s) {
		
		for(int i = 0; i<StudentRecordList.size(); i++) {
			StudentRecord info = StudentRecordList.get(i);
			// 이미 저장 내역이 있으면 업데이트
			if(info.getGrade()== StudentRecordList.get(i).getGrade()) {
				StudentRecordList.set(i, s);
				return;
			}
		}
		StudentRecordList.add(s);
	}
	public void printInfo() {
		System.out.println("학년 반 번호 국어 수학 영어");
		for(StudentRecord i : StudentRecordList) {
			i.print();
		}
	}

	
	public void show() {		
		System.out.println("=================================");
		System.out.println("[학년]\t[반]\t[출석번호]\t[국어]\t[영어]\t[수학]");
		for(StudentRecord i : StudentRecordList) {
			if(i.getGrade() == 1) {
				i.print();
			}	
		}
		
		System.out.println();
		for(StudentRecord i : StudentRecordList) {
			if(i.getGrade() == 2) {
				i.print();
			}	
		}
		
		System.out.println();
		for(StudentRecord i : StudentRecordList) {
			if(i.getGrade() == 3) {
				i.print();
			}	
		}
		
	}
	

}
