package day11.practice;

import java.util.Scanner;

public class DivisorEx {
	/** 정수 num의 약수들을 배열에 저장하는 코드를 작성하세요 약수는 최대 10개까지
	 *  12 : 1 2 3 4 6 12 
	 *  0번지 1
	 *  1번지 2 
	 *  2번지 3
	 *  3번지 4
	 *  ...
	 *  마지막 12
	 *  
	 */
	public static void main(String[] args) {
			int num;
			Scanner sc = new Scanner(System.in);
			System.out.print("Input num : ");
			num = sc.nextInt();
			int divisorCount =0;
			for(int i=1; i<=num; i++) {
				if(num % i ==0) {
					divisorCount++;
				}
			}
			int divisor[] = new int[10];
			int count =0;
			// 약수 출력하는 코드
			for(int i=1; i<=num; i++) {
				if(num % i ==0) {
					divisor[count] = i;
					count++;
				}
				
				if(count == divisor.length) {
					break;
				}
			}
			
			for(int i=0; i<count; i++) {
				System.out.println(divisor[i]);
			}
			
			
	
			
			
	}
	

}
