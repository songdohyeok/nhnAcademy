package ch02_5;

public class LogicalOperators {
    public static void main(String[] args) {
        // TODO: 논리 연산자의 동작과 실제 활용 예제를 작성하세요
        // 힌트:
        // 1. "=== 논리 연산자 ===" 출력
        // 2. AND 연산(&&): true&&true, true&&false, false&&true, false&&false 결과 출력
        // 3. OR 연산(||): true||true, true||false, false||true, false||false 결과 출력
        // 4. NOT 연산(!): !true, !false 결과 출력
        // 5. 실제 예제: age=25, hasLicense=true, isInsured=false를 사용하여
        //    운전 가능 여부, 차량 대여 가능 여부, 할인 대상 여부 판별

        // 여기에 코드를 작성하세요
        System.out.println("=== 논리 연산자 ===\n");

        System.out.println("AND 연산 (&&):");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        System.out.println("\nOR 연산 (||):");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        System.out.println("\nNOT 연산 (!):");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        System.out.println("\n=== 실제 예제 ===");
        int age = 25;
        boolean hasLicense = true;
        boolean isInsured = false;

        boolean canDrive = (age >= 18) && hasLicense;
        boolean canRentCar = canDrive && isInsured;
        boolean isDiscounted = (age < 25) && !isInsured;

        System.out.println("운전 가능: " + canDrive);
        System.out.println("차량 대여 가능: " + canRentCar);
        System.out.println("할인 대상: " + isDiscounted);
    }
}