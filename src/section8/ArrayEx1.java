package section8;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int sum = 0;
        for (int student : students) {
            sum += student;
        }
        System.out.println("합계는 " + sum);
        double avg = (double) sum / students.length;
        System.out.println(avg);
    }
}
