package day15.practice.vo;

public class Product {
	// 멤버변수 : 제품 판매와 관련된 정보
	// 제품명, 모델명, 가격, 수량(판매 수량, 전체수량), 분류
	private String name; // 제품명
	private String modelName; //모델명
	private int price; //가격
	private int amount; // 수량
	private String category; // 분류
	
	// 생성자
	public Product(String name, String modelName, int price, int amount, String category) {
		this.name = name;
		this.modelName = modelName;
		this.price = price;
		this.amount = amount;
		this.category = category;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	// 메서드
	/** 제품 입고 기능 => 현재 수량에 주어진 수량을 누적 */
	public boolean store(int amount) {
		if(amount<0) {
			return false;
		}
		this.amount += amount;
		return true;
	}
	//* 제품 출고 기능 => 현재 수량에서 주어진 수량을 감소*/
	public boolean release(int amount) {
		if(amount<0) {
			return false;
		}
		this.amount -= amount;
		return true;
	}

	
	

}
