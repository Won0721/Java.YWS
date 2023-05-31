package day8;

import java.util.Random;

public class CountTest2 {
	public static void main(String[] args) {
		
	
	Random random = new Random();
	int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
	for(int i = 1; i<= 10 ; i++) {
		int r = random.nextInt(6) + 1;
		System.out.println(r);
		
		switch (r) {
			
			case 1: a++; break;
			case 2: b++; break;
			case 3: c++; break;
			case 4: d++; break;
			case 5: e++; break;
			case 6: f++; break;
		}
	

	}
}
}