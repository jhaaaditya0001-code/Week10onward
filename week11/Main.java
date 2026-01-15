package week11;


public class Main {
    public static void main(String[] args) {

        Shape[] list = new Shape[2];

        list[0] = new Rectangle(8, 4);
        list[1] = new Circle(5);

        for (int i = 0; i < list.length; i++) {
            list[i].displayShapeInfo();

            Drawable d = (Drawable) list[i];
            d.draw();

            System.out.println("----------");
        }
    }
}
