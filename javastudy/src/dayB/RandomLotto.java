package dayB;

import java.util.Random;

public class RandomLotto {

	public static void main(String[] args) {
		
//		1. 추첨기를 준비한다.
		int[] lotto = new int[45];
//		2. 추첨기에 공을 넣는다.
		for(int i = 0 ; i <lotto.length; i++) {
			lotto[i] = i + 1;
			
		}
		for(int i = 0 ; i <lotto.length; i++) {
			System.out.printf("%2d ", lotto[i]); // %2d (%정수 두자리) 2자리씩 끊어서 출력
			if((i+1) % 10 == 0) {		// 10개씩 끊어서 줄바꿈
				System.out.println();
			}
		}
		System.out.println("\n========== 섞기전 =========");

// 		3. 추첨기의 공을 섞는다.
//		4. lotto[0]에 저장된 값과 lotto[1]~[44]사이의 랜덤한 위치의 값을 교환한다.
		Random random = new Random();
		for(int i = 0 ; i<100 ; i++) {	// 섞는 횟수 : i  // // random.nextInt(44) == > 0에서 43 사이의 합.
			int r = random.nextInt(44) + 1; //0부터 43이 아닌 1부터 44의 값을 구해야하기에 끝에 + 1 해야 마지막 자리도 섞임 	
			int temp = lotto[0];	// 로또번호 0번째 배열의 값을 temp에 저장
			lotto[0] = lotto[r];	// 로또번호 r번재 배열의 값은 로또번호 0번째 값에다가 대입
			lotto[r] = temp;		// 
		}
		for(int i = 0 ; i <lotto.length; i++) {		
				System.out.printf("%2d ", lotto[i]);
				if((i+1) % 10 == 0) {		// 10개씩 끊어서 줄바꿈
					System.out.println();
				}
			}
			System.out.println("\n========== 섞은 후 =========");
			
			System.out.print("1등 번호 : ");
			for(int i = 0; i < 6 ; i++) {
				System.out.print(lotto[i] + " ");
				
//				sleep() : 괄호 안에 지정된 시간(1/1000초) 만큼 프로그램을 잠깐 멈춘다.				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("\n보너스 : " + lotto[6]);
		}
		
//=========================================================
// a 변수에는 3 , b의 변수에는 4가 있을 경우. a의 값은 b로 b의 값은 a로 바꾸고싶을경우
// a = 3 , b = 4
// temp(임시변수) = a
// a = b
// b = temp
	
		

	}


