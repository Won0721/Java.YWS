package day8.parctice;

import java.util.Scanner;

public class MethodSeasonEx {
	/*
	 * 월을 입력받아 계절을 출력하는 코드
	 * 단, 메소드 사용
	 * spring : 3,4,5
	 * summer : 6,7,8
	 * fall : 9,10,11
	 * winter : 12,1,2
	 * Wrong month : 그 외
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력 :");
		int num = sc.nextInt();
		System.out.println(season(num));
		
	}

	/**
	 * 매개변수 int
	 * 리턴 타입 
	 * 
	 */
	public static String season(int num1) {
		if(num1 == 12 || num1<3) {
			return "Winter";
		}
		else if(num1 < 6) {
			return "Spring";
		}
		else if(num1 < 9) {
			return "Summer";
		}
		else if(num1 < 12) {
			return "Fall";
		}
		return "월 오입력";
	} 
}
