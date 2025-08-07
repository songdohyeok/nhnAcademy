package ch07_2;

public class InventoryManager {
    private static class Item {
        String name;
        int quantity;
        double price;

        Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }
    }

    private Item[] items;
    private int itemCount;

    public InventoryManager() {
        items = new Item[4];  // 작은 크기로 시작
        itemCount = 0;
    }

    // TODO: 항목 추가 메서드를 작성하세요 (자동 크기 조정)
    // 메서드명: addItem, 매개변수: String name, int quantity, double price
    // 이미 존재하는 항목이면 수량만 증가시키고 "기존 항목 수량 증가: 이름" 출력
    // 새 항목이면 배열이 가득 찬 경우 expandArray() 호출 후 추가
    // "새 항목 추가: 이름" 출력
    void addItem(String name, int quantity, double price){
        for(int i = 0 ; i< itemCount; i++) {
            if (items[i].name.equals(name)) {
                items[i].quantity += 10;
                System.out.println("기존 항목 수량 증가: " + name);
                return;
            }
        }
        if(itemCount == items.length){
            expandArray();
        }
        items[itemCount++] = new Item(name, quantity, price);
        System.out.println("새 항목 추가: "+name);
    }


    // TODO: 배열 크기 확장 메서드를 작성하세요
    // 메서드명: expandArray
    // "배열 크기 확장: 현재크기 -> 새크기" 출력
    // 현재 크기의 2배로 새 배열 생성하고 기존 항목들 복사
    void expandArray(){
        System.out.println("배열 크기 확장: "+items.length+" -> "+ items.length*2);
        Item[] expandItems = new Item[items.length*2];

        System.arraycopy(items, 0, expandItems, 0, items.length);
        items = expandItems;

    }


    // TODO: 항목 제거 메서드를 작성하세요
    // 메서드명: removeItem, 매개변수: String name
    // 찾은 항목을 마지막 항목으로 덮어써서 제거 (순서 무관)
    // 배열이 1/4 미만으로 사용되면 shrinkArray() 호출
    // 성공하면 "항목 제거됨: 이름" 출력하고 true 반환
    boolean removeItem(String name){
        for(int i = 0 ; i < itemCount; i++) {
            if (items[i].name.equalsIgnoreCase(name)) {
                items[i] = items[itemCount--];
                System.out.println("항목 제거됨: " + name);
                if (items.length/2 > itemCount) {
                    shrinkArray();
                }
                return true;
            }
        }
        return false;
    }


    // TODO: 배열 크기 축소 메서드를 작성하세요
    // 메서드명: shrinkArray
    // "배열 크기 축소: 현재크기 -> 새크기" 출력
    // 현재 크기의 1/2로 새 배열 생성하고 기존 항목들 복사
    void shrinkArray(){
        System.out.println("배열 크기 축소: "+items.length+" -> "+ items.length/2);
        Item[] shrinkItems = new Item[items.length/2];
        System.arraycopy(items, 0, shrinkItems, 0, items.length/2);

        items = shrinkItems;
    }


    // TODO: 재고 현황 출력 메서드를 작성하세요
    // 메서드명: printInventory
    // "=== 재고 현황 ===" 제목과 "항목 수: X / 배열 크기: Y" 출력
    // 각 항목의 "이름: 수량개 × 가격원 = 총가격원" 형태로 출력
    // 마지막에 "총 재고 가치: X원" 출력
    void printInventory(){
        System.out.println("=== 재고 현황 ===");
        System.out.println("항목 수: "+itemCount+" / 배열 크기: "+items.length);
        double sum = 0;
        for(int i = 0 ; i<itemCount; i++){
            System.out.println("- "+items[i].name+": "+items[i].quantity+"개 x "+items[i].price+"원 = "+items[i].quantity * items[i].price);
            sum += items[i].quantity * items[i].price;
        }
        System.out.printf("총 재고 가치: %.0f\n",sum);
    }


    public static void main(String[] args) {
        InventoryManager inventory = new InventoryManager();

        // 항목 추가 (배열 확장 테스트)
        inventory.addItem("노트북", 5, 1200000);
        inventory.addItem("마우스", 20, 30000);
        inventory.addItem("키보드", 15, 80000);
        inventory.addItem("모니터", 8, 350000);
        inventory.addItem("USB", 50, 15000);  // 배열 확장 발생
        System.out.println();

        inventory.printInventory();

        // 기존 항목 추가
        inventory.addItem("마우스", 10, 30000);

        // 항목 제거
        inventory.removeItem("USB");
        inventory.removeItem("모니터");
        inventory.removeItem("키보드");  // 배열 축소 발생
        System.out.println();

        inventory.printInventory();

    }
}
