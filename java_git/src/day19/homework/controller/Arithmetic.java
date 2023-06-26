package day19.homework.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmetic {
	private int num1, num2;
	private char ch;
	private double res;
	private Scanner sc = new Scanner(System.in);
	
	public void run() {
		int sel = 0;
		do {
			
			try {
				printMenu();
				sel = sc.nextInt();
				arith(sel);
			}catch(ArithmeticException e) {
				System.out.println("정수 입력 오류");
				return;
			}catch(InputMismatchException e) {
				System.out.println("연산자 오류");
				return;
			}

		}while(sel != 2);
		
	}
	
	public void printMenu() {
		
		System.out.println("계산 프로그램");
		System.out.println("1. 연산프로그램 이용");
		System.out.println("2. 프로그램 종료");

	}
	public void arith(int num) {
		if(num==1) {
			
				System.out.println("두 숫자와 연산자 입력 ex) 1 + 2 ");
				num1 = sc.nextInt();
				ch = sc.next().charAt(0);
				num2 = sc.nextInt();
				print();		
		}
		else {
			System.out.println("프로그램 종료");
			return;
		}
	}
	
	public void print() {
		System.out.println(num1+ " " + ch + " "+ num2 + " = " + res(ch));
	}
	public double res(char ch) {
		try {
			switch(ch) {
			case '+' : res = num1 + num2; return res;
			case '-' : res = num1 - num2; return res;
			case '*' : res = num1 * num2; return res;
			case '/' : res = num1 / (double)num2; return res;
			case '%' : res = num1 % num2; return res;
			default : 
				System.out.println("잘못된 연산자 입력");
				return 0;
			}
		}catch(ArithmeticException e) {
			System.out.println("정수 입력 오류");
		}
		return 0;
	
	}

}
