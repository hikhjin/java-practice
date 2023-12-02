package section7;

import java.util.Scanner;

public class ScanEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int cnt = 0;
        System.out.println("숫자를 입력하세요. 입력 중단: -1");
        while (true) {
            int temp = scanner.nextInt();
            if (temp == -1) {
                System.out.println("합계: " + sum);
                System.out.println("평균: " + avg);
                break;
            }
            sum += temp;
            cnt ++;
            avg = sum / cnt;
        }
    }
}
