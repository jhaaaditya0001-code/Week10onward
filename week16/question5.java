package week16;


public class question5 {
    public static void main(String[] args) {

        String initial = "Hello";
        String second = "World";
        int num = 2026;
        char special = '!';

        StringBuilder sb = new StringBuilder(initial);

        sb.append(second);
        sb.append(num);
        sb.append(special);

        System.out.println("Final modified String: " + sb.toString());
    }
}