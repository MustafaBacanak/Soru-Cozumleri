package q04_stringmanupilations;

public class Soru_01 {

    public static void main(String[] args) {

    /*
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
        Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.
    */

        String sehir = "amasya";
        System.out.println(sehir.substring(0,1).toUpperCase()+sehir.substring(1).toLowerCase());

    }
}
