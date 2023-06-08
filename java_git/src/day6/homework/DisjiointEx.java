package day6.homework;

import java.util.Scanner;

public class DisjiointEx {
	public static void main(String[] args) {
		// 두 정수를 입력 받아 두 정수가 서로소 관계인지 판별하는 코드를 작성
		// 최대 공약수가 1인 두 수의 관계
		// 3 4  , 5 11 
		// 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 i를 gcd에 저장
		/*			num1을 i로 나누었을 때 나머지가 0과 같고
		 * 			num2를 i로 나누었을 때 나머지가 0과 같으면
		 * 			i를 gcd에 저장
		 * 
		 *  반복문 종료 후 : gcd = 1이면 Disjoint를 출력
		 *  			아니면 Not disjoint 출력
		 */
		
		int num1, num2, i  = 1, gcd =1;
		int count=0;
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("Input number : ");
		num1= sc.nextInt();
		num2= sc.nextInt();
		
		while(i<=num1) {
			if(num1 % i == 0 && num2 % i ==0) {
				gcd = i;
				count++;
			}
			i++;
		}
		
		if(gcd ==1) {
			System.err.println("서로소");
		}
		else {
			System.out.println("서로소 아님");
		}
		
		/*
		if(count ==1) {
			System.out.println("서로소");
		}
		else {
			System.out.println("서로소 아님");
		}
		*/
	}
	
	
}
