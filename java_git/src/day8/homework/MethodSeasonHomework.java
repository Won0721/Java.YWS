package day8.homework;

import java.util.HashMap;

public class MethodSeasonHomework {
	/*  월을 입력받아 월에 맞는 영어를 출력
	 * 
	 */
	public static void main(String[] args) {
		printMont(1);
		System.out.println(getMonth(1));

	}
	

	/** 월이 주어지면 주어진 월의 영문을 출력하는 메서드
	 *  매개변수 : 월 = > int month
	 *  리턴타입 : 없음
	 *  메서드명 : printMonth
	 */
	public static void printMont(int month) {
		switch(month) {
		case 1: System.out.println(month+"월"); break;
		case 2: System.out.println(month+"월"); break;
		case 3: System.out.println(month+"월"); break;
		case 4: System.out.println(month+"월"); break;
		case 5: System.out.println(month+"월"); break;
		case 6: System.out.println(month+"월"); break;
		case 7: System.out.println(month+"월"); break;
		case 8: System.out.println(month+"월"); break;
		case 9: System.out.println(month+"월"); break;
		case 10: System.out.println(month+"월"); break;
		case 11: System.out.println(month+"월"); break;
		case 12: System.out.println(month+"월"); break;
		default: System.out.println("Wrong month!");
		}
		
	}

	/** 월이 주어지면 주어진 월의 영문을 알려주는 메서드
	 *  매개변수 : 월 => int month
	 *  리턴타입 : 월의 영문 = > String
	 *  메서드명 : getMonth
	 */
	public static String getMonth(int month) {
		switch(month) {
		case 1:  return "1월";
		case 2:  return "2월";
		case 3:  return "3월";
		case 4:  return "4월";
		case 5:  return "5월";
		case 6:  return "6월";
		case 7:  return "7월";
		case 8:  return "8월";
		case 9:  return "9월";
		case 10: return "10월";
		case 11: return "11월";
		case 12: return "12월";
		default: return "Wrong month";
		}	
	}
}

