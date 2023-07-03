package day11.array;

public class ArrayMethoadEx1 {
	public static void main(String[] args) {
		// 메서드의 매개변수와 관련된 예제
		int num1 = 10, num2 = 20;
		System.out.println("num1 = "+num1 + ", num2 = "+num2);
		// 두 정수를 교환
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println("num1 = "+num1 + ", num2 = "+num2);
		System.out.println("=========");
		num1 = 10;
		num2 = 20;
		System.out.println("num1 = "+num1 + ", num2 = "+num2);
		swap(num1,num2);
		System.out.println("num1 = "+num1 + ", num2 = "+num2);
		System.out.println("==========");
		int arr1[] = {1,2,3,4};
		int arr2[] = {5,6,7,8};
		int tmpArr[] = new int[arr1.length];
		for(int num : arr1) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		// 두 배열을 교환
		tmpArr = arr1;
		arr1 = arr2;
		arr2 = tmpArr;
		System.out.println();
		System.out.println("==========");
		for(int num : arr1) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("===============");
		printArr(arr1);
		printArr(arr2);
		
		System.out.println("=============swap ");
		// 매개변수로 넘겨준 배열의 주소가 메서드 안에서 바뀌면 원본에 영향이 없음
		swap(arr1, arr2);
		printArr(arr1);
		printArr(arr2);
		System.out.println("=============swap2");
		// 매개변수로 넘겨준 배열의 주소가 아닌 배열의 값이 메서드 안에서 바뀌면 
		// 원본에 영향을 받음
		swap2(arr1, arr2);
		printArr(arr1);
		printArr(arr2);
		
		System.out.println("===========test1");
		int arr3[] = {1,2,3,4};
		printArr(arr3);
		test1(arr3);
		printArr(arr3);
		
		System.out.println("===========test2");
		int arr4[] = {1,2,3,4};
		printArr(arr4);
		test2(arr4);
		printArr(arr4);
		
		
	}
	// 메서드 안에 있는 배열을 변경해줌
	public static void test1(int arr[]) {
		arr = new int[4];
		arr[0] =3;
	}
	// main에 연결되어있는 애를 사용함
	public static void test2(int arr[]) {
		arr[0] = 3;
	}
	public static void printArr(int arr[]){
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	/** 두 배열을 교환하는 메서드 : 교환이 안됨.
	 */
	public static void swap(int arr1[], int arr2[]) {
		int[] tmpArr = arr1;
		arr1 = arr2;
		arr2 = tmpArr;
	}
	/**  두 배열을 교환하는 메서드 : 교환이 됨*/
	public static void swap2(int arr1[], int arr2[]) {
		int[] tmp = new int [arr1.length];
		for(int i=0; i<arr1.length; i++) {
			tmp[i] = arr1[i];
			arr1[i] = arr2[i];
			arr2[i] = tmp[i];
			
		}
	}
	
	/** 두 정수의 값을 교환하는 메서드 : 교환이 안됨
	 *  매개변수 num1과 num2는 메서드가 호출되면 새로 변수를 만들어서
	 *  호출 한 곳에서 넘겨준 값을 복사해 오
	 */
	public static void swap(int num1, int num2) {
		int tmp = num1;
		num1 = num2;
		num2 = tmp;
		
	}

}
