package section07;
/*
 *
 * 클래스 구조
 * (접근제한자) class 클래스명 (extends 상속클래스) (implements 인터페이스 상속){// 클래스 선언부
 *		(생성자) = > 초기화 목적
 *		변수(멤버변수,멤버필드) = > 속성
 *		메소드(멤버메소드) => 기능
 *
 * 객체화 방법 => new 연산자로 인스턴스화 가능
 * 클래스명(타입) 변수명 = new 클래스();
 * }
 * 
 */

public class Ss7 {
	public static void main(String[] args) {
		Car c1 = new Car(); // 클래스를 이용해서 객체 생성
		Car c2 = new Car();
		Car c3 = new Car("새차");
		System.out.println(c1.name);
		System.out.println(c3.name);
		System.out.println("wheel 개수:" + c1.wheel);
		System.out.println("c2 바퀴의 개수: " + c2.wheel);
	}
}


