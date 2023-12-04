package start.start_section5;

public class LoopEx1 {
    public static void main(String[] args) {
        /* int num = 2;
        while(num < 20) {
            num += 2;
            System.out.println(num);
        }
         */
        for (int num = 2, count = 0; count < 10; count++, num += 2) {
            System.out.println(num);
        }
    }
}
