package basic.section1;

public class ClassEx3 {
    public static void main(String[] args) {
        ProductOrder[] productOrder = new ProductOrder[3];

        ProductOrder dubu = new ProductOrder();
        dubu.productName = "두부";
        dubu.price = 2000;
        dubu.quantity = 2;
        productOrder[0] = dubu;

        ProductOrder kimchi = new ProductOrder();
        kimchi.productName = "김치";
        kimchi.price = 5000;
        kimchi.quantity = 1;
        productOrder[1] = kimchi;

        ProductOrder coke = new ProductOrder();
        coke.productName = "콜라";
        coke.price = 1500;
        coke.quantity = 2;
        productOrder[2] = coke;

        int sum = 0;
        for (ProductOrder order : productOrder) {
            System.out.println(order.productName + " " + order.price + " " + order.quantity);
            sum += order.price * order.quantity;
        }
        System.out.println("총 금액은: " + sum);
    }
}
