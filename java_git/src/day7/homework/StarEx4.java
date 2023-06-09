package day7.homework;

public class StarEx4 {
//	    *   	i:0  j: 4,5,6   j - i > 3
//	   ***		i:1  j: 5,6     j - i > 3
//	  *****		i:2  j: 6       j - i > 3
//	 *******	i:3
//	  *****		i:4  j:	6       
//	   ***		i:5  j:	5,6     
//	    *		i:6  j:	4,5,6  
	public static void main(String[] args) {
		
		for(int i=0; i<7; i++) {
			if(i<4) {
				for(int j=0; j<3-i; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<2*i+1; j++) {
					System.out.print("*");
				}
			}
			else {
				for(int j=0; j<i-3; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<-2*i+13; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		System.out.println();
		
		int num=7;
		for(int i=1; i<=num; i++) {
			int half = (num+1) / 2; // 4
			//4줄 (num+1) / 2
			if(i<=half) {
				for(int j=1; j<=half-i; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=2*i-1; j++) {
					System.out.print("*");
				}
			}
			// 3줄
			else {
				for(int j=1; j<=i - half; j++) {
					System.out.print(" ");
				}
				for(int j=1; j<=2*(num-i)+1; j++) {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
			
			
			
			
			
			//3줄
		}
		
	}

}
