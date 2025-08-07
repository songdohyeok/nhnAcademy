package ch07_1;

public class MixedParameters {
    // TODO: 일반 매개변수와 가변 인수를 혼합한 메서드를 작성하세요
    // 메서드명: formatMessage
    // 매개변수: String prefix, String... items
    // 반환값: "prefix: item1, item2, item3" 형태의 문자열
    static String formatMessage(String prefix, String... items){
        return "prefix: item1, item2, item3";
    }


    // TODO: 다양한 타입의 매개변수를 가진 메서드를 작성하세요
    // 메서드명: printReport
    // 매개변수: String title, int year, double... values
    // 출력: 제목, 각 월의 값, 연간 총계, 월 평균
    static void printReport(String title, int year, double... values){
        System.out.println("=== "+title+" ("+year+") ===");
        int[] month = {1,2,3,4,5,6};
        double sum = 0;
        for(int i = 0;i<month.length;i++){
            System.out.println(i+1+"월: "+values[i]);
            sum += values[i];
        }
        System.out.printf("연간 총계: %.1f\n",sum);
        System.out.printf("월 평균: %.1f",sum/values.length);


    }


    public static void main(String[] args) {
        // formatMessage 사용
        System.out.println(formatMessage("과일", "사과", "바나나", "오렌지"));
        System.out.println(formatMessage("색상", "빨강", "파랑"));
        System.out.println(formatMessage("숫자"));  // 가변 인수 0개

        System.out.println();

        // printReport 사용
        printReport("월별 매출", 2024,
                150.5, 180.3, 165.7, 195.2, 210.5, 188.9);
    }
}