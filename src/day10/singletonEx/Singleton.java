package day10.singletonEx;

public class Singleton {
	public static void main(String[] args) {
//		SamsungCompany company = new SamsungCompany();
		
		SamsungCompany company1 = SamsungCompany.getInstance();
		SamsungCompany company2 = SamsungCompany.getInstance();
		System.out.println(company1);
		System.out.println(company2);
		
		
	}
		

}

class SamsungCompany{
	
	private static SamsungCompany company = new SamsungCompany();
	
	private String name; 	// 회사이름
	private String address; // 회사 주소
	
//	public SamsungCompany() {} // 퍼블릭인 경우에는 메인에 new 연산자를 이용해 객체 초기화 가능
	private SamsungCompany() {
		name = "Samsung";
		address = "Korea";
	}
	
	public static SamsungCompany getInstance() {
		return company;
	}
	
}
