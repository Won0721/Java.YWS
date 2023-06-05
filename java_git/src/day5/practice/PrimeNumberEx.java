package day5.practice;

import java.util.Scanner;

public class PrimeNumberEx {
	// 정수 num를 입력 받아 num가 소수인지 아닌지를 판별하는 코드를 작성하세요.
	// 소수 : 약수가 1과 자기 자신밖에 없는 수
	// ex ) 2, 3, 5 ,7 , 11, 13 등
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {
				count++;
			}		
		}
		
		if(count==2) {
			System.out.println("(for 문을 이용)소수입니다.");
		}
		else {
			System.out.println("(for 문을 이용)소수가 아닙니다.");				
		}
		
		int j=1;
		int jcount =0;
		while(j<=num) {
			j++;
			if(num % j==0) {
				jcount++;
			}
		}
		
		
		if(count==2) {
				System.out.println("(while 문을 이용)소수입니다.");
		}
		else {
				System.out.println("(while 문을 이용)소수가 아닙니다.");				
		}
			
		
	}

}
