package day13.sort;

import java.util.Arrays;
import java.util.Comparator;

import array.Array;

public class ArraysortEx {
	public static void main(String[] args) {
		int[] arr = {1,4,7,9,2,8,3,6}; // 1부터 9  크기8! 
		
		int[] arr5 = {5,4,3,2,1,5,6,10};
		
		Array.bubblesort(arr5);
	
		System.out.println(arr.length);
		for(int i=0; i< arr.length-1; i++) {
			for(int j=0; j< arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					// 앞에 수가 크면
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			Array.printArray(arr);
		}
		Integer arr2[] = {1,4,7,9,2,8,3,6};
		//Arrays.sort(arr2); 오름차순
		Arrays.sort(arr2, Comparator.reverseOrder()); // 내림차순
		for(Integer tmp : arr2) {
			System.out.print(tmp +" ");
		}
	}
	
	

}
