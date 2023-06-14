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
		int[] num = new int[3];		// 랜덤으로 생성한 숫자야구
		int[] numUser = new int[3]; // 유저가 입력한 숫자
		
		// 배열 랜덤 생성 {? , ? , ?}
		for(int i=0; i<num.length; i++) {
			num[i]=r.nextInt(9)+1;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}
			}
		}
		
		
		
		while(true) {
			
			int sCount = 0; // 스트라이크 개수
			int bCount = 0; // 볼 개수
			System.out.println("=======숫자야구게임======");
			System.out.print("숫자를 입력해주세요 :");
			numUser[0] = sc.nextInt();
			numUser[1] = sc.nextInt();
			numUser[2] = sc.nextInt();
			
			
			for(int i=0; i<num.length; i++) {
				if(num[i] == numUser[i]) {
					sCount++;
					System.out.print(sCount + "S ");
				}
				if(num[i] == numUser[1] || num[i] ==numUser[2]) {
					bCount++;
					System.out.print(bCount + "B ");
				}
				else {
					System.out.println("3Out");
				}
				
			}
			
	
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	

	
	

}
