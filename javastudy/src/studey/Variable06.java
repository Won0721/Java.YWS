package studey;
/*
 *  5. String 형(문자열)
 *  	문자열을 저장할 수 있다.
 *  	참조형 변수
 *  
 *  선언방법
 *  String 변수명;
 *  
 *  기본형 - boolean, char, byte, short, int, long, float, double
 *  참조형 - 기본형을 제외한 모든 객체(클래스 코드로 되어있다)
 *  	   주소 값을 저장
 *  	   속성(변수)
 */
public class Variable06 {
	public static void main(String[] args) {
		
		String hello = "hello";
		System.out.println("1번 인덱스 :"+ hello.charAt(1));
		System.out.println("2번 인덱스부터 4번 인덱스 : "+ hello.substring(2, 4));
		
	}

}
