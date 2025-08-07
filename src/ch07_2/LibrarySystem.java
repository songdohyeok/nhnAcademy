package ch07_2;

public class LibrarySystem {
    private static class Book {
        String title;
        String author;
        int year;
        boolean isAvailable;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.isAvailable = true;
        }

        @Override
        public String toString() {
            return String.format("%s - %s (%d) [%s]",
                    title, author, year, isAvailable ? "대출가능" : "대출중");
        }
    }

    private Book[] books;
    private int bookCount;

    public LibrarySystem(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    // TODO: 책 추가 메서드를 작성하세요
    // 메서드명: addBook, 매개변수: String title, String author, int year
    // 배열이 가득 찬 경우 "도서관이 가득 찼습니다!" 출력하고 false 반환
    // 성공적으로 추가하면 "책 추가됨: 제목" 출력하고 true 반환

    boolean addBook(String title, String author, int year){
        if(bookCount >= books.length){
            System.out.println("도서관이 가득 찼습니다!");
            return false;
        }
        books[bookCount++] = new Book(title, author, year);
        System.out.println("책 추가됨: "+title);
        return true;
    }

    // TODO: 책 제거 메서드를 작성하세요 (순서 유지)
    // 메서드명: removeBook, 매개변수: String title
    // 책을 찾지 못하면 "책을 찾을 수 없습니다: 제목" 출력하고 false 반환
    // 뒤의 책들을 앞으로 이동시켜 순서 유지
    // 성공적으로 제거하면 "책 제거됨: 제목" 출력하고 true 반환
    boolean removeBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (!books[i].title.equalsIgnoreCase(title)) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                System.out.println("책 제거됨: " + title);
                return true;
            }
        }
        System.out.println("책을 찾을 수 없습니다.");
        return true;
    }



    // TODO: 책 검색 헬퍼 메서드를 작성하세요
    // 메서드명: findBookIndex, 매개변수: String title
    // 대소문자 구분 없이 검색하여 인덱스 반환, 없으면 -1 반환
        int findBookIndex(String title){
            return -1;
        }


    // TODO: 대출 처리 메서드를 작성하세요
    // 메서드명: borrowBook, 매개변수: String title
    // 책이 없거나 이미 대출 중이면 적절한 메시지 출력하고 false 반환
    // 대출 가능하면 "대출 완료: 제목" 출력하고 true 반환
    boolean borrowBook(String title){
        for (int i = 0; i < bookCount; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                if(!books[i].isAvailable){
                    System.out.println("이미 대출 중입니다: " + title);
                    return true;
                }
                books[i].isAvailable = false;
                System.out.println("대출 완료: " + title);
                return true;
            }
        }
        return false;
    }


    // TODO: 반납 처리 메서드를 작성하세요
    // 메서드명: returnBook, 매개변수: String title
    // 책이 없거나 이미 반납된 경우 적절한 메시지 출력하고 false 반환
    // 반납 가능하면 "반납 완료: 제목" 출력하고 true 반환
    boolean returnBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (!books[i].title.equalsIgnoreCase(title)) {//반납할 책이 없을때
                System.out.println("반납할 책이 없습니다.");
            } else { //반납할 책이 있고 책장에도 책이 없는 정상적인 상황
                if (!books[i].isAvailable) {
                    books[i].isAvailable = true;
                    System.out.println("반납 완료: " + title);
                    return true;
                }
            }
            System.out.println("반납할 책이 없습니다.");
        }
        return false;
    }


    // TODO: 전체 도서 목록 출력 메서드를 작성하세요
    // 메서드명: listAllBooks
    // "=== 도서 목록 (총 X권) ===" 형태로 제목 출력
    // 각 책을 번호와 함께 출력
    void listAllBooks(){
        System.out.println("=== 도서 목록 (총 "+bookCount+"권) ===");
        for (int i = 0; i < bookCount; i++){
            System.out.println(((i+1)+". "+books[i]));
        }
    }


    // TODO: 대출 가능한 책만 출력하는 메서드를 작성하세요
    // 메서드명: listAvailableBooks
    // "=== 대출 가능한 도서 ===" 제목 출력
    // 대출 가능한 책들만 출력하고 마지막에 "대출 가능: X권" 출력
    void listAvailableBooks(){
        System.out.println("=== 대출 가능한 도서 ===");
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable) {
                System.out.println(((count + 1) + ". " + books[i]));
                count++;
            }
        }
        System.out.print("대출 가능: "+count+"권");

    }

    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem(10);

        // 책 추가
        library.addBook("자바의 정석", "남궁성", 2020);
        library.addBook("이펙티브 자바", "조슈아 블로크", 2018);
        library.addBook("클린 코드", "로버트 마틴", 2013);
        library.addBook("디자인 패턴", "GoF", 1994);
        System.out.println();
        library.listAllBooks();

        // 대출/반납 테스트
        library.borrowBook("자바의 정석");
        library.borrowBook("클린 코드");
        library.borrowBook("자바의 정석");  // 실패
        System.out.println();
        library.listAvailableBooks();
        System.out.println();
        library.returnBook("자바의 정석");
        library.removeBook("디자인 패턴");
        System.out.println();
        library.listAllBooks();
    }
}
