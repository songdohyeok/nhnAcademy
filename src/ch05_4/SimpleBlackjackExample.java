package ch05_4;

/**
 * 블랙잭 스타일 손패 (에이스를 유연하게 처리)
 */
class BlackjackHand extends Hand {

    /**
     * 블랙잭에서의 손패 값 계산
     */
    public int getBlackjackValue() {
        int val = 0;
        boolean ace = false;

        for (int i = 0; i < getCardCount(); i++) {
            Card card = getCard(i);
            int cardVal = card.getValue();

            if (cardVal > 10) {
                cardVal = 10;   // J, Q, K는 10으로 계산
            }
            if (cardVal == 1) {
                ace = true;     // 에이스 발견
            }
            val = val + cardVal;
        }

        // 에이스가 있고 11로 계산해도 21을 넘지 않으면
        if (ace && val + 10 <= 21) {
            val = val + 10;
        }

        return val;
    }
}

// 블랙잭 게임 예제
public class SimpleBlackjackExample {
    public static void main(String[] args) {
        System.out.println("=== 간단한 블랙잭 게임 ===");

        // TODO 42: 블랙잭 게임 5라운드 진행하기
        // 승리 카운터 초기화 (playerWins, dealerWins, ties)
        int playerWins = 0;
        int dealerWins = 0;
        int ties = 0;

        // TODO 43: 각 라운드 구현하기
        // for문으로 5라운드 반복:
        //   - 새 덱 생성하고 셔플
        //   - 플레이어와 딜러 손 생성
        //   - 초기 카드 2장씩 배분
        for (int round = 1; round <= 5; round++) {
            System.out.println("=== 라운드 " + round + " ===");

            Deck deck = new Deck();
            deck.shuffle();

            BlackjackHand player = new BlackjackHand();
            BlackjackHand dealer = new BlackjackHand();

            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());

            dealer.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());


            // TODO 44: 플레이어 턴 구현하기
        //   - 현재 카드와 합계 출력
        //   - 17 이하면 카드 더 받기
        //   - 21 초과하면 버스트
            System.out.println("플레이어 카드:");
            for (int i = 0; i < player.getCardCount(); i++) {
                System.out.println("  " + player.getCard(i));
            }
            System.out.println("플레이어 합계: " + player.getBlackjackValue());

            while (player.getBlackjackValue() <= 16) {
                Card newCard = deck.dealCard();
                player.addCard(newCard);
                System.out.println("플레이어가 카드를 받습니다: " + newCard);
                System.out.println("플레이어 합계: " + player.getBlackjackValue());
            }

            int playerValue = player.getBlackjackValue();

        // TODO 45: 딜러 턴 구현하기
        //   - 숨겨진 카드 공개
        //   - 16 이하면 카드 더 받기
            System.out.println("\n딜러 카드:");
            System.out.println("  " + dealer.getCard(0));
            System.out.println("  [숨김]");

            System.out.println("\n딜러의 숨겨진 카드: " + dealer.getCard(1));
            System.out.println("딜러 합계: " + dealer.getBlackjackValue());

            while (dealer.getBlackjackValue() <= 16) {
                Card newCard = deck.dealCard();
                dealer.addCard(newCard);
                System.out.println("딜러가 카드를 받습니다: " + newCard);
                System.out.println("딜러 합계: " + dealer.getBlackjackValue());
            }

            int dealerValue = dealer.getBlackjackValue();

        // TODO 46: 승부 판정하기
        //   - 플레이어 버스트 -> 딜러 승
        //   - 딜러 버스트 -> 플레이어 승
        //   - 값 비교로 승부 결정
            System.out.println("\n=== 결과 ===");

            if (playerValue > 21) {
                System.out.println("플레이어 버스트! 딜러 승리");
                dealerWins++;
            } else if (dealerValue > 21) {
                System.out.println("딜러 버스트! 플레이어 승리");
                playerWins++;
            } else if (playerValue > dealerValue) {
                System.out.println("플레이어 승리!");
                playerWins++;
            } else if (dealerValue > playerValue) {
                System.out.println("딜러 승리!");
                dealerWins++;
            } else {
                System.out.println("무승부!");
                ties++;
            }

            System.out.println();
        }

        // TODO 47: 최종 통계 출력하기
        System.out.println("=== 최종 결과 ===");
        System.out.println("플레이어 승리: " + playerWins);
        System.out.println("딜러 승리: " + dealerWins);
        System.out.println("무승부: " + ties);
    }
}
