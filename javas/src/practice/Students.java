package practice;

public class Students {
	String studentName;
	int grade,money;
	
	public Students(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		money -=1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 금액은 :"+money+"입니다.");
	}
	
}
