package start.start_section4;

public class ConditionEx2 {
    public static void main(String[] args) {
        double rating = 8.3;

        if (rating >= 9) {
            System.out.println("'어바웃타임'을 추천합니다.");
        }
        if (rating >= 8) {
            System.out.println("'토이스토리'를 추천합니다.");
        }
        if (rating >= 7) {
            System.out.println("'고질라'를 추천합니다.");
        }
    }
}
