package day22.ramda;

import java.util.function.Consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

public class FuctionalInterfaceEx {
	public static void main(String[] args) {
		//	매개변수 1개라 (s) 괄호 생략 가능 
		// s : 매개변수
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("Hong");
		
		
		Consumer<Student> consumer2 = s -> System.out.println(s.getName());
		Student std = new Student(1, 1, 1, "Hong");
		consumer2.accept(std);
		
		// 일반
		System.out.println();
		System.out.println("일반식");
		printStudent(std);
		printStudnetName(std);
		System.out.println();
		System.out.println("람다식 사용");
		
		//람다
		printStudent(std, s->System.out.println(s));
		printStudent(std, s -> System.out.println(s.getName()));
		
		printStudent(std, s->{
			System.out.println("grade : " + s.getGrade());
			System.out.println("class : " + s.getClassNum());
			System.out.println("num : " + s.getNum());
			System.out.println("name : " + s.getName());
			}
		);
	}
	
	// 학생 클래스의 전체 정보 출력
	public static void printStudent(Student std) {
		System.out.println(std);
	}
	
	// 학생 이름 출력
	public static void printStudnetName(Student std) {
		System.out.println(std.getName());
	}
	public static void printStudent(Student std, Consumer<Student> con) {
		con.accept(std);
	}
	

}

@Data
@AllArgsConstructor // 생성자 만듬
class Student{
	int grade, classNum, num;
	String name;
}

	
	

