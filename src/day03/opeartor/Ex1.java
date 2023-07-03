package day03.opeartor;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		// 성적을 입력받아 입력받은 성적이 60점이상 인지 확인하는 코드를 작성
		// 예 : input score
		// 65 
		// Do you pass 65 points? true
		Scanner sc = new Scanner(System.in);
	
		System.out.print("성적을 입력하세요 : ");
		int score = sc.nextInt();
		
		boolean answer = score>=60;
		
		System.out.println("Do you pass "+ score + " points? " + answer );
		
		
		System.out.println("===========================================");
		System.out.print("성적을 입력하세요 : ");
		int score2 = sc.nextInt();
		String result = score2>=60 ? "pass" : "fail";
		System.out.println("Do you pass " + score2 + " points? " + result);
		
		sc.close();

	}

}
