package day24.network;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		output();
		
	}

	public static void output(){

		FileWriter fw = null;

		try{
		fw = new FileWriter("testtest.txt",true);
		fw.write(97);
		fw.write(65);
		fw.close();

		}catch (Exception e) {
			System.out.println("ㅇㅇ");
		}



		}
}
