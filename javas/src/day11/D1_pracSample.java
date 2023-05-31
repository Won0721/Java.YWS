package day11;

import java.io.FileInputStream;
import java.util.Scanner;

public class D1_pracSample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src//day11//sample.txt");
			Scanner s = new Scanner(fis);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
