package day19.practice;

import java.util.Scanner;

public class ArithmeticEx {
	/* 두 정수와 산술연산자를 입력했을 때 연산결과를 출력하는 코드를 작성
	 * 예외처리도 추가
	 * 인풋 1 + 2
	 *  1 + 2 = 3
	 * 인풋 1 ? 2  
	 * 연산자 오류 
	 * 인풋 1 / 0 
	 * 연산자 오류
	 */
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic();
		ar.run();
		
	}
	

}

class Arithmetic{
	private int num1, num2;
	private char ch;
	private double res;
	private Scanner sc = new Scanner(System.in);
	public void run() {
		try {
			printMenu();			
			res(ch);
			
		}catch(ArithmeticException e) {
			System.out.println("정수 오입력. 0이 아닌 정수로 입력해주세요");
		}
		
	}
	
	public void printMenu() {
		System.out.println("숫자와 연산자를 입력해주세요 ex: 1 + 2 ");
		num1 = sc.nextInt();
		ch = sc.next().charAt(0);
		num2 = sc.nextInt();
		
	}
	
	public void res(char ch) {
		switch(ch) {
		case '+': System.out.println(num1+num2); break;
		case '-': System.out.println(num1-num2); break;
		case '*': System.out.println(num1*num2); break;
		case '/': System.out.println(num1/(double)num2);
		if(num2 == 0) {
			throw new ArithmeticException();
		}break;
		case '%': System.out.println(num1%num2); break;
		default : System.out.println("연산자 오입력");
		}
	}
	
}
