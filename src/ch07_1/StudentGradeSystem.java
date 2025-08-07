package ch07_1;

public class StudentGradeSystem {
    // TODO: 가변 인수를 사용한 성적 입력 메서드를 작성하세요
    // 메서드명: inputGrades
    // 매개변수: String studentName, double... scores
    // 학생 이름과 각 과목 점수를 출력하고 배열 반환
    static double[] inputGrades(String studentName, double... scores){
        System.out.println(studentName+"학생의 성적:");
        for(int i = 0; i< scores.length; i++){
            System.out.println("과목 "+i+": "+scores[i]+"점");
        }
        System.out.println();
        return scores;
    }


    // TODO: 성적 통계 계산 메서드를 작성하세요
    // 메서드명: calculateStats
    // 매개변수: String name, double[] grades
    // for-each 루프로 평균, 최고점, 최저점 계산 및 출력
    static void calculateStats(String name, double[] grades){
        double max = grades[0];
        double min = grades[0];
        double sum = 0;
        for(double grade : grades){
            if(max<grade){
                max = grade;
            }
            if(min>grade){
                min = grade;
            }
            sum += grade;
        }
        double avg = sum/ grades.length;

        System.out.println("=== "+name+" 성적 분석 ===");
        System.out.printf("평균: %.2f점\n", avg);
        System.out.printf("최고점: %.1f점\n", max);
        System.out.printf("최저점: %.1f점\n", min);
        System.out.println("등급: "+getLetterGrade(avg));
        System.out.println();
    }


    // TODO: 평균 점수로 등급 계산하는 private 메서드를 작성하세요
    // 메서드명: getLetterGrade, 매개변수: double average
    // 90이상:A, 80이상:B, 70이상:C, 60이상:D, 그외:F
    private static char getLetterGrade(double average){
        char grade;
       if(average>=90){
           grade = 'A';
       }else if(average>=80){
           grade = 'B';
       }else if(average>=70){
           grade = 'C';
       }else if(average>=60){
           grade = 'D';
       }else{
           grade = 'F';
       }
       return grade;
    }


    // TODO: 우수 학생 선발 메서드를 작성하세요
    // 메서드명: selectHonorStudents
    // 매개변수: String[] names, double[] averages
    // 평균 85점 이상인 학생들을 출력

    static void selectHonorStudents(String[] names, double[] averages){
        System.out.println("=== 우수 학생 명단 (평균 85점 이상) ===");
        for (int i = 0; i < averages.length; i++) {
            if (averages[i] >= 85) {
                System.out.println(names[i] + ": " + averages[i] + "점");
            }
        }

    }

    public static void main(String[] args) {
        // 학생 데이터
        String[] students = {"김철수", "이영희", "박민수"};

        // 각 학생의 성적 입력 (가변 인수 사용)
        double[] kimScores = inputGrades("김철수", 85.5, 92.0, 78.5, 88.0, 91.5);
        double[] leeScores = inputGrades("이영희", 95.0, 88.5, 92.0, 87.5, 89.0);
        double[] parkScores = inputGrades("박민수", 78.0, 82.5, 75.0, 80.0, 77.5);

        // 통계 계산
        calculateStats("김철수", kimScores);
        calculateStats("이영희", leeScores);
        calculateStats("박민수", parkScores);

        // 평균 점수 배열 생성
        double[] averages = new double[] {
                average(kimScores),
                average(leeScores),
                average(parkScores)
        };

        // 우수 학생 선발
        selectHonorStudents(students, averages);
    }

    // TODO: 평균 계산 헬퍼 메서드를 작성하세요
    // 메서드명: average, 매개변수: double[] scores
    // for-each 루프로 평균 계산하여 반환
    static double average(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}
