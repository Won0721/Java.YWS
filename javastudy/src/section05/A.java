package section05;

public class A {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;

		for (int row = 0; row < 3; row++) {
		    for (int col = 0; col < 12; col++) {
		        int result = a * b;
		        System.out.printf("%d * %d = %d \t", a, b, result);

		        b++;

		        if (b > 4) {
		            a += 3;
		            b = 1;
		        }
		    }
		    System.out.println();
		}

	}

}
