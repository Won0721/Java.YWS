package day22.ramda;

public class RamdaEx {
	public static void main(String[] args) {
		InterfaceA a = new InterfaceA() {
			public int getMax(int num1, int num2) {
				return num1 >= num2 ? num1 : num2;
				
			}
		};
		System.out.println(a.getMax(5, 4));
		
		InterfaceA b = (num1, num2) ->{
			return num1 >= num2 ? num1 : num2;
		};
		
		System.out.println(b.getMax(4, 5));
		
		
		
		
	}
}
interface InterfaceA{
	int getMax(int num1, int num2);
}
