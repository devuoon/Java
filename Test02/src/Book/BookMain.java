package Book;

import java.util.Scanner;
import java.util.ArrayList;

public class BookMain {

    // 입력을 위한 스캐너
	private static ArrayList<Book> books = new ArrayList<>();
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
            int price = Integer.parseInt(scanner.nextLine());  // nextInt() 대신에 nextLine()을 사용하고 정수로 변환
            System.out.print("출판사: ");
            String publisher = scanner.nextLine();
            System.out.print("페이지 수: ");
            int sizeInfo = scanner.nextInt();
            
            books.add(new PaperBook(title, author, price,publisher, sizeInfo));
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

           books.add(new EBook(title, author, price, publisher));
            System.out.println("도서가 등록되었습니다.");
        }


        // 도서 검색
        private static void searchBook() {
        	System.out.println("검색 할 도서 제목을 입력하세요.");		//도서 제목 입력
        	String title = scanner.nextLine();		// 사용자가 입력한 도서제목 문자열로 받아오기
        	
        	int index = findBookIndex(title);		//findBookIndex 메서드 호출
        	if( index == -1) {			// index가 있으면 해당 도서의 인덱스 반환, 없으면 -1 반환
        		System.out.println("해당 도서가 없습니다.");
        		 return;
        	}
        	
        	System.out.println(books.get(index));		//도서가 목록에 있다면 해당 도서의 정보 출력
        }

        // 도서 삭제
        private static void deleteBook() {
            System.out.print("삭제할 도서 제목을 입력하세요: ");		//삭제할 도서 제목 입력
            String titleToDelete = scanner.nextLine();
            
            int index = findBookIndex(titleToDelete);

            if (index != -1) {		//인덱스가 존재하면 해당 인덱스의 책 삭제
                books.remove(index);
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
	        for (int i = 0; i < books.size(); i++) {		//books.size : ArrayList(도서 목록)의 현재 크기를 반환하는 메서드
	            if (books.get(i).getTitle().equals(title)) {	//인덱스i에 해당하는 도서의 title과 getTitle()로 사용자가 입력한 타이틀이 같은지 확인
	                return i;
	            }
	        }
	        return -1;
	    }
    }


