package basic.section6;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니가 찼습니다.");
        } else {
            items[itemCount] = item;
            itemCount++;
        }
    }

    public void displayItems() {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + " 합계: " + item.itemSum());
        }
        System.out.println("총 금액 합: " + totalSum());
    }

    private int totalSum() {
        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            total += item.itemSum();
        }
        return total;
    }
}
