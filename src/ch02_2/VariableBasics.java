package ch02_2;

public class VariableBasics {
    public static void main(String[] args) {
        // TODO: 변수를 선언만 하세요 (초기화하지 않음)
        // 힌트:
        // 1. count (int 타입)
        // 2. price (double 타입)
        // 3. isAvailable (boolean 타입)

        // TODO: 위에서 선언한 변수에 값을 할당하세요
        // 힌트:
        // 1. count = 10
        // 2. price = 29.99
        // 3. isAvailable = true

        // TODO: 선언과 동시에 초기화하세요
        // 힌트:
        // 1. quantity = 5 (int)
        // 2. discount = 0.15 (double)
        // 3. grade = 'A' (char)

        // TODO: 여러 변수를 동시에 선언하고 개별적으로 값을 할당하세요
        // 힌트:
        // 1. x, y, z를 int 타입으로 동시 선언
        // 2. x = 1, y = 2, z = 3 할당

        // TODO: 여러 변수를 동시에 선언하면서 초기화하세요
        // 힌트: width = 100, height = 200, depth = 50 (모두 int)

        // TODO: 결과를 출력하세요
        // 힌트:
        // 1. count 값 출력
        // 2. price 값 출력
        // 3. quantity × price 계산 결과 출력

        // 여기에 코드를 작성하세요
        int count;
        double price;
        boolean isAvailable;

        count = 10;
        price = 29.99;
        isAvailable = true;

        int quantity = 5;
        double discount = 0.15;
        char grade = 'A';

        int x, y, z;
        x = 1;
        y = 2;
        z = 3;

        int width = 100, height = 200, depth = 50;

        System.out.printf("%d%n", count);
        System.out.printf("%.2f%n", price);
        System.out.printf("%.2f", quantity*price);

    }
}