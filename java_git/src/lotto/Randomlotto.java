package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Randomlotto {
	public static void main(String[] args) {
		// 로또 번호의 숫자 범위는 1~45까지
		// 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다
		// 당첨 번호 추첨 시 중복되지 않는 숫자 6개와 보너스 번호 1개를 뽑는다.
		// 당첨은 1등부터 5등까지 있다. 당첨기준과 금액은 아래와 같다.
		// 1등 : 6개 번호 일치 / 2,000,000,000원
		// 2등 : 5개번호 + 보너스 번호 일치 / 30,000,000원
		// 3등 : 5개번호 / 1,500,000원
		// 4등 : 4개번호 / 50,000원
		// 5등 : 3개번호 / 5,000원
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int bonusNum = 1;
		
		int[] lottoNum = new int[6]; // 당첨번호 6개 
		for(int i=0; i<lottoNum.length; i++) { // 번호 6개 뽑기
			lottoNum[i] = random.nextInt(10)+1; // 로또 배열[i] 안에 1~ 45 값 대입
			for(int j =0; j<i; j++) {  
				if(lottoNum[i] == lottoNum[j]) {  // lotto[1] == lotto[0] 이면? 
					i--;
					break;   // 이중for문 빠져나와 lotto[i] 값 다시 숫자 대입
				} 
			}
		}
		for (int i=0; i<lottoNum.length; i++) {
			if(lottoNum[i] == )
		}
	
			for(int i=0; i<lottoNum.length; i++) {
				bonusNum = random.nextInt(10)+1;
				for(int j=0; j<i; j++) {
					if(lottoNum[i] == bonusNum) {
						i--;
						break;
					}
				}
			}
		
		
		

		
		
		Arrays.sort(lottoNum); // 로또 번호 정렬
		System.out.println("당첨 번호 : "+Arrays.toString(lottoNum)); // 로또 번호 리스트 출력
		System.out.println("bonus : " + bonusNum);
//		
//		System.out.print("구입 금액을 입력해주세요 : "); // 로또 n장 구매하기
//		int lottoBuying = sc.nextInt();
//		
//		String bonus; // 보너스번호 1개
//		System.out.print("당첨 번호 입력받기 :"); // 로또 수동
//		String answer = sc.nextLine();
//		System.out.println("보너스 번호 입력 : ");
//		bonus = sc.next();
//		System.out.println(answer);
//		System.out.println(bonus);
		
//		if(lottoPrint>0) {
//			System.out.println(lottoBuying / 1000 + "장을 구매했습니다.");
//			for(int i=0; i<lottoPrint; i++) {   // 로또 lottoPrint(장) 구매 및 출력
//				int[][] lottoUser = new int[lottoPrint][6];
//				for(int j=0; j<6; j++) {
//					lottoUser[i][j] = (random.nextInt(45)+1);
//					for(int l=0; l<=j; l++) {
//						if(lottoUser[i][j] == lottoUser[i][l]) {
//						j--;
//						break;
//						}
//					}
//				}
//				System.out.println(Arrays.toString(lottoUser[i]));
//				Arrays.sort(lottoUser);
//			}
//		}
//		else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
	}
}


