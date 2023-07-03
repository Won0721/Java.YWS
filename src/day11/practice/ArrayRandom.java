package day11.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandom {
	public static void main(String[] args) {
		/* 1~9 사이의 랜덤한 수를 3개 만들어서 배열에 저장한 후 출력하는 코드 작성
		 * 
		 */
		
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기를 지정해주세요 : ");
		int n = sc.nextInt();
		int[] arr = new int[n]; // 배열 크기 지정

		// 배열에 (1~9 사이의 임의의 정수)로 값 대입 
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(9)+1;
			for(int j=0; j<i; j++) { // [i]배열이 다음 [i+1]배열과 중복일 경우 [i+1] 배열 다시 값 대입
				if(arr[i] == arr[j]) { 
					i--;
					break;
				}
			}
			
		}
		
		// 배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1)+" array is "+arr[i]);
		}
		
	}

}
