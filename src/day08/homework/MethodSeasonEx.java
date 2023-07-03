package day08.homework;

import java.util.Scanner;

public class MethodSeasonEx {
	/*
	 * 월을 입력받아 월에 맞는 영어를 출력
	 * 단, 메소드 이용
	 * input month : 
	 * 3
	 * March
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		System.out.println(season(month));
		
		
	}
	public static String season(int month) {
		switch(month) {
		case 1: return "1월";
			
		case 2: return "2월";
		
		case 3: return "3월";
			
		case 4: return "4월";
			
		case 5: return "5월";
			
		case 6: return "6월";
			
		case 7: return "7월";
			
		case 8: return "8월";
			
		case 9: return "9월";
			
		case 10: return "10월";
			
		case 11: return "11월";
			
		case 12: return "12월";
		}
		return "오입력";
	}
}
