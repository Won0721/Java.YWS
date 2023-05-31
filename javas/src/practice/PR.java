package practice;

import java.util.Random;
import java.util.Scanner;

public class PR {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] coin = {500, 100, 50, 10};
		int money = new Random().nextInt(500)+1;
		money *=10;
		System.out.println("금액 : "+money );
		
		for(int i=0; i< coin.length; i++) {
			int res = money / coin[i]; 
			money %= coin[i];
			System.out.println(coin[i]+ "원 : "+ res );
			
		}
		
	}

}
