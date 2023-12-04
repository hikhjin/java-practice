package start.start_section9;

public class MethodEx2 {
    public static void main(String[] args) {
        String m = "hello, world";
        message(7, m);
    }
    public static void message(int a, String m) {
        for (int i = 0; i < a; i++) {
            System.out.println(m);
        }
    }
}
