package day2.scanner;

import java.util.Scanner;
// Ctrl + / 드래그한 행 주석
// Ctrl + Shift + O 유틸 클래스 불러오기
public class ScannerEx {
	public static void main(String[] args) {
		//System.in : 표준 입력
		//표준 입력을 이용해서 스캐너를 생성
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("정수를 입력해주세요 : ");
		int num1 = sc.nextInt(); // 정수를 입력받음
		System.out.println(num1);
		
		System.out.print("실수를 입력해주세요 : ");
		double num2 = sc.nextDouble(); // 실수를 입력받음
		System.out.println(num2);
		
		System.out.print("문자열1을 입력해주세요 : ");
		sc.nextLine();	// 상위 코드에 nextInt와 nextDouble은 입력시 엔터를 제외한 실,정수를 가져오기에 이후 버퍼에 남아있는 엔터 읽어오기 때문에 그 엔터를 빼기 위한 코드를 짜야함
		String str1 = sc.nextLine(); // 스페이스를 포함한 문자열 한줄을 읽어옴
		System.out.println(str1);
		
		System.out.print("문자열2를 입력하세요 : ");
		String str2 = sc.next(); // 첫 번째 문자부터 다음 공백(엔터, 스페이스) 전까지 읽어옴 (공백을 포함해서 입력하게 될 경우 다음 출력에 영향줌)
		System.out.println(str2);
		
		System.out.print("문자를 입력하세요 : ");
		sc.next();
		char ch = sc.next().charAt(0); // next()를 이용하여 한 단어를 읽어오고 charAt(0)를 이용하여 읽어온 단어의 첫 글자를 가져옴
		// next(); 는 공백을 버림 
		System.out.println(ch);
		
		sc.close(); // close()로 닫지 않아도 문제는 없지만 사용 안할 경우 주의표시가 생김
		
	}

}
