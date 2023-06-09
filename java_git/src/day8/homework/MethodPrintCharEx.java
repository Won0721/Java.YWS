package day8.homework;

import java.util.Scanner;

public class MethodPrintCharEx {
	/* 다음과 같이 출력하기 위한 코드 작성
	 * 단, 메소드 이용
	 * 
	 * *****
	 * ***
	 * ?????
	 * ^^^^^^^
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아무거나 문자 하나와 출력하고 싶은 개수 ");
		char ch = sc.next().charAt(0);
		int num1 = sc.nextInt();
		
		for(int i=0; i<num1; i++) {
			System.out.print(printchar(ch));
		}
		System.out.println();
		
		sc.nextLine();
		System.out.print("아무거나 문자를 입력 : ");
		String str = sc.nextLine();
		System.out.println(printString(str));
		
	}
	public static char printchar(char ch) {
		return ch;
	}
	public static String printString(String str) {
		return str;
	}
	

}
