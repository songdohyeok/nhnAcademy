package ch02_5;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // TODO: 기본 산술 연산을 수행하고 결과를 출력하세요
        // 힌트:
        // 1. 정수 a=17, b=5 선언
        // 2. "=== 정수 연산 ===" 출력 후 a, b 값과 +, -, *, /, % 연산 결과 출력
        // 3. 실수 x=17.0, y=5.0 선언 후 실수 나눗셈과 나머지 연산 출력
        // 4. 음수와 양수의 나머지 연산 결과 확인 (17%5, -17%5, 17%-5, -17%-5)

        // 여기에 코드를 작성하세요
        int a = 17, b = 5;

        System.out.println("=== 정수 연산 ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        double x = 17.0, y = 5.0;

        System.out.println("\n=== 실수 연산 ===");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("\n=== 음수와 나머지 ===");
        System.out.println("17 % 5 = " + (17 % 5));
        System.out.println("-17 % 5 = " + (-17 % 5));
        System.out.println("17 % -5 = " + (17 % -5));
        System.out.println("-17 % -5 = " + (-17 % -5));
    }
}