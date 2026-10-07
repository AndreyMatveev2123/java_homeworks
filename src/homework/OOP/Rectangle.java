package src.homework.OOP;

public class Rectangle {
    int width;
    int height;

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.width = 10;
        rect.height = 20;
        System.out.println("Площадь прямоугольника: " + rect.area());


        Rectangle rect1 = new Rectangle();
        rect1.width = 5;
        rect1.height = 10;

        System.out.println("Площадь прямоугольника: " + rect1.area());
    }

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }
}
