package q05_ifstatement;

public class Soru_08 {

    public static void main(String[] args) {

   /*
        ABD'deki eyalet kısaltmalarının biçimini kontrol etmek için kod yazınız.

        a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
        b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz,
           "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.

        Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
             örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
             küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.

    */

        String eyaletKisaltma = "Fk3";
        if (eyaletKisaltma.length() > 2) {
            System.out.println("Eyalet kisaltmalari 2 karakterden fazla olamaz ");
        }
        if (eyaletKisaltma.replaceAll("[^a-z]", "").length() != 0) {
            System.out.println("Eyalet kisaltmalari kucuk harf iceremez ");
        }
        if (eyaletKisaltma.replaceAll("[^A-Za-z]", "").length() != 0) {
            System.out.println("Eyalet kisaltmalari asagidakilerden farkli karakterler iceremez ");
        }
    }
}
