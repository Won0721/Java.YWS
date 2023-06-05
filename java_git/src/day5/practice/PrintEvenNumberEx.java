package day5.practice;

public class PrintEvenNumberEx {
	public static void main(String[] args) {
		/* 방법 1.
		 * 반복횟수 : i는 1부터 5까지 1씩 증가
		 * 규칙성 2*i
		 * 
		 * 방법 2. 
		 * 반복횟수 : i는 2부터 10까지 2씩 증가
		 * 규칙성 i를 출력
		 * 
		 * 방법 3.
		 * 반복횟수 : i는 1부터 10까지 1씩증가
		 * 규칙성 i가 짝수이면 i를 출력
		 */
		int i = 1;
		while(i<=5) {
			System.out.println(2*i);
			++i;
		}
		System.out.println("==============방법2");
		
		i=2;
		while(i<=10) {
			System.out.println(i);
			i +=2;
		}
		System.out.println("===========방법3");
		i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		
		
		
	}
	

}
