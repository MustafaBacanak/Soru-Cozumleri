package d03_stringmanupilations;

public class Soru_09 {

    public static void main(String[] args) {

    /*
        Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle yazdırınız.
        Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
    */

        String str = "Did you miss me ?";

        str=str.substring(1,str.length()-1).toUpperCase();

        System.out.println(str);
    }
}
