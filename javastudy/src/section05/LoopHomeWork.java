package section05;

public class LoopHomeWork {
	public static void main(String[] args) {
		
	
//	**
//	***
//	****
//	*****
//	******
//	*******
	System.out.println("1번문제");
	
	for(int i = 0; i<6; i++) {
		for(int j=0; j<i+2; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
	 
//	   *
//	  **
//	 ***
//	****
	System.out.println();
	System.out.println("2번문제");
	
	for(int i=0; i<4; i++) {
		for(int j=0; j<3-i; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
//	3번
//	   *
//	  ***
//	 *****
//	******* 
	System.out.println();
	System.out.println("3번문제");
	for(int i=0; i<4; i++) {
		for(int j=0; j<3-i; j++) {
			System.out.print(" ");
		}
		for(int j=0; j<2*i+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}

//	  
//	4번
//				
//	   *				
//	  ***				  
//	 *****				
//	*******		
//	 *****			 
//	  ***			 
//	   *
	System.out.println();
	System.out.println("4번문제");
	
	for(int i=0; i<7; i++) {
		if(i<4) {
			for(int j=3; j<7-i; j++) {
			System.out.print(" ");
			}
			for(int j=0; j<2*i+1; j++) {
			System.out.print("*");
			}
		}
		
		else{
			for(int j=2; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<-2*i+13; j++) {
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	System.out.println();
	System.out.println("크리스마스 트리문제");
//	   ☆
//	   *
//	  ***
//	 *****
//	******* 
//	  | | Merry Christmas~*
	
	for(int i=0; i<6; i++) {
		if(i==0) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<1; j++) {
				System.out.print("☆");
			}
		}
		if(i<5) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
				
			}
		
			for(int j=0; j<2*i-1; j++) {
				System.out.print("*");
			}
		}
		else if(i==5) {
			for(int j=3; j<i; j++) {
			System.out.print(" ");
			}
			
			System.out.print("| |");
		}
				
		System.out.println();
	}
	
	
	
//	  
//	 
//	 구구단
//	  2 x 1 = 2		3 x 1 = 3	 4 x 1 = 4
//	  2 x 2 = 4		3 x 2 = 6	 4 x 2 = 8
//	  2 x 3 = 6		3 x 3 = 9	 4 x 3 = 12
//	  2 x 4 = 8		3 x 4 = 12	 4 x 4 = 16
//	  2 x 5 = 10    3 x 5 = 15   4 x 5 = 20
	
//	  5 x 1 = 5		6 x	1 = 6	 7 x 1 = 7
//	  5 x 2 = 10	6 x	2 = 12   7 x 2 = 14
//	  5 x 3 = 15	6 x	3 = 18	 7 x 3 = 21
//	  5 x 4	= 20	6 x	4 = 24	 7 x 4 = 28
//	  5 x 5 = 25	6 x	5 = 30	 7 x 5 = 35
	
//	  8				9 			 10
//    
//  
//
	
		System.out.println();
		System.out.println("구구단");
	int a=2;
	int b=1;
		
	for(int i=0; i<27; i++) {
		if(i<9) {
			a=2;
		}
		else if(i<18) {
			a=5;
		}
		else {
			a =8;
		}
		if(i % 9 == 0) {
			b=1;
		}
		for(int m=0; m<3; m++) {
			System.out.printf("%d * %d = %d \t ", a , b, a*b );
			a+=1;		
			if(a==10) {
				break;
			}
			}
		
		b++;			
		System.out.println();
		
		}
	}
}

		
	
	
	
	

