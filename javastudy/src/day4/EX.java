package day4;

public class EX {

	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			
		
			for(int j=0; j<4; j++) {
				System.out.print("*");
			}
			
		System.out.println("");
		
		}
		
		System.out.println("다음");
			
		
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		System.out.println("다음");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");	
			}
			System.out.println("");
		}
	

	}

}
