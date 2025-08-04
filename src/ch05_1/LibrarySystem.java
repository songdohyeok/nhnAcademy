package ch05_1;

/**
 * 도서 정보를 관리하는 클래스
 */
class Book {
    // TODO 11: 인스턴스 변수 선언하기
    // title(제목), author(저자), isbn, pages(페이지수), isAvailable(대출가능여부) 변수를 public으로 선언
    public String title;
    public String author;
    public String isbn;
    public int pages;
    public boolean isAvailable;

    // TODO 12: 도서 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "=== 도서 정보 ===" 출력
        // "제목: [제목]", "저자: [저자]", "ISBN: [isbn]", "페이지: [페이지수]" 출력
        // "대출 가능: [예/아니오]" 출력 (isAvailable이 true면 "예", false면 "아니오")

        System.out.println("=== 도서 정보 ===");
        System.out.printf("제목: %s, 저자: %s, ISBN: %s, 페이지: %d\n",title, author, isbn, pages);
        if(isAvailable){
            System.out.print("대출 가능: 예\n");
        }else {
            System.out.print("대출 가능: 아니오\n");
        }
    }

    // TODO 13: 대출 처리 메서드 구현하기
    public void borrowBook() {
        // isAvailable이 true면:
        //   - isAvailable을 false로 변경
        //   - "'[제목]' 도서가 대출되었습니다." 출력
        // 아니면:
        //   - "'[제목]' 도서는 현재 대출 중입니다." 출력
        if(isAvailable){
            isAvailable = false;
            System.out.printf("'%s' 도서가 대출되었습니다.\n",title);
        }else{
            System.out.printf("'%s' 도서는 현재 대출 중입니다.\n",title);
        }
    }

    // TODO 14: 반납 처리 메서드 구현하기
    public void returnBook() {
        // isAvailable을 true로 변경
        // "'[제목]' 도서가 반납되었습니다." 출력
        isAvailable = true;
        System.out.printf("'%s' 도서가 반납되었습니다.\n",title);
    }
}

// TODO 15: 도서관 시스템 완성하기
public class LibrarySystem {
    public static void main(String[] args) {
        // TODO 16: 첫 번째 도서 객체 생성하고 정보 설정하기
        // Book 객체를 생성하고 다음 정보로 설정:
        // title = "Java의 정석", author = "남궁성", isbn = "978-89-968088-0-1"
        // pages = 1022, isAvailable = true
        Book book1 = new Book();
        book1.title = "Java의 정석";
        book1.author = "남궁성";
        book1.isbn = "978-89-968088-0-1";
        book1.pages = 1022;
        book1.isAvailable = true;

        // TODO 17: 두 번째 도서 객체 생성하고 정보 설정하기
        // Book 객체를 생성하고 다음 정보로 설정:
        // title = "Clean Code", author = "Robert C. Martin", isbn = "978-89-966260-2-3"
        // pages = 464, isAvailable = true
        Book book2 = new Book();
        book2.title = "Clean Code";
        book2.author = "Robert C. Martin";
        book2.isbn = "978-89-966260-2-3";
        book2.pages = 464;
        book2.isAvailable = true;

        // TODO 18: 도서 정보 표시하기
        // book1의 displayInfo() 메서드 호출하고 빈 줄 출력
        book1.displayInfo();
        System.out.println();

        // TODO 19: 대출 시뮬레이션하기
        // book1.borrowBook() 두 번 호출 (두 번째는 실패해야 함)
        book1.borrowBook();
        book1.borrowBook();

        // TODO 20: 반납하고 정보 다시 표시하기
        // book1을 반납하고 displayInfo() 다시 호출
        book1.returnBook();
        book1.displayInfo();
    }
}
