package ch04_2;

public class CounterProgram {
    // TODO 32: 정적 멤버 변수 선언하기
    // globalCounter, methodACalls, methodBCalls 변수 선언
    static int globalCounter;
    static int methodACalls;
    static int methodBCalls;

    public static void main(String[] args) {
        System.out.println("=== 카운터 프로그램 ===\n");

        System.out.println("초기 상태:");
        printCounters();

        // TODO 33: 메서드들을 여러 번 호출하기
        methodA(); methodA(); methodB(); methodA(); methodB(); methodB();

        System.out.println("\n최종 상태:");
        printCounters();
    }

    // TODO 34: methodA 구현하기
    public static void methodA() {
        // methodACalls 증가
        // globalCounter 증가
        // "Method A 호출됨 (총 X번째)" 출력

        methodACalls++;
        globalCounter++;
        System.out.printf("Method A 호출됨 (총 %d번째)\n",methodACalls);
    }

    // TODO 35: methodB 구현하기
    public static void methodB() {
        // methodBCalls 증가
        // globalCounter 증가
        // "Method B 호출됨 (총 X번째)" 출력
        methodBCalls++;
        globalCounter++;
        System.out.printf("Method B 호출됨 (총 %d번째)\n",methodBCalls);
    }

    // TODO 36: printCounters 구현하기
    public static void printCounters() {
        // 전체 호출 횟수, Method A 호출 횟수, Method B 호출 횟수 출력
        System.out.printf("전체 호출 횟수: %d\n",globalCounter);
        System.out.printf("Method A 호출: %d회\n",methodACalls);
        System.out.printf("Method B 호출: %d회\n",methodBCalls);
    }
}