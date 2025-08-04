package ch05_4;

import java.util.Random;

/**
 * High-Low 카드 게임
 */
class HighLowGame {
    private Deck deck;
    private Card currentCard;
    private int correctGuesses;
    private boolean gameOver;

    /**
     * 새 게임을 시작
     */
    public HighLowGame() {
        // TODO 33: 게임 초기화하기
        // deck 생성하고 셔플
        // 첫 번째 카드 뽑기
        // correctGuesses = 0
        // gameOver = false
        deck = new Deck();
        deck.shuffle();
        currentCard = deck.dealCard();
        correctGuesses = 0;
        gameOver = false;
    }

    /**
     * 현재 카드 반환
     */
    public Card getCurrentCard() {
        // TODO 34: 현재 카드 반환하기
        return currentCard;
    }

    /**
     * 게임 종료 여부 확인
     */
    public boolean isGameOver() {
        // TODO 35: 게임 종료 여부 반환하기
        return gameOver;
    }

    /**
     * 현재 점수 반환
     */
    public int getScore() {
        // TODO 36: 현재 점수(맞춘 횟수) 반환하기
        return correctGuesses;
    }

    /**
     * "다음 카드가 더 높다"고 추측
     */
    public boolean guessHigher() {
        // TODO 37: "다음 카드가 더 높다"고 추측하기
        // 게임이 끝났으면 false 반환
        // 다음 카드 뽑기
        // 다음 카드 값이 현재 카드보다 큰지 확인
        // 맞으면 correctGuesses 증가
        // 틀리면 gameOver = true
        // currentCard 업데이트
        // 결과 반환
        if (gameOver) return false;
        Card nextCard = deck.dealCard();
        System.out.println("다음 카드: " + nextCard);
        if (nextCard.getValue() > currentCard.getValue()) {
            correctGuesses++;
            currentCard = nextCard;
            return true;
        } else {
            gameOver = true;
            currentCard = nextCard;
            return false;
        }
    }

    /**
     * "다음 카드가 더 낮다"고 추측
     */
    public boolean guessLower() {
        // TODO 38: "다음 카드가 더 낮다"고 추측하기
        // guessHigher()와 유사하지만 반대 조건
        if (gameOver) return false;
        Card nextCard = deck.dealCard();
        System.out.println("다음 카드: " + nextCard);
        if (nextCard.getValue() < currentCard.getValue()) {
            correctGuesses++;
            currentCard = nextCard;
            return true;
        } else {
            gameOver = true;
            currentCard = nextCard;
            return false;
        }
    }
}

// 게임 실행 예제
public class HighLowGameExample {
    public static void main(String[] args) {
        // TODO 39: High-Low 게임 실행하기
        // HighLowGame 객체 생성
        // 게임 설명 출력
        HighLowGame game = new HighLowGame();
        System.out.println("=== High-Low 카드 게임 ===");
        System.out.println("다음 카드가 현재 카드보다 높을지 낮을지 맞춰보세요!\n");

        Random rand = new Random();

        // TODO 40: 게임 루프 구현하기
        // while문: 게임이 끝나지 않고 점수가 10 미만일 때까지
        //   - 현재 카드 출력
        //   - 랜덤하게 Higher 또는 Lower 선택
        //   - 선택에 따라 guessHigher() 또는 guessLower() 호출
        //   - 결과 출력 (정답/오답)
        while (!game.isGameOver() && game.getScore() < 10) {
            Card current = game.getCurrentCard();
            System.out.println("현재 카드: " + current);

            boolean guessHigher = rand.nextBoolean();
            System.out.println("추측: 다음 카드가 더 " + (guessHigher ? "높다" : "낮다"));

            boolean result = guessHigher ? game.guessHigher() : game.guessLower();

            if (result) {
                System.out.println("정답! 현재 점수: " + game.getScore() + "\n");
            } else {
                System.out.println("틀렸습니다! 게임 종료\n");
                break;
            }
        }

        // TODO 41: 최종 점수 출력하기
        System.out.println("최종 점수: " + game.getScore());
    }
}
