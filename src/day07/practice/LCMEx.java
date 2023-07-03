package day07.practice;

import java.util.Scanner;

public class LCMEx {
	// 두 정수를 입력받아 두 정수의 최소 공배수를 구하는 코드 작성
	// 반복횟수 : i는 1부터 (num1 * num2까지) 1씩 증가
	/*
	 * i가 num1의 배수이고 i가 num2의 배수면 i를 출력하고 반복문 종료
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		int i=1;
		int lcm=1;
		System.out.print("Input num : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		for(i=1; ; i++) {
			if(i % num1 == 0 && i % num2 ==0) {
				System.out.println(i);
				break;
			}
		}
		for (i= num1; ; i+=num1) {
			if(i % num2 ==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
