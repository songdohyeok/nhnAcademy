package ch02_3;

public class SeasonAndMonth {
    // TODO: 계절 열거형을 정의하세요
    // 힌트: enum Season { SPRING, SUMMER, FALL, WINTER }

    // TODO: 월 열거형을 정의하세요
    // 힌트: enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER }
    enum Season { SPRING, SUMMER, FALL, WINTER }
    enum Month { JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER }

    public static void main(String[] args) {
        // TODO: 현재 계절과 월을 설정하세요
        // 힌트:
        // 1. currentSeason = Season.FALL
        // 2. currentMonth = Month.NOVEMBER

        // TODO: 현재 계절과 월을 출력하세요
        // 힌트:
        // 1. "현재 계절: " + currentSeason 출력
        // 2. "현재 월: " + currentMonth 출력

        // TODO: 월에 따른 계절을 판단하고 출력하세요
        // 힌트:
        // 1. seasonForMonth = getSeasonForMonth(currentMonth) 호출
        // 2. currentMonth + "의 계절: " + seasonForMonth 출력

        // TODO: 계절별 활동을 switch문으로 출력하세요
        // 힌트:
        // switch (currentSeason) 사용하여
        // - SPRING: "봄 - 꽃구경 가기!"
        // - SUMMER: "여름 - 해수욕장 가기!"
        // - FALL: "가을 - 단풍구경 가기!"
        // - WINTER: "겨울 - 스키장 가기!"

        // 여기에 코드를 작성하세요
        Season currentSeason = Season.FALL;
        Month currentMonth = Month.NOVEMBER;

        System.out.println("현재 계절: " + currentSeason);
        System.out.println("현재 월: " + currentMonth);

        Season seasonForMonth = getSeasonForMonth(currentMonth);
        System.out.println(currentMonth + "의 계절: " + seasonForMonth);

        switch (currentSeason) {
            case SPRING:
                System.out.println("봄 - 꽃구경 가기!");
                break;
            case SUMMER:
                System.out.println("여름 - 해수욕장 가기!");
                break;
            case FALL:
                System.out.println("가을 - 단풍구경 가기!");
                break;
            case WINTER:
                System.out.println("겨울 - 스키장 가기!");
                break;
        }
    }

    // TODO: 월에 따른 계절을 반환하는 메소드를 구현하세요
    // 힌트:
    // switch (month) 사용하여
    // - MARCH, APRIL, MAY: return Season.SPRING;
    // - JUNE, JULY, AUGUST: return Season.SUMMER;
    // - SEPTEMBER, OCTOBER, NOVEMBER: return Season.FALL;
    // - DECEMBER, JANUARY, FEBRUARY: return Season.WINTER;
    // - default: return null;
    public static Season getSeasonForMonth(Month month) {
        // 여기에 코드를 작성하세요
        switch (month) {
            case MARCH:
            case APRIL:
            case MAY:
                return Season.SPRING;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.FALL;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            default:
                return null; // 임시 반환값
        }
    }
}