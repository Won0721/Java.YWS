package day02;

// 오버로딩은 매개변수의 개수와 타입은 다르지만
// 		이름이 같은 메서드를 여러 개 정의하는 것.
// 컴퓨터가 함수를 구분하는 시그니처 1. 함수명 , 2. 함수의 매개변수의 개수, 3. 함수의 매개변수의 타입



public class Day9_OverLoading {
	public static void main(String[] args) {			
			sum(10,20);
			sum(1.23,3.12);
			sum(10,20,30);
		
	}
	// 메서드의 매개변수 타입에 변화
	static void sum(int x, int y) {
		System.out.println(x+y);	
	}
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	//메서드의 매개변수 개수에 변화
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
		
}



