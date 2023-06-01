package day2.homework;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.print("두 정수와 산술 연산자를 입력하세요 : ");
		String str1 = sc.nextLine();
		System.out.println(str1);
		
		System.out.print("두 정수를 입력하세요 :");
		int num1;
		int num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(""+num1+ " + " + num2 + " = " + (num1 + num2));
		System.out.println(""+num1+ " - " + num2 + " = " + (num1 - num2));
		System.out.println(""+num1+ " * " + num2 + " = " + (num1 * num2));
		System.out.println(""+num1+ " / " + num2 + " = " + (num1 / num2));
		System.out.println(""+num1+ " % " + num2 + " = " + (num1 % num2));
		
		
		
		
	}

}
