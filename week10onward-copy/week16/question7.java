package week16;

public class question7 {
    public static void main(String[] args) {

        String phone = "9766612358";
        String regex = "^9[87]\\d{8}$";
 
        System.out.println(phone + " is valid phone number: " + phone.matches(regex));
    }
}