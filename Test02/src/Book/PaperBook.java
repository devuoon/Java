package Book;

public class PaperBook extends Book {
	private int size;

	public PaperBook(String title, String author, int price, String publisher, int size) {
		super(title, author, price, publisher);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return super.toString() + " | 페이지 수: " + size + "쪽";
	}

}