package day15.practice.vo;

// 판매내역 : 누가 어떤 제품을 샀는지 관리하는 클래스
public class Sales {
	private Customer customer;
	private Product product;
	private int totalPrice; // 판매 내역의 총 금액( 전체내역의 총 금액이 아님)
	
	public Sales(Customer customer, Product product) {
		this.customer = customer;
		this.product = product;
		totalPrice = product.getAmount() * product.getPrice();
	}
	public void print() {
		System.out.println("====================");
		System.out.println("고객명 : " + customer);
		System.out.println("제품명 : " + product);
		System.out.println("총 판매 금액 : " + totalPrice);
		System.out.println("====================");
	}
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
