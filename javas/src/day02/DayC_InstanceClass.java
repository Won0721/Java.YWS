package day02;
//인스턴스 : 클래스로 실제 메모리에 생성된 객체\

//클래스 변수 생성방법
//class 클래스명{
//		static 자료형 변수명;  }
//		static 을 사용하면 어떠한 객체여도 동일한 값을 부여함.
public class DayC_InstanceClass {
		public static void main(String[] args) {
			Member member1 = new Member();
			Member member2 = new Member();
			Member member3 = new Member();
			Member member4 = new Member();
			
			
			member1.name ="김철수";
			member1.age = 32;
			member1.gender="남자";
			
			member2.name ="김민호";
			member2.age = 28;
			member2.gender="남자";
			
		
			member3.name ="이영희";
			member3.age = 24;
			member3.gender="여자";
			
			
			member4.name ="고석천";
			member4.age = 32;
			member4.gender="남자";
			
			Member.centerName = "Bye";
			System.out.println("member1------");
			member1.info();
			System.out.println("member2------");
			member2.info();
			System.out.println("member3------");
			member3.info();
			System.out.println("member4------");
			member4.info();
	
			
			
		}
}
class Member{
	static String centerName = "hello";
	String name;
	int age;
	String gender;
	void info() {
		System.out.println("centerName:" + centerName);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("gender:" + gender);
	}
}

