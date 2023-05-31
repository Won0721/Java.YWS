package day04;
//인터페이스 : 물체들 사이에서 상호작용 할 수 있도록 하는 매개 역할
// 인터페이스의 멤버 - 상수 : final 타입 변수명 = 값;
//				- 추상메서드 : abstract 리턴 타입 메서드명 ();
// interface 인터페이스명{필드
//		};
// 클래스로 인터페이스 구현 
// class 클래스명 implements 인터페이스명{   }
// ** 인터페이스로 객체 생성불가
public class Day3_Interface {
	public static void main(String[] args) {
		D d = new D();
		d.methodA();
		d.methodB();
		
		
		
	}

}
interface Ainter{
	final int x=10;
	int y=20;		//final 생략 가능
	abstract void methodA();
	void methodB();		// abstract 생략 가능
}
class D implements Ainter{

	
	public void methodA() {
		System.out.println("methodA");
		
	}

	
	public void methodB() {
		System.out.println("methodB");
		
	}
}