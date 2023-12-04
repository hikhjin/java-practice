package section8;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 개의 정수를 입력받을 건지 입력하세요.");
        int cnt = scanner.nextInt();

        System.out.println(cnt + "개의 정수를 입력하세요.");
        int[] nums = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            int n = scanner.nextInt();
            nums[i] = n;
        }
        Arrays.sort(nums);
        System.out.println("최솟값은: " + nums[0]);
        System.out.println("최댓값은: " + nums[cnt-1]);

    }
}
