package day02;

public class DayB_CarExam {
	public static void main(String[] args) {
//		 클래스명 참조변수 = new 클래스명();
		 Car myCar =new Car();
		 System.out.println("시동 처음 초기화:"+ myCar.powerOn);		// 처음엔 false
		 System.out.println("차의 색상 초기화:"+ myCar.color);		// 처음엔 null
		 System.out.println("바퀴의 수 초기화:"+ myCar.wheel);		// 첨엔 0
		 System.out.println("속력 초기화:"+ myCar.speed);
		 System.out.println("와이퍼 작동 초기화:"+ myCar.wiperOn);
		 
		 System.out.println();
		 
		 myCar.power();
		 System.out.println("시동 메서드 동작 트루:" + myCar.powerOn);
		 
		 myCar.power();
		 System.out.println("시동 메서드 다시 동작 펠즈:"+myCar.powerOn);
		 
		 myCar.color = "black";
		 System.out.println("차량 색상:"+myCar.color);
		 
		 
		 
	}
}

class Car{
	boolean powerOn; // 시동
	String color; // 색
	int wheel;	// 바퀴수
	int speed;	// 속력
	boolean wiperOn; // 와이퍼 작동
	
	void power() {powerOn=!powerOn;} // true -> false, false -> true
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn=!wiperOn;} // true -> false, false -> true
}
