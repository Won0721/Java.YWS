package day5.practice;

import java.util.Scanner;

public class DivisorEx {
	public static void main(String[] args) {
		// 정수 num를 입력받아 num의 약수를 출력하는 코드 작성
		// 약수 : A를 B로 나누었을 때 나머지가 0이면 B는 A의 약수이다. 
		// 12의 약수 : 1, 2, 3, 4, 6, 12 
		// 반복횟수 : i는 1부터 num 까지 1씩 증가
		// 규칙성 : i가 num의 약수이면 i를 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Num : ");
		int num = sc.nextInt();
		
		System.out.print("for문을 이용한 "+num +"의 약수는 ");
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {
				System.out.print(i+ " ");
			}
		
		}
		System.out.println();
		System.out.println("====================");
		
		System.out.print("while문을 이용한 "+num+"의 약수는 ");
		int j=0;
		while(j <= num) {
			j++;
			if(num % j ==0) {
				System.out.print(j + " ");
			}
		}
		
		
	}

}
