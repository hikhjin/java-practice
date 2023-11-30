package section5;

public class LoopEx2 {
    public static void main(String[] args) {
        /*
        int cnt = 1;
        int max = 100;
        int sum = 0;
        while (cnt <= max) {
            sum += cnt;
            cnt++;
        }
        System.out.println(sum);

         */

        int sum = 0;
        for (int cnt = 1, max = 100; cnt <= max; cnt++) {
            sum += cnt;
        }
        System.out.println(sum);
    }
}
