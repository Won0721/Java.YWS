package day02;
//클래스로 객체 만드는법
// 클래스명 자료형 참조변수 = new 클래스명();

//참조변수 : 클래스로 생성된 객체 값(인스턴스) 저장할 공간
//new : 메모리 할당
//클래스명() : 클래스로 객체 만들어라

public class DayB_ClassEx {
	public static void main(String[] args) {
// 		자료형 변수 = 객체값;
//		클래스명 참조변수 = new 클래스명();
		ClassA ca = new ClassA();
		
//		객체 내 값을 사용하는 방법 : 객체변수.필드명
		System.out.println(ca.x);
		ca.f1();
		
// 		객체 내 변수 사용
		ca.x = 30;
		System.out.println(ca.x);
	}
}

class ClassA {
	int x=10;
	void f1() {
		System.out.println("f1()");
	}
	
	
	
}
