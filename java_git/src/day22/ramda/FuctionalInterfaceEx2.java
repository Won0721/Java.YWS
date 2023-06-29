package day22.ramda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FuctionalInterfaceEx2 {
	public static void main(String[] args) {
		
		//Supplier 인터페이스
		// 매개변수 없음 , 리턴타입 있음
		Supplier<String> supplier = ()->"Hi";
		System.out.println(supplier.get());
		
		//Function 인터페이스 
		//Function <T,K> T : 매개변수 , K: 리턴타입
		Function<Student, String> fuction = std -> std.getName();
		System.out.println(fuction.apply(new Student(1, 1, 1, "Hong")));
		
		//UnaryOperator 인터페이스
		UnaryOperator<Student> operator = std-> {
			std.setGrade(2);
			return std;
		};
		System.out.println(operator.apply(new Student(1, 1, 1, "Hong")));
		//Predicate 인터페이스
		// Predicate<T> T : 매개변수 , 리턴타입 boolean
		
		Predicate<Student> predicate = s -> s.getName().indexOf("Hong") == 0;
		System.out.println(predicate.test(new Student(1, 1, 1, "Hong")));

}
}
