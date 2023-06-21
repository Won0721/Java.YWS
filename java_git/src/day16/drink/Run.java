package day16.drink;

public class Run {
	
	public static void main(String[] args) {
		
		// 방법 1.
		Machine m = new Machine(3);
		
		Coke coke = new Coke("콜라",3500);
		Cider sider = new Cider("사이다", 2500);
		Fanta fanta = new Fanta("환타", 2000);
		
		m.InsertDrinkIntoMachine(coke);
		m.InsertDrinkIntoMachine(sider);
		m.InsertDrinkIntoMachine(fanta);
		m.run();
		
		
		
		
		// 방법 2.
		// 기본생성자 생성 
	  /*Machine m = new Machine();
	
		m.set(3);
		m.run();*/
		
		
		//System.out.println(m.equals(s)); // false 
	}
	
	
	

	

}
