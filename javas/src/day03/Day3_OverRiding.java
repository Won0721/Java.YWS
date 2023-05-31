package day03;
// 오버로딩 : 메서드 중복정의				오버라이딩: 상속관계에 있는 자식클래스가 부모 클래스의 메서드를 다시 정의하는 
// 메시드의 시그니처
// 함수명
// 매개변수 개수
// 매개변수타입


public class Day3_OverRiding {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.say();

		
	}

}

class Student2{
	void learn(){
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say(){ 
		System.out.println("선생님 안녕하세요~");
	}
}

class Leader extends Student2{
	void lead() {}
	void say() { // 메서드 오버라이딩
		System.out.println("선생님께 인사");
		super.say(); // 부모 클래스의 생성자 호출방법
					 // 무조건 자식 클래스의 생성자 첫줄에서 이뤄짐
	}
}
