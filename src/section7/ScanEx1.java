package section7;

import java.util.Scanner;

public class ScanEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 정수를 입력하세요.");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요.");
        int num2 = scanner.nextInt();

        int result = (num1 < num2) ? num2 : num1;

        System.out.println(result);
    }
}
