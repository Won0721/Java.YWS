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
		
		boolean isAdd = (a+b>c) && (b+c>a) && (c+b>a);
		if(isAdd) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}
		else {
			System.out.println("만들 수 없습니다.");
		}
	}

}
	

