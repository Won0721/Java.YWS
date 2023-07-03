package day09.classEx;

public class CarMain {
	public static void main(String[] args) {
		/* 현대 뉴 아반떼 2023년식 자동차 객체를 생성하는 코드 작성
		 * 
		 */
		Car a = new Car("뉴 아반떼", "현대", 2023);
		
		// 현재 a 정보를 조회
		a.printInfo();			// 시동을 키기 전
		System.out.println();
		a.turn();				// 시동을 킨 후
		System.out.println();
		a.printInfo();
		System.out.println();
		a.setGear('D');
		System.out.println();
		a.printInfo();
		System.out.println();
		// 시동을 키고 속도를 올리고 싶어
		a.speedChange(true);
		a.speedChange(true);
		a.speedChange(true);
		System.out.println();
		a.printInfo();
		System.out.println();
		System.out.println("기어를 D로 둔 채 시동정지 시도");
		a.turn();
		System.out.println();
		a.printInfo();
		System.out.println();
		a.setGear('N');
		System.out.println();
		a.printInfo();
		System.out.println();
		a.turn();
		System.out.println();
		a.printInfo();
	}
}

