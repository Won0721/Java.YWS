package day2;

import java.util.Scanner;

public class Day2_scanner2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
//		문자열을 제외한 데이터를 입력받은 후 nextLine() 메소드가 실행이 되야 한다면 키보드 버퍼의 엔터키를 읽어들이는 문제가 발생된다.
//		문자열을 제외한 데이터를 입력받은 후 키보드 버퍼를 비워주는 동작을 실행하고 nextLine() 메소드를 실행한다
		sc.nextLine();		// 키보드 버퍼를 비운다
		
		String name = "";
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
				
		System.out.println(name + "님은 " + age + "살 입니다.");
		
		
		
		sc.close();

	}

}
