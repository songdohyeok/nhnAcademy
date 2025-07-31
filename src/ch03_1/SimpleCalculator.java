package ch03_1;

import textio.TextIO;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1, num2, result = 0;
        char operator;
        boolean validOperation = true;

        System.out.println("=== 간단한 계산기 ===");

        System.out.print("첫 번째 숫자: ");
        num1 = TextIO.getlnDouble();

        System.out.print("연산자 (+, -, *, /): ");
        operator = TextIO.getlnChar();

        System.out.print("두 번째 숫자: ");
        num2 = TextIO.getlnDouble();

        // TODO: 연산자에 따른 계산
        // 힌트:
        // 1. '+' → 덧셈
        // 2. '-' → 뻔셈
        // 3. '*' → 곱셈
        // 4. '/' → 나눗셈 (0으로 나누기 처리 필요)
        // 5. 그 외 → 오류 메시지

        // 여기에 코드를 작성하세요

        if(operator == '+'){
            result = num1 + num2;
        }else if(operator == '-'){
            result = num1 - num2;
        }else if(operator == '*'){
            result = num1 * num2;
        }else if(operator == '/' && num2 != 0){
            result = num1 / num2;
        }

        if(operator == '/' && num2 == 0){
            System.out.println("0으로 나눌 수 없습니다");
            System.exit(0);
        }

        if (validOperation) {
            System.out.println("결과: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}