package ch05_3;

import java.util.Random;

/**
 * StringBuilder를 활용한 효율적인 문자열 처리 예제
 */
public class StringBuilderExample {

    // TODO 1: 비효율적인 방법 - String 연결 메서드 구현하기
    public static String createStringInefficient(int count) {
        // String result = ""로 시작
        // 반복문으로 i + " "를 result에 추가 (+ 연산자 사용)
        // result 반환
        String result = "";
        for(int i = 0; i < count; i++){
            result = result + i+" ";
        }
        return result;
    }

    // TODO 2: 효율적인 방법 - StringBuilder 사용 메서드 구현하기
    public static String createStringEfficient(int count) {
        // StringBuilder builder = new StringBuilder() 생성
        // 반복문으로 builder.append(i).append(" ") 호출
        // builder.toString() 반환
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < count; i++){
            builder.append(i).append(" ");
        }
        return builder.toString();
    }

    // TODO 3: HTML 테이블 생성 메서드 구현하기
    public static String createHtmlTable(String[][] data) {
        // StringBuilder html 생성
        // "<table border='1'>\n" 추가
        // 이중 반복문으로 각 행과 열 처리
        //   - 각 행마다 "  <tr>\n" 추가
        //   - 각 셀마다 "    <td>" + 데이터 + "</td>\n" 추가
        //   - 행 끝에 "  </tr>\n" 추가
        // "</table>" 추가
        // html.toString() 반환
        StringBuilder html = new StringBuilder();
        html.append("<table border='1'>\n");

        for(int i = 0; i<= 2;i++){
            html.append("  <tr>\n");
            for(int j = 0; j<= 2; j++){
                html.append("    <td>");
                html.append(data[i][j]);
                html.append("</td>\n");
            }
            html.append("  </tr>\n");
        }
        System.out.println("</table>");

        System.out.println(html);

        return html.toString();
    }

    // TODO 4: 성능 비교 테스트 메서드 구현하기
    public static void performanceTest() {
        // int count = 10000으로 설정
        // System.currentTimeMillis()로 시작 시간 기록
        // createStringInefficient(count) 호출하고 시간 측정
        // createStringEfficient(count) 호출하고 시간 측정
        // 결과 출력:
        //   "=== 성능 비교 (반복 [count]회) ==="
        //   "String 연결: [inefficientTime]ms"
        //   "StringBuilder: [efficientTime]ms"
        //   "성능 향상: [inefficientTime/efficientTime]배"
        int count = 10000;
        long start = System.currentTimeMillis();
        createStringInefficient(count);
        long end = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        createStringEfficient(count);
        long end2 = System.currentTimeMillis();

        System.out.println("=== 성능 비교 (반복 10000회) ===");
        System.out.printf("String 연결: %sms\n", end - start);
        System.out.printf("StringBuilder : %sms\n", end2 - start2);
        System.out.printf("성능 향상: %d배",(end - start) / (end2 - start2));
    }

    // TODO 5: 사용 예제 완성하기
    public static void main(String[] args) {
        System.out.println("=== StringBuilder 사용 예제 ===\n");

        // TODO 6: StringBuilder 기본 사용법 테스트하기
        // StringBuilder로 "Hello" 생성
        // " ", "World", "!" 순서대로 append
        // 결과 출력
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(" ");
        builder.append("World");
        builder.append("!");

        System.out.println(builder);

        // TODO 7: HTML 테이블 생성 테스트하기
        // tableData 배열 선언 (이름, 나이, 직업 데이터)
        // createHtmlTable() 호출하고 결과 출력
        System.out.println("\n=== 생성된 HTML 테이블 ===");
        String[][] tableData = new String[4][4];
        tableData[0][0] = "이름";
        tableData[0][1] = "나이";
        tableData[0][2] = "직업";
        tableData[1][0] = "김철수";
        tableData[1][1] = "25";
        tableData[1][2] = "프로그래머";
        tableData[2][0] = "이영희";
        tableData[2][1] = "23";
        tableData[2][2] = "디자이너";
        tableData[3][0] = "박민수";
        tableData[3][1] = "30";
        tableData[3][2] = "기획자";

        createHtmlTable(tableData);

        // TODO 8: 성능 테스트 실행하기
        // performanceTest() 호출
        performanceTest();
    }
}