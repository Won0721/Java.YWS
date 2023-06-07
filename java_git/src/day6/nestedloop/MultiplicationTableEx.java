package day6.nestedloop;

public class MultiplicationTableEx {
	public static void main(String[] args) {
		// 구구단 2단부터 9단까지 출력하는 코드를 작성하세요
		/* 외부 반복문
		 * 
		 * 
		 */
		int i=0;
		int j =0;
		
		for(i=2; i<=9; i++) {
			for(j=1; j<=9; j++) {
				System.out.print(i + " * " + j + " =  " + i*j +"\t");
			}
			System.out.println();
		}
		// 이 위치에서 i와 j의 값은? 
		System.out.println();
		System.out.println(i);
		System.out.println(j);
	}

}
