package day22.practice.vo;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString


public class Student {
	private int grade, classNum, num;
	private String name;
	
	
	public void print() {
		System.out.println(grade +"\t"+ classNum + "\t" + num + "\t" + name);
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
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}


	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	
	
	
}
