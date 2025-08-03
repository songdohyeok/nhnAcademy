package ch04_2;

import ch02_4.StudentRoster;

public class GradeManager {
    // TODO 43: 멤버 변수들 선언하기
    // MAX_STUDENTS (상수, 30), names (문자열 배열),
    // scores (정수 배열), studentCount (정수)

    static final int MAX_STUDENTS = 30;
    static String[] names = new String[MAX_STUDENTS];
    static int[] scores = new int[MAX_STUDENTS];
    static int studentCount;

    public static void main(String[] args) {
        System.out.println("=== 성적 관리 프로그램 ===");

        // TODO 44: 샘플 학생들 추가하고 테스트하기
         addStudent("김철수", 85);
         addStudent("이영희", 92);
         addStudent("박민수", 78);
         addStudent("최유진", 88);
         addStudent("정하늘", 95);

         showAllStudents();
         showStatistics();
         findStudent("이영희");
         findStudent("홍길동"); // 없는 학생
    }

    // TODO 45: 학생 추가 메서드 구현하기
    public static void addStudent(String name, int score) {
        // studentCount가 MAX_STUDENTS 이상이면 "더 이상 학생을 추가할 수 없습니다." 출력하고 return
        // score가 0~100 범위를 벗어나면 "점수는 0~100 사이여야 합니다." 출력하고 return
        // names와 scores 배열에 정보 저장
        // studentCount 증가
        // "학생이 추가되었습니다." 출력

        if(studentCount>=MAX_STUDENTS){
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
            return;
        }
        if(score>100 || score<0){
            System.out.println("점수는 0~100 사이여야 합니다.");
            return;
        }

        names[studentCount] = name;
        scores[studentCount] = score;

        studentCount++;
        System.out.println("학생이 추가되었습니다.");

    }

    // TODO 46: 전체 학생 조회 메서드 구현하기
    public static void showAllStudents() {
        // studentCount가 0이면 "등록된 학생이 없습니다." 출력하고 return
        // 표 형태로 학생 정보 출력 (번호, 이름, 점수, 학점)
        if(studentCount == 0){
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        System.out.println("\n=== 전체 학생 목록 ===");
        System.out.println("번호  이름  점수  학점");
        System.out.println("------------------------------");
        for(int i = 0; i<studentCount; i++){
            System.out.printf("%d   %s  %d   %s\n",i+1,names[i],scores[i],getGrade(scores[i]));
        }

    }

    // TODO 47: 통계 보기 메서드 구현하기
    public static void showStatistics() {
        // studentCount가 0이면 "등록된 학생이 없습니다." 출력하고 return
        // 학생 수, 평균 점수, 최고 점수, 최저 점수 계산하여 출력
        if(studentCount == 0){
            System.out.println("등록된 학생이 없습니다.");
            return;
        }

        int sum = 0;
        for(int i = 0; i<studentCount; i++){
            sum += scores[i];
        }

        int max = 0;
        for(int i = 0; i<studentCount; i++){
            if(scores[i]>=max){
                max = scores[i];
            }
        }

        int min = 100;
        for(int i = 0; i<studentCount; i++){
            if(scores[i]<=min){
                min = scores[i];
            }
        }

        System.out.println("\n=== 성적 통계 ===");
        System.out.printf("학생 수: %d\n",studentCount);
        System.out.printf("평균 점수: %d\n",sum/studentCount);
        System.out.printf("최고 점수: %d\n",max);
        System.out.printf("최저 점수: %d\n",min);


    }

    // TODO 48: 학생 검색 메서드 구현하기
    public static void findStudent(String searchName) {
        // 이름으로 학생 검색
        // 찾으면 학생 정보 출력, 못 찾으면 "학생을 찾을 수 없습니다." 출력
        boolean found = false;

        for(int i = 0; i< studentCount; i++){
            if(names[i].equals(searchName)){
                System.out.println("\n=== 검색 결과 ===");
                System.out.printf("이름: %s\n",names[i]);
                System.out.printf("점수: %d\n",scores[i]);
                System.out.printf("학점: %s\n",getGrade(scores[i]));
                found = true;
            }
        }
        if(!found){
            System.out.println("학생을 찾을 수 없습니다.");
        }
    }

    // TODO 49: 학점 계산 메서드 구현하기
    public static String getGrade(int score) {
        // 90 이상: A, 80 이상: B, 70 이상: C, 60 이상: D, 60 미만: F
        String grade = "";
        if(score>=90){
            grade = "A";
        }else if(score>=80){
            grade = "B";
        }else if(score>=70){
            grade = "C";
        }else if(score>=60){
            grade = "D";
        }else{
            grade = "F";
        }
        return grade;
   }
}