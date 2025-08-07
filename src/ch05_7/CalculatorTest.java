package ch05_7;

/**
 * 계산기 인터페이스 - 기본 연산과 확장 연산
 */
interface Calculator {
    // 기본 연산 (추상 메서드)
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    // 확장 연산 (기본 메서드)
    default double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    default double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수의 제곱근은 계산할 수 없습니다.");
        }
        return Math.sqrt(number);
    }

    default double average(double... numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double num : numbers) {
            sum = add(sum, num);  // 추상 메서드 사용
        }
        return divide(sum, numbers.length);
    }

    default double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("음수의 팩토리얼은 정의되지 않습니다.");
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result = multiply(result, i);  // 추상 메서드 사용
        }
        return result;
    }
}

// 기본 계산기 구현
class BasicCalculator implements Calculator {
    @Override
    public double add(double a, double b) {
        // TODO 38: 덧셈 구현하기
        return a+b;
    }

    @Override
    public double subtract(double a, double b) {
        // TODO 39: 뺄셈 구현하기
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        // TODO 40: 곱셈 구현하기
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
        // TODO 41: 나눗셈 구현하기
        // b가 0이면 ArithmeticException 던지기
        if(b==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        return a/b;
    }
}

// 공학용 계산기 - 일부 기본 메서드 오버라이드
class ScientificCalculator extends BasicCalculator {
    // 더 정확한 제곱근 계산 알고리즘 사용
    @Override
    public double squareRoot(double number) {
        // TODO 42: 개선된 제곱근 계산 구현하기
        // 음수 체크
        // Newton-Raphson 방법 구현 (또는 간단히 Math.sqrt 사용)
        // "개선된 알고리즘 사용" 출력 후 결과 반환
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println("개선된 알고리즘 사용");
        return Math.sqrt(number);
    }

    // 추가 메서드
    public double sin(double angle) {
        // TODO 43: 사인 함수 구현하기
        return Math.sin(angle);
    }

    public double cos(double angle) {
        // TODO 44: 코사인 함수 구현하기
        return Math.cos(angle);
    }
}

// 테스트
public class CalculatorTest {
    public static void main(String[] args) {
        // TODO 45: BasicCalculator 테스트하기
        // 3 + 5, 10 - 4 계산하고 출력
        // average(2, 4, 6, 8) 계산하고 출력
        // 5! 계산하고 출력
        // √16 계산하고 출력
        BasicCalculator basic = new BasicCalculator();
        System.out.println("=== 기본 계산기 ===");
        System.out.println("3 + 5 = " + basic.add(3, 5));
        System.out.println("10 - 4 = " + basic.subtract(10, 4));
        System.out.println("평균(2, 4, 6, 8) = " + basic.average(2, 4, 6, 8));
        System.out.println("5! = " + basic.factorial(5));
        System.out.println("√16 = " + basic.squareRoot(16));

        // TODO 46: ScientificCalculator 테스트하기
        // √25 계산하고 출력
        // sin(π/2), cos(0) 계산하고 출력
        System.out.println("\n=== 공학용 계산기 === ");
        ScientificCalculator sci = new ScientificCalculator();
        System.out.println("√25 = " + sci.squareRoot(25));
        System.out.println("sin(π/2) = " + sci.sin(Math.PI / 2));
        System.out.println("cos(0) = " + sci.cos(0));
    }
}
