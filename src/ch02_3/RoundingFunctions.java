package ch02_3;

public class RoundingFunctions {
    public static void main(String[] args) {
        // TODO: 반올림 함수들을 테스트할 숫자 배열을 선언하세요
        // 힌트: double[] numbers = {3.14, 3.5, 3.8, -2.3, -2.7};

        // TODO: 테이블 헤더를 출력하세요
        // 힌트:
        // 1. "숫자\tround\tfloor\tceil" 출력
        // 2. 구분선 "----------------------------------------" 출력

        // TODO: 각 숫자에 대해 round, floor, ceil 결과를 출력하세요
        // 힌트:
        // for-each 루프를 사용하여 각 숫자에 대해
        // Math.round(), Math.floor(), Math.ceil() 결과를 탭으로 구분하여 출력

        // TODO: 특별한 경우들을 출력하세요
        // 힌트:
        // 1. "\n특별한 경우:" 출력
        // 2. Math.floor(5.0)의 결과 (5.0)
        // 3. Math.ceil(5.0)의 결과 (5.0)
        // 4. Math.round(5.5)의 결과 (6)

        // 여기에 코드를 작성하세요
        double[] numbers = {3.14, 3.5, 3.8, -2.3, -2.7};

        System.out.println("숫자\t\tround\t\tfloor\tceil");
        System.out.println("----------------------------------------");

        for (double num : numbers) {
            System.out.println(num+"\t\t"+Math.round(num)+"\t\t"+Math.floor(num)+"\t\t"+Math.ceil(num));
        }

        System.out.println("\n특별한 경우:" );
        System.out.println(Math.floor(5.0));
        System.out.println(Math.ceil(5.0));
        System.out.println(Math.round(5.5));
    }
}