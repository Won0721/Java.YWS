package day22.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

public class StreamEx2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student(1,1,1,"Hong",100,90,80),
				new Student(1,1,2,"Lingg",10,30,50),
				new Student(2,1,1,"Park",60,30,100),
				new Student(3,1,1,"Lee",50,40,20),
				new Student(3,3,2,"Kim",20,30,40));
			
		// 국어 성적이 60점 이상인 학생들의 이름을 출력
		Stream<Student> listStream = list.stream();
		listStream
				.filter(s -> s.getKor() >= 60) // 조건을 걸어줌
				.map(s -> s.getName()) // 맵은 타입을 바꿔줌 
				.forEach(s -> System.out.println(s));
		
		listStream = list.stream();
		
		listStream
				.filter(s -> s.getKor() >= 60)
				.forEach(s -> System.out.println(s.getName()));

		// 국어 성적의 총합 출력
		listStream = list.stream();
		int sum = listStream.mapToInt(s -> s.getKor()).sum();
		System.out.println(sum);
		
		// 국어 성적의 평균
		listStream = list.stream();					// average 평균이라는 객체를 가져온 후 double형으로 바꿔줌
		double avg = listStream.mapToDouble(s -> s.getKor()).average().getAsDouble();
		System.out.println(avg);
		
		// 국어 성적의 총합
		listStream = list.stream();	// 초기값 0을 a에 넣고 추가된 getKor로 추가된 값을 b 
									// 그리고 a+b 계산된  a+b값을 다시 a로 보내고 b에 다음 값
		sum = listStream.map(s -> s.getKor()).reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		
	}

}
@Data
@AllArgsConstructor
class Student{
	int grade, classNum, num;
	String name;
	int kor, math, eng;
}
