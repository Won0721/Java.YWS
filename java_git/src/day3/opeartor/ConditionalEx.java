package day3.opeartor;

public class ConditionalEx {
	public static void main(String[] args) {
		// 나이가 20살 이상이면 성인, 아니면 미성년자
		int age = 21;
		String str;
		// (조건식) ? 참 : 거짓;
		str = age > 20 ? "성인" : "미성년자";
		System.out.println(age + "살은 " + str);
		
	}

}
