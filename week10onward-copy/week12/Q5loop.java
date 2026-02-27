package week12;


import java.util.ArrayList;

class Q5loop {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        names.add("Aaditya");
        names.add("Ramesh");
        names.add("Gopal");

        for (Integer n : numbers) {
            System.out.println(n);
        }

        for (String s : names) {
            System.out.println(s);
        }
    }
}
