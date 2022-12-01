package d03_stringmanupilations;

public class Soru_05 {

    public static void main(String[] args) {

     /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan sonkarakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız
     */

        String str = " Mustafa Halt Yemee ";
        str=str.trim();
        char m=str.charAt(str.length()-1);
        System.out.println(m);

    }
}
