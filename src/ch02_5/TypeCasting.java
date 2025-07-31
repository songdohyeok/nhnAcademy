package ch02_5;

public class TypeCasting {
    public static void main(String[] args) {
        // TODO: 강제 타입 변환(캐스팅)의 다양한 예제를 작성하세요
        // 힌트:
        // 1. "=== 강제 타입 변환 ===" 출력
        // 2. pi=3.14159를 (int)로 캐스팅하여 소수부분 버림 확인
        // 3. bigNumber=130을 (byte)로 캐스팅하여 오버플로우 확인
        // 4. a=7, b=2의 정수 나눗셈과 (double)a/b 실수 나눗셈 비교
        // 5. letter='Z'를 ASCII 값으로 변환하고, +32하여 소문자로 변환

        // 여기에 코드를 작성하세요
        System.out.println("=== 강제 타입 변환 ===");

        double pi = 3.14159;
        System.out.println("pi = " + pi);
        System.out.println("(int)pi = " + (int) pi);

        int bigNumber = 130;
        System.out.println("\nbigNumber = " + bigNumber);
        System.out.println("(byte)bigNumber = " + (byte) bigNumber);

        int a = 7, b = 2;
        System.out.println("\n정수 나눗셈:");
        System.out.println(a + " / " + b + " = " + (a / b) + ".0");
        System.out.println("(double)" + a + " / " + b + " = " + ((double) a / b));

        char letter = 'Z';
        int ascii = (int) letter;
        int lowerAscii = ascii + 32;
        char lowerChar = (char) lowerAscii;
        System.out.println("\n문자 변환:");
        System.out.println("'" + letter + "' → " + ascii);
        System.out.println(ascii + " + 32 → '" + lowerChar + "'");
    }
}