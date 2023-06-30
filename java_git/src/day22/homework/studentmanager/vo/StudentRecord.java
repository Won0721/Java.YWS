package day22.homework.studentmanager.vo;



import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

// 한 학생의 모든 기록 관리 학년별 학급 반 번호 성적
public class StudentRecord {
	private int grade,classNum,num;
	private int kor,eng,math;
	
	public StudentRecord(StudentRecord s) {
		this.grade = s.grade;
		this.classNum = s.classNum;
		this.num = s.num;
		this.kor = s.kor;
		this.eng = s.eng;
		this.math = s.math;
	}
	
	
	public void print() {
		System.out.println(grade +"학년  "+ classNum + "반 " + "출석번호 : " + num + "국어 :" + kor + " 영어 : "+eng+ " 수학 : " + math);
	}

}
