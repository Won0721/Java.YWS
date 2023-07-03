package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Randomlotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

	
		System.out.println("구입금액을 입력해주세요");
		int money = sc.nextInt(); // 지불할 금액 
		
		int Paper = money / 1000; // 로또 1장당 가격은 1000원
		System.out.println(Paper + "장 구매하셨습니다.");
		
		// 사용자가 로또를 구매 후  로또 종이 출력
		int[] lottoUser = new int[6]; 
		int count = 0;
		
		while(count < Paper) { // 사용자가 구매한 로또를 n장만큼 n번 반복 및 반복 때 마다 랜덤으로 배열에 숫자 대입   
			for(int i=0; i<6; i++) { 
				lottoUser[i] = random.nextInt(45)+1; // 로또 배열[i] 안에 랜덤 값(1~ 45) 대입
				for(int j =0; j<i; j++) {  
					if(lottoUser[i] == lottoUser[j]) {  // 중복제거 
						i--;
						break;   // 중복일 경우 i를 한번 더 돌림  
					} 
				}
			}
			
			Arrays.sort(lottoUser); // 로또 번호 올림순 정렬
			System.out.println(Arrays.toString(lottoUser)); // 구매한 로또 번호 리스트 출력
			
			count++; 
		}
	try { // 잘못된 수 입력 시 예외상황처리를 위해
		int[] lottoNum = new int[6]; // 입력한 로또 배열(당첨번호)
		System.out.println("당첨 번호를 입력해주세요.");
		for(int i=0; i<6; i++) {
			lottoNum[i] = sc.nextInt();
			if(lottoNum[i] < 1 || lottoNum[i] > 45) { // 잘못된 숫자 입력시 오류 발생
				// 강제로 IllegalArgumentException 객체를 생성하여 throw로 강제로 예외를 내줌
				throw new IllegalArgumentException("[Error] 잘못된 입력입니다. 숫자는 1부터 45까지 입력해주세요.");
			}
		}
	
		
		System.out.println();
		System.out.println("보너스 번호를 입력해주세요");
		int bonus = sc.nextInt();
		
		
		// 랜덤으로 출력한 "로또 랜덤 6자리와" 와 "임의의 숫자 입력 6자리" 일치여부 확인하기
		int first=0,second=0,third = 0,forth=0,fifth = 0; //  초기화
		for(int i=0; i<Paper; i++) {
			int lottoCount =0; // 등수 나누기 위한 값 초기화  
			for(int j=0; j<6; j++) {
				for(int m=0; m<6; m++) {
					if(lottoUser[j]==lottoNum[m]) {
						lottoCount++;
					}
				}
			}
			
			if(lottoCount == 6) { // 1등
				first++;
			}
			else if(lottoCount ==5 ) {
				for(int j=0; j<6; j++) { 
					if(lottoUser[j] == bonus) { // 랜덤으로 돌린 로또와 입력한 보너스 숫자가 같은지 확인
						second++;	// 2등 번호 5개일치 + 보너스번호 일치
					}	
				}
				third++; // 없으면 3등 // 3등 번호 5개 일치
			}
			else if(lottoCount ==4) { // 4등 번호 4개일치
				forth++;
			}
			else if(lottoCount ==3) { // 5등 번호 3개일치
				fifth++;
			}
		}
	
		System.out.println();
		System.out.println("당첨 통계");
		System.out.println("---");
		
		System.out.println("3개 일치 (5,000원) - " + fifth + "개");
		System.out.println("4개 일치 (50,000원) - " + forth + "개");
		System.out.println("5개 일치 (1,500,000원) - " + third + "개");
		System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + second + "개");
		System.out.println("6개 일치 (200,000,000원) - " + first + "개");
		
		// 수익률
		int Max = (fifth * 5000) + (forth * 50000) + (third * 1500000) + (second * 30000000) + (first * 200000000);
		double totalReturn = (Max-money) / (double)money * 100;  // 소수점 표현을 위해 double 형변환
		
		System.out.printf("총 수익률은 %.1f%%", totalReturn);
		
		
	} catch (IllegalArgumentException e) {
		// IllegalArgumentException 객체를 생성하여 throw를 통해 강제로 예외를 받아 catch 문이 실행되어 하단 문구 출력 및 종료
		System.out.println(e.getMessage());
		return;
	}
		
		
	}

}



