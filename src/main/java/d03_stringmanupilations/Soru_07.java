package d03_stringmanupilations;

public class Soru_07 {

    public static void main(String[] args) {

    /*
        Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsoldayazdırınız.
        Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız
    */

        String str = "Did you miss me";

        System.out.println(str.substring(1));

        //2.Yol

        str=str.replaceAll(str.substring(0,1),"");
        System.out.println(str);

    }
}
