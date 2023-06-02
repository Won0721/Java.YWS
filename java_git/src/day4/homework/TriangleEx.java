package day4.homework;

import java.util.Scanner;

public class TriangleEx {
	public static void main(String[] args) {
		// 세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드
		// 세 변 중 작은 두변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		System.out.print("세 정수를 입력하세요 : ");
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		
		// c가 제일 클 경우
		if(a<=c && b<=c){
			if(a+b>c) {
				System.out.println("삼각형 만들 수 있습니다.");
			}
			else if(a+b<=c) {
				System.out.println("못만들어요");
			}
		}// b가 제일 클 경우
		else if(a<=b && c<=b) {
			if(a+c>b) {
				System.out.println("삼각형 만들 수 있습니다");
			}
			else if(a+c<=b){
				System.out.println("못만들어요");
			}
		} // a가 제일 클 경우
		else if (b<=a && c<=a) {
			if(b+c>a) {
				System.out.println("삼각형 만들 수 있습니다.");
			}
			else if(b+c<=a){
				System.out.println("못만들어요");
			}
		}
		
		
	}

}
	

