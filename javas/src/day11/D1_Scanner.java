package day11;

import java.util.Scanner;

public class D1_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오:");
		String name =sc.nextLine();

		System.out.println(name+"님 환영해요");
	}

}
