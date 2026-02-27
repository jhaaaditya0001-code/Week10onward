package week16;
import java.util.Scanner;

import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text 1: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter text 2: ");
        String text2 = scanner.nextLine();

        String combinedText = text1.concat(text2);
        System.out.println("Combined text: " + combinedText);

        System.out.print("Enter text 3 to compare: ");
        String text3 = scanner.nextLine();

        if (combinedText.equals(text3)) {
            System.out.println("They match!");
        } else {
            System.out.println("They do not match.");
        }

        scanner.close();
    }
}