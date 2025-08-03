package ch04_6.model;

import java.time.LocalDate;

/**
 * @author 송도혁
 * @version 21-LTS
 */
public class Student {
    // TODO 56: private 필드들 선언하기
    private String studentId;
    private String name;
    private int age;
    LocalDate enrollDate;

    // TODO 57: 생성자에 Javadoc 주석과 구현 작성하기
    /**
     * @param studentId 학번
     * @param name 이름
     * @param age 나이
     * @param enrollDate 등록일
     */
    public Student(String studentId, String name, int age, LocalDate enrollDate) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.enrollDate = enrollDate;
    }

    // TODO 58: getter 메서드들 구현하기
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public LocalDate getEnrollDate() {
        return enrollDate;
    }

    // TODO 59: toString 메서드 구현하기
    @Override
    public String toString() {
        return String.format("[%s] %s (%d세) - 입학일: %s", studentId, name, age, enrollDate);
    }

}