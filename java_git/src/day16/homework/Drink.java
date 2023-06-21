package day16.homework;

public class Drink {
	private String name;
	private int money;
	private int amount;
	private int totalMoney;
	
	public Drink(String name, int money) {
		this.name = name;
		this.money = money;
	}
	// 입고
	public void add(int amount) {
		this.amount += amount;
	}
	// 판매
	public void release(int amount) {
		this.amount -= amount;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	

}
