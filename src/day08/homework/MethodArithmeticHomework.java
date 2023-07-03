package day08.homework;

import java.util.Scanner;

public class MethodArithmeticHomework {
	public static void main(String[] args) {
		/*
		 * 두 정수와 산술 연산자를 입력받아 산술연산 결과를 출력하는 코드 작성
		 * 단, 메소드 이용
		 * 연산자를 잘못 입력한 경우는 없다고 가정.
		 * 0 으로 나누는 일은 없다고 가정.
		 */
		
		/** 두 정수와 산술 연산자가 주어지면 산술 연산 결과를 알려주는 메소드
		 *  매개변수 : 두 정수와 산술 연산자 = > int num1 char operator, int num2
		 *  리턴타입 : 산술 연산 결과 => 실수 = > double
		 * 	메소드명 : arithmetic
		 */
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		char operator;
		double res;
		System.out.println("두 정수와 산술 연산자 입력 (ex : 1 + 2) : ");
		num1 = sc.nextInt();
		operator = sc.next().charAt(0);
		num2 = sc.nextInt();
		
		res = arithmetic(num1, operator, num2);
		System.out.println(num1 + " " + operator + " " + num2 + " = " + res);
		
		res = arithmetic2(num1, operator, num2);
		System.out.println(num1 + " " + operator + " " + num2 + " = " + res);
	}
	public static double arithmetic(int num1, char operator, int num2) {
		double res = 0.0;
		switch(operator) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num1 - num2;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num1 / (double)num2;
			break;
		case '%':
			res = num1 % num2;
			break;
		default:
			// 잘못된 연산자인 경우 예외처리
			throw new RuntimeException("Wrong operator");
		}
		
		
		return res;
	}
	public static double arithmetic2(int num1, char operator, int num2) {
		
		switch(operator) {
		case '+':
			// return 사용 시 반환하고 반복문을 빠져나감
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / (double)num2;
		case '%':
			return num1 % num2;
		default:
			return 0.0;
			// 잘못된 연산자인 경우 예외처리
//			throw new RuntimeException("Wrong operator");
		}
		
		
	}
}
