package day8.homework;

import java.util.Scanner;

public class MethodScoreHomework {
	// 성적을 입력받아 학점을 출력하는 코드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input score : ");
		double score = sc.nextDouble();
		System.out.println(getGrade(score));
	
	}
	
	/** 성적이 주어지면 학점을 알려주는 메서드
	 *  매개변수 : 성적 => 실수 => double
	 *  리턴타입 : 학점 => 문자열 = > "String"
	 *  메서드명 : getGrade
	 */
	public static String getGrade(double score) {
		if(score > 100 || score < 0) {
			return "Wrong score";
		}
		int res = (int)(score/10);
		switch(res) {
		case 10: case 9: return "A";
		case 8: return "B";
		case 7: return "C";
		case 6: return "D";
		default: return "F";
		
		}
	}
}
