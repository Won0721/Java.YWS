package day6.parctice;

import java.util.Scanner;

public class DisjiointEx {
	public static void main(String[] args) {
		// 두 정수를 입력 받아 두 정수가 서로소 관계인지 판별하는 코드를 작성
		// 최대 공약수가 1인 두 수의 관계
		// 3 4  , 5 11 
		int num1, num2, num3;
		int i=1;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number : ");
		num1= sc.nextInt();
		num2= sc.nextInt();
		if(num1>num2) {
			num3 = num1;
		}
		else {
			num3 = num2;
		}
		while(i<=num3) {
			if((num1 % i ==0) && (num2 % i ==0))

			
			
			
			i++;
		}
	}

}
