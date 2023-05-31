package day4;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("3과목 점수를 입력하세요 : ");
		int java = sc.nextInt();
		int jsp = sc.nextInt();
		int spring = sc.nextInt();
		
		int total = java + jsp + spring;
		double average = (double) total / 3;
		
//		System.out.println("평균 점수 : " + average);
		System.out.printf("평균 점수 : %6.2f\n", average); // 100.00 ( 6자리(숫자 수에서 + 1) + 소수점 2자리 / 6.2)
		
		if(average >= 90) {
			System.out.println("수");
		} else if(average >= 80) {
			System.out.println("우");
		} else if(average >= 70) {
			System.out.println("미");
		} else if(average >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		
		}
			
	}
}

			
		
		
		
		
		
	


