package start.start_section7;

import java.util.Scanner;

public class ScanEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("입력하세요.");
            String result = scanner.nextLine();
            if (result.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println(result);
            }
        }
    }
}
