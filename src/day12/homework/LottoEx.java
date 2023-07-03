package day12.homework;

import java.util.Scanner;

import array.Array;

public class LottoEx {
	/** 로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드
	 * 
	 */
	public static void main(String[] args) {
		// 랜덤으로 로또번호 6개와 보너스 번호 1개를 생성
		
		// 랜덤으로 로또번호 6개와 보너스 번호 1개를 생성
		// 7개 짜리 배열에 로또 번호를 생성하고 앞에 6개는 로또번호 마지막 1개는 보너스로 활용
		int[] lotto = new int[7];
		// 7개 짜리 배열에 로또 번호를 생성
		Array.creatRamdomArray(1, 45, lotto);
		int [] lotto2 = new int[6];
		// 마지막 1개는 보너스로
		int bonus = lotto[6];

		//앞에 6개는 로또번호
		System.arraycopy(lotto, 0, lotto2, 0, 6);
		System.out.println("bonus :" + bonus);
		// 로또번호 정렬
		Array.bubblesort(lotto2);
		Array.printArray(lotto2);
		// 사용자가 번호를 6개 입력
		Scanner sc = new Scanner(System.in);
		int[] user = new int[6];
		System.out.print("user : ");
		for(int i=0; i<user.length; i++) {
			user[i] = sc.nextInt();
		}
		
		// 중복입력하면 판별을 X
		if(Array.isarrayDoubleCheck(user)) {
			System.out.println("Wrong number");
			return;
		}
		
		// 등수 판별
		int count = count(lotto2, user);
		printResult(count, Array.iscontains(user, bonus, user.length));
		
	}
	/** 로또 번호와 사용자 번호가 주어지면 몇개가 같은지 알려주는 메서드
	 *  매개변수 : int[] arr, int[] arr2
	 *  리턴타입 : int 
	 *  메서드명 : count
	 */ 
	public static int count(int[] arr1, int[] arr2) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}
		int count = 0;
		for(int tmp : arr1) {
			if(Array.iscontains(arr2, tmp, arr2.length)) {
				count++;
			}
		}
		return count;
	} 
	/** 일치하는 개수와 보너스 번호와 사용자 번호가 일치하는지 여부를 알려주면 
	 * 등수를 출력하는 메소드
	 * 매개변수 : 일치하는 개수, 보너스번호와 일치 여부
	 * 				=> int count, boolean checkBonus
	 * 리턴타입 : 없음 => void
	 * 메서드명 : printResult
	 */
	public static void printResult(int count, Boolean checkBonus) {
		switch(count) {
		case 6:
			System.out.println("1");
			break;
		case 5:
			if(checkBonus) {
				System.out.println("2");				
			}
			else {
				System.out.println("3");
			}
			break;
		case 4:
			System.out.println("4");
			break;
		case 3:
			System.out.println("5");
			break;
		default:
			System.out.println("5");
		}
		
	}
	

	
	

}
