package geometry;

public class GeometryTest {
    public static void main(String[] args) {

        Square square = new Square(5);
        Triangle triangle = new Triangle(3, 4, 5);

        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());

        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}
