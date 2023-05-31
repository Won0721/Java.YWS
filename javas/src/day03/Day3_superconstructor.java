package day03;

public class Day3_superconstructor {
	public static void main(String[] args) {
	SportsCar mycar = new SportsCar("red",300);
	System.out.println(mycar.color);
	System.out.println(mycar.speedLimit);
	
	}
}

class Car{
	int wheel;
	int speed;
	String color;
//	Car(){}		//오류해결 첫번째 방법 디폴트생성자를 만들어줌
	Car(String color){
		this.color = color;
	}
}
class SportsCar extends Car{
	int speedLimit;
	SportsCar(String color,int speedLimit){  //1. 오류발생이유: 자식클래스에서 생성자 호출 시 부모클래스의 디폴트 생성자가 
		super(color);	//오류해결 두번째 방법                    자동으로 호출되기 때문에 부모의 디폴트 생성자가 존재해야함	
		this.color=color;					
		this.speedLimit=speedLimit;			
	}
}