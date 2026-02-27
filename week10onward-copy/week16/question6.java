package week16;


public class question6 {
    public static void main(String[] args) {

        String original = "level";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        System.out.println("Is palindrome: " + original.equals(reversed));
    }
}