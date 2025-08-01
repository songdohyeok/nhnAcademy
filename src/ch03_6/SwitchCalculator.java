package ch03_6;

import textio.TextIO;

public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("=== Switch 표현식 계산기 ===");

        System.out.print("첫 번째 숫자: ");
        double num1 = TextIO.getlnDouble();

        System.out.print("연산자 (+, -, *, /, %, ^): ");
        String operator = TextIO.getln().trim();

        System.out.print("두 번째 숫자: ");
        double num2 = TextIO.getlnDouble();

        // TODO: switch 표현식으로 계산 수행
        // 힌트: yield 사용, 0으로 나누기 검사
        double result = switch(operator) {// 여기에 switch 표현식을 작성하세요
            case "+" -> {yield num1 + num2;}
            case "-" -> {yield num1 - num2;}
            case "*" -> {yield num1 * num2;}
            case "/" -> {
                if(num2==0){
                System.out.println("0으로 나눌 수 없습니다!");
                System.exit(0);
            }
                yield num1 / num2;
            }
            case "%" -> {
                if(num2==0){
                System.out.println("0으로 나눌 수 없습니다!");
                System.exit(0);
            }
                yield num1 % num2;
            }
            case "^" -> {yield Math.pow(num1, num2);}
            default -> 0;
        };

        // 결과 출력
        if (!Double.isNaN(result)) {
            System.out.printf("결과: %.2f %s %.2f = %.2f%n",
                    num1, operator, num2, result);

            // TODO: switch 표현식으로 결과 분석
            // 힌트: Double.compare() 사용
            String analysis = switch(Double.compare(result, 0)) {// 여기에 switch 표현식을 작성하세요
                case 1 -> "양수입니다.";
                case -1 -> "음수입니다.";
                default -> "0입니다.";

            };
                    System.out.println("분석: " + analysis);

            // TODO: 정수 여부 확인
            // 힌트: 조건 평가 후 switch
            String numberType = switch((result == Math.floor(result)) ? "정수" : "실수") {// 여기에 switch 표현식을 작성하세요
                case "정수" -> "정수입니다:";
                case "실수" -> "실수입니다";
                default -> "분석 불가";
            };
                    System.out.println("타입: " + numberType);
        }
    }
}