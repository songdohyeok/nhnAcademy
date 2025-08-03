package ch04_6;

// TODO 6: 와일드카드를 사용하여 패키지 전체 import하기

import java.io.File;
import java.util.*;

public class WildcardImportExample {
    public static void main(String[] args) {
        // TODO 7: List, Set, Map 컬렉션 생성하기
        ArrayList<Integer> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String,Integer> map = new HashMap<>();

        // TODO 8: 데이터 추가하기
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        set.add("banana");
        set.add("apple");
        map.put("김철수",90);
        map.put("이영희",85);

        // TODO 9: 결과 출력하기
        System.out.println("숫자 리스트 : " + list);
        System.out.println("고유 단어 : " +set);
        System.out.println("점수  : " + map);

        // TODO 10: File 객체로 현재 디렉토리 정보 출력하기
        File currentDir = new File("");
        System.out.println("경로 : " + currentDir.getAbsolutePath());
    }
}