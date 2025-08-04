package ch05_2;

/**
 * 안전한 생성자를 가진 BankAccount 클래스
 */
class BankAccount {
    // TODO 11: private 인스턴스 변수 선언하기
    // accountNumber, ownerName (String), balance (double), bankName (String)
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String bankName;

    // TODO 12: 기본 생성자 구현하기 - 0원 계좌
    public BankAccount(String accountNumber, String ownerName) {
        // 계좌번호와 예금주명이 null이거나 비어있으면 IllegalArgumentException 발생
        // this.accountNumber = accountNumber, this.ownerName = ownerName
        // this.balance = 0.0, this.bankName = "Java Bank"
        // "[예금주]님의 계좌([계좌번호])가 개설되었습니다." 출력

        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
        this.bankName = "Java Bank";

        if(accountNumber == null || accountNumber.isEmpty() || ownerName== null || ownerName.isEmpty()){
            throw new IllegalArgumentException();
        }

        System.out.printf("%s님의 계좌(%s)가 개설되었습니다.\n",getOwnerName(),getAccountNumber());
    }

    // TODO 13: 초기 입금액이 있는 생성자 구현하기
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        // 계좌번호와 예금주명 유효성 검사 (null이거나 비어있으면 예외)
        // initialBalance가 0보다 작으면 "초기 잔액은 0 이상이어야 합니다." 예외
        // 모든 필드 초기화
        // "[예금주]님의 계좌([계좌번호])가 [금액]원으로 개설되었습니다." 출력
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.bankName = "Java Bank";

        if(accountNumber == null || accountNumber.isEmpty() || ownerName== null || ownerName.isEmpty()){
            throw new IllegalArgumentException();
        }

        if(initialBalance<0){
            throw new IllegalArgumentException("초기 잔액은 0 이상이어야 합니다.");
        }

        System.out.printf("%s님의 계좌(%s)가 %.0f원으로 개설되었습니다.\n",getOwnerName(),getAccountNumber(),getBalance());
    }

    // TODO 14: 은행명까지 지정하는 생성자 구현하기
    public BankAccount(String accountNumber, String ownerName,
                       double initialBalance, String bankName) {
        // 모든 매개변수 유효성 검사
        // bankName이 null이거나 비어있으면 "Java Bank"로 설정
        // "[은행명]에서 [예금주]님의 계좌([계좌번호])가 [금액]원으로 개설되었습니다." 출력
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
        this.bankName = bankName;

        if(accountNumber == null || accountNumber.isEmpty() || ownerName== null || ownerName.isEmpty()){
            throw new IllegalArgumentException();
        }

        if(bankName == null || bankName.isEmpty()){
            this.bankName = "Java Bank";
        }

        if(initialBalance<0){
            throw new IllegalArgumentException("초기 잔액은 0 이상이어야 합니다.");
        }

        System.out.printf("%s에서 %s님의 계좌(%s)가 %.0f원으로 개설되었습니다.\n",getBankName(),getOwnerName(),getAccountNumber(),getBalance());
    }

    // TODO 15: getter 메서드들 구현하기
    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }
    public String getBankName() { return bankName; }

    // TODO 16: 입금 메서드 구현하기
    public void deposit(double amount) {
        // amount가 0보다 크면 balance에 추가
        // "[금액]원이 입금되었습니다. 현재 잔액: [잔액]원" 출력
        if(amount>0){
            balance += amount;
        }
        System.out.printf("%.1f원이 입금되었습니다. 현재 잔액: %.1f원\n",amount, balance);
    }

    // TODO 17: 계좌 정보 출력 메서드 구현하기
    public void displayAccountInfo() {
        // "=== 계좌 정보 ===" 출력
        // "은행: [은행명]", "계좌번호: [계좌번호]", "예금주: [예금주]", "잔액: [잔액]원" 출력
        System.out.println("=== 계좌 정보 ===");
        System.out.printf("은행: %s\n", getBankName());
        System.out.printf("계좌번호: %s\n", getAccountNumber());
        System.out.printf("예금주: %s\n", getOwnerName());
        System.out.printf("잔액: %.1f원\n", getBalance());
        System.out.println();
    }
}

// TODO 18: 사용 예제 완성하기
public class BankAccountExample {
    public static void main(String[] args) {
        try {
            // TODO 19: 다양한 생성자로 계좌 생성하기
            // account1: "123-456-789", "김철수"
            // account2: "987-654-321", "이영희", 100000
            // account3: "555-777-999", "박민수", 500000, "우리은행"
            BankAccount account1 = new BankAccount("123-456-789", "김철수");
            BankAccount account2 = new BankAccount("987-654-321", "이영희", 100000);
            BankAccount account3 = new BankAccount("555-777-999", "박민수", 500000, "우리은행");

            // TODO 20: 계좌 정보 출력하기
            System.out.println("\n=== 계좌 정보 출력 ===");
            // 각 계좌의 displayAccountInfo() 호출하고 빈 줄 출력
            account1.displayAccountInfo();
            account2.displayAccountInfo();
            account3.displayAccountInfo();

            // TODO 21: 입금 테스트하기
            System.out.println("=== 입금 테스트 ===");
            // account1에 50000원 입금
            account1.deposit(50000);
        } catch (IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }
}