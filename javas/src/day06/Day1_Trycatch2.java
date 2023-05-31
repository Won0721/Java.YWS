package day06;

public class Day1_Trycatch2 {
	public static void main(String[] args) {
		try {
			int []a = {2,0,0};
			int b=4;
			int c=b/a[2]; //배열 [2]이 없음
			System.out.println(c);
		}
		catch(ArithmeticException e) { // 산술 연산 관련 오류
			System.out.println("산술 오류 발생");	
		}
		catch(ArrayIndexOutOfBoundsException e) { // 배열 인덱스 접근 오류
			System.out.println("배열 길이 오류 발생");
		}
		System.out.println("예외처리 공부중");
	}
}

