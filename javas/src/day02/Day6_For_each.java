package day02;

import java.util.Scanner;

public class Day6_For_each {
// 3개의 과일을 저장하는 문자열 fruits[] 배열을 만들어서 사용자에게 3개의 과일의 이름을 입력을 받아 fruits에 저장
// for-each 문을 사용해서 입력받은 과일의 이름을 출력하는 코드 실행
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String fruits[] = new String[3];
		for(int i= 0; i<3; i++) {
				System.out.print("주문할 과일 :");
				fruits[i]=sc.next();
		}
		
		System.out.println("---주문받은 과일---");
		for(String eachFruit:fruits) {
			System.out.print(eachFruit+" ");
		}
	}

}
