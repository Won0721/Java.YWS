package day08.parctice;

import java.util.Scanner;

public class MethodGCDEx {
	public static void main(String[] args) {
		/* 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성
		 * 
		 */
		int num1, num2;
		Scanner sc =new Scanner(System.in);
		System.out.println("두 정수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		int gcd= gcd(num1,num2);
		System.out.println(num1 + "과 " + num2 +"의 최대공약수는 " + gcd);
	}

	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 ==0;
	}
	
	/** 두 정수가 주어지면 두 정수의 최대공약수를 알려주는 메소드
	 *  매개변수 : 두 정수 = > int num1, int num2
	 *  리턴타입 : 최대공약수 = > 정수 => int
	 *  메소드명 : gcd
	 */
	
	public static int gcd(int num1, int num2) {
		for(int i = num1; i>=1; i--) {
			// i가 num1의 약수이다 == num1은 i의 배수
			if(isMultiple(num1, i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;
	}
	
}

