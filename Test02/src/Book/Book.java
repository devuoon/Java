package Book;

public class Book {

	// 멤버 변수 선언
	private String title; // 제목
	private String author; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	private final float tax = 1.1f; // 세금 (초기값을 1.1f로 설정)

	// 매개변수를 받아 객체를 초기화하는 생성자 정의
	// 객체를 생성할 때 전달된 매개변수로 멤버 변수들을 초기화
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	// getter / setter (클래스의 필드에 접근하고 값을 설정)
	// getter : 필드의 값을 반환
	// setter : 필드의 값을 설정

	// title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// author
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// price
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// publisher
	public String getPublisher() {
		return publisher;
	}
  
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	// tax 값이 1.1f로 고정되므로 set은 필요없음
	public float getTax() {
		return tax;
	}

	// 책 정보
	@Override
	public String toString() { // 책의 정보를 문자열로 반환
		return String.format("책 제목 : %s | 저자 : %s | 가격 :  %d원 | 출판사: %s ", title, author, price, publisher);
	}

}
