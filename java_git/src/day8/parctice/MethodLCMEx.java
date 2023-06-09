package day8.parctice;

import java.util.Scanner;


public class MethodLCMEx {
	// A : ga, B :gb
	// g : 최대공약수 
	// l : A*B/g
	// 정수 num1과 num2를 입력받아 두 정수의 최소공배수를 구하는 코드를 작성
	// A*B/g == (ga*gb)/g == gab
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수를 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int lcm = lcm(num1, num2);
		System.out.println("두 정수 "+num1+"와 "+num2+"의 최소공배수는 "+lcm);
		
		int lcm2 = lcm(num1, num2);
		System.out.println("두 정수 "+num1+"와 "+num2+"의 최소공배수는 "+lcm2);
	}
	
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 ==0;                                           
	}
	public static int gcd(int num1, int num2) {
		for(int i = num1; i>=1; i--) {
			// i가 num1의 약수이다 == num1은 i의 배수
			if(isMultiple(num1, i) && isMultiple(num2, i)) {
				return i;
			}
		}
		return 1;
	}
	
	public static int lcm(int num1, int num2) {
		for(int i = num1; i<= num1 *num2; i+= num1) {
			// 공배수를 찾음. isMultiple은 배수를 찾는 메소드이고
			// i가 num1의 배수들이기 때문에 i가 num2의 배수이면 num1과
			// num2의 공배수가 됨
			if(isMultiple(i, num2))
				return i;
		}
		return num1 * num2;
	}
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
}


