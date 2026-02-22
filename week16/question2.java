package week16;
public class question2 {
    public static void main(String[] args) {
        String text = "   hello world this is java   ";
        String trimmed = text.trim();

        System.out.println("Trimmed: " + trimmed);
        System.out.println("First 10 characters: " + trimmed.substring(0, Math.min(10, trimmed.length())));

        for (String word : trimmed.split("\\s+")) {
            System.out.println(word);
        }
    }
}