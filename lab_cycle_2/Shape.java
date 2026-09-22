class Shape {

    void area() {
        System.out.println("Area of Shape");
    }
}

class Circle extends Shape {

    double radius = 5;

    @Override
    void area() {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {

    int length = 10, breadth = 5;

    @Override
    void area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

class Triangle extends Shape {

    int base = 8, height = 4;

    @Override
    void area() {
        System.out.println("Area of Triangle = " + (0.5 * base * height));
    }
}

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(),
                new Rectangle(),
                new Triangle()
        };

        for (Shape s : shapes) {
            s.area();
        }
    }
}