package day7.practice;

public class StarEx2 {
	public static void main(String[] args) {
		/*  *
		 *  **
		 *  ***
		 *  ****
		 *  ***** 작성
		 */
		for(int i =0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
