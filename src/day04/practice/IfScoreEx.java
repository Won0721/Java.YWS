package day04.practice;

import java.util.Scanner;

public class IfScoreEx {
	public static void main(String[] args) {
		/* 성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성  
		 * 90이상 ~ 100 이하 A
		 * 80이상 ~ 90미만 B
		 * 70이상 80
		 * 60이상 70
		 * 60미만 F
		 * 0보다 작거나 100보다 큰 경우 : Wrong score
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Input score : ");
		int score = sc.nextInt();
		/*
		if(score >= 90 && score<=100) {
			System.out.println("A");
		}
		else if(score >=80 && score < 90) {
			System.out.println("B");
		}
		else if(score >=70 && score < 80) {
			System.out.println("C");
		}
		else if(score >=60 && score < 70) {
			System.out.println("D");
		}
		else if(score >=0 && score < 60) {
			System.out.println("F");
		}
		else {
			System.out.println("Wrong score");
		}
		*/
		// score가 0 미만이거나 100초과이면 wrong score 
		// score 90 이상이면 A
		// score 80 이상이면 B ...
		if(score <0 || score>100) {
			System.out.println("wrong score");
		}
		else if(score >=90) {
			System.out.println("A");
		}
		else if(score >=80) {
			System.out.println("B");
		}
		else if(score >=70) {
			System.out.println("C");
		}
		else if(score >=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		
	}

}
