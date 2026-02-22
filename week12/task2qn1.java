package week12;


import java.util.ArrayList;

class task2qn1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Ram");
        names.add("Shyam");
        names.add("Hari");
        names.add("Sita");

     
        names.remove(2);

        System.out.println(names);
    }
}
