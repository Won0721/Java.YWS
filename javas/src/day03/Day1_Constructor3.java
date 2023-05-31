package day03;
//기본 생성자(default 생성자)
// 구현부								호출부
//		클래스명(){}						클래스명();

// 매개변수 생성자
// 구현부								호출부
//		클래스명(자료형 변수명..){}			클래스명(값);
public class Day1_Constructor3 {
	public static void main(String[] args) {
		Bclass b1 = new Bclass("가길동");
		Bclass b2 = new Bclass(); // 오류남  해결하려면 기본생성자를 구현해야함
		System.out.println(b1.name);
		
	}

}
class Bclass{
	String name;
	// 생성자 오버로딩
	Bclass(){} // 12행 해결하기위해 생성
	Bclass(String name2){ // 매개변수 생성자
		System.out.println("Bclass의 매개변수생성자()가 호출됨");
		this.name = name2;
		// this : 현재 객체를 지칭하기 위한 키워드
		//		  매개변수의 변수명과 객체내 변수의 이름이 같을 경우 사용
	}
}