package section8;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("학생 수를 입력하세요.");
        int cnt = scanner.nextInt();

        int score[][] = new int[cnt][3]
;        for (int i = 0; i < cnt; i++) {
            System.out.println(i+1 + "번째 학생의 성적을 입력하세요.");
            for (int j = 0; j < 3; j++) {
                int temp = scanner.nextInt();
                score[i][j] = temp;
            }

        }
        for (int k = 0; k < cnt; k++) {
            int sum = Arrays.stream(score[k]).sum();
            int avg = sum / 3;
            System.out.println("성적의 총합은: " + sum);
            System.out.println("성적의 평균은: " + avg);
        }
    }
}
