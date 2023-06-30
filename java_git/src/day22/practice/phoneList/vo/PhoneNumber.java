package day22.practice.phoneList.vo;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PhoneNumber {
	// 한 사람의 전화번호 정보
	private String name;
	private String number; // "010-1111-1111"

	public PhoneNumber(String name, String number) {
		this.name = name;
		this.number ="";
		if(checkNumber(number)) {
			this.number = number;
		}
		// this.number = checNumber(number) ? number : "";
	}
	
	
	
	
	// 정규표현식 
	// 전화번호가 010-xxxx-xxxx 패턴이 맞는지 확인해주는 메서드
	// 외부에서도 객체 생성 없이 쓸수 있게 static과 public을 붙여줌
	public static boolean checkNumber(String num) {
		String regex = "^010(-\\d{4}){2}$";		
		return Pattern.matches(regex, num);
	}
	
	public void setNumber(String number) {
		
		this.number = checkNumber(number) ? number : this.number;
	}
	
	
	// hashset이나 hashmap을 사용할때 쓰임
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneNumber other = (PhoneNumber) obj;
		return Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}




	@Override
	public String toString() {
		return "PhoneNumber [name=" + name + ", number=" + number + "]";
	}

	
	
	
}
