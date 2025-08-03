package ch04_6;

import ch04_6.model.Student;
import ch04_6.service.StudentService;
import java.time.LocalDate;
import java.util.List;

// TODO 55: Student 클래스에 상세한 Javadoc 주석 작성하기

// TODO 69: Main 클래스 만들기

// TODO 70: 필요한 import문 추가하기

// TODO 71: Main 클래스에 Javadoc 주석 작성하기

public class Main {
    public static void main(String[] args) {
        // TODO 72: StudentService 객체 생성하기
        StudentService studentService = new StudentService();

        // TODO 73: 학생들 추가하기
        studentService.addStudent(new Student("S001", "김철수", 20, LocalDate.of(2023, 3, 2)));
        studentService.addStudent(new Student("S002", "이영희", 21, LocalDate.of(2023, 3, 3)));
        studentService.addStudent(new Student("S003", "박민수", 19, LocalDate.of(2023, 3, 4)));


        // TODO 74: 모든 학생 출력하기
        System.out.println("=== 전체 학생 목록 ===");
        List<Student> allStudents = studentService.getAllStudents();
        for (Student student : allStudents) {
            System.out.println(student);
        }

        // TODO 75: 특정 학생 검색하기
        System.out.println("\n=== 학생 검색 ===");
        Student found = studentService.findStudent("S002");
        if (found != null) {
            System.out.println("찾은 학생: " + found);
        }

        // TODO 76: 이름으로 검색하기
        System.out.println("\n=== 이름으로 검색 ===");
        List<Student> foundByName = studentService.searchByName("김철수");
        for (Student s : foundByName) {
            System.out.println(s);
        }
    }
}


