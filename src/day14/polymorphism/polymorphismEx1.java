package day14.polymorphism;

public class polymorphismEx1 {
	public static void main(String[] args) {
		/* 매개변수의 다형성 
		 * 리모컨으로 여러 제품의 전원을 켜는 예제
		 * 제품 : Tv, 에어컨, 라디오
		 * 리모컨 클래스, tv클래스 , 에어컨 클래스, 라디오 클래스
		 * */
		System.out.println("각각 객체에 turnOn turnOff 기능 추가");
		Tv tv1 = new Tv();
		Radio radio1 = new Radio();
		AirConditioner aircon1 = new AirConditioner();
		RemoteControl remocon = new RemoteControl();
		remocon.turnOn(tv1);   // tv를 켜는기능
		remocon.turnOn(radio1); // 라디오를 켜는 기능
		remocon.turnOn(aircon1); // 에어컨을 켜는 기능
		
		System.out.println("부모클래스 HomeAppliances를 상속받아 HomeAppliances 객체에만 turnOn , turnOff 기능 생성 ");
		System.out.println();
		Tv2 tv2 = new Tv2();
		Radio2 radio2 = new Radio2();
		AirConditioner2 aircon2 = new AirConditioner2();
		RemoteControl2 remocon2 = new RemoteControl2();
		
		// 매개변수 다향성
		remocon2.turnOn(tv2); // 가전을 켜는 기능
		remocon2.turnOn(radio2); // 가전을 켜는 기능
		remocon2.turnOn(aircon2); // 가전을 켜는 기능
		
		
		
	}

}

class RemoteControl{
	
	public void turnOn(Tv tv) {
		tv.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void turnOn(AirConditioner air) {
		air.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
	
	public void turnOn(Radio radio) {
		radio.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
}

class Tv{
	boolean power;
	int channel;
	void turnOn() {
		power = true;
	}
}
class AirConditioner{
	boolean power;
	double currentTemperature;
	double desiredTemperature;
	void turnOn() {
		power = true;
	}
}

class Radio{
	boolean power;
	double frequency;
	void turnOn() {
		power = true;
	}
}
class RemoteControl2{
	
	public void turnOn(HomeAppliances appliances) {
		appliances.turnOn();
		System.out.println("전원이 켜졌습니다.");
	}
	public void turnOff(HomeAppliances appliances) {
		appliances.turnOff();
		System.out.println("전원이 꺼졌습니다.");
	}
}

class Tv2 extends HomeAppliances{
	int channel;

}
class AirConditioner2 extends HomeAppliances{
	double currentTemperature;
	double desiredTemperature;

}

class Radio2 extends HomeAppliances{
	
	double frequency;
	
}

class HomeAppliances{
	boolean power;
	void turnOn() {
		power = true;
	}
	void turnOff() {
		power = false;
		
	}
}
