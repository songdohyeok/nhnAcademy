package ch05_4;

/**
 * 카드 덱을 나타내는 클래스
 */
class Deck {
    private Card[] deck;     // 카드 배열
    private int cardsUsed;   // 사용된 카드 수

    /**
     * 52장의 표준 카드 덱을 생성
     */
    public Deck() {
        // TODO 10: 52장의 카드로 이루어진 덱 생성하기
        // deck = new Card[52] 생성
        // 이중 for문 사용:
        //   - 바깥쪽: suit (0~3)
        //   - 안쪽: value (1~13)
        // 각 조합으로 Card 객체 생성하여 deck 배열에 저장
        // cardsUsed = 0으로 초기화
        deck = new Card[52];
        int index = 0;
        for (int i = 0; i < 4; i++) {        // 0:스페이드 ~ 3:다이아몬드
            for (int j = 1; j <= 13; j++) { // 1:에이스 ~ 13:킹
                deck[index++] = new Card(j, i);
            }
        }
        cardsUsed = 0;
    }

    /**
     * 카드를 섞는다
     */
    public void shuffle() {
        // TODO 11: Fisher-Yates 셔플 알고리즘 구현하기
        // 배열의 끝에서부터 시작하여:
        //   - 현재 위치부터 시작까지의 랜덤 인덱스 선택
        //   - 현재 카드와 랜덤 위치의 카드 교환
        // cardsUsed = 0으로 리셋
        for (int i = deck.length - 1; i > 0; i--) {
            int rand = (int)(Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    /**
     * 남은 카드 수를 반환
     */
    public int cardsLeft() {
        // TODO 12: 남은 카드 수 반환하기
        // 전체 카드 수 - 사용된 카드 수
        return deck.length - cardsUsed;

    }

    /**
     * 카드 한 장을 나누어준다
     */
    public Card dealCard() {
        // TODO 13: 카드 한 장 나누어주기
        // 카드가 없으면 IllegalStateException 발생
        // cardsUsed 증가시키고 해당 위치의 카드 반환
        if (cardsUsed == deck.length) {
            throw new IllegalStateException("모든 카드를 다 사용했습니다.");
        }
        return deck[cardsUsed++];
    }

    /**
     * 덱에 조커가 있는지 확인
     */
    public boolean hasJoker() {
        // TODO 14: 조커 포함 여부 반환하기 (기본 덱은 조커 없음)
        return false;
    }
}

// 사용 예제
public class DeckExample {
    public static void main(String[] args) {
        // TODO 15: 덱 생성하고 셔플하기
        // Deck 객체 생성
        // shuffle() 메서드 호출
        Deck deck = new Deck();
        deck.shuffle();

        // TODO 16: 카드 5장 뽑기
        // for문으로 5번 반복:
        //   - dealCard()로 카드 뽑기
        //   - "카드 N: [카드정보]" 형식으로 출력
        for (int i = 1; i <= 5; i++) {
            Card card = deck.dealCard();
            System.out.println("카드 " + i + ": " + card);
        }

        // TODO 17: 남은 카드 수 출력하기
        // cardsLeft() 메서드 사용
        System.out.println("\n남은 카드: " + deck.cardsLeft() + "장");

        // TODO 18: 덱 다시 셔플하기
        // shuffle() 호출하고 결과 확인
        System.out.println("\n덱을 다시 셔플합니다...");
        deck.shuffle();
        System.out.println("다시 셔플 후 남은 카드: " + deck.cardsLeft() + "장");
    }
}