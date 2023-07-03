package day11.homework;

import java.util.Random;
import java.util.Scanner;

public class BaseballGameEx {
	/* 1~9 사이의 중복되지 않은 세 수를 맞추는 게임.
	 * 규칙 :
	 * B : 같은 숫자가 있지만 위치가 다름
	 * S : 같은 숫자가 있고 위치가 같음
	 * 3O : 일치하는 숫자가 하나도 없음.		
	 * 
	 * 1. 정수값 3개 배열로 만들기, 각각의 배열은 값이 중복되지 않음 중복될 경우 랜덤 다시 돌려 대입
	 * 2. 배열 순서와 값이 일치할 경우, 값은 있지만 배열과 동일하지 않는경우, 아에 없는 경우 
	 * 3. while 문을 사용하여 정답을 맞출 때까지 출력, 맞추면 종료
	 * 필요한 패키지 : 스캐너, 랜덤
	 */
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc =new Scanner(System.in);
		int[] numArr = new int[3];		// 랜덤으로 생성한 숫자야구
		int[] numUser = new int[3]; // 유저가 입력한 숫자
		
	
		while(true) {
			for(int i=0; i<numArr.length; i++) {
				numArr[i]=r.nextInt(9)+1;
				for(int j=0; j<i; j++) {
					if(numArr[i]==numArr[j]) {
						i--;
						break;
					}
				}
			}
			
			System.out.print("숫자야구 정답 : ");
			
			for(int i=0; i<numArr.length; i++) {
				System.out.print(numArr[i] +" "); 
			}
			
			System.out.println();
			
			while(true) {
				System.out.println("=======숫자야구게임======");
				System.out.print("숫자를 입력해주세요 :");
			
				for(int i=0; i<numArr.length; i++) {
					numUser[i] = sc.nextInt();
					if(numUser[i] > 9 || numUser[i] < 1) {
						System.out.println("유효 범위 숫자 이내로 입력해주세요 (예 : 1 ~ 9)");
						i--;
						break;
					}
				}
		
				int sCount = 0; // 스트라이크 개수
				int bCount = 0; // 볼 개수
			
				for(int i=0; i<numArr.length; i++) {
				
					if(numArr[i] == numUser[i]) {
						sCount++;
					}
				
					else {
						for(int j=0; j<numArr.length; j++) {
							if(numArr[i] == numUser[j]) {
								bCount++;
							}
						}	
					}			
				}
			
				if(sCount > 0 || bCount > 0) {
					System.out.println(sCount +"스트라이크 " + bCount + "볼" );
				}
			
				else {
					System.out.println("삼진 아웃");
				}
			
				if(sCount ==3) {
					System.out.println("3 스트라이크!");
					System.out.println("새로운 게임을 진행하시겠습니까? Y/N");
					char ch = sc.next().charAt(0);
					if(ch=='Y') { // 2중 while문 탈출 해서 첫 while문 부터 다시 시작 
						break;
					}
					
					else if(ch=='N') { // while문 탈출
						System.out.println("게임 종료!");
						return;
					}
				}		
			}
		}
		
		
		
		
	}



}
