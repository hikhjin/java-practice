package basic.section3;

public class Rectangle {
    int width;
    int height;

    int calArea() {
        int area = width * height;
        return area;
    }

    int calPerimeter() {
        int perimeter = 2 * (width + height);
        return perimeter;
    }

    boolean isSqaure() {
        if (this.width == this.height) {
            return true;
        } else return false;
    }
}
