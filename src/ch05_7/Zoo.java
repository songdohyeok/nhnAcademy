package ch05_7;

import java.util.ArrayList;

/**
 * 동물 행동을 나타내는 인터페이스 계층구조
 */
// 기본 동물 인터페이스
interface Animal {
    String getName();
    void eat(String food);
    void sleep();
}

// 이동 가능한 동물
interface Movable {
    void move(int distance);
    int getSpeed();
}

// 소리 낼 수 있는 동물
interface Audible {
    void makeSound();
    void setVolume(int level);
}

// 육상 동물 - 여러 인터페이스 확장
interface LandAnimal extends Animal, Movable, Audible {
    void run();
    void jump();
}

// 수중 동물
interface AquaticAnimal extends Animal, Movable {
    void swim();
    void dive(int depth);
}

// 날 수 있는 동물
interface FlyingAnimal extends Animal, Movable {
    void fly();
    void land();
    int getAltitude();
}

// 구체적인 구현 - 개
class Dog implements LandAnimal {
    private String name;
    private int speed = 30;  // km/h
    private int volume = 5;

    public Dog(String name) {
        // TODO 47: name 초기화하기
        this.name = name;
    }

    @Override
    public String getName() {
        // TODO 48: name 반환하기
        return name;
    }

    @Override
    public void eat(String food) {
        // TODO 49: "[name]가 [food]를 먹습니다." 출력하기
        System.out.println(name + "가 " + food + "를 먹습니다.");
    }

    @Override
    public void sleep() {
        // TODO 50: "[name]가 잠을 잡니다. Zzz..." 출력하기
        System.out.println(name + "가 잠을 잡니다. Zzz...");
    }

    @Override
    public void move(int distance) {
        // TODO 51: "[name]가 [distance]m 이동합니다." 출력하기
        System.out.println(name + "가 " + distance + "m 이동합니다.");
    }

    @Override
    public int getSpeed() {
        // TODO 52: speed 반환하기
        return speed;
    }

    @Override
    public void makeSound() {
        // TODO 53: "[name]가 짖습니다: 멍멍! (볼륨: [volume])" 출력하기
        System.out.println(name + "가 짖습니다: 멍멍! (볼륨: " + volume + ")");
    }

    @Override
    public void setVolume(int level) {
        // TODO 54: volume 설정하기 (0~10 범위로 제한)
        // Math.max(0, Math.min(10, level)) 사용
        volume = Math.max(0, Math.min(10, level));
    }

    @Override
    public void run() {
        // TODO 55: "[name]가 달립니다!" 출력하고
        // move(100) 호출하기
        System.out.println(name + "가 달립니다!");
        move(100);
    }

    @Override
    public void jump() {
        // TODO 56: "[name]가 점프합니다!" 출력하기
        System.out.println(name + "가 점프합니다!");
    }
}

// 구체적인 구현 - 오리 (여러 능력)
class Duck implements LandAnimal, AquaticAnimal, FlyingAnimal {
    private String name;
    private int landSpeed = 5;
    private int swimSpeed = 10;
    private int flySpeed = 40;
    private int currentSpeed;
    private int altitude = 0;
    private int volume = 3;

    public Duck(String name) {
        // TODO 57: name과 currentSpeed(landSpeed) 초기화하기
        this.name = name;
        this.currentSpeed = landSpeed;
    }

    @Override
    public String getName() {
        // TODO 58: name 반환하기
        return name;
    }

    @Override
    public void eat(String food) {
        // TODO 59: "[name]가 [food]를 먹습니다." 출력하기
        System.out.println(name + "가 " + food + "를 먹습니다.");
    }

    @Override
    public void sleep() {
        // TODO 60: "[name]가 물 위에서 잠을 잡니다." 출력하기
        System.out.println(name + "가 물 위에서 잠을 잡니다.");
    }

    @Override
    public void move(int distance) {
        // TODO 61: "[name]가 [distance]m 이동합니다. (속도: [currentSpeed]km/h)" 출력하기
        System.out.println(name + "가 " + distance + "m 이동합니다. (속도: " + currentSpeed + "km/h)");
    }

    @Override
    public int getSpeed() {
        // TODO 62: currentSpeed 반환하기
        return currentSpeed;
    }

    @Override
    public void makeSound() {
        // TODO 63: "[name]: 꽥꽥! (볼륨: [volume])" 출력하기
        System.out.println(name + ": 꽥꽥! (볼륨: " + volume + ")");
    }

    @Override
    public void setVolume(int level) {
        // TODO 64: volume 설정하기 (0~10 범위로 제한)
        volume = Math.max(0, Math.min(10, level));
    }

    @Override
    public void run() {
        // TODO 65: currentSpeed를 landSpeed로 설정하고
        // "[name]가 뒤뚱뒤뚱 걷습니다." 출력하기
        currentSpeed = landSpeed;
        System.out.println(name + "가 뒤뚱뒤뚱 걷습니다.");
    }

    @Override
    public void jump() {
        // TODO 66: "[name]가 폴짝 뜁니다." 출력하기
        System.out.println(name + "가 폴짝 뜁니다.");
    }

    @Override
    public void swim() {
        // TODO 67: currentSpeed를 swimSpeed로 설정하고
        // "[name]가 우아하게 헤엄칩니다." 출력하기
        currentSpeed = swimSpeed;
        System.out.println(name + "가 우아하게 헤엄칩니다.");
    }

    @Override
    public void dive(int depth) {
        // TODO 68: "[name]가 [depth]m 깊이로 잠수합니다." 출력하기
        System.out.println(name + "가 " + depth + "m 깊이로 잠수합니다.");
    }

    @Override
    public void fly() {
        // TODO 69: currentSpeed를 flySpeed로 설정하고
        // altitude를 100으로 설정하고
        // "[name]가 날아오릅니다!" 출력하기
        currentSpeed = flySpeed;
        altitude = 100;
        System.out.println(name + "가 날아오릅니다!");
    }

    @Override
    public void land() {
        // TODO 70: altitude를 0으로, currentSpeed를 landSpeed로 설정하고
        // "[name]가 착륙합니다." 출력하기
        altitude = 0;
        currentSpeed = landSpeed;
        System.out.println(name + "가 착륙합니다.");
    }

    @Override
    public int getAltitude() {
        // TODO 71: altitude 반환하기
        return altitude;
    }
}

// 동물원 관리 시스템
public class Zoo {
    public static void main(String[] args) {
        // TODO 72: Dog과 Duck 객체 생성하기
        // Dog: "바둑이"
        // Duck: "도널드"
        System.out.println("=== 육상 동물 행동 ===");

        Dog dog = new Dog("바둑이");
        Duck duck = new Duck("도널드");

        // TODO 73: LandAnimal 배열로 처리하기
        // 두 동물을 LandAnimal 배열에 담고
        // 각각 run(), makeSound(), jump() 호출하기
        LandAnimal[] animals = {dog,duck};
        for(LandAnimal animal : animals){
            animal.run();
            animal.makeSound();
            animal.jump();
            System.out.println();
        }


        // TODO 74: 오리의 특별한 능력 테스트하기
        // swim(), dive(2), fly() 호출
        // 현재 고도 출력
        // land() 호출
        System.out.println("=== 오리의 특별한 능력 ===");
        duck.swim();
        duck.dive(2);
        duck.fly();
        System.out.println("현재 고도: " + duck.getAltitude() + "m");
        duck.land();
    }
}
