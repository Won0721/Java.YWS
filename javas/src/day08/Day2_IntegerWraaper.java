package day08;

public class Day2_IntegerWraaper {
	public static void main(String[] args) {
		Integer ii=30; // auto boxing
		//Integer > int로 변경
		System.out.println(ii.intValue()+3);
		//Integer > double
		System.out.println(ii.doubleValue());
		//Integer > float
		System.out.println(ii.floatValue());
		//Integer > String
		System.out.println(ii.toString()+3);
		
		//Auto boxing
		Integer i =10;
		Double d = 3.14;
		Float f = 3.14f;
		Character c = 'A';
		//Auto Unboxing
		int t=i;
		double dd =d;
		float ff = f;
		char cc=c;
		System.out.println();
		System.out.println(t);
		System.out.println(dd);
		System.out.println(ff);
		System.out.println(cc);
		
		
	}

}
