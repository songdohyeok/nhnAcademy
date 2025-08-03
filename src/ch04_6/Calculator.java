package ch04_6;

// TODO 31: 클래스에 대한 Javadoc 주석 작성하기
/**
 *
 * @author : 송도혁
 * @version : 21-LTS
 * @since : 2025-08-02
 */
public class Calculator {

    // TODO 32: add 메서드에 Javadoc 주석 작성하기
    /**
     * @param a First param
     * @param b second param
     * @return A+B;
     */
    public static double add(double a, double b) {
        return a + b;
    }

    // TODO 33: subtract 메서드에 Javadoc 주석 작성하기
    /**
     * @param a First param
     * @param b Second param
     * @return A-B;
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    // TODO 34: divide 메서드에 Javadoc 주석 작성하기 (예외 포함)
    /**
     * @param dividend 피제수
     * @param divisor  제수
     * @return A/B:
     * @throws ArithmeticException 0으로 나눌경우
     */
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다");
        }
        return dividend / divisor;
    }
}