package basic.section2;

import java.util.Scanner;

public class ReferEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("총 상품 개수를 입력하세요: ");
        int num = scanner.nextInt();

        ProductOrder[] productOrders = new ProductOrder[num];

        for (int i = 0; i < num; i++) {
            scanner.nextLine();
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품 이름을 입력하세요: ");
            String pName = scanner.nextLine();
            System.out.print("상품 가격을 입력하세요: ");
            int pPrice = scanner.nextInt();
            System.out.print("상품 수량을 입력하세요: ");
            int pQuantity = scanner.nextInt();
            productOrders[i] = createOrder(pName, pPrice, pQuantity);
        }
        getTotalAmout(productOrders);

    }
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void getTotalAmout(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + "가격: " + order.price + "수량: " + order.quantity);
            sum += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}
