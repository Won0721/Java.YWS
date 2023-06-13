package day06.whileex;

import java.util.Scanner;

public class SumEx2 {
	public static void main(String[] args) {
		// n을 입력받아 1부터 n까지 짝수의 합을 구하는 코드를 작성하세요
		// input : 10
		// i가 n보다 작거나 같으면 반복
		// i가 짝수면 누적
		int i=1;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input num : ");
	    int num = sc.nextInt();
		
		while(i<=num) {
			if(i%2==0) {
				sum += i;
			}
			i ++;
		}
		System.out.println(sum);
		
		
	}

}
