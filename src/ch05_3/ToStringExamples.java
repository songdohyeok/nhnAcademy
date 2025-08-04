package ch05_3;

/**
 * 책 정보를 나타내는 클래스
 */
class Book {
    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean isAvailable;

    // TODO 30: 생성자 구현하기
    public Book(String title, String author, int pages, double price) {
        // 모든 필드 초기화
        // isAvailable은 true로 설정
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.isAvailable = true;
    }

    // TODO 31: Getter 메서드들 구현하기
    public String getTitle() { return title; }
    public String getAuthor() { return author;}
    public int getPages() {return pages; }
    public double getPrice() {return price; }
    public boolean isAvailable() { return isAvailable;}

    // TODO 32: toString() 메서드 재정의하기
    @Override
    public String toString() {
        // "Book{title='제목', author='저자', pages=페이지수, price=가격원, available=O/X}" 형식
        return String.format("Book{title='%s', author='%s', pages=%d, price=%.1f원, " +
                        "available=%b}", title, author, pages, price, isAvailable);
    }
}

/**
 * 좌표를 나타내는 클래스
 */
class Point {
    private double x, y;

    // TODO 33: 생성자 구현하기
    public Point(double x, double y) {
        // x, y 초기화
        this.x = x;
        this.y = y;
    }

    // TODO 34: toString() 메서드 재정의하기
    @Override
    public String toString() {
        // "(x, y)" 형식으로 소수점 둘째자리까지 표시
        return String.format("(%.2f, %.2f)", x, y);
    }

    // TODO 35: 다른 점까지의 거리 계산 메서드 구현하기
    public double distanceTo(Point other) {
        // 두 점 사이의 거리 계산
        // Math.sqrt((x차이)^2 + (y차이)^2)
        double distanceX = this.x - other.x;
        double distanceY = this.y - other.y;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }
}

// TODO 36: 클래스들 테스트하기
public class ToStringExamples {
    public static void main(String[] args) {
        System.out.println("=== 다양한 toString() 구현 예제 ===\n");

        // TODO 37: Book 클래스 테스트하기
        // book1: "자바의 정석", "남궁성", 1200, 35000
        // book2: "클린 코드", "로버트 마틴", 584, 29000
        // 책 정보 출력
        Book book1 = new Book("자바의 정석", "남궁성", 1200, 35000);
        Book book2 = new Book("클린 코드", "로버트 마틴", 584, 29000);
        System.out.println(book1);
        System.out.println(book2);


        // TODO 38: Point 클래스 테스트하기
        // p1: (3.5, 4.2)
        // p2: (-2.1, 1.8)
        // 좌표 출력 및 거리 계산
        System.out.println("\n=== 좌표 정보 ===");
        Point p1 = new Point(3.5, 4.2);
        Point p2 = new Point(-2.1, 1.8);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.printf("p1에서 p2까지: %.2f\n", p1.distanceTo(p2));
    }
}