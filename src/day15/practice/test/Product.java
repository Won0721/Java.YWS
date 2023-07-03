package day15.practice.test;

public class Product {
	private String name; // 제품명
	private int price;
	private int productCount; // 제품 개수
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Product(Product p) {
		this.name = p.name;
		this.price = p.price;
		this.productCount = p.productCount;
	}
	
	public Product(String name, int productCount, int price) {
		this.name = name;
		this.productCount = productCount;
		this.price = price;
	}
	
	// 제품 info
	public void amount(int price) {
		this.price += price;
	}
	public void info() {
		System.out.println("제품명 : " + name);
		System.out.println("제품 가격 : " + price);
		System.out.println("제품 수량 : " + productCount);
	}
	// 제품 수량 추가
	public void store(int count) {
		this.productCount += count;
	}
	
	// 제품 판매
	public void sell(int count) {
		this.productCount -= count;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProductCount() {
		return productCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
	

}
