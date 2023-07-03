package day06.whileex;

public class SumEx {
	public static void main(String[] args) {
		// 1부터 n까지 합을 구하는 코드를 작성하세요 (n은 10)
		/* 반복 횟수 : i 는 1부터 n까지 1씩 증가
		 * 규칙성 : sum += i
		 * 반복문 종료 후 : 누적합인 sum을 출력
		 */
		
		int n=10;
		int i = 1;
		int sum =0;
		while(i<=n) {
			sum +=i;
			i++;
		}
		System.out.println(sum);
		
	}

}
