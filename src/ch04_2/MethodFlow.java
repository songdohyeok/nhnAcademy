package ch04_2;

public class MethodFlow {
    public static void main(String[] args) {
        System.out.println("=== 메서드 호출 흐름 ===\n");
        System.out.println("1. main 시작");

        // TODO 11: methodA 호출하기
        methodA();

        System.out.println("6. main 종료");
    }

    // TODO 12: methodA 구현하기
    public static void methodA() {
        // "2. methodA 시작" 출력
        System.out.println("2. mothodA 시작");
        // methodB() 호출
        methodB();
        // "5. methodA 종료" 출력
        System.out.println("5. mothodA 종료");
    }

    // TODO 13: methodB 구현하기
    public static void methodB() {
        // "3. methodB 시작" 출력
        System.out.println("3. mothodB 시작");
        // methodC() 호출
        methodC();
        // "4. methodB 종료" 출력
        System.out.println("4. mothodB 종료");
    }

    // TODO 14: methodC 구현하기
    public static void methodC() {
        // "3.5. methodC 실행" 출력
        System.out.println("3.5. mothodC 실행");
    }
}