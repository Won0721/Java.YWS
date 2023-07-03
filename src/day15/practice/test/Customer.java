package day15.practice.test;

public class Customer {
	private String name;
	private int money;
	private String telNumber;
	
	public Customer(String name,String telNumber) {
		this.name = name;
		this.telNumber = telNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
}


