package day27.student.vo;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable{
	
	private int num; // 학번
	private String name; // 이름
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, num);
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
		return Objects.equals(name, other.name) && num == other.num;
	}
	@Override
	public String toString() {
		return num + " " + name;
	}
	
	
	
	

}
