package src.homework;


import java.util.Locale;

public class ConstanstsPerimeter {
    static final int TRIANGLE_SIDE = 3;
    static final int SQUARE_SIDE = 4;
    static final int CIRCLE_RADIUS = 5;

    public static void main(String[] args){
        System.out.println("Perimeter triangle = " + PerimeterCalculator.perimeterTriangle());
        System.out.println("\nPerimeter square = " + PerimeterCalculator.perimeterSquare());

        String formattedResult = String.format(Locale.US, "%.2f", PerimeterCalculator.perimeterCircle());
        System.out.println("\nPerimeter circle = " + formattedResult);

    }
}

class PerimeterCalculator{
    public static int perimeterTriangle(){
        return 3 * ConstanstsPerimeter.TRIANGLE_SIDE;

    }

    public static int perimeterSquare(){
        return 4 * ConstanstsPerimeter.SQUARE_SIDE;
    }

    public static double perimeterCircle(){
        return 2 * Math.PI * ConstanstsPerimeter.CIRCLE_RADIUS;
    }
}
