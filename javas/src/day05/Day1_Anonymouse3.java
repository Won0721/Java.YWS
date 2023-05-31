package day05;

public class Day1_Anonymouse3 {
	public static void main(String[] args) {
//		Inter1 it1 =new Inter1(); 인터페이스는 객체 생성불가
		Inter1 it = new Inter1() {

			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
				
			}};
			it.f1();

	}
}

interface Inter1 {
	void f1();
}

class Inter1Impl implements Inter1{

	@Override
	public void f1() {
		// TODO Auto-generated method stub
		
	}
	
}