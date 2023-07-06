package day27.student.vo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Attendance {
	private Student student; // 학생
	private String today; // 출석일
	private boolean attendance; // 참석여부
	
	
	
	
	
	
	public Attendance(Student student, boolean attendance) {
		this.student = student;
		this.attendance = attendance;
	}

	public void attend() {
		attendance = true;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		today = format.format(new Date());
	}
	
	public void print() {
		System.out.println(today);
		if(attendance == true) {
			System.out.println("1. " + student.getNum() +" " + student.getName() + " O");
			return;
		}
		System.out.println("1. " + student.getNum() +" " + student.getName() + " X");
	}

	@Override
	public int hashCode() {
		return Objects.hash(student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Attendance other = (Attendance) obj;
		return Objects.equals(student, other.student);
	}
	


}
