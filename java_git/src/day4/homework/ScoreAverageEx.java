package day4.homework;

import java.util.Scanner;

public class ScoreAverageEx {
	public static void main(String[] args) {
		// 국어 영어 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요
		Scanner sc = new Scanner(System.in);
		int kor, eng, math;
		System.out.print("국어 성적을 입력하세요 : ");
		kor = sc.nextInt();
		System.out.print("영어 성적을 입력하세요 : ");
		eng = sc.nextInt();
		System.out.print("수학 성적을 입력하세요 : ");
		math = sc.nextInt();
		double avg = (kor + eng + math) / 3.0; // (double)로 형변환도 가능
				
		System.out.printf("평균 성적 : %.2f점 입니다" ,avg);
		
	}

}
