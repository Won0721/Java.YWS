package day15.polymorphism;

import org.w3c.dom.html.HTMLModElement;

public class InstancePolymorphismEx {
	public static void main(String[] args) {
		/* Tv 1대, 에어컨 2대, 라디오 3대를 객체로 생성한 후
		 * 전원을 켜는 기능을 실행해보세요
		 * */
		Remote remote = new Remote();
		Tv tv1 = new Tv();
		
		AirConditioner ac1 = new AirConditioner();
		AirConditioner ac2 = new AirConditioner();
		
		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		Radio radio3 = new Radio();
		System.out.println("리모트로 turnOn");
		System.out.print("Tv ");    remote.turnOn(tv1);
		System.out.print("에어컨1 "); remote.turnOn(ac1);
		System.out.print("에어컨2 "); remote.turnOn(ac1);
		System.out.print("라디오1 "); remote.turnOn(radio1);
		System.out.print("라디오1 "); remote.turnOn(radio2);
		System.out.print("라디오1"); remote.turnOn(radio3);
		
		System.out.println();
		Tv tv = new Tv();
		AirConditioner[] aircons = new AirConditioner[2];
		Radio[] radios = new Radio[3];
		
		for(int i=0; i<aircons.length; i++) {
			aircons[i] = new AirConditioner();
		}
		for(int i=0; i<radios.length; i++) {
			radios[i] = new Radio();
		}
		
		
		tv.turnOn();
		for(AirConditioner aircon : aircons) {
			remote.turnOn(aircon);
		}
		
		for(Radio radio : radios) {
			remote.turnOn(radio);
		}
		
		// 포함 다형성 예제, 객체 다형성 예제
		int tvCount = 1, airconCount = 2, radioCount = 3;
		int total= tvCount + airconCount + radioCount;
		HomeAppliance[] homeAppliances = new HomeAppliance[total];
		int count = 0; // 현재 만들어진 제품 대수
		// tv 1대 생성
		for(int i=0; i<tvCount; i++) {
			homeAppliances[count++] = new Tv();
		}
		//aircon 2대 생성
		for(int i=0; i< airconCount; i++) {
			homeAppliances[count++] = new AirConditioner();
		}
		// 라디오 3대 생성
		for(int i=0; i<radioCount; i++) {
			homeAppliances[count++] = new Radio();
		}
		
		// 모든 제품의 전원을 켬
		
		for(HomeAppliance homeApp : homeAppliances) {
			remote.turnOn(homeApp);
		}
		
		// 모든 라디오의 전원을 끔
		for(HomeAppliance homeApp : homeAppliances) {
			// 라디오로 다운캐스팅이 가능한 객체만 끔 => 라디오만 끔
			if(homeApp instanceof Radio){ // 라디오 클래스의 객체로 이용한 업캐스팅한 객체(homeApp)인경우 true
				remote.turnOff(homeApp); // 다운캐스팅 아님 
				Radio radio = (Radio) homeApp; // 다운캐스팅
				System.out.println(radio.frequency);
			}
		}
	
		
		
		
		
	}

	
	
}
class Remote{
	void turnOn(HomeAppliance homeApp) {
		homeApp.turnOn();
	}
	void turnOff(HomeAppliance homeApp) {
		homeApp.turnOn();
	}
	
}


class Tv extends HomeAppliance{
	int channel;
}

class AirConditioner extends HomeAppliance{
	double currentTemperature;
	double desiredTemperature;
}

class Radio extends HomeAppliance{
	double frequency;
}

class HomeAppliance{
	boolean power;
	void turnOn() {
		power = true;
		System.out.println("켜졌습니다.");
	}
	void turnOff() {
		power = false;
	}
}
