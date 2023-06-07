package day6.parctice;

import java.util.Scanner;

public class GCDEx {
	public static void main(String[] args) {
		// 두 정수 num1과 num2를 입력받아 두 정수의 최대 공약수를 구하는 코드를 작성하세요
		// 약수 : 나누어 떨어지는 수
		// 공약수 공통으로 있는 약수
		// 최대 공약수 : 공약수 중 가장 큰수
		// 8과 12의 공약수 : 1, 2, 4
		// 8과 12의 최대 공약수 : 4
		// 반복횟수 : i는 1부터 num1까지 1씩 증가
		// 규칙성 : i가 num1의 약수이고 i가 num2의 약수이면 i를 gcd에 저장
		//		   num1을 i로 나누었을 때 나머지가 0과 같고
		// 		   num2를 i로 나누었을 때 나머지가 0과 같다면
		//		   i를 gcd에 저장
		// 반복문 종료 후:
		int num1 =0;
		int num2 =0;
		int num3;
		int i=1;
		int j=1;
		int gcd =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if(num1>num2) {
			num3 = num1;
		}
		else {
			num3 = num2;
		}
		
		while(i<=num3) {
			if((num1 % i ==0) && (num2 % i==0)) {
				gcd = i;
				
			}
			i++;
		}
		System.out.println(gcd);
	
	
		
	
	}

}
