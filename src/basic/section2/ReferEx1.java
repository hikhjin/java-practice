package basic.section2;

public class ReferEx1 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

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
