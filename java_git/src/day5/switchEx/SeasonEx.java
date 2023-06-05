package day5.switchEx;

import java.util.Scanner;

public class SeasonEx {
	public static void main(String[] args) {
		/*
		 * 월을 입력받아 입력받은 월의 계절을 출력하세요
		 * 3,4,5 : 봄
		 *  6,7,8 : 여름
		 *  9,10,11 : 가을
		 *  12,1,2 : 겨울
		 *  그 외 : 잘못된 월 입력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Input month:");
		int month = sc.nextInt();
		
		switch (month / 3) {
		case 1: {
			System.out.println("Spring");
			break;
		}
		case 2: {
			System.out.println("Summer");
			break;
		}
		case 3: {
			System.out.println("Fall");
			break;
		}
		case 0: case 4: {
			System.out.println("Winter");
			break;
		}
		default:{
			System.out.println("Error");
		}
		
		}
	}

}
