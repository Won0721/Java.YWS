package day02;

import java.util.Arrays;

public class Day7_Array_For_Each {
	//System.array(src, srcPos, dest, destPos, length);
	//src : 복사할 배열
	//srcPos : 복사를 하기 시작할 인덱스(위치)
	//dest : 덮어쓸 배열
	//destPost : 덮어쓰기 시작할 인덱스(위치)
	// length : 복사할 길이
	
	public static void main(String[] args) {
			int [] a = {1,2,3,4,5,6};
			int [] b = {0,0,0,0,0,0,0};
			//Arrays.toString : 배열에 정의된 값들을 문자열 형태로 만들어서 리턴하는 메서드
			System.out.println(Arrays.toString(a)); // => [1,2,3,4,5,6]
			System.out.println(Arrays.toString(b)); // => [0,0,0,0,0,0,0]
			System.arraycopy(a, 2, b, 3, 4);
//			= > [0,0,0,3,4,5,6]
// 			a 라는 배열에서 2번째부터 복사해서 b의 3번째 인덱스부터 복사

// for each : 배열을 순환 할 시 , 반복문보다 편리하게 순환할 수 있도록 새로운 문법을 제공
// for(자료형 변수명:배열명){ 변수가 배열을 순환하면서 반복할 명령};
			
			String c[] = {"Java","Hello","Programming"};
			for(String i:c) {
				System.out.println(i);
			}
			
			int d[] = {1,2,3,4,5};
			for(int i:d) {
				System.out.print(i); // 1,2,3,4,5
				
			}
			
	}

}
