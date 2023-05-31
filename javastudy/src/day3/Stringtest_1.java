package day3;

public class Stringtest_1 {
	
		public static void main(String[] args) {
			
//		클래스로 만드는 모든 객체(변수)는 주소를 기억하는 참조형 변수이다.
//		문자열이 최초로 만들어지면 메모리 어딘가에 문자열이 생성되고 문자열이 생성된 주소값이 변수에 저장된다.	
		String str1 = "AAA";	// str1에는 "AAA"가 생성된 메모리의 주소가 저장된다.
		
//		메모리에 같은 내용의 문자열이 있으면 다시 만들지 않고 기존에 있는 문자열의 주소값이 변수에 저장된다.
		String str2 = "AAA";	// str2에는 str1의 저장된 "AAA"가 생성된 메모리의 주소가 저장된다.
//		"=="를 사용해서 같은가 비교할 수 있는 데이터는 기본 자료형과 NULL(아무것도 없는 상태)만 가능하다.
			
// 		관계 연산자 : 연산 결과는 true or false
//		>, >=, <, <=, ==, != 
	
//		논리 연산자
//		&& : 논리곱, AND, 두 조건이 모두 참일 경우
//		|| : 논리합, OR, 두 조건중 한개 이상 참일 경우 
//		! : 논리부정, NOT
			
//		if(조건식) {
//			조건식이 참일 경우 실행할 문장;
//			...;
//		} else {
//			조건식이 거짓일 경우 실행할 문장;
//			...;
		
//		"==" 을 사용해서 비교했으므로 변수에 저장된 문자열 자체를 비교한게 아니고 변수에 저장된 주소를 비교하게 된다.
			
		if(str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		new 라는 예약어를 사용해서 객체를 생성하게 되면 메모리에 같은 내용이 있더라도 무조건 다시 만든다.		
		String str3 = new String("AAA");

//		문자열을 비교하려 하는 경우 반드시 equals() 메소드를 사용해서 비교해야 한다.
		if(str1.equals(str3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		}
		
}




