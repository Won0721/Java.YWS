package day02;

import java.util.Scanner;

public class Day4_Array {
	
	public static void main(String[] args) {
		// 2차원 배열의 선언	  자료형[][] 배열명;
		// 2차원 배열의 생성 : 배열명 = new 자료형[][]
// 5개의 [정수형변수]를 묶는 1차원 배열을 2개씩 관리하는 2차원배열 array2를 생성해라.
//		int ar[] = new int[5];
//		int ar2[] = new int[5];

//		자료형 배열명[][] = new int[묶음크기][변수개수];
//		int ar3[][] = new int[묶음의 개수][각 요소 개수];
		int ar3[][] = new int[2][5];
		
//		2차원 배열의 인덱스 ( 행과 열로 구성되어있음. )
		/*
		 * int array3[][] = { {1,2,3,4,5} ,{6,7,8,9,10} };
		 */
//		2차원 배열의 초기화		
//		자료형 배열명[][] = {
//			{값1,값2,값3}
//			{값4,값5,값6}
//		};

// 4명의 학생의 점수 3개를 입력받아 scores 라는 2차원 배열에 저장.
		Scanner sc = new Scanner(System.in);
		
		int scores[][] = new int[4][3];
		String subject[] = {"국어","영어","수학"};
		
		for(int j=0; j<4; j++) {
			System.out.println((j+1)+"번 학생 점수");
			for(int i =0; i<3; i++) {
				System.out.print(subject[i]+":");
				scores[j][i] = sc.nextInt();
		
			}
		}
		
		
		
//		2차원 배열에 저장된 값을 출력
		for(int i=0; i<3; i++) {
			System.out.print("\t"+ subject[i]);
		}
		System.out.println();
		for(int j=0; j<4; j++) {
		System.out.print((j+1) +"번:\t");
			for(int i =0; i<3; i++) {
				System.out.print(scores[j][i]+"\t");
			}
			System.out.println();
		}
		sc.close();
		/*
		 * System.out.print(subject[1] + ":"); scores[0][1]= sc.nextInt();
		 * 
		 * System.out.print("수학"); scores[0][2]= sc.nextInt();
		 */
		
		
	
		
		

	}

}
