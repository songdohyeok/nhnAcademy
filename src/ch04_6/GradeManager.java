package ch04_6;

// TODO 35: import문 추가하기

// TODO 36: 클래스에 상세한 Javadoc 주석 작성하기

import java.util.ArrayList;

/**
 *
 * <p> 주요 기능 :
 * <ul>
 *   <li></li> 점수 입력
 *   <li></li> 평균 계산
 *   <li></li> 평균에 따른 학점 부여
 * </ul>
 *
 * <p>사용 예제:
 * <pre>
 * </pre>
 *
 * @author 송도혁
 * @version LTS-21
 * @see java.util.ArrayList
 */
public class GradeManager {
    private ArrayList<Integer> scores;

    // TODO 37: 생성자에 Javadoc 주석 작성하기
    /**
     *
     */
    public GradeManager() {
        scores = new ArrayList<>();
    }

    // TODO 38: addScore 메서드에 Javadoc 주석 작성하기
    /**
     * @param score 점수 추가
     * @throws IllegalArgumentException 잘못된 범위 예외
     */
    public void addScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                    "점수는 0과 100 사이여야 합니다: " + score);
        }
        scores.add(score);
    }

    // TODO 39: getAverage 메서드에 Javadoc 주석 작성하기
    /**
     * @return 점수를 다 더해서 점수의 개수만큼 나눔
     */
    public double getAverage() {
        if (scores.isEmpty()) {
            return 0.0;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.size();
    }

    // TODO 40: getLetterGrade 메서드에 상세한 Javadoc 주석 작성하기
    /**
     * <p>학점 기준:
     * <ul>
     *   <li></li> 90 이상 A
     *   <li></li> 80 이상 B
     *   <li></li> 70 이상 C
     *   <li></li> 60 이상 D
     *   <li></li> 나머지 F
     * </ul>
     *
     * @return
     * @see #getAverage() 
     */
    public char getLetterGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        if (avg >= 80) return 'B';
        if (avg >= 70) return 'C';
        if (avg >= 60) return 'D';
        return 'F';
    }
}