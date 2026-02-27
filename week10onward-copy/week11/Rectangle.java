package week11;


public class Rectangle extends Shape implements Drawable {

    double l;
    double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double calculateArea() {
        return l * w;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (l + w);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}
