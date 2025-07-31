package ch02_2;

public class IntegerTypes {
    public static void main(String[] args) {
        // TODO: byte 타입 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. age = 25 (byte 타입, -128 ~ 127 범위)
        // 2. temperature = -10 (byte 타입)
        // 주의: byte tooBig = 200은 범위 초과로 오류 발생

        // TODO: short 타입 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. year = 2024 (short 타입, -32,768 ~ 32,767 범위)
        // 2. population = 30000 (short 타입)

        // TODO: int 타입 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. salary = 50000000 (int 타입, 가장 많이 사용)
        // 2. distance = 384400 (지구에서 달까지 거리 km)

        // TODO: long 타입 변수를 선언하고 값을 할당하세요
        // 힌트:
        // 1. worldPopulation = 7_900_000_000L (L 접미사 필수)
        // 2. nationalDebt = 1_500_000_000_000L
        // 주의: 밑줄(_)은 숫자 가독성을 위해 사용 가능

        // TODO: 각 정수 타입의 최대/최소값을 출력하세요
        // 힌트:
        // 1. Byte.MIN_VALUE, Byte.MAX_VALUE
        // 2. Short.MIN_VALUE, Short.MAX_VALUE
        // 3. Integer.MIN_VALUE, Integer.MAX_VALUE
        // 4. Long.MIN_VALUE, Long.MAX_VALUE

        // 여기에 코드를 작성하세요
        byte age = 25;
        byte temperature = -10;

        short year = 2024;
        short population = 30000;

        int salary = 50000000;
        int distance = 38440;

        long worldPopulation = 7_900_000_000L;
        long nationalDebt = 1_500_000_000_000L;

        System.out.printf("byte 범위: %d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Short 범위: %d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Integer 범위: %d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long 범위: %d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);

    }
}