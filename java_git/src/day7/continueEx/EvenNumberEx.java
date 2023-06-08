package day7.continueEx;

import java.util.Scanner;

public class EvenNumberEx {
	public static void main(String[] args) {
		// continue문을 이용한 10이하 짝수 출력 예제
		int num =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num");
		// 홀수면 건너뜀
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i % 2 !=0) {
			continue;
			}
			System.out.println(i);
		}
		
		int i = 0;
		while(++i<=10) {
			if(i% 2 !=0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}
