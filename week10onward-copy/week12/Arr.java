package week12;


import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {

        ArrayList<Object> arrlist = new ArrayList<>();

        arrlist.add(101);
        arrlist.add("Sandesh");
        arrlist.add(70.50);
        
        arrlist.add(0, 98);

        System.out.println(arrlist);
        System.out.println(arrlist.get(0));
        System.out.println(arrlist.contains(95));
    }
}
