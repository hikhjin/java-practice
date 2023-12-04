package section8;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[4-i]);
            if (i != 4) {
                System.out.print(",");
            }
        }
    }
}
