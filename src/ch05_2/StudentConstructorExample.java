package ch05_2;

/**
 * 다양한 생성자를 가진 Student 클래스
 */
class Student {
    // TODO 1: private 인스턴스 변수 선언하기
    // name (String), age (int), studentId (String), gpa (double)
    private String name;
    private int age;
    private String studentId;
    private double gpa;

    // TODO 2: 기본 생성자 구현하기
    public Student() {
        // name = "미정", age = 20, studentId = "S000000", gpa = 0.0으로 초기화
        // "기본 생성자로 학생 객체가 생성되었습니다." 출력
        name = "미정";
        age = 20;
        studentId = "S000000";
        gpa = 0.0;
        System.out.println("기본 생성자로 학생 객체가 생성되었습니다.");
    }

    // TODO 3: 이름만 받는 생성자 구현하기
    public Student(String name) {
        // this.name을 매개변수로 설정, age = 20, studentId = "S000000", gpa = 0.0
        // "[이름] 학생 객체가 생성되었습니다." 출력
        this.name = name;
        age = 20;
        studentId = "S000000";
        gpa = 0.0;
        System.out.printf("%s 학생 객체가 생성되었습니다.\n", getName());
    }

    // TODO 4: 이름과 나이를 받는 생성자 구현하기
    public Student(String name, int age) {
        // name과 age를 매개변수로 설정, studentId = "S000000", gpa = 0.0
        // "[이름] ([나이]세) 학생 객체가 생성되었습니다." 출력
        this.name = name;
        this.age = age;
        studentId = "S000000";
        gpa = 0.0;
        System.out.printf("%s (%d세) 학생 객체가 생성되었습니다.\n", getName(), getAge());
    }

    // TODO 5: 모든 정보를 받는 생성자 구현하기
    public Student(String name, int age, String studentId, double gpa) {
        // 모든 매개변수로 인스턴스 변수 초기화
        // "완전한 정보로 [이름] 학생 객체가 생성되었습니다." 출력
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
        System.out.printf("완전한 정보로 %s 학생 객체가 생성되었습니다.\n", getName());
    }

    // TODO 6: getter 메서드들 구현하기
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }

    // TODO 7: 학생 정보 출력 메서드 구현하기
    public void displayInfo() {
        // "이름: [이름], 나이: [나이], 학번: [학번], GPA: [GPA]" 형식으로 출력
        System.out.printf("이름: %s, 나이: %d, 학번: %s, GPA: %f\n", getName(), getAge(), getStudentId(), getGpa());
    }
}


// TODO 8: 사용 예제 완성하기
public class StudentConstructorExample {
    public static void main(String[] args) {
        System.out.println("=== 다양한 생성자 사용 ===");

        // TODO 9: 각각 다른 생성자를 사용하여 Student 객체 생성하기
        // 기본 생성자로 student1 생성
        Student student1 = new Student();
        // 이름만 지정하여 student2 생성 ("김철수")
        Student student2 = new Student("김철수");
        // 이름과 나이를 지정하여 student3 생성 ("이영희", 22)
        Student student3 = new Student("이영희", 22);
        // 모든 정보를 지정하여 student4 생성 ("박민수", 21, "S202301", 3.8)
        Student student4 = new Student("박민수", 21, "202301", 3.8);
        // TODO 10: 학생 정보 출력하기
        System.out.println("\n=== 학생 정보 출력 ===");
        // 모든 학생의 displayInfo() 메서드 호출
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}