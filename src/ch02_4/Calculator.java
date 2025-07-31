package ch02_4;

import textio.TextIO;
public class Calculator {
    public static void main(String[] args) {
        // TODO: TextIO를 사용하여 간단한 계산기를 만드세요
        // 힌트:
        // 1. "=== 간단한 계산기 ===" 출력
        // 2. 첫 번째 숫자를 getlnDouble()로 입력받기
        // 3. 연산자를 getlnChar()로 입력받기 (+, -, *, /)
        // 4. 두 번째 숫자를 getlnDouble()로 입력받기
        // 5. switch문으로 연산 수행
        // 6. 0으로 나누기 오류 처리
        // 7. printf로 결과 출력: "숫자1 연산자 숫자2 = 결과"

        // 여기에 코드를 작성하세요
        System.out.println("=== 간단한 계산기 ===");

        System.out.print("첫 번째 숫자: ");
        double num1 = TextIO.getlnDouble();

        System.out.print("연산자 (+, -, *, /): ");
        char op = TextIO.getlnChar();

        System.out.print("두 번째 숫자: ");
        double num2 = TextIO.getlnDouble();

        double result = 0.0;
        boolean valid = true;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    valid = false;
                } else
                    result = num1 / num2;
                break;
        }

        if (valid)
            System.out.printf("%.2f %c %.2f = %.2f\n", num1, op, num2, result);

    }
}