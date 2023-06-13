package day01.variable;
/* byte (1byte)
 * short (2byte)
 * int (4byte)
 * long (8byte)
 */

public class IntEx {
	public static void main(String[] args) {
		
		int num1 = 11; // 십진수 11
		int num2 = 0b11; // 2진수 0011 == 3
		int num3 = 011; // 8진수	0011 == 9
		int num4 = 0x11; // 16진수 0011 ==17
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		// 1234567890123은 int(4바이트)로 표현할 수 없는 큰 숫자
		// long(8바이트) 타입에 큰 숫자를 저장할 경우 리터럴에 L 또는 l을 반드시 붙여야 함
		long num5 = 1234567890123L; 
		
		
		
		
	}

}
