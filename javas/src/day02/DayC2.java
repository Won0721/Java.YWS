package day02;

public class DayC2 {
	public static void main(String[] args) {
			System.out.println(Car3.wheel);
		
			Car3 mycar1 = new Car3();
			System.out.println(mycar1.speed);
			
			Car3 mycar2 = new Car3();
			
			System.out.println("<변경 전>");
			System.out.println("mycar1.speed:" + mycar1.speed);
			System.out.println("mycar2.speed:" + mycar2.speed);
			System.out.println("mycar1.wheel:" + mycar1.wheel);
			System.out.println("mycar2.wheel:" + mycar2.wheel);
			
			mycar2.speed = 100;
			mycar2.wheel = 5;
			
			System.out.println("<변경 후>");
			System.out.println("mycar1.speed:" + mycar1.speed);
			System.out.println("mycar2.speed:" + mycar2.speed);
			System.out.println("mycar1.wheel:" + mycar1.wheel); // static을 사용했기에 공통적으로 값을 가짐
			System.out.println("mycar2.wheel:" + mycar2.wheel); 
			
		
		
	}

}
class Car3{
		static int wheel =4; // 클래스 변수
		int speed; // 인스턴스 변수
	
}