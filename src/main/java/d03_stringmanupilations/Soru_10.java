package d03_stringmanupilations;

public class Soru_10 {

    public static void main(String[] args) {

   /*
        Bir String'in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        olmadığını kontrol etmek için kod yazınız.

        Örnek: ‘Ali    Can’ için konsolda false yazmalıdır.
               ‘ Ali Can ’ için konsolda false yazmalıdır.
               ‘ Ali    Can ’ için konsolda false yazmalıdır.
               ‘Ali Can’ için konsolda true yazmalıdır.
    */
        String str ="  Ali Can";
        String x =str.trim().replaceAll("\\s+"," ");
        Boolean cevap = str.equals(x);
        System.out.println(cevap);
    }
}
