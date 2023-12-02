package section7;

import java.util.Scanner;

public class ScanEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("숫자를 입력하세요.");
            int temp = scanner.nextInt();
            sum += temp;
            if (temp == 0) {
                System.out.println(sum);
                break;
            }
        }
    }
}
