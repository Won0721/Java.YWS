package day19.homework.controller;

import java.text.MessageFormat;
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
				printMenu();
				sel = sc.nextInt();
				arith(sel);
		}while(sel != 2);
		
	}
	
	public void printMenu() {
		System.out.println("==================");
		System.out.println("계산 프로그램");
		System.out.println("1. 연산프로그램 이용");
		System.out.println("2. 프로그램 종료");
		System.out.print("메뉴 선택 >>>");
	}
	public void arith(int num) {
		if(num==1) {
			try {
				System.out.println("두 숫자와 연산자 입력 ex) 1 + 2 ");
				num1 = sc.nextInt();
				ch = sc.next().charAt(0);
				num2 = sc.nextInt();
				print();		
			}catch(InputMismatchException e) {
				System.out.println("Input 오입력");	
				System.out.println(e.getMessage());
				sc.nextLine(); // 예외발생으로 1+2 값이 버퍼에 남아있음
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("Arith 에러 발생");
			}
		}
		else {
			System.out.println("프로그램 종료");
			return;
		}
	}
	
	public void print() {
		String message = "{0} {1} {2} = {3}";
		String result = MessageFormat.format(message, num1, ch, num2, res(ch));
		System.out.println(result);
	}
	public double res(char ch) {
		
		switch(ch) {
			case '+' : res = num1 + num2; return res;
			case '-' : res = num1 - num2; return res;
			case '*' : res = num1 * num2; return res;
			case '/' : 
			if(num2==0) {
				throw new ArithmeticException();
			}	
			res = num1 / (double)num2; 
			return res;
			case '%' : 
			if(num2==0) {
				throw new ArithmeticException("연산자 오류에요");
			}	
			res = num1 % num2; return res;
			default : 
				System.out.println("잘못된 연산자 입력");
		}
		
		return 0;
	
	}

}
