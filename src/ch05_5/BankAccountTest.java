package ch05_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * protected 접근 제어자의 활용을 보여주는 예제
 */
class BankAccount {
    private String accountNumber;
    protected double balance;  // 서브클래스에서 접근 가능
    protected List<String> transactionHistory;

    public BankAccount(String accountNumber, double initialBalance) {
        // TODO 14: 필드 초기화하기
        // accountNumber, balance 초기화
        // transactionHistory를 새 ArrayList로 초기화
        // addTransaction()으로 "계좌 개설: [초기잔액]원" 추가
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        transactionHistory = new ArrayList<>();
        addTransaction("계좌 개설: "+balance+"원");
    }

    public void deposit(double amount) {
        // TODO 15: 입금 기능 구현하기
        // amount > 0일 때만 처리
        // balance에 amount 추가
        // addTransaction()으로 "입금: [금액]원" 추가
        if(amount>0){
            balance += amount;
            addTransaction("입금: "+amount+"원");
        }

    }

    public void withdraw(double amount) {
        // TODO 16: 출금 기능 구현하기
        // amount > 0이고 amount <= balance일 때만 처리
        // balance에서 amount 차감
        // addTransaction()으로 "출금: [금액]원" 추가
        if(amount>0 && amount<=balance){
            balance -= amount;
            addTransaction("출금: "+amount+"원");
        }
    }

    protected void addTransaction(String transaction) {
        // TODO 17: 거래 내역 추가하기
        // transactionHistory에 현재 시간과 transaction 추가
        // 형식: "날짜시간 - 거래내용"
        String now = new Date().toString();
        transactionHistory.add(now + " - " + transaction);
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        // TODO 18: 거래 내역 출력하기
        // "=== 거래 내역 ===" 출력
        // transactionHistory의 모든 항목 출력
        System.out.println("=== 거래 내역 ===");
        for(int i = 0 ; i<transactionHistory.size();i++) {
            String item = transactionHistory.get(i);
            System.out.println(item);
        }

    }
}

// 프리미엄 계좌 - 특별 기능 추가
class PremiumAccount extends BankAccount {
    private double creditLimit;
    private double interestRate;

    public PremiumAccount(String accountNumber, double initialBalance,
                          double creditLimit, double interestRate) {
        // TODO 19: 부모 생성자 호출하고 추가 필드 초기화하기
        super(accountNumber, initialBalance);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    // 오버라이딩: 마이너스 통장 기능
    @Override
    public void withdraw(double amount) {
        // TODO 20: 신용 한도를 포함한 출금 기능 구현하기
        // amount > 0이고 amount <= balance + creditLimit일 때 처리
        // balance -= amount (protected이므로 직접 접근 가능)
        // addTransaction()으로 "출금: [금액]원 (잔액: [잔액]원)" 추가
        // balance < 0이면 "신용 한도 사용 중: [사용금액]원" 추가
        // 한도 초과 시 "출금 한도 초과!" 출력
        if(amount>0 && amount<=balance+creditLimit){
            balance -= amount;
            addTransaction("출금: "+amount+"원 (잔액: "+balance+"원)");
            if(balance < 0){
                System.out.println("출금 한도 초과!");
                addTransaction("신용 한도 사용 중: "+balance+"원");
            }
        }
    }

    // 새로운 기능: 이자 지급
    public void applyInterest() {
        // TODO 21: 이자 지급 기능 구현하기
        // balance > 0일 때만 처리
        // 이자 = balance * (interestRate / 100)
        // balance에 이자 추가
        // addTransaction()으로 "이자 지급: [이자]원" 추가
        if(balance>0){
            interestRate = balance * (interestRate/100);
            balance += interestRate;
            addTransaction("이자 지급: "+interestRate+"원");
        }
    }

    // 새로운 기능: VIP 혜택
    public void applyVIPBenefit() {
        // TODO 22: VIP 혜택금 지급하기
        // 혜택금 10000원을 balance에 추가
        // addTransaction()으로 "VIP 혜택금 지급: 10000원" 추가
        balance += 10000;
        addTransaction("VIP 혜택금 지급: 10000원" );
    }
}

// 테스트
public class BankAccountTest {
    public static void main(String[] args) {
        // TODO 23: 일반 계좌와 프리미엄 계좌 생성하기
        // 일반 계좌: "1234", 100000원
        // 프리미엄 계좌: "5678", 100000원, 신용한도 50000, 이자율 2.5%
        BankAccount normal = new BankAccount("1234", 100000);
        PremiumAccount premium = new PremiumAccount("5678", 100000, 50000, 2.5);

        // TODO 24: 일반 계좌 테스트하기
        // 50000원 입금, 30000원 출금, 200000원 출금 시도
        // 잔액 출력
        System.out.println("=== 일반 계좌 테스트 ===");
        normal.deposit(50000);
        normal.withdraw(30000);
        normal.withdraw(200000);
        System.out.println(normal.getBalance());

        // TODO 25: 프리미엄 계좌 테스트하기
        // 50000원 입금, 170000원 출금(신용한도 사용)
        // 이자 지급, VIP 혜택 적용
        // 잔액 출력
        System.out.println("=== 프리미엄 계좌 테스트 ===");
        premium.deposit(50000);
        premium.withdraw(170000);
        premium.applyInterest();
        premium.applyVIPBenefit();
        System.out.println(premium.getBalance());

        // TODO 26: 프리미엄 계좌 거래 내역 출력하기
        premium.printTransactionHistory();
    }
}
