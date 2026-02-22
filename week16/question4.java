package week16;


public class question4 {
    public static void main(String[] args) {

        String str = "hello world from java";

        System.out.println("Lower-case String: " + str.toLowerCase());
        System.out.println("Upper-case String: " + str.toUpperCase());

        String[] words = str.split(" ");
        StringBuilder titleCase = new StringBuilder();

        for (String word : words) {
            titleCase.append(Character.toUpperCase(word.charAt(0)));
            titleCase.append(word.substring(1).toLowerCase());
            titleCase.append(" ");
        }

        System.out.println("Title Case: " + titleCase.toString().trim());
    }
}