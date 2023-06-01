package day2.homework;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		/*
		 * 1. 콘솔에서 정수 2개와 문자(산술연산자)를 입력받아 출력하는 코드를 작성하세요.
			  두 정수와 산술 연산자를 입력하세요 (예: 1 + 2) :
			[입력] 1 + 2 [엔터]
			[출력] 1 + 2   
			2. 두 정수를 입력 받아 두 정수의 산술 연산 결과를 출력하는 코드를 작성하세요.
			   (단, 2번째 숫자는 0이 아님.)
			[입력] 1 2 [엔터]
			[출력] 1 + 2 = 3
				  1 - 2 = -1
				  1 * 2 = 2 
				  1 / 2 = 0.5
				  1 % 2 = 1
		 */
		Scanner sc = new Scanner(System.in);
			
		// 1.
		int num1, num2, num3, num4;
		char operator;
		System.out.print("두 정수와 산술 연산자를 입력하세요 : (예:1 + 2)" );
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		System.out.println(num1 + " " + operator + " "+ num2);
		
		// 2.
		System.out.print("두 정수를 입력하세요 :");
		// 두 정수를 입력받음
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		// 두 정수 산술연산 대입
		int sum = num3 + num4;
		int sub = num3 - num4;
		int mul = num3 * num4;
		double div = num3 / (double)num4;
		int mod = num3 % num4;
		
		System.out.println(num3+ " + " + num4 + " = " + sum);
		System.out.println(num3+ " - " + num4 + " = " + sub);
		System.out.println(num3+ " * " + num4 + " = " + mul);
		System.out.println(num3+ " / " + num4 + " = " + div);
		System.out.println(num3+ " % " + num4 + " = " + mod);
		
		
		
		
	}

}
