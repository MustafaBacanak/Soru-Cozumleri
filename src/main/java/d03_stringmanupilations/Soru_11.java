package d03_stringmanupilations;

public class Soru_11 {

    public static void main(String[] args) {

   /*
        Bir String’in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
        Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
        ‘Ali’ için kodunuz konsolda true yazmalıdır
    */

        String str = "I want to break free";
        String str1=str.trim();
        boolean cevap = str.equals(str1);
        System.out.println(cevap);


    }
}
