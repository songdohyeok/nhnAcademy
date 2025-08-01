package ch03_6;

import textio.TextIO;

public class BrowserDetector {
    public static void main(String[] args) {
        System.out.print("브라우저명을 입력하세요: ");
        String browser = TextIO.getln().toLowerCase();

        // TODO: switch 표현식으로 브라우저 정보 설정
        // 힌트: yield 사용
        String engineInfo =""; // 여기에 switch 표현식을 작성하세요
        switch (browser){
            case "chrome" -> engineInfo = "Chromium 기반 브라우저입니다.\n" +
                                            "Blink 렌더링 엔진을 사용합니다.\n" +
                                            "V8 JavaScript 엔진을 사용합니다.";
            case "firefox" -> engineInfo = "Mozilla Foundation의 브라우저입니다.\n" +
                                              "Gecko 렌더링 엔진을 사용합니다.\n" +
                                            "SpiderMonkey JavaScript 엔진을 사용합니다.";
        }

                System.out.println("\n브라우저 정보:");
        System.out.println(engineInfo);

        // TODO: 보안 등급 평가
        // 힌트: switch 표현식
        String securityLevel = "";// 여기에 switch 표현식을 작성하세요
        switch (browser){
            case "chrome","firefox" -> securityLevel = "높음";
        }

                System.out.println("보안 수준: " + securityLevel);
    }
}