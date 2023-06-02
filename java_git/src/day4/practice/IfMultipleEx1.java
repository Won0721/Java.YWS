package day4.practice;

import java.util.Scanner;

public class IfMultipleEx1 {
	public static void main(String[] args) {
		// 정수 num를 입력받아 2의배수인지 아닌지 판별하는 코드 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int num = sc.nextInt();
		
		if(num % 2 ==0) {
			System.out.println(num+" is 2 baesoo");
		}
		else {
			System.out.println(num+" is not 2 basesoo");
		}
		
		
	}

}
