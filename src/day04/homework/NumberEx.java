package day04.homework;

public class NumberEx {
	public static void main(String[] args) {
		// 정수 num가 짝수면 num에 2를 나누고 , 정수 num가 홀수면 num에 1을 더한 후 num을 출력하는 코드를 작성
		int num = 3;
		
		if(num % 2 ==0) {
			num = num / 2;
			System.out.println(num);
		}
		else {
			System.out.println(++num);
		}
		
	}

}
