package day8.parctice;

import java.util.Scanner;

/* 정수 num을 입력받아 2,3,6의 배수인지 아닌지 판별하는 코드 작성
 * 
 */
public class MethodMultipleEx {
	public static void main(String[] args) {
//		System.out.println(MethodEvenNumberEx.isMultiple(4,2));
		
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("정수를 입력해주세요 : ");
		num1 = sc.nextInt();
		if(isMultiple(num1, 6))		{
			System.out.println(num1 +" 6의 배수입니다");
		}
		else if(isMultiple(num1, 2)) {
			System.out.println(num1 + " 2의 배수입니다.");
		}
		else if(isMultiple(num1, 3)) {
			System.out.println(num1 + " 3의 배수입니다.");
		}else {
			System.out.println(num1 + " 2,3,6의 배수가 아닙니다.");
		}
		

	}
	
	/**
	 * 매개변수 : 정수 num => int num
	 * 리턴타입 : 2,3,6 의 배수인지(참), 아닌지(거짓) => boolean
	 * 메소드명 : isMultiple
	 */
	public static boolean isMultiple(int num1, int num2) {
		return num1 % num2 ==0;
	}
}


