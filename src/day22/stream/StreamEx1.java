package day22.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEx1 {

		
		// 배열 대상 스트림 생성 대표 메소드
	//	public static <T> Stream<T> stream(T[] array) //Arrays 클래스에 정의
	
	public static void main(String[] args) {
		
//		String[] names = {"Yoon","Lee","Park"};
//		Stream<String> stm = Arrays.asList(names); * Stream형태로 받으면 에러뜸 List<String> 으로 받아야함
//		stm.forEach(s -> System.out.println(s));
		
	//  위에있는 코드를 간략화 한 것 
		String[] names2 = {"Yoon","Lee","Park"};
		Arrays.stream(names2)
			  .forEach(s -> System.out.println(s));
		
	}

}
