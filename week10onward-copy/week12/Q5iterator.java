package week12;



import java.util.ArrayList;
import java.util.Iterator;

class Q5iterator {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> names = new ArrayList<String>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        names.add("Sunil");
        names.add("Anil");
        names.add("Manoj");

        Iterator<Integer> it1 = numbers.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        Iterator<String> it2 = names.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
