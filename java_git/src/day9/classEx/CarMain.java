package day9.classEx;

public class CarMain {
	public static void main(String[] args) {
		/* 현대 뉴 아반떼 2023년식 자동차 객체를 생성하는 코드 작성
		 * 
		 */
		Car a = new Car("뉴 아반떼", "현대", 2023);
		
		// 현재 a 정보를 조회
		a.turn();
		a.setGear('D');
		a.printInfo();
		a.speedChange(false);
		a.speedChange(false);
		a.printInfo();
		a.speedChange(true);
		a.speedChange(true);
		a.speedChange(true);
		a.printInfo();
		a.speedChange(false);
		a.printInfo();
		a.turn();
		a.printInfo();
	}
}

