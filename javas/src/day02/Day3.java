package day02;

public class Day3 {
	public static void main(String[] args) {
		
	
/*	
	1 byte : 8 bit
	정수형 int, long, short 	4, 8, 2(byte)	1,0,-1,2,100
	실수형 float, double 			4,8				3.14F,3.14
	문자형 char					2				'a','A'
	문자열 String					?			"hello","A"
	논리형 boolean				1			true,false
*/
// 형변환
		int a = 65;
		float f = a;	  // 묵시적 형변환(자동형변환)
		System.out.println(f);
		char c = (char) a; // 명시적 형변환(강제형변환) 방법 :(자료형) 변수
		System.out.println(c);
		
		System.out.println("==============");
		
// 상수 : 항상 유지되는수(변하지않는수)
// final 자료형 변수명;  -> 해당 자료형의 변수명은 모든 글자를 대문자로 변경 (코드의 가독성때문에)
		int b = 3;
		c = 4; 
		
		final double PI = 3.14;

		
	}
}
