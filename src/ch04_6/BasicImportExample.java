package ch04_6;

// TODO 1: 필요한 클래스들을 개별적으로 import하기

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BasicImportExample {
    public static void main(String[] args) {
        // TODO 2: Scanner 객체 생성하고 사용자 이름 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        // TODO 3: Random 객체로 1~100 사이의 행운의 숫자 생성하기
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;

        // TODO 4: ArrayList 생성하고 취미 3개 추가하기
        ArrayList<String> hobby = new ArrayList<>();
        hobby.add("독서");
        hobby.add("운동");
        hobby.add("요리");

        // TODO 5: 결과 출력하기
        System.out.println(name + "의 행운의 숫자는 " + n+"입니다.");
        System.out.println("취미 : " +hobby);
    }
}