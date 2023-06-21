package day16.drink;

public class Drink {
	private int account = 0 ;
	private int money;
	private String name;
	
	public Drink() {}
	public Drink(String name, int money) {
	}
	
	public void add(int amount) {
		this.account += amount;
	}
	
	public void release(int amount) {
		this.account -= amount;
	}
	
	// 현재 잔고
	public void print() {
		System.out.println("====================");
		System.out.println("제품명 : " + name);
		System.out.println("남은 재고 : " + account);
	}

	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return account;
	}

	public void setAmount(int amount) {
		this.account = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
