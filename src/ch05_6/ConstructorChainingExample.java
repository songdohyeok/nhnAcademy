package ch05_6;

/**
 * 다양한 생성자를 제공하는 날짜 클래스
 */
class SimpleDate {
    private int year;
    private int month;
    private int day;

    // 완전한 생성자
    public SimpleDate(int year, int month, int day) {
        // TODO 30: year, month, day 초기화하기
        // "날짜 생성: " + this 출력
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("날짜 생성: " + this);
    }

    // 년, 월만 지정 (일은 1일로)
    public SimpleDate(int year, int month) {
        // TODO 31: this()를 사용하여 완전한 생성자 호출하기
        // day는 1로 설정
        this(year, month, 1);
    }

    // 년만 지정 (1월 1일로)
    public SimpleDate(int year) {
        // TODO 32: this()를 사용하여 다른 생성자 호출하기
        // month는 1로 설정
        this(year, 1, 1);

    }

    // 오늘 날짜로 생성
    public SimpleDate() {
        // TODO 33: this()를 사용하여 기본 날짜(2024, 1, 20) 설정하기
        this(2024, 1, 20);
    }

    @Override
    public String toString() {
        // TODO 34: "[year]년 [month]월 [day]일" 형식으로 반환하기
        return year+"년 "+month+"월 "+day+"일";
    }
}

// 테스트
public class ConstructorChainingExample {
    public static void main(String[] args) {
        // TODO 35: 다양한 생성자를 사용하여 SimpleDate 객체 생성하기
        // date1: 2024년 12월 25일
        // date2: 2024년 3월 1일
        // date3: 2024년 1월 1일
        // date4: 2024년 1월 20일

        SimpleDate date1 = new SimpleDate(2024,12,25);
        SimpleDate date2 = new SimpleDate(2024,3);
        SimpleDate date3 = new SimpleDate(2024);
        SimpleDate date4 = new SimpleDate();

        // TODO 36: 생성된 날짜들 출력하기
        System.out.println("date1: "+date1);
        System.out.println("date2: "+date2);
        System.out.println("date3: "+date3);
        System.out.println("date4: "+date4);
    }
}