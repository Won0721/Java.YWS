package day12.homework;

import java.util.Arrays;
import java.util.Random;

public class LottoService {
	static Random r = new Random();
	int[] arr;
	public static int[] randomArray(int n, int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(n)+1;
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(arr);
		return arr;		
	}
	public static void print(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

	

