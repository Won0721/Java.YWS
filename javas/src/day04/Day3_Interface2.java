package day04;

import java.security.Provider;

public class Day3_Interface2 {
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sightSeeing();
		guide.food();
		
	}

}
interface Prividable{
	void leisureSports();
	void sightSeeing();
	void food();
}
class KoreaTour implements Prividable{

	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
		
	}

	@Override
	public void sightSeeing() {
		System.out.println("경북궁 관람 투어");
		
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
}
class JapanTour implements Prividable{

	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
		
	}

	@Override
	public void sightSeeing() {
		System.out.println("오사카 관람투어");
		
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");	
	}
}	
	

class TourGuide{
//	private Prividable tour = new KoreaTour();
	private Prividable tour = new JapanTour();
	public void leisureSports() {
		tour.leisureSports();	
	}
	public void sightSeeing() {
		tour.sightSeeing();	
	}
	public void food() {
		tour.food();	
	}
}


