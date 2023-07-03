package day08.homework;

import java.util.Scanner;

public class MethodScoreEx {
	/*
	 * 성적을 입력받아 학점을 출력하는 코드를 작성
	 * 단, 메소드 이용
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 성적 : ");
		int num1 = sc.nextInt();
		System.out.print("영어 성적 : ");
		int num2 = sc.nextInt();
		System.out.print("수학 성적 : ");
		int num3 = sc.nextInt();
		double res = score(num1, num2, num3);
		System.out.printf("평균 점수 : %.2f " , res);
	}
	
	public static double score(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3.0;
	}
	
	
}
