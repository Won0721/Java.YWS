package day06.parctice;

import java.util.Scanner;

public class AverageEx {
public static void main(String[] args) {
	// 국어 영어 수학 성적을 입력받아 평균을 구하는 코드 작성
	// n을 입력하기 전까지
	// 반복문 : menu가 n이 아니면 반복 (y,n이 아닌 다른 문자를 입력하면 반복)
	// menu가 y이면 반복(y,n이 아닌 다른 문자를 입력하면 종료)
	// 국 영 수 점수 입력
	// 평균을 계산
	// 평균을 출력
	// 더 할건지 물어본 후 , 입력
	// EXIT! 출력
	int kor, eng, math;
	
	char menu='y';
	Scanner sc = new Scanner(System.in);
	while(menu !='n') {
		System.out.print("Input score : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
	
		double avg = (kor + eng + math) / 3.0;
		System.out.printf("average : %.2f ", avg);
		System.out.println();
		System.out.println("continue? (y/n)");
		menu = sc.next().charAt(0);
		

		}
		System.out.println("EXIT!");
	}
}

