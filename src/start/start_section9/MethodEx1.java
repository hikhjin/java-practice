package start.start_section9;

public class MethodEx1 {
    public static void main(String[] args) {
        double result = calAvg(30, 40, 30);
        System.out.println(result);
    }
    public static double calAvg(int a, int b, int c) {
        int sum = a + b + c;
        double avg = sum / 3.0;
        return avg;
    }
}
