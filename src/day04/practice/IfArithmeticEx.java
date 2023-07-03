package day04.practice;

import java.util.Scanner;

public class IfArithmeticEx {
	public static void main(String[] args) {
		// 산술 연산자와 두 정수를 입력 받아서 산술 연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요
		// 예시 : 1 + 2 [input]
		// 		 1 + 2 = 3 [output]
		// 1 ? 2 
		// ? is not Arithmetic operator
		// 산술연산자 : op ( + - * / %
		
		Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("input 2 nums and arithmetic operat (ex : 1 + 2) : ");
		
		int num1 = sc.nextInt();
		char op = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		if(op == '+') {
			int result = num1+num2;
			System.out.println(num1 +" "+ op +" "+ num2 + " = " + result);
		}
		else if(op == '-') {
			int result = num1 -num2;
			System.out.println(num1 +" "+ op +" "+ num2 + " = " + result);
		}
		else if(op == '*') {
			int result = num1 * num2;
			System.out.println(num1 +" "+ op +" "+ num2 + " = " + result);
		}
		else if(op == '/') {
			double result = num1 / (double)num2;
			System.out.println(num1 +" "+ op +" "+ num2 + " = " + result);
		}
		else if(op == '%') {
			int result = num1 % num2;
			System.out.println(num1 +" "+ op +" "+ num2 + " = " + result);
		}
		else {
			System.out.println(op + " is not arithmetic operator");
		}
	}
	}

}
