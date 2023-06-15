package day11.homework;

import java.util.Scanner;

import array.Array;

public class BaseballGameHomework {
	public static void main(String[] args) {
		// 숫자 야구 게임 구현
		int com[] = new int[3]; // 컴퓨터가 랜덤으로 생성한 수를 저장할 배열
		int user[] = new int[3]; // 사용자가 입력할 수를 저장할 배열
		
		int min = 1, max=9;
		int strike = 0; // 스트라이크 개수
		int ball = 0; // 볼의 개수
		// 맞춰야할 숫자 3개를 랜덤으로 생성(중복 X)
		Array.creatRamdomArray(min, max, com);
		Array.printArray(com);
		
		Scanner sc = new Scanner(System.in);
		
		// 반복문
		while(strike !=3) {
			// 사용자가 숫자 3개를 입력
			System.out.print("숫자 입력 : ");
			for(int i = 0 ; i < user.length; i++) {
				user[i] = sc.nextInt();
			}
			// 사용자 입력 체크 
			if(Array.isarrayDoubleCheck(user)) {
				System.out.println("숫자를 중복으로 입력하셨습니다.");
				continue;
			}
			// 
				
			// 판별
			
	
			// 스트라이크 개수 판별
			strike = getStrike(com, user) ;
			
	
			
			// 볼의 개수 판별
			ball = getBall(com, user);
			
			// 스트라이크와 볼의 개수에 맞게 출력
			printResult(strike, ball);

		}
		System.out.println("Good");
		sc.close();

	}
	
	/** 스트라이크 개수를 판별하는 메서드
	 *  => 두 배열에서 같은 번지에 있는 값들이 몇개 같은지 알려주는 메서드
	 *  매개변수 : 두 배열 int arr1[] int arr2[]
	 *  리턴타입 : 같은 번지에 있는 값들이 몇개 같은지 => 몇개 => 정수 =>int
	 *  메서드명 : getStrike
	 */
	
	public static int getStrike(int arr1[], int arr2[]) {
		// 배열이 하나라도 생성 안되었을 경우 0을 리턴
		if(arr1 ==null || arr2 == null) {
			return 0;
		}
		// 배열의 개수가 다른 경우, 작은 크기의 배열을 기준으로 비교하기위해 
		int size = arr1.length < arr2.length ? arr1.length : arr2.length;
		int count=0; // 스트라이크 개수			
		for(int i=0; i<size; i++) {
			if(arr1[i] == arr2[i]) {
				count++;
			}
		}
		return count;
	}
	
	/** 볼 개수를 판별하는 메서드
	 *  => 두 배열에서 같은 번지에 있는 값들이 몇개 같은지 알려주는 메서드
	 *  매개변수 : 두 배열 int arr1[] int arr2[]
	 *  리턴타입 : 다른번지 번지에 있는 값들이 몇개 같은지 => 몇개 => 정수 =>int
	 *  메서드명 : getBall
	 */
	public static int getBall(int arr1[], int arr2[]) {
		if(arr1 == null || arr2 == null) {
			return 0;
		}

		int count =0 ; // 볼 개수
		// 다른 번지를 비교해서 찾아도 되지만 
		// 두 배열에서 같은 숫자의 개수에서 스트라이크 개수를 빼면 볼의 개수
		for(int tmp : arr1) {
			// 배열 1에서 꺼낸 값이 arr2에 있으면 개수를 증가
			if(Array.iscontains(arr2, tmp, arr2.length)) {
				count++;
			}
		}
		
		return count - getStrike(arr1, arr2);
	}
	
	/** 스트라이크와 볼의 개수가 주어지면 결과를 출력하는 메서드
	 *  매개변수 : 스트라이크 개수, 볼의개수
	 *  리턴타입 : void
	 *  메서드명 : printResult
	 */
	public static void printResult(int strike, int ball) {
		if(strike !=0) {
			System.out.print(strike + "S ");
		}
		if(ball != 0) {
			System.out.print(ball + "B" );
		}
		if(strike == 0 && ball ==0) {
			System.out.println("3O");
		}
		System.out.println();
	}
	

	

	
	
	
	
}
