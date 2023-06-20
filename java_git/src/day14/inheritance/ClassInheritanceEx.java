package day14.inheritance;

import lombok.Data;

public class ClassInheritanceEx {
	public static void main(String[] args) {
		/* 스마트폰은 폰이다. = > 상속
		 * 	- 스마트폰 : 자식 클래스
		 * 	- 폰 : 부모 클래스
		 * 
		 * 부모 클래스에게 상속 받은 기능들은 사용할 수 있다.
		 * 	- 접근제어자가 public 또는 protected 인 경우
		 * 	- 디폴트는 같은 패키지인 경우 가능하나 다른 패키지면 불가능
		 * 
		 * 스마트폰은 카메라를 가지고 있다. => 포함
		 * 	- 스마트폰 : 클래스
		 * 	- 카메라 : 멤버변수
		 * 
		 */
		SmartPhone phone1 = new SmartPhone();
		System.out.println("스마트폰 인스턴스화");
		phone1.call("010-1234-5678");
		phone1.answer("02-123-4567");
		System.out.println();
		
		// 부모클래스에서 멤버변수를 private으로 설정하면 자식클래스에서 사용불가
		// 사용하려면 부모클래스에서 getter를 만들어야함
		System.out.println(phone1.getNum());
		phone1.take();
		
		// 다운캐스팅이 안되는 경우
		Phone p1 = new Phone("02-123-3456");
		// 문법적으로 에러가 발생하지 않지만 예외가 발생 : 다운캐스팅이 안되는 경우
		if(p1 instanceof SmartPhone) {
			SmartPhone c1 = (SmartPhone) p1;
			c1.call("국제번호");
		}
		
		
		// 다운캐스팅이 되는 경우
		Phone p2 = new SmartPhone(); // 업캐스팅
		System.out.println("업캐스팅 자식클래스(SmartPhone) 객체를 부모타입(Phone)으로 변환  ");
		p2.call("123-4567");
		
		SmartPhone c2 = (SmartPhone) p2;
		System.out.println("다운캐스팅 후 업캐스팅한 객체를 자식타입으로 변환");
		c2.call("123-4567");
	
	}
}
@Data
class Phone{
	private String num = "010-1111-5555"; // 전화번호

	
	// 전화 걸기
	public void call(String num) {
		System.out.println(num); // 내가 전화 거는 상대방 번호
		System.out.println("calling...");
	}
	// 전화 받기
	public void answer(String num) {
		System.out.println(num); // 나한테 전화를 건 상대방 번호
		System.out.println("Answering...");
	}
	
	public Phone(String num) {
		this.num = num;
	}
	
	//public Phone() {} // 생성자가 하나도 없으면 컴파일할 때 기본 생성자가 자동으로 추가
	
}

class Camera{
	public void take() {
		System.out.println("take a picture");
	}
	
}


class SmartPhone extends Phone{
	Camera camera = new Camera();
	
	public void take() {
		camera.take();
	}
	
	public SmartPhone() {
		// 부모 클래스의 생성자가 호출
		// super() 를 이용하여 부모 클래스의 생성자를 직접 호출하지 않으면 
		// 기본 생성자인 super()가 자동으로 추가가 되고 호출이 됨.
		// 이 때, 부모 클래스의 기본 생성자가 없음 에러가 발생
		// super(); //에러발생
		super("");
	}

	@Override
	public void call(String num) {
		super.call(num);
		System.out.println("SmartPhone");
	}

	@Override
	public void answer(String num) {

		super.answer(num);
		System.out.println("SmartPhone");
	}


	
	
	
}

