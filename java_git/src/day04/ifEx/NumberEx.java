package day04.ifEx;

import java.util.Scanner;

public class NumberEx {
	public static void main(String[] args) {
		/* 정수 num가 양수이면 positive number라고 출력하고
		 * 음수이면 negative number 라고 출력
		 * 0이면 0으로 출력하는 코드를 작성하세요
		 */
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		num = sc.nextInt();
		String result ="";
		if(num>0) {
			result ="positive number";
			
		}
		else if(num<0) {
			result = "negative number";
		}	
		else {
			result = "zero";
		}
		System.out.println(num + " is " + result);
	}

}
