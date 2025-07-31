package ch02_5;

public class ConditionalOperator {
    public static void main(String[] args) {
        // TODO: 조건 연산자(?:)를 사용한 다양한 예제를 작성하세요
        // 힌트:
        // 1. "=== 조건 연산자 (? :) ===" 출력
        // 2. a=10, b=20일 때 최댓값과 최솟값 구하기
        // 3. number=-15의 절댓값 구하기
        // 4. 1부터 5까지 짝수/홀수 판별하여 출력
        // 5. score=85일 때 중첩된 조건 연산자로 등급(A/B/C/D/F) 구하기

        // 여기에 코드를 작성하세요
        System.out.println("=== 조건 연산자 (? :) ===");

        int a = 10, b = 20;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("최댓값: " + (a > b ? a : b));
        System.out.println("최솟값: " + (a < b ? a : b));

        int number = -15;
        System.out.println("\n" + number + "의 절댓값: " + (number < 0 ? -number : number));

        System.out.println("\n짝수/홀수 판별:");
        for (int i = 1; i <= 5; i++)
            System.out.println(i + "는 " + (i % 2 == 0 ? "짝수" : "홀수"));

        int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        System.out.println("\n점수 " + score + "의 등급: " + grade);
    }

}