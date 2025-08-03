package ch04_2;

public class DiceGame {
    // TODO 50: 게임 통계 변수들 선언하기
    // gamesPlayed, playerWins, computerWins, draws

    static int gamesPlayed;
    static int playerWins;
    static int computerWins;
    static int draws;

    public static void main(String[] args) {
        System.out.println("=== 주사위 게임 ===");
        System.out.println("주사위를 3번 굴려 합이 큰 쪽이 승리합니다!");

        // TODO 51: 게임을 여러 번 실행하기
         playOneGame();
         playOneGame();
         playOneGame();
         showFinalStatistics();
    }

    // TODO 52: 한 게임 플레이 메서드 구현하기
    public static void playOneGame() {
        // gamesPlayed 증가
        // 게임 번호 출력

        // 플레이어와 컴퓨터의 총점 계산
        // 각각 주사위를 3번 굴려서 합계 계산

        // 승부 판정하고 결과 출력
        // 해당 통계 변수 업데이트

        gamesPlayed++;
        System.out.printf("\n=== 게임 #%d ===\n", gamesPlayed);
        System.out.println("플레이어 차례:");
        int playerTurn1 = rollDice();
        int playerTurn2 = rollDice();
        int playerTurn3 = rollDice();
        int playerScore = playerTurn1 + playerTurn2 + playerTurn3;

        System.out.println("주사위 1: "+playerTurn1);
        System.out.println("주사위 2: "+playerTurn2);
        System.out.println("주사위 3: "+playerTurn3);

        System.out.printf("플레이어 총점: %d\n", playerScore);

        System.out.println("\n컴퓨터 차례:");
        int computerTurn1 = rollDice();
        int computerTurn2 = rollDice();
        int computerTurn3 = rollDice();
        int computerScore = computerTurn1 + computerTurn2 + computerTurn3;

        System.out.println("주사위 1: "+computerTurn1);
        System.out.println("주사위 2: "+computerTurn2);
        System.out.println("주사위 3: "+computerTurn3);

        System.out.printf("플레이어 총점: %d\n", computerScore);

        System.out.println("\n=== 결과 ===");
        if(playerScore>computerScore){
            System.out.println("플레이어 승리!");
            playerWins++;
        }else if(computerScore>playerScore){
            System.out.println("컴퓨터 승리!");
            computerWins++;
        }else{
            System.out.println("무승부!");
            draws++;
        }
    }

    // TODO 53: 주사위 굴리기 메서드 구현하기
    public static int rollDice() {
        // 1~6 사이의 랜덤 숫자 반환 (Math.random() 사용)
        return (int)(Math.random() * 6 + 1);
    }

    // TODO 54: 최종 통계 메서드 구현하기
    public static void showFinalStatistics() {
        // 총 게임 수, 플레이어 승리 수, 컴퓨터 승리 수, 무승부 수 출력
        // 게임 수가 0보다 크면 승률도 계산하여 출력
        System.out.println("\n=== 최종 통계 ===");
        System.out.println("총 게임 수: "+gamesPlayed);
        System.out.println("플레이어 승리: "+playerWins);
        System.out.println("컴퓨터 승리: "+computerWins);
        System.out.println("무승부: "+draws);
        double winrate = ((double) playerWins / gamesPlayed) * 100;
        if(gamesPlayed>0) {
            System.out.printf("승률: %.1f",winrate);
            System.out.print("%");
        }
    }
}