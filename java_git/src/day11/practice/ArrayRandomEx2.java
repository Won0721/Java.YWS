package day11.practice;

import java.util.Random;

public class ArrayRandomEx2 {
	public static void main(String[] args) {
		// 1~9 사이의 랜덤한 수를 중복되지 않게 3개를 만들어서 배열에 저장한 후 출력하는 코드
		
		Random r = new Random();
		int[] arr = new int[3];
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = r.nextInt(9)+1;
//			for(int j=0; j<i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		// 장점 : 작업이 단순하다.
		// 단점 : 저장 공간이 필요
//		int[] arr2 = new int[3];
//		boolean[] checkArr = new boolean[10];
//		for(int i=0; i<arr2.length; ) {
//			int random = r.nextInt(9)+1;
//			// checkarr 배열에 random 번지에 있는 값이 false이면 
//			if(!checkArr[random]) {
//				// random 배열에 저장, i를 증가. 
//				// cheackArr 배열에 random 인덱스에 있는 값을 true로 변경 
//				arr2[i] = random;
//				i++;
//				checkArr[random] = true;
//			}
//		}
		
		
		// 방법2 : 저장된 값들을 비교
		int count =0; // 현재 저장된 랜덤수 개수
		int i = 0 ;// 반복문에 사용할 ㄹ변수
		
		while(count < 3) {
			int random = r.nextInt(9)+1;
			// 이미 저장된 랜덤수들과 하나하나 비교해서 같은게 있는지 확인하여
			// 있으면 반복문 종료
			for(i=0; i<count; i++) {
				if(random == arr[i]) {
					break;
				}
			}
				/* 위 반복문에서 break를 만나지 않으면 i는 count일 때 종료하기때메
				 * 반복문 종료 후 i는 count와 같다. 하지만 break를 만나서 중간에 빠져나오면 
				 * i는 count보다 작다.*/
				if(i == count) {
					arr[count] = random;
					count++;
				}
		}		
		System.out.println("============");
		printArray(arr);
		//방법 3 : 방법2를 메서드로 변형
		count = 0;
		while(count<3) {
			int random = r.nextInt(9)+1;
			// 중복되지 않으면 배열에 저장 후 count 증가
			if(!contains(arr, random, count)){
				arr[count] = random;
				count++;
			}
		}
		System.out.println("============");
		printArray(arr);
		
		System.out.println("=========");
		int[] arr5 = new int[3];
		creatRamdomArray(1,3, arr5);
		printArray(arr5);
	

		
		
	}
	/** 정수형 배열이 주어지면, 정수형 배열의 값을 콘솔에 출력 하는 메서드
	 * 매개변수 : 배열과 배열의 개수가 필요 => int arr[], int size
	 * 리턴타입 : 없음 => void
	 * 메서드명 :printArray
	 */
	
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	
	}
	
	/** 정수 num가 배열의 0 인덱스 부터 count개만큼 확인 했을 때 중복된 값이 있는지 없는지
	 * 알려주는 메서드
	 * 매개변수 : 중복을 확인할 배열, 비교할 정수 num, 비교할 개수 count => int[] arr, int num , int count
	 * 리턴타입 : 있는지 없는지 => boolean
	 * 메서드명 : contains
	 */
	public static boolean contains(int[] arr, int num, int count) {	// 객체를 안만들라고 static 붙임
		
		for(int i=0; i<count; i++) {
			// 중복되면 메소드 종료하면서 중복됐다고 알려줌
			if(num == arr[i]) {
				return true;
			}
		}
		
		// 이 위치까지 왔다는건 return true를 못만났다는 뜻. (중복되지 않았다.)
		return false;
	}
	/** min에서 max 사이의 랜덤한 수를 생성해서 배열에 저장하는 메서드 
	 * (int)math.random()*(max - min + 1)+ 1;
	 * 매개변수 : 최소값, 최대값, 배열 = > int min , int max , int arr[]
	 * 리턴타입 : 없음 => void
	 * 메서드명 : creatRandomArray
	 */
	public static void creatRamdomArray(int min, int max, int arr[]) {
		// 배열에 생성되어있지않으면(배열이 null이면)
		if(arr==null) {
			return;
		}
			
		// 랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메서드 종료
		// 1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max - min + 1 < arr.length) {
			return;
		} 
		
		int count=0;
		while(count<3){
			int random =(int)(Math.random()*(max - min + 1) + min);
			if(!contains(arr, random, count)){
				arr[count] = random;
				count++;
			}
		
		}
		
	}
	
	
	

}
