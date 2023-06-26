package day19.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticTeach {
	public static void main(String[] args) {
		/* 두 정수와 산술연산자를 입력했을 때 연산 결과를 출력하는 코드를 작성하세요
		 * 예외처리도 추가
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		// 두 정수와 산술연산자를 입력
	try {
		System.out.println("Input 2 num, 1 op ex : 1 + 2");
		int num1 = sc.nextInt();
		char operator = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		// 연산자에 따른 결과를 출력
		
			
		switch(operator) {
		case '+' : System.out.println("" + num1 + operator + num2 + "=" + (num1+num2)); break;
		case '-' : System.out.println("" + num1 + operator + num2 + "=" + (num1=num2)); break;
		case '*' : System.out.println("" + num1 + operator + num2 + "=" + (num1*num2)); break;
		case '/' : 
				   if(num2==0) {
					   throw new ArithmeticException();	   
				   }	
				   System.out.println("" + num1 + operator + num2 + "=" + (num1/(double)num2));
		break;
		case '%' : System.out.println("" + num1 + operator + num2 + "=" + (num1%num2)); break;
		default : 
			System.out.println("Not operator");
		}
		
	}catch(ArithmeticException e) {
		System.out.println("Arithmetic error");
			
	}catch(InputMismatchException e) {
			System.out.println("InputMismatch error");
			
	}catch(Exception e) {
		// 코드의 안전성을 위해 마지막에 Exception 작성
		System.out.println("Exception");
	}
	System.out.println();
	System.out.println("test1()");
	test1();
	System.out.println();
	System.out.println("test2()");
	test2();
	
}
	
	public static void test1() { 
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception!!");
			return;
		}finally {
			System.out.println("Method Exit !");
		}
	}	
	
	public static void test2() {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("Exception!!");
			return;
		}
		System.out.println("Method2 Exit !");
	}
		
	
	
}


