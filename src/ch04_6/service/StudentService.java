package ch04_6.service;

// TODO 60: StudentService 클래스 만들기 (service 패키지)

// TODO 61: 필요한 import문 추가하기

// TODO 62: StudentService 클래스에 Javadoc 주석 작성하기

import ch04_6.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * <ul>
 *   <li></li> 학생 저장하기
 *   <li></li> 학생 추가하기
 *   <li></li> 학생 조회하기(전체,특정이름 조회, 학번으로 특정 학생조회)
 * </ul>
 */
public class StudentService {
    // TODO 63: 학생 저장용 Map 선언하기
    private Map<String, Student> studentMap;



    // TODO 64: 생성자 구현하기
    public StudentService() {
        studentMap = new HashMap<>();
    }

    // TODO 65: addStudent 메서드 구현하기
    /**
     * @param student 학생 클래스
     * @throws IllegalArgumentException 이미 존재하는 학생이라면 예외처리
     */
    public void addStudent(Student student) {
        if(studentMap.containsKey(student.getName())){
            throw new IllegalArgumentException("이미 존재하는 학생입니다.");
        }
        studentMap.put(student.getStudentId(), student);

    }

    // TODO 66: findStudent 메서드 구현하기
    /**
     * @param studentId 학번으로 조회하기
     * @return 해당 학번에 해당하는 객체
     */
    public Student findStudent(String studentId) {
        return studentMap.get(studentId);
    }

    // TODO 67: getAllStudents 메서드 구현하기
    /**
     * @return 맵에 저장된 모든 학생정보 반환
     */
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }

    // TODO 68: searchByName 메서드 구현하기
    /**
     * @param name 찾을 학생 이름
     * @return 학생이름과 저장된 학생이름과 같으면 반환
     */
    public List<Student> searchByName(String name) {
        List<Student> studentList = new ArrayList<>();
        for (Student student : studentMap.values()) {
            if(student.getName().equals(name)){
                studentList.add(student);
            }
        }
        return studentList;
    }
}