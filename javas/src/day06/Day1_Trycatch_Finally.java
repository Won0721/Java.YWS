package day06;

public class Day1_Trycatch_Finally {
	public static void main(String[] args) {
//		외부로 접근	\
		int a=0;
		int b=2;
		try {
			System.out.println("외부로 접속");
			int c=b/a;
		}
		catch(ArithmeticException e) {
			System.out.println("오류 발생");
		}
		finally {
			System.out.println("무조건 연결해제");
		}
	}

		
}
