package q04_stringmanupilations;

public class Soru_04 {

    public static void main(String[] args) {

        /*
            Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
            Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir
        */

        String str = "'1a3Bcf4!...'";

        int str1=str.replaceAll("[0,9]","").length();
        System.out.println(str1);
    }
}
