package ch09_1;

public class FibonacciExample {

    /**
     * 기본 재귀 피보나치 (비효율적)
     * F(n) = F(n-1) + F(n-2)
     */
    public static long fibonacciSimple(int n) {
        // TODO 1: 기저 사례 구현
        // 힌트: F(0) = 0, F(1) = 1
        if(n == 1){
            return 1;
        }else if (n == 0){
            return 0;
        }

        // TODO 2: 재귀 사례 구현
        // 힌트: F(n) = F(n-1) + F(n-2)

        return fibonacciSimple(n-1) + fibonacciSimple(n-2); // 임시 반환값
    }

    /**
     * 메모이제이션을 사용한 효율적인 재귀 피보나치
     */
    public static long fibonacciMemo(int n) {
        long[] memo = new long[n + 1];
        return fibonacciMemoHelper(n, memo);
    }

    private static long fibonacciMemoHelper(int n, long[] memo) {
        // TODO 1: 기저 사례
        if(n==1){
            return 1;
        }else if (n==0){
            return 0;
        }

        // TODO 2: 이미 계산된 값이 있는지 확인
        // 힌트: memo[n] != 0이면 이미 계산됨
        if(memo[n] != 0){
            return memo[n];
        }

        // TODO 3: 계산 후 메모에 저장
        return fibonacciMemoHelper(n-1, memo) + fibonacciMemoHelper(n-2, memo); // 임시 반환값
    }

    public static void main(String[] args) {
        System.out.println("=== 피보나치 수열 예제 ===");
        for(int i = 0 ; i<=9; i++) System.out.println("F(" + i + ") = " + fibonacciSimple(i));

        // 실행 결과:
        // F(0) = 0
        // F(1) = 1
        // F(2) = 1
        // F(3) = 2
        // F(4) = 3
        // F(5) = 5
        // F(6) = 8
        // F(7) = 13
        // F(8) = 21
        // F(9) = 34

        System.out.println("\n=== 성능 비교 ===");
        System.out.println("F(20) 계산: ");
        System.out.println("단순 재귀: "+fibonacciSimple(20)+" (약 10ms, 21891회 호출)");
        System.out.println("메모이제이션: "+fibonacciMemo(20)+" (약 0.1ms)");
        // F(20) 계산:
        // 단순 재귀: 6765 (약 10ms, 21891회 호출)
        // 메모이제이션: 6765 (약 0.1ms)
    }
}
