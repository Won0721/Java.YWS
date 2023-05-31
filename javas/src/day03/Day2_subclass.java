package day03;
// 클래스 상속 부모클래스(슈퍼클래스) - > 자식클래스(서브클래스)
// class 클래스명 extends 부모클래스명{ }  
// 다중상속을 지원하지 않음.
// 클래스 앞 final 키드는 다른클래스가 상속 불가
public class Day2_subclass {
	public static void main(String[] args) {
		Student st = new Student();
		st.breath();
		
		Teacher t = new Teacher();
		t.eat();
		t.teach();
		
		
		
		
	}

}


class Person{
	void breath() {
		System.out.println("숨 쉬기");
	}
	void eat() {
		System.out.println("먹기");
	}
	void say() {
		System.out.println("말하기");
	}
	
}
class Student extends Person{
	void study() {
		System.out.println("배우기");
	}
}
class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}

