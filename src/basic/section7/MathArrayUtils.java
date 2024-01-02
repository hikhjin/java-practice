package basic.section7;

public class MathArrayUtils {
    private MathArrayUtils() {
        // private으로 인스턴스 생성 막기
    }

    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        int tmp = values[0];
        for (int value : values) {
            if (value < tmp) {
                tmp = value;
            }
        }
        return tmp;
    }

    public static int max(int[] values) {
        int tmp = values[0];
        for (int value : values) {
            if (value > tmp) {
                tmp = value;
            }
        }
        return tmp;
    }

}
