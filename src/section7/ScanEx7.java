package section7;

import java.util.Scanner;

public class ScanEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요.");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요.");
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

    }
}
