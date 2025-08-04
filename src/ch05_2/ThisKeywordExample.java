package ch05_2;

/**
 * this 키워드의 다양한 사용법을 보여주는 클래스
 */
class Rectangle {
    // TODO 39: private 인스턴스 변수 선언하기
    // width, height (double), color (String)
    private double width;
    private double height;
    private String color;

    // TODO 40: this로 인스턴스 변수와 매개변수 구분하는 생성자 구현하기
    public Rectangle(double width, double height) {
        // this.width = width, this.height = height
        // this.color = "흰색"
        this.width = width;
        this.height = height;
        this.color ="흰색";
    }

    // TODO 41: 색상까지 받는 생성자 구현하기
    public Rectangle(double width, double height, String color) {
        // 모든 매개변수로 인스턴스 변수 초기화
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // TODO 42: this()를 사용한 생성자 체이닝 - 기본 생성자
    public Rectangle() {
        // this(1.0, 1.0, "흰색") 호출
        this(1.0, 1.0, "흰색");
    }

    // TODO 43: this()를 사용한 생성자 체이닝 - 정사각형 생성자
    public Rectangle(double size) {
        // this(size, size, "흰색") 호출
        this(size, size, "흰색");
    }

    // TODO 44: 메서드 체이닝을 위한 setter 구현하기
    public Rectangle setWidth(double width) {
        // this.width = width 설정
        // return this
        this.width = width;
        return this;
    }

    public Rectangle setHeight(double height) {
        // this.height = height 설정
        // return this
        this.height = height;
        return this;
    }

    public Rectangle setColor(String color) {
        // this.color = color 설정
        // return this
        this.color = color;
        return this;
    }

    // TODO 45: getter 메서드들 구현하기
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public String getColor() { return color; }

    // TODO 46: 넓이 계산 메서드 구현하기
    public double getArea() {
        // width * height 반환
        return width * height;
    }

    // TODO 47: 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "사각형 정보: [가로] x [세로] ([색상]), 넓이: [넓이]" 출력
        System.out.printf("사각형 정보: %.1f x %.1f (%s), 넓이: %.1f\n",width,height,color,getArea());
    }

    // TODO 48: this를 매개변수로 사용하는 비교 메서드 구현하기
    public boolean isLargerThan(Rectangle other) {
        // this의 넓이가 other의 넓이보다 크면 true 반환
        return this.getArea() >= other.getArea();
    }
}

// TODO 49: 사용 예제 완성하기
public class ThisKeywordExample {
    public static void main(String[] args) {
        System.out.println("=== this 키워드 활용 예제 ===");

        // TODO 50: 다양한 생성자로 사각형 생성하기
        // rect1: 기본 생성자
        // rect2: 크기 5.0인 정사각형
        // rect3: 3.0 x 4.0 사각형
        // rect4: 2.0 x 6.0 빨간색 사각형
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5.0);
        Rectangle rect3 = new Rectangle(3.0, 4.0);
        Rectangle rect4 = new Rectangle(2.0 , 6.0, "빨간색");


        // TODO 51: 생성된 사각형 정보 출력하기
        System.out.println("\n=== 생성된 사각형들 ===");
        // 모든 사각형의 displayInfo() 호출
        rect1.displayInfo();
        rect2.displayInfo();
        rect3.displayInfo();
        rect4.displayInfo();

        // TODO 52: 메서드 체이닝 사용하기
        System.out.println("\n=== 메서드 체이닝 ===");
        // new Rectangle().setWidth(10.0).setHeight(5.0).setColor("파란색")으로 rect5 생성
        // rect5의 정보 출력
        Rectangle rect5 = new Rectangle().setWidth(10.0).setHeight(5.0).setColor("파란색");
        rect5.displayInfo();

        // TODO 53: 크기 비교하기
        System.out.println("\n=== 크기 비교 ===");
        // rect3과 rect4를 비교하여 결과 출력
        if(rect4.isLargerThan(rect3)){
            System.out.println("rect4가 rect3보다 크거나 같습니다.");
        } else if (rect4.isLargerThan(rect4)) {
            System.out.println("rect3가 rect4보다 크거나 같습니다.");
        }
    }
}
