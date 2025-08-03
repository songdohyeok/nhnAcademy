package ch04_1;

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println("=== 인터페이스 구성 요소 예제 ===\n");

        // TODO 26: 구문적 인터페이스 테스트하기
        System.out.println("1. 구문적 인터페이스 (올바른 사용):");
        // add 메서드와 calculateAverage 메서드를 호출해보세요
        add(5,3);
        double[] numbers = {25, 25, 25, 25};
        calculateAverage(numbers);

        // TODO 27: 의미적 인터페이스 이해하기
        System.out.println("\n2. 의미적 인터페이스 이해:");
        // BankAccount 객체를 생성하고 출금 기능을 테스트해보세요
        int balance = 1000;
        BankAccount account = new BankAccount(balance);
        account.withdraw(300);
        account.withdraw(800);
        account.getBalance();
    }

    // TODO 28: 두 정수를 더하는 메서드 구현하기
    /**
     * 두 정수를 더합니다.
     * 구문: add(int, int) -> int
     * 의미: 첫 번째 매개변수와 두 번째 매개변수의 합을 반환
     */
    public static int add(int a, int b) {
        // 두 수의 합을 반환하세요
        System.out.printf("add(%d, %d) = %d",a,b,a+b);
        return a + b;
    }

    // TODO 29: 배열의 평균을 계산하는 메서드 구현하기
    /**
     * 배열의 평균을 계산합니다.
     * 전제조건: 배열이 null이 아니고 비어있지 않아야 함
     */
    public static double calculateAverage(double[] numbers) {
        // 배열이 null이거나 비어있으면 예외를 발생시키고
        // 그렇지 않으면 평균을 계산하여 반환하세요
        double sum = 0;

        try{
            if(numbers == null || numbers.length == 0){
                throw new NullPointerException();
            }else{
                for(double i:numbers){
                    sum += i;
                }
            }
        }catch (NullPointerException e){
            System.out.printf(e.getMessage());
        }finally {
            System.out.printf("%n평균 = %.1f%n", sum/numbers.length);
        }
        return sum/numbers.length;
    }
}

// TODO 30: 은행 계좌 클래스 완성하기
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        // 초기 잔액을 설정하세요
        balance = initialBalance;
        System.out.printf("초기 잔액: %.1f%n",balance);
    }
    /**
     * 계좌에서 돈을 출금합니다.
     *
     * 의미적 계약:
     * - 잔액이 충분하면 출금하고 true 반환
     * - 잔액이 부족하면 출금하지 않고 false 반환
     * - 음수 금액은 허용하지 않음
     */
    public boolean withdraw(double amount) {
        // 출금 로직을 구현하세요
        if(balance >= amount){
            System.out.printf("%.0f원 출금 성공%n", amount);
            System.out.printf("현재 잔액: %.1f%n", balance -= amount);
        }else{
            System.out.printf("%.0f원 출금 실패 (잔액 부족)%n", amount);
        }
        return true;
    }

    public double getBalance() {
        // 현재 잔액을 반환하세요
        System.out.printf("최종 잔액: %.1f%n", balance);
        return balance;
    }
}