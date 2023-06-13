package day02.variable;

public class CastEx {
	public static void main(String[] args) {
		// 3.14는 double형 리터럴이기 때문에 int에 저장할 수 없음. => 강제 형변환 
		int pi = (int)3.14;
		System.out.println(pi);
		// 3은 int형 리터럴이기 때문에 double형 변수에 저장 할 수 없음. =>자동 형변환
		double num1 = 3;
		// 123L은 long 형 리터럴 이기 때문에 int에 저장 할 수 없음. =? 강제 형변환
		// 실제 데이터 분실이 없어도 타입에 맞게 강제 형변환을 해야함
		int num2 = (int) 123L;
		System.out.println(num2);
		
		// 1/2는 문법에는 문제가 없지만 원하는 결과를 얻기 위해서 강제형변환
		System.out.println((double)1/2);
	}

}
