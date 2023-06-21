package day16.drink;

public class Fanta extends Drink{
	private int account;
	private int money;
	private String name;
	
	public Fanta(String name, int money) {
		this.name = name;
		this.money = money;
	}
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
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
