package practice;

public class Exam {
	public static void main(String[] args) {
		
		Students james = new Students("James", 5000);
		Students tomas = new Students("tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subway400 = new Subway(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		tomas.takeSubway(subway400);
		tomas.showInfo();
		subway400.showInfo();
		
	}

}
