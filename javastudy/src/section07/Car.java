package section07;

public class Car {
	int wheel = 4;
	String color;
	String name;
	Car(){}
	Car(String name){
		this.name = name;
		
	}

	// 메소드 - 객체에서 기능역할
	public void drive() {
		System.out.println("운전을 해요");
	}
	
}
