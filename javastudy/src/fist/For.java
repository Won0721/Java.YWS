package fist;

public class For {

	public static void main(String[] args) {
		int linecount = 4;
		int star = 1;
		int space = linecount / 2 +1;
		
		for(int i =0; i<linecount; i++) {
			for(int j=0; j<space; i++) {
				System.out.print(" ");
			}
			for(int j =0; j<=star; j++) {
				System.out.print("*");
			}
			for(int j =0 ; j<space; i++) {
				System.out.print(" ");
			}
			space -= 1;
			star += 2;
			System.out.println();
		}
		}
			

		}

