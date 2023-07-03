package day04.practice;

import java.util.Scanner;

public class IfMutipleEx2 {
	public static void main(String[] args) {
		/*
		 * 정수 num을 입력받아 2의배수면 2의배수로 출력 
		 * 3의 배수면 3, 6의배수면 6이라고 출력, 2,3,6의 배수가 아니라면 2,3,6의 배수가 아니라고 출력하는코드 작성
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
	while(true) {
		System.out.println("Input integer num : ");
		int num = sc.nextInt();
		
		// 순서에 따라 결과가 달라질 수 있음
		if(num % 6 ==0) {
			System.out.println("A multiple of 6");
		}
		else if(num % 3 ==0) {
			System.out.println("A multiple of 3");	
		}
		else if(num % 2 ==0) {
			System.out.println("A multiple of 2");	
		}
		else {
			System.out.println("Not multiple of 2,3,6");
		}
	}
	// 6의 배수가 아닌 2의배수만 찾기 위해 2의배수이지만 3의 배수가 아닌 정수를 확인
	/*if(num % 2 ==0 && 3 !=0) {
		System.out.println("A multiple of 2");
	}
	else if(num % 3 ==0 && 2 !=0) {
		System.out.println("A multiple of 3");	
	}
	else if(num % 6 ==0) {
		System.out.println("A multiple of 6");	
	}
	else {
		System.out.println("Not multiple of 2,3,6");
	}*/
	
		
	

	
	
	
	
	
	}

}
