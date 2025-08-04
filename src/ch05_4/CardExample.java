package ch05_4;

/**
 * 카드(트럼프 카드)를 나타내는 클래스
 */
class Card {

    // 무늬를 나타내는 상수
    public final static int SPADES = 0;   // 스페이드
    public final static int HEARTS = 1;   // 하트
    public final static int DIAMONDS = 2; // 다이아몬드
    public final static int CLUBS = 3;    // 클럽

    // 카드 값을 나타내는 상수
    public final static int ACE = 1;      // 에이스
    public final static int JACK = 11;    // 잭
    public final static int QUEEN = 12;   // 퀸
    public final static int KING = 13;    // 킹

    // 카드의 무늬 (0-3 중 하나)
    private final int suit;

    // 카드의 값 (1-13 중 하나)
    private final int value;

    /**
     * 지정된 값과 무늬로 카드를 생성
     */
    public Card(int theValue, int theSuit) {
        // TODO 1: value와 suit 초기화하기
        value = theValue;
        suit = theSuit;
    }

    /**
     * 카드의 값을 반환
     */
    public int getValue() {
        // TODO 2: value 반환하기
        return value;
    }

    /**
     * 카드의 무늬를 반환
     */
    public int getSuit() {
        // TODO 3: suit 반환하기
        return suit;
    }

    /**
     * 카드의 무늬를 문자열로 반환
     */
    public String getSuitAsString() {
        // TODO 4: suit 값에 따라 문자열 반환하기
        // switch문 사용
        // SPADES -> "스페이드"
        // HEARTS -> "하트"
        // DIAMONDS -> "다이아몬드"
        // CLUBS -> "클럽"
        // default -> "??"
        switch (suit){
            case SPADES -> {
                return "스페이드";
            }
            case HEARTS -> {
                return "하트";
            }
            case DIAMONDS -> {
                return "다이아몬드";
            }
            case CLUBS -> {
                return "클럽";
            }
            default -> {
                return "??";
            }
        }
    }

    /**
     * 카드의 값을 문자열로 반환
     */
    public String getValueAsString() {
        // TODO 5: value 값에 따라 문자열 반환하기
        // switch문 사용
        // 1 -> "에이스"
        // 2~10 -> 숫자 그대로
        // 11 -> "잭"
        // 12 -> "퀸"
        // 13 -> "킹"
        // default -> "??"
        switch (value){
            case 1 -> {
                return "에이스";
            }
            case 2 -> {
                return "2";
            }
            case 3 -> {
                return "3";
            }
            case 4 -> {
                return "4";
            }
            case 5 -> {
                return "5";
            }
            case 6 -> {
                return "6";
            }
            case 7 -> {
                return "7";
            }
            case 8 -> {
                return "8";
            }
            case 9 -> {
                return "9";
            }
            case 10 -> {
                return "10";
            }
            case 11 -> {
                return "잭";
            }
            case 12 -> {
                return "퀸";
            }
            case 13 -> {
                return "킹";
            }
            default -> {
                return "??";
            }
        }
    }

    /**
     * 카드를 문자열로 표현
     */
    public String toString() {
        // TODO 6: 카드를 "값 무늬" 형식의 문자열로 반환하기
        // 예: "에이스 스페이드", "킹 하트"
        return getValueAsString() +" "+ getSuitAsString();
    }
}

// 사용 예제
public class CardExample {
    public static void main(String[] args) {
        // TODO 7: 카드 객체 생성하기
        // card1: 에이스 스페이드 (1, Card.SPADES)
        // card2: 킹 하트 (13, Card.HEARTS)
        // card3: 7 다이아몬드 (7, Card.DIAMONDS)
        Card card1 = new Card(1, Card.SPADES);
        Card card2 = new Card(13, Card.HEARTS);
        Card card3 = new Card(7, Card.DIAMONDS);
        // TODO 8: 생성된 카드 출력하기
        // 각 카드를 "카드 N: [카드정보]" 형식으로 출력
        Card[] cards = {card1, card2, card3};
        for(int i = 0 ; i < 3; i ++){
            System.out.printf("카드 %d: %s\n",i,cards[i].toString());
        }
        System.out.println();
        // TODO 9: 카드 1의 세부 정보 출력하기
        // getValue()와 getSuitAsString() 메서드 사용
        System.out.println("카드 1의 값: "+card1.getValue());
        System.out.println("카드 1의 무늬: "+card1.getSuitAsString());
    }
}
