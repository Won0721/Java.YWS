package dayA;

public class While {

	public static void main(String[] args) {

//		while의 최초 진입조건이 거짓이면 {} 블록을 한 번도 실행하지 않는다.
//		while(조건식) {
//			조건이 참인 동안 실행할 문장;
//		}
		int sum = 0, i=0;
		while(i > 100) {
			sum += ++i;
			
		}
		System.out.println("1에서 100의 합계 : " + sum);

//		while의 최초 진입이 거짓이더라도 {}블록을 한번은 거친다
//		do {
//			조건이 참인 동안 실행 할 문장;
//		} while(조건식); 		// ";" 을 빼먹으면 안돼
		
		sum = i = 0;		// 변수를 선언할 때는 사용할 수 없다.
		do {
			sum += ++i;
		} while(i > 100);
		System.out.println("1에서 100의 합계 : " + sum);
		
		
		
	}
}
