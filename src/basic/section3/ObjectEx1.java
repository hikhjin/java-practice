package basic.section3;

import org.w3c.dom.css.Rect;

public class ObjectEx1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calArea();
        System.out.println("넓이는: " + area);

        int perimeter = rectangle.calPerimeter();
        System.out.println("둘레는: " + perimeter);

        boolean square = rectangle.isSqaure();
        System.out.println("정사각형 여부: " + square);
    }
}
