package day3.homework;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		/* 성별을 입력받아 여성인지 확인하는 코드를 작성하세요. 
		 * 1. 조건연산자 사용
		 * 
		 * input gender : 
		 * M
		 * Are you a women? false
		 * 
		 * 2. if 문 사용
		 * input gender :
		 * M
		 * are you a women? man
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("성별을 입력해주세요 (M or W)");
		String result = sc.next();
		System.out.println("여성입니까? " + (result == "Man" ? true : false));
		
	
		
		
		// 2. if문 사용
		System.out.println("성별을 입력해주세요 (Man or Woman)");
		String gender;
		gender = sc.next();
		if(gender.equals("Man")) {
			System.out.println("여성입니까? "+ gender);
		}
		else if(gender.equals("Woman")){
			System.out.println("여성입니까? "+ gender);
		}
	
		
		sc.close();
	}

}
