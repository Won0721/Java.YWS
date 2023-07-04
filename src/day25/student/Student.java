package day25.student;

import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

public class Student {
	private int grade;
	private String major;
	private String name;
	
	
	public Student(int grade, String major, String name) {
		this.grade = grade;
		this.major = major;
		this.name  = name;
	}


	
	@Override
	public int hashCode() {
		return Objects.hash(grade, major, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return grade == other.grade && Objects.equals(major, other.major) && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "[학번 = " + grade + ", 학과 = " + major + ", 이름 = " + name + "]";
	}





	
}
