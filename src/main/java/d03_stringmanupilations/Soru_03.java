package d03_stringmanupilations;

public class Soru_03 {

    public static void main(String[] args) {

     /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
    */

        String deger = " We are  the Champions ! ";

        int deger1=deger.trim().replaceAll("\\p{Punct}","").replaceAll("\\s+","").length();

        System.out.println(deger1);
    }
}
