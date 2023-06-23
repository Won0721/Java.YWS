package day18.practice;

import java.util.Scanner;

public class StringSplitEx {
	public static void main(String[] args) {
		// 문장을 입력받아 단어의 개수를 출력하는 코드를 작성하세요.
		// input : Hi. My name is hong.
		// word : 5
		Scanner sc = new Scanner(System.in);
		String str = "Hi. My name is hong.";
		String strSc = sc.nextLine();	
		
		String [] arr = str.split(" ");
		String [] scArr = strSc.split(" ");
		System.out.println(scArr.length);
	
	
		System.out.println(arr.length);
	}

}
