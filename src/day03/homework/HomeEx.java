package day03.homework;

import java.util.Scanner;

public class HomeEx {
	public static void main(String[] args) {
		/*
		 * 성별(M:남성, W:여성)을 입력받아 여성인지 확인하는 코드를 작성하세요. 
		 * 1. 조건연산자 사용
		 * 
		 * input gender : 
		 * M
		 * Are you a women? false
		 */
//		char gender;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("input gender :");
//		gender = sc.next().charAt(0);
//		boolean result = gender == 'W' ? true: false;
//		System.out.println("Are you a women? " + result);
		
//		String gender;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("input gender :");
//		gender = sc.next();
//		boolean result = gender.equals("W") ? true: false;
//		System.out.println("Are you a women? " + result);
		
		 /* 2. if 문 사용
		 * input gender :
		 * M
		 * are you a women? man
		 */
		
//		char gender; 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("input gender : ");
//		gender = sc.next().charAt(0);
//		if(gender == 'M') {
//			System.out.println("Are you a women? " + "man");	
//		}
//		else if(gender =='W') {
//			System.out.println("Are you a women? " + "women");
//		}
		
		String gender; 
		Scanner sc = new Scanner(System.in);
		System.out.println("input gender : ");
		gender = sc.next();
		String result = "";
		if(gender.equals("M")) {
			result = "man";
		}
		else if(gender.equals("W")) {
			result = "women";
		}
		System.out.println("Are you a women? " + result);
		
		
		
		sc.close();
	}

}
