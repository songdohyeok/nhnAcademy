package ch04_6;

// TODO 11: java.util 패키지만 import하기 (java.awt는 주석)
import java.util.ArrayList;

public class NameConflictExample {
    public static void main(String[] args) {
        // TODO 12: java.util.List 사용하기
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");

        // TODO 13: java.awt.List를 전체 이름으로 사용하기
        java.awt.List awList = new java.awt.List();
        awList.add("Java");
        awList.add("Python");

        // TODO 14: 결과 출력하기
        System.out.println(list);
        System.out.println("awt.List 항목 수: "+awList.getItemCount());
    }
}