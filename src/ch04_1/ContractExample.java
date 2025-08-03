package ch04_1;

import java.util.Arrays;

public class ContractExample {
    public static void main(String[] args) {
        System.out.println("=== 서브루틴의 계약 예제 ===\n");

        // TODO 31: 나누기 계약 테스트하기
        System.out.println("1. 나누기 계약:");
        // safeDivide 메서드를 사용해서 정상적인 나누기와 0으로 나누기를 테스트해보세요
        // try-catch를 사용하여 예외를 처리하세요
        safeDivide(10, 2);

        // TODO 32: 배열 검색 계약 테스트하기
        System.out.println("\n2. 배열 검색 계약:");
        // findElement 메서드를 사용해서 요소 찾기를 테스트해보세요
        int[] array = {10,20,30,40};
        findElement(array, 30);
        findElement(array, -99);

        // TODO 33: 비밀번호 검증 계약 테스트하기
        System.out.println("\n3. 비밀번호 검증 계약:");
        // 여러 종류의 비밀번호를 테스트해보세요
        isValidPassword("abc");
        isValidPassword("password");
        isValidPassword("12345678");
        isValidPassword("Pass123");
        testPassword("Pass123");
    }

    // TODO 34: 안전한 나누기 연산 메서드 구현하기
    /**
     * 안전한 나누기 연산
     * 전제조건: divisor != 0
     * 사후조건: dividend / divisor의 정확한 결과 반환
     * 예외: divisor가 0이면 IllegalArgumentException 발생
     */
    public static double safeDivide(double dividend, double divisor) {
        // 0으로 나누기를 방지하는 안전한 나누기를 구현하세요
        try{
            if(divisor!=0){
                System.out.printf("%.1f / %.1f = %.1f%n",dividend,divisor,dividend / divisor);
            }else{
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println("오류: 0으로 나눌 수 없습니다.");
        }
        return dividend / divisor;
    }

    // TODO 35: 배열에서 요소 찾기 메서드 구현하기
    /**
     * 배열에서 요소 찾기
     * 전제조건: array != null
     * 사후조건: 요소를 찾으면 인덱스 반환, 못 찾으면 -1 반환
     * 보장: 배열의 내용은 변경되지 않음
     */
    public static int findElement(int[] array, int target) {
        // 배열에서 target을 찾는 메서드를 구현하세요 (null 검사 포함)
        try{
            if(array != null){

                int index = Arrays.binarySearch(array, target);

                if (index >= 0) {
                    System.out.println(target + "의 위치: " + index);
                } else {
                    System.out.println(target + "의 위치: -1");
                }

                /*for(int i = 0; i<array.length; i++){
                    if(array[i]==target){
                        System.out.println(target+"의 위치: "+i);
                    }else{
                        System.out.println(target+"의 위치: "+i+"(찾지못함)");
                    }
                   }
                 */
            }
        }catch (NullPointerException e){
            System.out.println("catch");
        }
        return 0;
    }
    // TODO 36: 비밀번호 유효성 검사 메서드 구현하기
    /**
     * 비밀번호 유효성 검사
     * 규칙: 최소 6자 이상, 문자와 숫자 포함
     */
    public static boolean isValidPassword(String password) {
        // 비밀번호 유효성을 검사하는 메서드를 구현하세요
        boolean containsLetterAndDigit = password.matches(".*[a-zA-Z].*[0-9].*");
        if (password.length()>=6 && containsLetterAndDigit){
            System.out.printf("비밀번호 '%s': ✅ 유효함%n", password);
        } else {
            System.out.printf("비밀번호 '%s': ❌ 유효하지 않음%n", password);
            }

        return false;
    }

    // TODO 37: 비밀번호 테스트 메서드 구현하기
    private static void testPassword(String password) {
        // 비밀번호를 테스트하고 결과를 출력하는 메서드를 구현하세요
    }
}