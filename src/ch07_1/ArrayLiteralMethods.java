package ch07_1;

public class ArrayLiteralMethods {
    // TODO: 요일 이름 반환 메서드를 작성하세요
    // 메서드명: getDayName, 매개변수: int dayNumber
    // 배열 리터럴을 사용하여 요일 배열 생성 (일,월,화,수,목,금,토)
    // 유효한 번호면 "요일명요일" 반환, 아니면 "잘못된 요일" 반환
    static String getDayName(int dayNumber){
        String[] day = new String[]{"일","월","화","수","목","금","토"};

        if(dayNumber<7 && dayNumber >=0){
            return day[dayNumber]+"요일";
        }else{
            return "잘못된 요일";
        }
    }


    // TODO: 월별 일수 반환 메서드를 작성하세요
    // 메서드명: getDaysInMonth, 매개변수: int month, boolean isLeapYear
    // 배열 리터럴로 각 월의 일수 정의
    // 2월이고 윤년이면 29일 반환

    static String getDaysInMonth(int month, boolean isLeapYear){
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        isLeapYear = false;
        if(days[1] % 4 == 0){
            isLeapYear = true;
            if(days[1] % 100 == 0){
                isLeapYear = days[1] % 400 == 0;
            }
        }

        if(isLeapYear){
            return "29";
        }

        return "";
    }


    // TODO: 점수에 따른 등급 반환 메서드를 작성하세요
    // 메서드명: getGrade, 매개변수: int score
    // 경계값 배열과 등급 배열을 사용하여 등급 결정

    static char getGrade(int score){
        char[] grade = new char[]{'A','B', 'C', 'D', 'F'};

        if(score>=90){
            return grade[0];
        }else if(score>=80){
            return grade[1];
        }else if(score>=70){
            return grade[2];
        }else if(score>=60){
            return grade[3];
        }else{
            return grade[4];
        }

    }


    // TODO: 메뉴 출력 메서드를 작성하세요
    // 메서드명: showMenu
    // 배열 리터럴을 직접 전달하여 printMenu 호출

    static void showMenu(){
        String[] menu = new String[]{"1. 파일", "2. 편집", "3. 보기", "4. 도움말", "0. 종료"};
        printMenu("메인 메뉴", menu);
    }

    private static void printMenu(String title, String[] items) {
        System.out.println("=== " + title + " ===");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("================");
    }

    public static void main(String[] args) {
        // getDayName 테스트
        System.out.println("오늘은 " + getDayName(3));  // 수요일

        // getDaysInMonth 테스트
        System.out.println("2024년 2월: " +
                getDaysInMonth(2, true) + "일");  // 29일

        // getGrade 테스트
        int[] scores = {95, 82, 73, 65, 58};
        System.out.println("\n성적 평가:");
        for (int score : scores) {
            System.out.println(score + "점: " + getGrade(score) + "등급");
        }

        // showMenu 테스트
        System.out.println();
        showMenu();
    }
}
