package day02;
//1. 6개의 랜덤의 숫자와 보너스 점수를 로또배열에 저장
//2. 사용자에게 1~45의 6개의 숫자를 입력받아 배열 저장하고 사용자에게 보너스 점수를 입력
//3. 사용자가 입력한 값과 로또 배열에 있는 값을 비교하여 동일한 값의 개수를 count한다
//4. 몇개의 숫자를 맞췄는지 다음과 같은 조건에 따라 등수를 출력한다.
import java.util.Arrays;
import java.util.Random;	// import java.util.*; : 모든 유틸이용
import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class Day5_Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int lottoAr[] = new int[6];
		int userAr[] = new int[6];
		
		int bonus;			//랜덤으로 가져올 값
		int bonusUser;		// 사용자가 입력할 값
		int count=0;		// 로또번호와 일치하는 값
		// 1.
		for(int i=0; i<6; i++) {
		lottoAr[i] = random.nextInt(45)+1;
		}
		//bonues = random
		bonus = random.nextInt(45)+1;
		
		System.out.println("Lotto :" + Arrays.toString(lottoAr)+ ",bonus: "+ bonus);
		
		// 사용자에게 6개의 값과 보너스를 입력
		System.out.print("숫자 6개 입력: ");
		for(int i=0; i<6; i++) {
			userAr[i] = sc.nextInt();
		}
		System.out.print("보너스 값 입력: ");
		bonusUser = sc.nextInt();
		
		System.out.println("User:"+ Arrays.toString(userAr)+",bonus: "+ bonusUser);
		
		//로또 배열의 값과 사용자배열의 값중 같은 값이 몇개 있는지 카운팅
		
		
		for(int j=0; j<6; j++) {
			for(int i=0; i<6; i++) {
				if(lottoAr[j] == userAr[i]) {
				count++;
				}
			}
		}
		
		System.out.println("총 맞춘 개수: " + count);
		// count의 개수에 따라 등수 정하기
		if(count==6) {
			System.out.println("축하드립니다. 1등");
		}
		else if(count==5) {
			if(bonus == bonusUser) {
				System.out.println("축하 2등");
			}
			else {
				System.out.println("3등");
			}	
		}
		else if(count ==4) {
			System.out.println("4등");
		}
		else if(count ==3) {
			System.out.println("5등");
		}
		else {
			System.out.println("꽝");
		}
		sc.close();
	}

}
