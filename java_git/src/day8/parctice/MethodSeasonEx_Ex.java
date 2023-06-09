package day8.parctice;

import java.util.Scanner;

public class MethodSeasonEx_Ex {
	public static void main(String[] args) {
		
		int month; 
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력");
		month = sc.nextInt();
		// month 가 3이거나 4이거나 5 이면 spring
		// month 가 6이거나 7이거나 8 이면 summer
		// month 가 9이거나 10이거나 11 이면 fall
		// month 가 12이거나 1이거나 2 이면 winter
		// 아니면 wrong month
		System.out.println(month + " is " + getSesaon(month));
		
	
	}
	/**
	 * 월이 주어지면 주어진 월에 맞는 계절을 알려주는 메서드
	 * 매개 변수: 월 = > int month
	 * 리턴타입: 계절 = > String
	 * 메서드명: getSeason
	 */
	
	public static String getSesaon(int month) {
		if(month == 12 || month<3) {
			return "Winter";
		}
		else if(month < 6) {
			return "Spring";
		}
		else if(month < 9) {
			return "Summer";
		}
		else if(month < 12) {
			return "Fall";
		}
		else {
		return "월 오입력";
		}
	}

}
