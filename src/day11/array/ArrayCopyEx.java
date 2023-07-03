package day11.array;

public class ArrayCopyEx {
	public static void main(String[] args) {
		
		//배열인 arr1과 arr2는 참조변수(값이 있는 주소를 저장하는 변수)
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = arr1; // arr1와 arr2의 배열을 공유한다.
		
		arr2[0] = 10; 
		System.out.println("======arr1");
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		arr2[0] = 1; //초기값으로 되돌림
		arr2 = new int[arr1.length]; // 복사하기 위한 배열 생성 arr1 크기만큼
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr2[0] = 10; // 반복문을 통해 복사된 arr2에 인덱스[0]을 수정해도 arr1은 안변함
		
		System.out.println("=======arr1");
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		int arr3[] = new int[arr1.length];
		System.arraycopy(arr1, 0, arr3, 2, 3);
		//(복사할 대상, index부터, 생성된 복사본으로, 복사본의 index부터, 개수)
	
		arr3[0] = 10;
		
		System.out.println("======= arr1");
		for(int tmp : arr1) {
			System.out.println(tmp);
		}
		System.out.println("====== arr3");
		for(int tmp : arr3) {
			System.out.println(tmp);
		}
		
	}

	public static void printArr(int arr[]) {}
}
