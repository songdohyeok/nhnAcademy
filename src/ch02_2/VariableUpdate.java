package ch02_2;

public class VariableUpdate {
    public static void main(String[] args) {
        // TODO: score 변수를 0으로 초기화하고 출력하세요
        // 힌트: "초기 점수: [score]" 형식

        // TODO: score를 10으로 변경하고 출력하세요
        // 힌트: "첫 번째 점수: [score]" 형식

        // TODO: score에 5를 더하고 출력하세요
        // 힌트: score = score + 5
        // 출력: "두 번째 점수: [score]"

        // TODO: score를 2배로 만들고 출력하세요
        // 힌트: score = score * 2
        // 출력: "최종 점수: [score]"

        // TODO: 계좌 잔액 시뮬레이션을 구현하세요
        // 힌트:
        // 1. balance = 1000.0 (초기 잔액)
        // 2. interestRate = 0.05 (이자율 5%)
        // 3. "\n계좌 잔액 변화:" 출력
        // 4. 초기 잔액 출력
        // 5. 이자 계산: interest = balance * interestRate
        // 6. 잔액에 이자 추가: balance = balance + interest
        // 7. 이자 후 잔액 출력
        // 8. withdrawal = 200.0 (출금액)
        // 9. 출금 처리: balance = balance - withdrawal
        // 10. 출금 후 잔액 출력

        // 여기에 코드를 작성하세요
        int score = 0;
        System.out.printf("초기 점수: %d%n",score);

        score = 10;
        System.out.printf("첫 번째 점수: %d%n",score);

        score += 5;
        System.out.printf("두 번째 점수: %d%n",score);

        score *= 2;
        System.out.printf("최종 점수: %d%n",score);

        double balance = 1000.0;
        double interestRate = 0.05;
        System.out.printf("%n계좌 잔액 변화:%n");
        System.out.printf("초기 잔액: %.1f%n",balance);
        double interest = balance * interestRate;
        balance += interest;
        System.out.printf("이자 후 잔액: %.1f%n",balance);
        double withdrawal = 200.0; // 출금 금액
        balance -= withdrawal;
        System.out.printf("출금 후 잔액: %.1f%n",balance);

    }
}