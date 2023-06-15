package day12.homework;

public class LottoHomework {
	/* 1등 : 번호: 6개
	 * 2등 : 번호 5개 + 보너스
	 * 3등 : 번호 5개
	 * 4등 : 번호 4개
	 * 5등 : 번호 3개
	 * .. : X
	 * 
	 * com :
	 * 	number : [1, 3, 40, 23, 24, 45]
	 * 	bonus : 2
	 * 
	 * user :
	 * 	 1 2 3 4 5 6 
	 * 
	 * losing ticket!
	 * 
	 */
	
	public static void main(String[] args) {
		int[] lottoCom = new int[6];
		int[] lottoUser = new int[6];
		LottoService.randomArray(45, lottoCom);
		LottoService.print(lottoCom);
	}

	
}


