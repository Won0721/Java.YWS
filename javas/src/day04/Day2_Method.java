package day04;
//추상메서드 : 선언 부만 정의하고 구체적인 내용은 비워놓는 메서드
// abstract 리턴타입 메서드명(); 구현하지 않으므로 "{}"생략하고 ";"로 마무리
// 추상 클래스 : 추상 메서드를 멤버(필드)로 갖는 클래스
// 구조
// abstract class 클래스명{
//		abstract 리턴타입 메서드명(); }
// 사용 목적 : 구현은 자식 클래스가 하도록 메서드의 기능을 비워놓고 싶을 때 사용

public class Day2_Method {
	public static void main(String[] args) {
		Shape shapes[] = new Shape[3];
		// 부모의 객체 배열요소에 자식 값 넣기 => 업캐스팅
		shapes[0] = new Rect();
		shapes[1] = new Circle();
		shapes[2] = new Line();
		
		for(int i=0; i<3; i++){
			shapes[i].draw();
		}
		
	}

}

abstract class Shape{
	abstract void draw(); // 부모클래스의 객체 바디가 불편할때 추상메서드 이용
	
}

class Rect extends Shape{
	void draw() {
		System.out.println("사각형을 그리다");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그리다");
	}
}
class Line extends Shape{
	void draw() {
		System.out.println("선을 그리다");
	}
}