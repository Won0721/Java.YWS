package practice;

public class EXX {
	public static void main(String[] args) {
		A1 ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.2);
		System.out.println();
		Person p = new Student();
		p.run();
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
