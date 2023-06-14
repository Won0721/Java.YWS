package day11.array;

import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
		/* 학생들의 국어성적을 저장하기 위한 배열을 생성하세요.
		 * 학생들은 총 3명
		 */
		
		double[] studentKoreaScore = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) { // 범위를 벗어날 경우 ArrayIndexOutOfBounds 에러 뜸
			System.out.print("성적 입력 : ");
			studentKoreaScore[i] = sc.nextDouble();
		}
		
		for(int i =0; i<3; i++) {
			System.out.println((i+1)+"번째 학생의 점수 : "+studentKoreaScore[i]);
		}
		// 학생 3명의 국어점수 평균을 구하고 출력하는 코드를 작성하세요
		
		double avr;
		double total = 0;
		for(int i=0; i<studentKoreaScore.length; i++) {
			total += studentKoreaScore[i];
		}
		avr = total / (double) studentKoreaScore.length;
		System.out.printf(studentKoreaScore.length + "명의 국어 평균점수는 %.2f 입니다.", avr);
		
		
		
	}

}
