package d03_stringmanupilations;

public class Soru_08 {

    public static void main(String[] args) {

     /*
        Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda büyük harfle yazdırınız.
        Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız
    */

        String str = "Did you miss me ?";
        str=str.toUpperCase().substring(0,str.length()-1);
        System.out.println(str);

    }
}
