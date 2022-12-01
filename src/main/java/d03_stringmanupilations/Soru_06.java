package d03_stringmanupilations;

public class Soru_06 {

    public static void main(String[] args) {
    /*
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin toplamını bulunuz.
    */
        String str = "Freddy Mercury";

        int x =str.charAt(0)+str.charAt(str.length()-1);
        System.out.println(x);
    }

}
