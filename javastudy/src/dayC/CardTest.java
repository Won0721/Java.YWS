package dayC;

import java.util.Random;

public class CardTest {
	
	public static void main(String[] args) {
		
		String number[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
//		char symbol[] = {'♠','♥','◇','♣'};
		String symbol[] = {"♠","♥","◇","♣"};

		int card[] = new int[52];
		for(int i=0; i<card.length; i++) {
			card[i] = i;
		}
		for(int i=0; i<card.length; i++) {
//			System.out.printf("%2d ",card[i]);
//			System.out.printf("%2s ", number[card[i] % 13]);	// %2d 정수, %2s 문자열
//			System.out.printf("%s " , symbol[card[i] / 13]);	// c 문자
			System.out.printf("%s%2s " , symbol[card[i] / 13], number[card[i] % 13]);	
			if((i + 1) % 13 == 0){
				System.out.println();
			}
		}
		System.out.println("=====================섞기전=====================");
		
		Random random = new Random();
		for(int i=0 ; i<100000; i++) {
			int r = random.nextInt(51) + 1; 
			int temp = card[0];			// 섞기
			card[0] = card[r];
			card[r] = temp;
		}	
		for(int i=0; i<card.length; i++) {
			System.out.printf("%s%2s " , symbol[card[i] / 13], number[card[i] % 13]);
			if((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		
		
		
	}

}
