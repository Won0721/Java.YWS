package dayB;

public class Test {
	public static void main(String[] args) {
		
		int[] lotto = new int[45];
		for(int i = 0 ; i <lotto.length; i++) {
			lotto[i] = i + 1;
			System.out.printf("%2d ", lotto[i]); // %2d (%정수 두자리) 2자리씩 끊어서 출력
			if((i+1) % 10 == 0) {		// 10개씩 끊어서 줄바꿈
				System.out.println();
			}
		System.out.println("\n========== 섞기전 =========");
		
		
		
	}
  }
	
}
