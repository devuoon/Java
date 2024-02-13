package Project02;

public class CustomClass {
	int id;
	String name;
	int age;
	ProductClass[] basket; // 상품(ProductClass)를 담기위한 배열
	int basketSize = 0; // 장바구니 배열의 첫번째 인덱스로 초기화

	public CustomClass(int id, String name, int age, int range) {
		this.id = id;
		this.name = name;
		this.age = age;
		basket = new ProductClass[range];
	}
	
	public void customInfo() {
		System.out.printf("회원번호 : %d, 회원이름 : %s, 나이 : %d \n", id, name, age);
	}
	
	void addToCart(ProductClass product, int quantity) {
		boolean isOk = product.checkQty(quantity);
	}

//	public void addToCart(ProductClass product, int quantity) {
//		if (basketSize >= basket.length) { // 장바구니가 가득찼는지 체크
//			System.out.println("장바구니가 가득찼습니다.");
//			return;
//		}
//
//		if (product.quantity < quantity) { // 제품수량과 구매할수량을 비교
//			System.out.println("현재 구매할 수 있는 수량은 " + product.quantity + "개 입니다.");
//		} else {
//			product.quantity -= quantity;
//			basket[basketSize++] = new ProductClass(product.id, product.name, product.price, quantity);
//			// 다음 addToCart() 호출 시에는 장바구니 배열 다음인덱스에 상품을 담을 수 있다.
//		}
//	}

	public void purchase() {
		for (int i = 0; i < basket.length; i++) {
			if (basket[i] == null) {
				break;
			}
			System.out.println(this.name + "고객님이 " + basket[i].name + "을(를) " + basket[i].quantity + "개 구매하셨습니다.");
		}
	}
}
