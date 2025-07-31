package ch02_4;

import textio.TextIO;

public class ShoppingCalculator {
    public static void main(String[] args) {
        // TODO: 쇼핑 계산기 프로그램을 만드세요
        // 힌트:
        // 1. "=== 쇼핑 계산기 ===" 출력
        // 2. while문으로 상품명 입력 (quit 입력시 종료)
        // 3. 가격과 수량 입력받기
        // 4. 소계 계산하여 총액에 누적
        // 5. 영수증 출력 (총액 10만원 이상시 10% 할인)
        // 6. 파일 저장 여부 확인 후 저장

        // 여기에 코드를 작성하세요
        System.out.println("=== 쇼핑 계산기 ===\n");

        int itemCount = 0;
        int totalPrice = 0;
        StringBuilder receiptDetails = new StringBuilder();

        while (true) {
            System.out.print("상품명 (종료: 'quit'): ");
            String itemName = TextIO.getln().trim();
            if (itemName.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("가격: ");
            int price = TextIO.getlnInt();

            System.out.print("수량: ");
            int quantity = TextIO.getlnInt();

            int subtotal = price * quantity;
            totalPrice += subtotal;
            itemCount++;

            System.out.printf("%s %d개 = %,d원%n%n", itemName, quantity, subtotal);
            receiptDetails.append(String.format("%s %d개 = %,d원%n", itemName, quantity, subtotal));
        }

        System.out.println("==============================");
        System.out.println("영수증");
        System.out.println("==============================");
        System.out.printf("구매 품목: %d개%n", itemCount);
        System.out.printf("총액: %,d원%n", totalPrice);

        int discount = 0;
        if (totalPrice >= 100_000) {
            discount = totalPrice / 10;  // 10%
            System.out.printf("할인(10%%): -%,d원%n", discount);
        }

        int finalPrice = totalPrice - discount;
        System.out.printf("결제금액: %,d원%n", finalPrice);
        System.out.println("==============================\n");

        System.out.print("영수증을 파일로 저장하시겠습니까? (yes/no): ");
        String saveAnswer = TextIO.getln().trim().toLowerCase();

        if (saveAnswer.equals("yes") || saveAnswer.equals("y")) {
            TextIO.writeFile("receipt.txt");
            TextIO.putln("==============================");
            TextIO.putln("영수증");
            TextIO.putln("==============================");
            TextIO.putf("구매 품목: %d개%n", itemCount);
            TextIO.putf("총액: %,d원%n", totalPrice);
            if (discount > 0) {
                TextIO.putf("할인(10%%): -%,d원%n", discount);
            }
            TextIO.putf("결제금액: %,d원%n", finalPrice);
            TextIO.putln("==============================");
            TextIO.putln();
            TextIO.putln("구매 내역:");
            TextIO.putln(receiptDetails.toString());
            TextIO.writeStandardOutput();

            System.out.println("영수증이 receipt.txt에 저장되었습니다.");
        }
    }
}