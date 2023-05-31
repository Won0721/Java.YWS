package day06;
// try{
//		예외가 발생할 수 있는 명령;
//}
// catch(발생할 수 있는 예외 클래스명){
//		예외 발생 시 실행할 명령;	
//}
// finally{예외가 발생하든 안하든 무조건 실행하는 명령;}

public class Day1_Trycatch {
	public static void main(String[] args) {
		int a=0;
		int b=2;
		int c =b/a;	// 0으로 나눌 수 없어 나오는 오류 : ArithmeticException
	}

}
