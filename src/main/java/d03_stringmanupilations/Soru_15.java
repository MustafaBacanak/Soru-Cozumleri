package d03_stringmanupilations;

public class Soru_15 {

    public static void main(String[] args) {

     /*
           String gomlekFiyat = ‘$12.99’;
           String kitapFiyat = ‘$35.99’;
           Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.

      */

        String gomlekFiyat = "$1200.99";
        String kitapFiyat = "$3500.99";

        gomlekFiyat=gomlekFiyat.replace("$","");
        kitapFiyat=kitapFiyat.replace("$","");

        double x = Double.parseDouble(gomlekFiyat);
        double y = Double.parseDouble(kitapFiyat);
        double toplam = x+y;

        System.out.printf("%5.2f",toplam);

//      System.out.println();
//      System.out.println(String.format("%.2f",toplam));


    }
}
