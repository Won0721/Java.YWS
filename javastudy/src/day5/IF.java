package day5;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윤년/평년을 판별한 년도를 입력하세요 : ");
		int year = sc.nextInt();

//		프로그램에서 여러번 사용되는 값은 변수에 저장시켜 사용하면 편리하다.
//		논리값을 기억하는 변수나 논리값을 리턴하는 메소드의 이름은 "is"로 시작하게 하는 것이 관행이다.
		
// 		년도가 4로 나눠 떨어지고(&&) 100으로 나눠 떨어지지않거나(||) 400을 나눠 떨어지면 윤년, 그렇지 않으면 평년
		boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		
		if(isLeapYear) {
			System.out.println(year + "년은 윤년 입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		
//		삼항 연산자(? A : B)
//		if의 조건을 비교한 결과 조건이 참일 때와 거짓일때 실행할 문장이 각각 한문장일 경우 사용하면 편리함
//		조건식 ? 조건식이 참일 경우 실행할 내용 : 거짓일 경우 실행할 내용
		System.out.println(year + "년은 " + (isLeapYear ? "윤":"평") + "년입니다.");
		
		sc.close();

	}
}


