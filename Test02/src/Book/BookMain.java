package Book;

import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {
	// 도서목록을 저장하는 ArrayList
	// ArrayList 타입의 books 변수를 선언하고 Book클래스의 객체를 담을 수 있도록 초기화
	private static ArrayList<Book> books = new ArrayList<>();
	//사용자로부터 입력을 받는 Scanner 객체
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("=== 도서 관리 프로그램 ===");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 검색");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 확인");
			System.out.println("5. 도서 구입");
			System.out.println("6. 끝내기");
			System.out.println("===================");
			System.out.println("번호 입력: ");
			int num = scanner.nextInt();
			scanner.nextLine();

			switch (num) {
			case 1:
				addBook();
				break;
			case 2:
				searchBook();
				break;
			case 3:
				deleteBook();
				break;
			case 4:
				confirmBook();
				break;
			case 5:
				buyBook();
				break;
			case 6:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	// 도서 등록
	private static void addBook() {
		System.out.println("1. 종이책");
		System.out.println("2. 전자책");
		System.out.println("번호 입력 : ");
		int num = scanner.nextInt();
		scanner.nextLine();

		switch (num) {
		case 1:
			addPaperBook();
			break;
		case 2:
			addEBook();
			break;
		default:
			System.out.println("다시 입력해주세요.");
		}
	}

	private static void addPaperBook() {
		System.out.print("제목: ");
		String title = scanner.nextLine();
		System.out.print("저자: ");
		String author = scanner.nextLine();
		System.out.print("가격: ");
		int price = Integer.parseInt(scanner.nextLine()); // nextInt() 대신에 nextLine()을 사용하고 정수로 변환
		System.out.print("출판사: ");
		String publisher = scanner.nextLine();
		System.out.print("페이지 수: ");
		int size = scanner.nextInt();

		books.add(new PaperBook(title, author, price, publisher, size));
		System.out.println("도서가 등록되었습니다.");
	}

	private static void addEBook() {
	    System.out.print("제목: ");
	    String title = scanner.nextLine();
	    System.out.print("저자: ");
	    String author = scanner.nextLine();
	    System.out.print("가격: ");
	    int price = Integer.parseInt(scanner.nextLine());
	    System.out.print("출판사: ");
	    String publisher = scanner.nextLine();

	    // 호환 기기 목록 출력
	    EBook eBook = new EBook(title, author, price, publisher); // 객체 생성

	    // 선택된 기기 번호 입력 받기
	    System.out.print("호환 기기 번호 입력 (1: 안드로이드, 2: 아이폰, 3: 태블릿): ");
	    int selectedDeviceNumber = Integer.parseInt(scanner.nextLine());

	    // 선택된 기기 설정
	    String selectedDevice = eBook.getSupperDevices()[selectedDeviceNumber - 1];

	    // 선택된 기기 저장
	    eBook.setSelectedDevice(selectedDevice);

	    // books 리스트에 EBook 추가
	    books.add(eBook);

	    System.out.println("도서가 등록되었습니다.");
	}




	// 도서 검색
	private static void searchBook() {
		System.out.println("검색 할 도서 제목을 입력하세요."); // 도서 제목 입력
		String title = scanner.nextLine(); // 사용자가 입력한 도서제목 문자열로 받아오기

		int index = findBookIndex(title); // findBookIndex 메서드 호출
		if (index == -1) { // index가 있으면 해당 도서의 인덱스 반환, 없으면 -1 반환
			System.out.println("해당 도서가 없습니다.");
			return;
		}

		System.out.println(books.get(index)); // 도서가 목록에 있다면 해당 도서의 정보 출력
	}

	// 도서 삭제
	private static void deleteBook() {
	    System.out.print("삭제할 도서 제목을 입력하세요: "); // 삭제할 도서 제목 입력
	    String titleToDelete = scanner.nextLine();

	    //도서를 찾았는지 여부를 나타내는 변수
	    boolean found = false;
	    
	    //리스트를 역순으로 탐색하여 모든 동일한 제목의 도서를 삭제
	    for (int i = books.size() - 1; i >= 0; i--) {
	    	// 제목이 일치하는 도서를 찾은 경우
	        if (books.get(i).getTitle().equals(titleToDelete)) {
	        	// 해당 도서를 삭제
	            books.remove(i);
	            // 도서를 찾았을 때 true
	            found = true;
	        }
	    }

	    if (found) {
	        System.out.println("도서가 삭제되었습니다.");
	    } else {
	        System.out.println("해당 도서를 찾을 수 없습니다.");
	    }
	}


	// 도서 확인
	private static void confirmBook() {
		for (Book book : books) {
			System.out.println(book);
		}
	}

	// 도서 구입
	private static void buyBook() {
		System.out.println("구입할 도서 제목 : ");
		String title = scanner.nextLine();

		int index = findBookIndex(title);

		Book book = books.get(index);
		
		System.out.println(book.getTitle() + "을 구매했습니다.");
		System.out.println("총 결제 금액은 : " + (book.getPrice() * book.getTax()) + "원입니다.");
	}

	// 책검색 메서드
	private static int findBookIndex(String title) {
		for (int i = 0; i < books.size(); i++) { // books.size : ArrayList(도서 목록)의 현재 크기를 반환하는 메서드
			if (books.get(i).getTitle().equals(title)) { // 인덱스i에 해당하는 도서의 title과 getTitle()로 사용자가 입력한 타이틀이 같은지 확인
				return i;
			}
		}
		return -1;
	}
}
