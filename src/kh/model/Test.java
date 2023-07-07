package kh.model;

import java.io.FileWriter;

public class Test {
	public static void main(String[] args) {
		TT tt = new TT();
		tt.out();
		
	}
}



class TT{
	
	public void out() {
		FileWriter fw = null;
		try {
			fw= new FileWriter("tt.txt");
			fw.write(97);
			fw.write(65);
			fw.close();
			
		}catch (Exception e) {}
		
		
	}
	
	
	
}
