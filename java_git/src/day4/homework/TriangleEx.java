package day4.homework;

import java.util.Scanner;

public class TriangleEx {
	public static void main(String[] args) {
		// 세 변의 길이를 정수로 입력받아 세 변으로 삼각형을 만들 수 있는지 확인하는 코드
		// 세 변 중 작은 두변의 길이의 합이 큰 변보다 커야 삼각형을 만들 수 있다.
		System.out.print("세 정수를 입력하세요 : ");
		int a,b,c;
		int max;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		boolean isAdd = ((a+b>c) && (a<c && b<c)) || ((b+c>a) && (b<c && c<a)) || ((a+c>b) &&(a<b && c<b)) || (a==b && b==c);
		if(isAdd) {
			System.out.println("삼각형을 만들 수 있습니다.");
		}
		else {
			System.out.println("만들 수 없습니다.");
		}
		
//		if(a>b) {
//			if(a>c) {
//				max = a;
//			}
//			else {
//				max = c;
//			}
//		}
//		
//		else if(b>c) {
//			max = b;
//		}
//		
//		else {
//			max = c;
//		}
		
//		max = a > b ? (a>c ? a:c) : (b > c ? b :c);
		// 작은 두변의 합 > max
		// 세변의 합 - max = 작은 두변의 합
		// 세변의 합에서 max를 뺀 값이 max보다 크면 삼각형이라고 출력
		// 아니면 아니락 출력

		
		
	}

}
	

