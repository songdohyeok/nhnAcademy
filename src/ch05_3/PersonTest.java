package ch05_3;

import java.util.Objects;

/**
 * Object 클래스 메서드를 올바르게 재정의한 예제
 */
class Person {
    private String name;
    private int age;
    private String email;
    private String phoneNumber;

    // TODO 20: 생성자 구현하기
    public Person(String name, int age, String email, String phoneNumber) {
        // 모든 필드 초기화
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // TODO 21: Getter 메서드들 구현하기
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }

    // TODO 22: toString() 메서드 재정의하기
    @Override
    public String toString() {
        // "Person{name='이름', age=나이, email='이메일', phone='전화번호'}" 형식으로 반환
        return "Person{name="+name+ ", age="+age+ ", email="+email+", phone="
                +phoneNumber+"}";
    }

    // TODO 23: equals() 메서드 재정의하기
    @Override
    public boolean equals(Object obj) {
        // 1. this == obj인 경우 true 반환
        // 2. obj가 null이거나 다른 클래스인 경우 false 반환
        // 3. Person으로 캐스팅 후 모든 필드 비교
        // 4. 모든 필드가 같으면 true, 아니면 false 반환
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Person other = (Person) obj;

        return this.name.equals(other.name) && this.age == other.age &&
                this.email.equals(other.email) && this.phoneNumber.equals(other.phoneNumber);
    }

    // TODO 24: hashCode() 메서드 재정의하기
    @Override
    public int hashCode() {
        // Objects.hash()를 사용하여 모든 필드를 포함한 해시코드 생성
       return Objects.hash(name, age, email, phoneNumber);
    }
}

// TODO 25: Person 클래스 테스트 완성하기
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("=== Person 클래스 테스트 ===\n");

        // TODO 26: 객체 생성하기
        // person1: "김철수", 25, "kim@email.com", "010-1234-5678"
        // person2: "이영희", 23, "lee@email.com", "010-9876-5432"
        // person3: person1과 같은 정보
        Person person1 = new Person("김철수", 25, "kim@email.com", "010-1234-5678");
        Person person2 = new Person("이영희", 23, "lee@email.com", "010-9876-5432");
        Person person3 = new Person("김철수", 25, "kim@email.com", "010-1234-5678");

        // TODO 27: toString() 테스트하기
        // person1, person2 출력
        System.out.println("=== toString() 테스트 ===");
        System.out.println("person1: "+person1.toString());
        System.out.println("person2: "+person2.toString());

        // TODO 28: equals() 테스트하기
        // person1.equals(person2) 결과 출력
        // person1.equals(person3) 결과 출력
        // person1 == person3 결과 출력
        System.out.println("\n=== equals() 테스트 ===");
        System.out.println("person1.equals(person2):"+person1.equals(person2));
        System.out.println("person1.equals(person3):"+person1.equals(person3));
        System.out.println("person1 == person3: "+(person1 == person3));

        // TODO 29: hashCode() 테스트하기
        // 각 person의 hashCode 출력
        // person1과 person3의 hashCode가 같은지 확인
        System.out.println("\n=== hashCode() 테스트 ===");
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
        System.out.println("person1과 person3의 hashCode가 같은가? " + (person1.hashCode() == person3.hashCode()));


    }
}