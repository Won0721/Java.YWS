package day22.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {
		// 스트림 사용 이유 : 방법이 같아짐
		Integer[] arr = {1,2,3,4,5};
		
		
		// 기본 형태 
//		List<String> list = Arrays.asList("Toy", "Robot", "Box");
//		list.stream()
//			.forEach(s -> System.out.println(s));
		
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> arrStream = Arrays.stream(arr);
		Stream<Integer> listStream = list.stream();
		
		// 전체출력 
		// 매개변수 ㅇ 리턴타입 없음
		arrStream.forEach(num -> System.out.print(num + " "));
		System.out.println();
		listStream.forEach(num -> System.out.print(num + " "));
		System.out.println();
		
		System.out.println("==필터사용==");
		
		// 3 보다 큰 수 출력
		// 매개변수 o 리턴타입 boolean
		// 스트림은 한번 사용하면 사라지기에 다시 만들어줘야함
		arrStream = Arrays.stream(arr);
		arrStream
				.filter(num -> num>3)
				.forEach(num -> System.out.println(num));
		
		listStream = list.stream();
		System.out.println("");
		listStream
		.filter(num -> num>3)
		.forEach(num -> System.out.println(num));
		
	}

}
