package ch05_4;

import java.util.ArrayList;

/**
 * 손에 든 카드들을 관리하는 클래스
 */
class Hand {
    private ArrayList<Card> hand;  // 손에 든 카드들

    /**
     * 빈 손패를 생성
     */
    public Hand() {
        // TODO 19: ArrayList<Card> 생성하여 hand 초기화하기
        hand = new ArrayList<>();
    }

    /**
     * 손패를 비운다
     */
    public void clear() {
        // TODO 20: 손에 있는 모든 카드 제거하기
        // hand.clear() 호출
        hand.clear();
    }

    /**
     * 카드를 손패에 추가
     */
    public void addCard(Card c) {
        // TODO 21: 카드를 손에 추가하기
        // null 체크: null이면 NullPointerException 발생
        // hand에 카드 추가
        if (c == null) {
            throw new NullPointerException();
        }
        hand.add(c);
    }

    /**
     * 특정 카드를 손패에서 제거
     */
    public void removeCard(Card c) {
        // TODO 22: 특정 카드를 손에서 제거하기
        // hand.remove(c) 호출
        hand.remove(c);
    }

    /**
     * 특정 위치의 카드를 제거
     */
    public void removeCard(int position) {
        // TODO 23: 특정 위치의 카드를 손에서 제거하기
        // 위치 유효성 검사: 범위를 벗어나면 IllegalArgumentException
        // hand.remove(position) 호출
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException();
        }
        hand.remove(position);
    }

    /**
     * 손패의 카드 수 반환
     */
    public int getCardCount() {
        // TODO 24: 손에 있는 카드 수 반환하기
        // hand.size() 반환
        return hand.size();
    }

    /**
     * 특정 위치의 카드 반환
     */
    public Card getCard(int position) {
        // TODO 25: 특정 위치의 카드 반환하기
        // 위치 유효성 검사
        // hand.get(position) 반환
        if (position < 0 || position >= hand.size()) {
            throw new IllegalArgumentException();
        }
        return hand.get(position);
    }

    /**
     * 손패를 무늬별로 정렬
     */
    public void sortBySuit() {
        // TODO 26: 무늬별로 카드 정렬하기
        // 선택 정렬 알고리즘 사용:
        // - 새로운 ArrayList 생성
        // - 원래 hand가 빌 때까지:
        //   - 가장 작은 무늬/값의 카드 찾기
        //   - 해당 카드를 제거하고 새 리스트에 추가
        // - hand를 새 리스트로 교체

        ArrayList<Card> sorted = new ArrayList<>();
        while (!hand.isEmpty()) {
            int minIndex = 0;
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                Card c2 = hand.get(minIndex);
                if (c1.getSuit() < c2.getSuit() || (c1.getSuit() == c2.getSuit() && c1.getValue() < c2.getValue())) {
                    minIndex = i;
                }
            }
            sorted.add(hand.remove(minIndex));
        }
        hand = sorted;
    }

    /**
     * 손패를 값별로 정렬
     */
    public void sortByValue() {
        // TODO 27: 값별로 카드 정렬하기
        // 선택 정렬 알고리즘 사용:
        // - 값이 작은 순서로 정렬
        // - 같은 값이면 무늬 순서로 정렬
        ArrayList<Card> sorted = new ArrayList<>();
        while (!hand.isEmpty()) {
            int minIndex = 0;
            for (int i = 1; i < hand.size(); i++) {
                Card c1 = hand.get(i);
                Card c2 = hand.get(minIndex);
                if (c1.getValue() < c2.getValue() || (c1.getValue() == c2.getValue() && c1.getSuit() < c2.getSuit())) {
                    minIndex = i;
                }
            }
            sorted.add(hand.remove(minIndex));
        }
        hand = sorted;
    }
}

// 사용 예제
public class HandExample {
    public static void main(String[] args) {
        // TODO 28: 덱과 손 객체 생성하기
        // Deck 생성하고 셔플
        // Hand 객체 생성

        Deck deck = new Deck();
        deck.shuffle();
        Hand hand = new Hand();
        System.out.println("=== 카드 5장 받기 ===");

        // TODO 29: 카드 5장 받기
        // for문으로 5번 반복:
        //   - dealCard()로 카드 받기
        //   - addCard()로 손에 추가
        //   - 받은 카드 출력
        for (int i = 0; i < 5; i++) {
            Card card = deck.dealCard();
            hand.addCard(card);
            System.out.println("받은 카드: " + card);
        }

        // TODO 30: 손에 있는 카드 수 출력하기
        System.out.println("\n손에 있는 카드 수: " + hand.getCardCount());

        // TODO 31: 무늬별로 정렬하고 출력하기
        // sortBySuit() 호출
        // 모든 카드 출력
        System.out.println("\n=== 무늬별로 정렬 ===");
        hand.sortBySuit();
        for (int i = 0; i < hand.getCardCount(); i++) {
            System.out.println("카드 " + (i + 1) + ": " + hand.getCard(i));
        }

        // TODO 32: 값별로 정렬하고 출력하기
        // sortByValue() 호출
        // 모든 카드 출력
        System.out.println("\n=== 값별로 정렬 ===");
        hand.sortByValue();
        for (int i = 0; i < hand.getCardCount(); i++) {
            System.out.println("카드 " + (i + 1) + ": " + hand.getCard(i));
        }
    }
}