package start.start_section7;

import java.util.Scanner;

public class ScanEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요.");
            int num1 = scanner.nextInt();
            System.out.println("두 번째 숫자를 입력하세요.");
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0) {
                break;
            }
        }

    }
}
