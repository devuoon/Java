package Book;

public class Book {

    private String title;
    private String author;
    private int price;
    private String publisher;
    private float tax = 1.1f;

    // 생성자
    public Book() {}

    // 매개변수 생성자
    public Book(String title, String author, int price, String publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    // getter / setter

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getTax() {
		return tax;
	}

	

    // 책 정보
    @Override
    public String toString() {
        return String.format("책 제목 : %s | 저자 : %s | 가격 :  %d원 | 출판사: %s ", title, author, price, publisher);
    }

}
