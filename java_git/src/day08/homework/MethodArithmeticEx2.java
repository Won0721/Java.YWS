package day08.homework;

import java.util.Scanner;

public class MethodArithmeticEx2 {
	/*
	 * 두 정수와 산술 연산자를 입력받아 산술연산 결과를 출력하는 코드 작성
	 * 단, 메소드 이용
	 * 연산자를 잘못 입력한 경우는 없다고 가정.
	 * 0 으로 나누는 일은 없다고 가정.
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력 받으세요");
		int num1 = sc.nextInt();
		char ch = sc.next().charAt(0);
		int num2 = sc.nextInt();
		
		System.out.println(num1 + " " + ch +" " + num2 + " = " + arithmetic(num1, num2, ch) );
	}
	
	public static double arithmetic(int num1, int num2, char ch) {
		if(ch =='+') {
			return (num1 + num2);
		}
		else if(ch =='-') {
			return num1 - num2;
		}
		else if(ch =='*') {
			return num1 * num2;
		}
		else if(ch =='/') {
			return (num1 / (double) num2);
		}
		else if(ch =='%') {
			return num1 % num2;
		}
		return 0;
	}
}
