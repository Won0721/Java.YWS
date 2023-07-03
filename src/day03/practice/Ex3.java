package day03.practice;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		// 정수 num을 입력 받아서 num가 0인지, 음수인지, 양수인지 판별하는 코드를 if문을 이용하여 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("num(양수,음수,0 구분)을 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수");
		}
		else if(num==0) {
			System.out.println("0");
		}
		else {
			System.out.println("음수");
		}
		
		
		System.out.print("num(홀짝 구분)을 입력하세요 : ");
		int num2 = sc.nextInt();
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		}
		else if(num2 % 2 ==1) {
			System.out.println("홀수");
		}
		
		
	}

}
