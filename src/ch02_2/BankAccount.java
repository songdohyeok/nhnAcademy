package ch02_2;

public class BankAccount {
    public static void main(String[] args) {
        // TODO: 계좌 정보를 저장할 변수들을 선언하고 초기화하세요
        // 힌트:
        // 1. accountHolder = "홍길동" (예금주 이름)
        // 2. accountNumber = "1234-5678-9012" (계좌번호)
        // 3. balance = 10000.0 (초기 잔액)
        // 4. interestRate = 0.02 (연 2% 이자율)
        // 5. isActive = true (계좌 활성 상태)

        // TODO: 계좌 정보를 출력하세요
        // 힌트:
        // 1. "=== 은행 계좌 정보 ===" 출력
        // 2. 예금주, 계좌번호, 현재 잔액 출력
        // 3. 이자율을 백분율로 변환하여 출력 (interestRate * 100)
        // 4. 계좌 상태를 삼항 연산자로 출력 (isActive ? "활성" : "비활성")

        // TODO: 거래 시뮬레이션을 구현하세요
        // 힌트:
        // 1. "\n=== 거래 내역 ===" 출력
        // 2. deposit = 2500.0 (입금액)
        // 3. balance에 입금액 추가
        // 4. 입금 내역과 잔액 출력

        // TODO: 출금 처리를 구현하세요
        // 힌트:
        // 1. withdrawal = 1000.0 (출금액)
        // 2. if문으로 잔액 충분 여부 확인
        // 3. 충분하면 출금 처리 후 잔액 출력
        // 4. 부족하면 "잔액 부족!" 출력

        // TODO: 월 이자를 계산하고 적용하세요
        // 힌트:
        // 1. monthlyRate = interestRate / 12 (월 이자율)
        // 2. monthlyInterest = balance * monthlyRate (월 이자)
        // 3. balance에 이자 추가
        // 4. "\n=== 월 이자 적용 ===" 출력
        // 5. 월 이자율(백분율), 이자, 최종 잔액 출력

        // 여기에 코드를 작성하세요
        String accountHolder = "홍길동";
        String accountNumber = "1234-5678-9012";
        double balance = 10000.0;
        double interestRate = 0.02;
        boolean isActive = true;

        System.out.println("=== 은행 계좌 정보 ===");
        System.out.printf("예금주: %s 계좌번호: %s 현재잔액: %.1f%n", accountHolder, accountNumber, balance);
        interestRate *= 100;
        System.out.println(isActive ? "활성" : "비활성");

        System.out.println("\n=== 거래 내역 ===");
        double deposit = 2500.0;
        balance += deposit;
        System.out.printf("입금내역: %.1f 잔액: %.1f%n", deposit, balance);

        double withdrawal = 1000.0;

        if (balance > withdrawal) {
            balance -= withdrawal;
            System.out.printf("출급내역: %.1f 잔액: %.1f%n", withdrawal, balance);
        }else if (balance < withdrawal)
            System.out.println("잔액 부족!");

        double monthlyRate = interestRate / 12;
        double monthlyInterest = balance * monthlyRate;
        balance += monthlyInterest;
        System.out.println("\n=== 월 이자 적용 ===");
        System.out.printf("월 이자율: %.2f%% 이자: %.1f 최종 잔액: %.1f%n", monthlyRate * 100, monthlyInterest, balance);

    }
}