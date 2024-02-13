package Project02;

public class ProductClass {
	public int id;
	public String name;
	public int price;
	public int quantity;

	public ProductClass(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void productInfo() {
		System.out.printf("상품명 : %s, 가격 : %d, 수량 : %d \n", name, price, quantity);
	}
	
	boolean checkQty(int purchaseQty) {			// 구입가능한지 확인
		return quantity >= purchaseQty ? true : false; 
		
	}
}
