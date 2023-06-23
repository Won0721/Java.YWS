package day18.homework.vo;

import java.util.Scanner;

public class ArithmeticCreate implements Sum, Sub, Div, Mul{
	private Scanner sc = new Scanner(System.in);
	private int a;
	private int b;
	
	public void menu() {
		int num = 0;
		do {
			System.out.println(" 1. 숫자 입력 ");
			System.out.println(" 2. 연산자 입력 ");
			System.out.println(" 3. 종료 ");
			num = sc.nextInt();
			switch(num) {
			case 1: input(); break;
			case 2: result(); break;
			case 3: System.out.println("종료"); break;
			default : System.out.println("오입력");
			}
			
		}while(num != 3);
		
		
	}
	public void input() {
		int a;
		int b;
		System.out.println("두 숫자를 입력하세요");
		a = sc.nextInt();
		b = sc.nextInt();
	}
	public void result() {
		
		System.out.println("연산자 입력 +, -, *, /");
		char str = sc.next().charAt(0);
		if(str == '+') {
			System.out.println(sum(a,b));
			return;
		}
		if(str == '-') {
			System.out.println(sub(a,b));
			return;
		}
		if(str == '*') {
			System.out.println(mul(a,b));
			return;
		}
		if(str =='/') {
			System.out.println(div(a,b));
		}
		
	}
	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return Mul.super.mul(a, b);
	}
	@Override
	public double mul(int a, double b) {
		// TODO Auto-generated method stub
		return Mul.super.mul(a, b);
	}
	@Override
	public double mul(double a, int b) {
		// TODO Auto-generated method stub
		return Mul.super.mul(a, b);
	}
	@Override
	public double mul(double a, double b) {
		// TODO Auto-generated method stub
		return Mul.super.mul(a, b);
	}
	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return Div.super.div(a, b);
	}
	@Override
	public double div(int a, double b) {
		// TODO Auto-generated method stub
		return Div.super.div(a, b);
	}
	@Override
	public double div(double a, int b) {
		// TODO Auto-generated method stub
		return Div.super.div(a, b);
	}
	@Override
	public double div(double a, double b) {
		// TODO Auto-generated method stub
		return Div.super.div(a, b);
	}
	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return Sub.super.sub(a, b);
	}
	@Override
	public double sub(int a, double b) {
		// TODO Auto-generated method stub
		return Sub.super.sub(a, b);
	}
	@Override
	public double sub(double a, int b) {
		// TODO Auto-generated method stub
		return Sub.super.sub(a, b);
	}
	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return Sub.super.sub(a, b);
	}
	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return Sum.super.sum(a, b);
	}
	@Override
	public double sum(int a, double b) {
		// TODO Auto-generated method stub
		return Sum.super.sum(a, b);
	}
	@Override
	public double sum(double a, int b) {
		// TODO Auto-generated method stub
		return Sum.super.sum(a, b);
	}
	@Override
	public double sum(double a, double b) {
		// TODO Auto-generated method stub
		return Sum.super.sum(a, b);
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	

	
}



interface Sum{
	public default int sum(int a, int b) {
		return a+b;
	}
	public default double sum(int a, double b) {
		return a+b;
	}
	public default double sum(double a, int b) {
		return a+b;
	}
	public default double sum(double a, double b) {
		return a+b;
	}
	
}
interface Sub{
	public default int sub(int a, int b) {
		return a-b;
	}
	public default double sub(int a, double b) {
		return a-b;
	}
	public default double sub(double a, int b) {
		return a-b;
	}
	public default double sub(double a, double b) {
		return a-b;
	}
	
	

}


interface Div{
	public default int div(int a, int b) {
		return a / b;
	}
	public default double div(int a, double b) {
		return a / b;
	}
	public default double div(double a, int b) {
		return a / b;
	}
	public default double div(double a, double b) {
		return a / b;
	}
	
}


interface Mul{
	public default int mul(int a, int b) {
		return a * b;
	}
	public default double mul(int a, double b) {
		return a * b;
	}
	public default double mul(double a, int b) {
		return a * b;
	}
	public default double mul(double a, double b) {
		return a * b;
	}
	
}
