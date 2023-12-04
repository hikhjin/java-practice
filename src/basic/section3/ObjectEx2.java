package basic.section3;

public class ObjectEx2 {
    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        System.out.println("잔액: " + account.balance);
    }
}
