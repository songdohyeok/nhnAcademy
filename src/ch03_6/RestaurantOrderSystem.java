package ch03_6;

import textio.TextIO;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        System.out.println("🍽️ 레스토랑 주문 시스템에 오신 것을 환영합니다!");

        while (true) {
            showMainMenu();
            int choice = TextIO.getlnInt();

            if (choice == 0) {
                System.out.println("이용해 주셔서 감사합니다! 👋");
                break;
            }

            processMenuChoice(choice);
        }
    }

    public static void showMainMenu() {
        System.out.println("""
            
            === 메인 메뉴 ===
            1. 🍝 파스타 메뉴
            2. 🍕 피자 메뉴
            3. 🥗 샐러드 메뉴
            4. 🍰 디저트 메뉴
            5. ☕ 음료 메뉴
            6. 🛒 주문 확인
            7. 💳 결제하기
            0. 종료
            
            선택하세요: """);
    }

    public static void processMenuChoice(int choice) {
        // TODO: 메뉴 선택 처리
        // 힌트: switch문으로 각 메뉴 처리

        // 여기에 코드를 작성하세요
        switch(choice){
            case 1 ->  showSubMenu("파스타 메뉴", new String[]{"스파게티 까르보나라 - 15,000원",
                    "토마토 파스타 - 12,000원","크림 파스타 - 14,000원","페스토 파스타 - 16,000원"});
            case 2 ->  showSubMenu("피자 메뉴", new String[]{"치즈 피자 - 15,000원",
                    "콤비네이션 피자 - 12,000원","마르게리따 피자 - 14,000원","포테이토 피자 - 16,000원"});
            case 3 ->  showSubMenu("샐러드 메뉴", new String[]{"연어 샐러드 - 15,000원",
                    "감자 샐러드 - 12,000원","스테이크 샐러드 - 14,000원"});
            case 4 ->  showSubMenu("디저트 메뉴", new String[]{"소금빵 - 15,000원",
                    "마카롱 - 12,000원","까눌레 - 14,000원"});
            case 5 ->  showSubMenu("음료 메뉴", new String[]{"아메리카노 - 15,000원",
                    "아포가토 - 12,000원","카페 라떼 - 14,000원"});
            case 6 -> System.out.println("주문 확인 창입니다.");
            case 7 -> processPayment();

        }
    }

    public static void showSubMenu(String category, String[] items) {
        System.out.println("\n=== " + category + " 상세 메뉴 ===");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i]);
        }
        System.out.println("메인 메뉴로 돌아가려면 엔터를 누르세요.");
        TextIO.getln();
    }

    public static void processPayment() {
        System.out.print("결제 방법을 선택하세요 (card/cash/mobile): ");
        String paymentMethod = TextIO.getln().toLowerCase();

        // TODO: 결제 방법별 처리
        // 힌트: switch 표현식과 yield
        String message = switch(paymentMethod){
            case "card" -> "카드를 삽입해주세요... 카드 결제가 완료되었습니다.";
            case "cash" -> "현금 결제가 완료되었습니다.";
            case "mobile" -> "모바일 결제가 완료되었습니다.";
            default -> "❌ 유효하지 않습니다.";

        };// 여기에 switch 표현식을 작성하세요


        System.out.println(message);
        if (!message.startsWith("❌")) {
            System.out.println("주문이 접수되었습니다. 조리 시간은 15-20분입니다. 🍽️");
            System.exit(0);
        }
    }
}