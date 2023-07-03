package day04.practice;

import java.util.Scanner;

public class IfSeasonEx {
	public static void main(String[] args) {
		/*
		 * 월을 입력받아 입력받은 월의 계절을 출력하세요
		 * 3,4,5 : 봄
		 *  6,7,8 : 여름
		 *  9,10,11 : 가을
		 *  12,1,2 : rudnf
		 *  그 외 : 잘못된 월 입력
		 */
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Input month : ");
		int month = sc.nextInt();
	
		if(month >=3 && month <=5) {
			System.out.println("봄");
		}
		else if(month >=6 && month<=8) {
			System.out.println("여름");
		}
		else if(month >=9 && month<=11) {
			System.out.println("가을");
		}
		else if(month ==12 || (month >=1 && month <=2)) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못된 월 입력");
		}
	
		
		
		/*
		switch (month) {
		case 3: case 4: case 5: {
			System.out.println("봄");
			break;
		}
		case 6: case 7: case 8: {
			System.out.println("여름");
			break;
		}
		case 9: case 10: case 11:{
			System.out.println("가을");
			break;
		}
		case 12: case 1: case 2:{
			System.out.println("겨울");
		}
		default:{
			System.out.println("오입력");
		}
		
		}
		*/
		
	}

}
