package day14.inheritance;

public class ExEx {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		
		Person p2 = new Student();
		
		//부모클래스
		p.breath();
		p.run();
		p.eat();
		
		//자식클래스
		s.breath();
		s.run();
		s.eat();
		s.study();
		
		//자식클래스의 객체를 부모클래스 타입으로 업캐스팅
		p2.breath();
		p2.run();
		p2.eat();
		//p2.study(); 자식클래스의 메서드 사용불가
		
		
	}

}

class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void run() {
		System.out.println("달리기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
}

class Student extends Person{
	void study() {
		System.out.println("공부하기");
	}
}