package day1.variable;
// float (4byte)  
// double (8byte)
public class FloatEx {
	public static void main(String[] args) {
		double num1 = 3.14;
		
		// 기본 실수 리터럴은(3.14와 같은) 타입이 double이다.
		// double은 8바이트이기 때문에 float(4바이트)에 저장할 수 없다.
		// 접미사 f나 F를 붙여야 함.
		
		float num2 = 3.14f;
	}

}