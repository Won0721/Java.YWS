package day04;
// 업 캐스팅
// 자식 클래스의 객체가 부모클래스의 참조변수로 형 변환 되는 것
// 구조
// 부모클래스 변수 = 자식 객체값;

public class Day1_Upcasting {
	public static void main(String[] args) {
		Student st1 = new Student("가길동", 20, "게임하기", 3);
		st1.info();
		System.out.println();
		st1.study();
		System.out.println();
		//업 캐스팅
		Human h1 = new Student("나길동",17,"롤하기",4);
		h1.info();
		
		
	}

}

class Human{
	String name;
	int age;
	String hobby;
	// 마우스 우클릭 > Source > Generate Constructor using Fields
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("hobby:"+hobby);
	}		
}
class Student extends Human{
	int grade;
	public Student(String name,int age,String hobby,int grade) {
		super(name,age,hobby);
		this.grade = grade;
	}
	void info() {// 오버라이딩
		super.info();
		System.out.println("grade:"+grade);	
	}
	void study() {
		System.out.println("공부하기");
	}
}


