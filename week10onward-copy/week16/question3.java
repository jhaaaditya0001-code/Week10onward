package week16;



public class question3 {
    public static void main(String[] args) {

        String str = "HelloWorld";

        int index = 4;
        System.out.println("Character at index " + index + ": " + str.charAt(index));

        char findChar = 'o';
        System.out.println("First occurrence of '" + findChar + "' is at index: " + str.indexOf(findChar));

        String word = "World";
        System.out.println("The String contains '" + word + "' at index: " + str.indexOf(word));
    }
}
