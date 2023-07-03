package day18.homework.controller;

import java.util.Scanner;

public class ArithmeticEx implements Program {
	private final static int EXIT = 3;
	private Scanner sc = new Scanner(System.in);
	
	private int num1, num2;
	private char operator;
	private double res;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int menu;
		do {
			printMenu();
			menu = sc.nextInt();
			System.out.println("============");
			runMenu(menu);
		}while(menu != EXIT);
		
	}

	@Override
	public void printMenu() {
		System.out.println("======메뉴======");
		System.out.println("1. 두 정수 입력");
		System.out.println("2. 연산자 선택 ");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴 선택 >>>");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1: inputNum(); break;
		case 2: inputOperator(); break;
		case 3: System.out.println("종료!") ;break;
		default : System.out.println("선택 오입력");
		}
		
	}
	
	private void inputNum() {
		System.out.print("두 정수 입력 :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	
	private void inputOperator() {
		System.out.print("연산자 입력 : ");
		operator = sc.next().charAt(0);
		calculator();
		
	}
	
	private void calculator() {
		switch(operator) {
		case '+': res = num1+num2; break;
		case '-': res = num1-num2; break;
		case '*': res = num1*num2; break;
		case '/': res = num1/(double)num2; break;
		case '%': res = num1%num2; break;
		default : System.out.println("잘못된 연산기호 입력");
			return;
		
		}
		System.out.println(num1 +" " + operator + " " + num2 + " = " + res);
	}
}
