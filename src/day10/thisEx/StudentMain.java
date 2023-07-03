package day10.thisEx;

public class StudentMain {
	public static void main(String[] args) {
		
		
		Student1.printCount();
		//System.out.println(Student1.studentCount); // 0
		Student1 std1 = new Student1(1,1,1,"홍길동");
		Student1.printCount();
		
		Student1 std2 = new Student1(1,1,2,"임꺽정");
		Student1.printCount();
	
		Student1 std3 = new Student1();
		Student1.printCount();
		
		System.out.println(std1);
		System.out.println(std2);
		
		
		
		std1.info();
		//Student1.print(); // 에러발생. static이 info에는 안붙어서 객체를 통해 호출해야함
		std2.info();
		std3.info();
		
	}

}
class Student1{
	// 객체 멤버들은 객체가 만들어진 후 추가가 됨
	private static int studentCount; // 객체가 만들어 질때마다 학생숫자 카운트를 위해
	private int grade, classNum, number; // 학년 반 번호
	private String name; // 이름
	// 생성자 생성
	public Student1(int grade, int classNum, int number, String name) {
		// 매개변수와 멤버변수가 이름이 동일하여 구별해주기위해 this 사용
		this.grade = grade;
		this.classNum = classNum;
		this.number = number;
		this.name = name;
		studentCount++;  // 객체가 만들어 질때마다 학생숫자 카운트를 위해
	}
	// 기본생성자는 매개변수가 없기 때문에 this 사용 안해두됨 
	public Student1(){ 
		// 멤버변수와 이름이 같은 지역변수를 만들수도있다 (비추)
		// int grade = 10;
		
		// 다른 생성자를 호출할때 사용 this(매개변수1,매개변수2, ...) 
		// 동일 클래스 내부에서 매개변수 리스트가 일치한 생성자를 호출한다
		// Stduent1(int grade, int classNum, int number, String name) 을 호출해서 초기화(?) 시킴 
		this(1,1,1,"");
		/* 상위 this(1,1,1,"")를 풀어 쓴 것
		grade = 1;
		classNum = 1;
		name = "";*/
	}
		// 객체 메서드
		public void info() {
			System.out.println("===============");
			System.out.println("grade : " + grade);
			System.out.println("classNum : " + classNum );
			System.out.println("number : " + number);
			System.out.println("name : " + name);
			//클래스 변수 사용 가능
			System.out.println("count :" + studentCount);
			// 클래스 메서드 사용가능
			printCount();
		}
		// 클래스 메서드
		public static void printCount() {
			// 클래스 변수 사용 가능
			System.out.println("등록된 학생 수 " + studentCount);	
			
			/* 객체변수 사용불가능
			 * grade = 1; 
			   객체 메서드 사용 불가능
			   static이므로 객체를 생성하기 전에 메모리에 할당되어있음 
			 info();*/
			// 객체를 생성 후 호출해서 사용 가능
//			Student1 std1 =new Student1();
//			std1.name = "hong";
//			std1.info();
		}
	
	}
	

