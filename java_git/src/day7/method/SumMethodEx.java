package day7.method;

public class SumMethodEx {
	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		int res = sum(num1,num2);
		System.out.println(res);
		
		
		/* 두 정수의 합을 구하는 함수(메서드)를 만드세요.
		 * 메소드는 클래스 안에 배치해야함.
		 * 메소드안에 메소드는 불가
		 */
	
	
	}
	/** 메소드의 설명을 나타날때 씀
	 *  기능: 두 정수가 주어지면 두 정수의 합을 알려주는 메서드 
	 *  메서드명: sum
	 *  리턴타입: 두 정수의 합 = > int 
	 *  매개변수: 두 정수 = > int num1, int num2
	 * @param num1 정수1
	 * @param num2 정수2
	 * @return 두 정수의 합
	 *
	 */
//	public static 리턴타입 메소드명(매개변수) {
//		return xx; // 매개변수는 앞에 타입이 같더라도 타입생략불가
//	}
	public static int sum(int num1, int num2) {
		int res = num1+num2;
		return res;
		// return num1 + num2;
	}

}

