package array;

public class Array {
	
	// 배열 전체 출력
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {	// 배열의 마지막이면 엔터 아니면 ,로 한줄로 되게
			System.out.print(arr[i] + (i==arr.length-1?"":","));
		}
		System.out.println("]");
	}
	
	// 메서드 오버로딩, 배열을 [start]인덱스부터 [end-1]인덱스까지 출력
	public static void printArray(int[] arr, int start, int end) {
		System.out.print("[");
		for(int i= start ; i<end; i++) {	// 배열의 마지막이면 엔터 아니면 ,로 한줄로 되게
			if(i >=arr.length) {
				break;
			}
			System.out.print(arr[i] + (i==end-1?"":", "));
		}
		System.out.println("]");
	}
	
	// num가 배열의 원소 중에서 [0]부터 [count-1]인덱스 안에 있는지 확인하는 메서드
	public static boolean iscontains(int[] arr, int num, int count) {
		// 객체를 안만들라고 static 붙임
		for(int i=0; i<count; i++) {
			// 중복되면 메소드 종료하면서 중복됐다고 알려줌
			if(num == arr[i]) {
				System.out.println("중복됨");
				return true;
			}
		}
		
		// 이 위치까지 왔다는건 return true를 못만났다는 뜻. (중복되지 않았다.)
		return false;
	}
	
	public static int [] creatRamdomArray(int min, int max, int arr[]) {
		// max가 min보다 작으면 두 수를 교환
		if(max < min) {
			int tmp = max;
			max = min;
			min = max;
		}	
		// 배열에 생성되어있지않으면(배열이 null이면) 메서드 종료 
		if(arr == null) {
			arr = new int[max - min + 1];
		}
		
		// 랜덤으로 만들어지는 수의 개수가 배열의 크기보다 작으면 메서드 종료
		// 1~3 : 3개가 4개짜리 배열에 중복되지 않게 들어갈 수 없음
		if(max - min + 1 < arr.length) {
			return null;
		} 
		
		int count=0;
		while(count< arr.length){
			int random =(int)(Math.random()*(max - min + 1) + min);
			if(!iscontains(arr, random, count)){
				arr[count] = random;
				count++;
			}
		}
		return arr;
	}
	
	/** 주어진 배열에 중복된 값이 있는지 없는지 알려주는 메서드 
	 * 매개변수 : 배열 = > int arr[]
	 * 리턴타입 : 중복여부 =>boolean  
	 * 메서드명 : arrayCheck
	 */
	public static boolean isarrayDoubleCheck(int arr[]) {
		if(arr == null) {
			return false;
		}
		// arr배열의 다른 번지들끼리 비교해서 같은값 이 있는지 확인하는 반복문
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				// 같은 번지면 건너 뜀
				if(i == j) {
					continue;
				}
				if(arr[i] == arr[j]) {
					return true;
				}
			}
		}
		// 반복문이 끝날 때 까지 중복이 없으면 
		return false;
		
	}
	
	
}
