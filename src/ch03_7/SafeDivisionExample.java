package ch03_7;

import textio.TextIO;

public class SafeDivisionExample {
    public static void main(String[] args) {
        System.out.println("=== 안전한 나눗셈 예제 ===");

        while (true) {
            try {
                System.out.print("첫 번째 숫자 (또는 'quit'): ");
                String input1 = TextIO.getln();

                if (input1.equalsIgnoreCase("quit")) {
                    break;
                }

                System.out.print("두 번째 숫자: ");
                String input2 = TextIO.getln();

                // TODO: 숫자 변환과 나눗셈 수행
                // 힌트: parseDouble() 사용

                // 여기에 코드를 작성하세요
                double inputD1 = Double.parseDouble(input1);
                double inputD2 = Double.parseDouble(input2);
                double result = safeDivide(inputD1, inputD2);
               System.out.printf("결과: %.2f / %.2f = %.2f", inputD1, inputD2, result);
                } catch (NumberFormatException e) {
                    System.out.println("❌ 올바른 숫자를 입력해주세요.");
                } catch (ArithmeticException e) {
                    System.out.println("❌ 계산 오류: " + e.getMessage());
                }


            System.out.println();
        }

        System.out.println("계산기를 종료합니다.");
    }

    public static double safeDivide(double dividend, double divisor) {
        // TODO: 안전한 나눗셈 구현
        // 힌트: 0 검사 후 예외 발생
        // 여기에 코드를 작성하세요
        if(divisor == 0){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }

        return dividend / divisor; // 임시 반환값
    }
}