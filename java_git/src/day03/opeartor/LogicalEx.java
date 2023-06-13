package day03.opeartor;

public class LogicalEx {
	public static void main(String[] args) {
		int score = 85;
		// 성적(score)이 80점 이상이고, 성적이 90점 미만인가?
		// score가 80보다 크거나 같고, score가 90보다 작다
		// score가 80보다 크거나 같다 그리고 score가 90보다 작다
		// score >= 80 && score < 90
		System.out.println(score + "점은 B학점 인가? " + (score >= 80 && score < 90));
		
		int age = 21;
		// 20세 이상이면 성인
		boolean isAdult = age >=20;
		// age살은 미성년자 인가?
		System.out.println(age + "살은 미성년자 인가? " + !isAdult);
		
		// 주민등록증은 있고 운전면허증이 없음.
		boolean hasIdCard = true;
		boolean hasDriverCard = false;
		System.out.println("토익 시험을 치룰수 있는가? "+ (hasIdCard || hasDriverCard));
	}

}
