package practice;

public class EXX {
	public static void main(String[] args) {
		A1 ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		// 
		System.out.println("오버라이딩된 함수 출력 ");
		System.out.println();
		System.out.print("C클래스의 객체를 받는 A1타입형의 함수 : ");
		ref1.rideMethod();
		System.out.print("C클래스의 객체를 받는 B타입형의 함수 :");
		ref2.rideMethod();
		System.out.print("C클래스의 객체로 받는 생성된 C타입형 함수1타입형 :");
		ref3.rideMethod();
		System.out.println();
		System.out.println("오버로딩 함수:");
		System.out.println();
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.2);
		System.out.println();
		Person p = new Student();
		System.out.print("자식클래스에 오버로딩되어 자식클래스의 메서드로 호출됨(다형성) : ");
		p.run();
		System.out.println();
		System.out.print("참조변수의 참조형은 부모클래스이기에 부모클래스의 메서드만 호출 가능 : ");
		p.breath();
		
		
	}

}
class Person{
	public void breath() {
		System.out.println("숨쉬다");
	}
	public void run() {
		System.out.println("Person run");
	}
}

class Student extends Person{
	public void study() {
		System.out.println("공부하다");
	}
	public void run() {
		System.out.println("사람 런 ");
		super.run();
	}
}	

class A1{
	public void rideMethod() {
		System.out.println("A1 method");
	}
	public void loadMethod() {
		System.out.println("void Method");
	}
}
class B extends A1{
	public void rideMethod() {
		System.out.println("B method");
	}
	public void loadMethod(int num) {
		System.out.println("int Method");
	}
}
class C extends B{
	public void rideMethod() {
		System.out.println("C method");
	}
	public void loadMethod(double num) {
		System.out.println("double Method");
	}
}
