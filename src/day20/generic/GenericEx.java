package day20.generic;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericEx {
	public static void main(String[] args) {
		Student<Integer> std = new Student<>();
		std.kor = 10;	// 10.0을 넣어주면 에러가 발생 
		Student<Double> std2 =new Student<>();
		std2.kor = 10.3;	
		// Student<Scanner> std3 = new Student<>();
	
		print(std2);
		GenericEx.<Double>print(std2);
		GenericEx.print(std2); // std2가 Double로 되어있어 print의 T를 Duble이라고 추정할 수 있음
		
	}
	
	// 학생정보를 출력하는 메서드 
	
	public static <T extends Number> void print(Student<T> std) {
		System.out.println(std.grade);
		System.out.println(std.classNum);
		System.out.println(std.num);
		System.out.println(std.name);
		System.out.println(std.kor);
	}
}
