package week11;


public class Circle extends Shape implements Drawable {

    double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return 3.14 * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}
