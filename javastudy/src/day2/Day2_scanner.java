package day2;

import java.util.Scanner;

public class Day2_scanner {
	
	public static void main(String[] args) {
		
// 		키보드를 통해서 데이터를 입력받는 스캐너
		Scanner sc= new Scanner(System.in);
		
//		next() : 문자열을 입력받는다.(띄어쓰기 전까지)
//		nextline() : 문자열을 입력받는다.(한줄 전체를 입력받음)
//		nextline() 메소드는 키보드 버퍼가 비어 있을 경우 입력을 요구하며 대기하고 키보드 버퍼가 비어있지 않으면 키보드 버퍼 전체의 내용을 
//		읽어들인다.
		
		String addr = "";
		System.out.print("주소를 입력하세요 : ");
		addr = sc.nextLine();
		
		String name = "";
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.println(name + "님은" + addr + "에 삽니다." );

		
		
		
		sc.close();
	}

}
