package ch04_3;

public class CalculatorOverloading {
    public static void main(String[] args) {
        System.out.println("=== 계산기 오버로딩 ===\n");

        // TODO 35: 두 수의 합 테스트하기
        add(5,3);
        add(5.5,3.3);

        // TODO 36: 세 수의 합 테스트하기
        add(1,2,3);
        add(1.1,2.2,3.3);

        // TODO 37: 배열의 합 테스트하기
        int[] intArray = {10, 20, 30, 40};
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        add(intArray);
        add(doubleArray);

        // TODO 38: 평균 계산 테스트하기
        System.out.println("\n평균 계산:");
        average(80,90);
        average(80,90,100);
        average(intArray);
    }

    // TODO 39: add 메서드들 구현하기
    static int add(int a, int b) {
        System.out.printf("add(%d, %d) = %d\n", a, b, a+b);
        return a+b;
    }

    static double add(double a, double b) {
        System.out.printf("add(%.1f, %.1f) = %.1f\n", a, b, a+b);
        return a+b;
    }

    static int add(int a, int b, int c) {
        System.out.printf("add(%d, %d, %d) = %d\n", a, b, b, a+b+c);
        return a+b+c;
    }

    static double add(double a, double b, double c) {
        System.out.printf("add(%.1f, %.1f, %.1f) = %.1f\n", a, b,c, a+b+c);
        return a+b+c;
    }

    static int add(int[] numbers) {
        int sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.printf("add(intArray) = %d\n", sum);
        return sum;
    }

    static double add(double[] numbers) {
        double sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.printf("add(intArray) = %.1f\n", sum);
        return sum;
    }

    // TODO 40: average 메서드들 구현하기
    static double average(int a, int b) {
        System.out.printf("average(%d, %d) = %d\n", a, b, (a+b)/2);
        return (a+b)/2;
    }

    static double average(int a, int b, int c) {
        System.out.printf("average(%d, %d, %d) = %d\n", a, b,c, (a+b+c)/3);
        return (a+b+c)/3;
    }

    static double average(int[] numbers) {
        int sum = 0;
        for(int i = 0; i<numbers.length;i++){
            sum += numbers[i];
        }
        System.out.printf("add(intArray) = %.1f\n", (double) sum/numbers.length);
        return (double) sum /numbers.length;
    }
}