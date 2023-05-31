package day08;

import java.util.Random;

public class Day3_Random {
// int nextInt() : 무작위의 int값을 반환
// int nextInt(int n) : 0보다 크고 n보다 작은 int값 반환
// boolean nextBoolean() , long nextLong(), double nextDoulbe(), float nextFloat()
	public static void main(String[] args) {
		Random random = new Random(); // seed : 현재시간
		Random random2 = new Random(2); // seed:2
		Random random3 = new Random(2); // seed:2
		System.out.println(System.currentTimeMillis());
		for(int i=0; i<5; i++) {
			System.out.println("random:"+i+"번째 값:"+random.nextInt(10));
		}
		for(int i=0; i<5; i++) {
			System.out.println("random2:"+i+"번째 값:"+random2.nextInt(10));
		}
		for(int i=0; i<5; i++) {
			System.out.println("random3:"+i+"번째 값:"+random3.nextInt(10));
		}
		
		
	}


}
