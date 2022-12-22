package q08_loops;

public class Soru_23 {

    public static void main(String[] args) {

        /*
           23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
               Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
               olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
               yönlendiriniz
              (sadece kendisine ve 1'e bölünebilen
         */

        asalSayiMi(5);

    }

    public static void asalSayiMi(int sayi) {
        int counter = 0;
        if (sayi <= 0) {
            System.out.println("Pozitif bir tam sayı giriniz");
        } else {
            if (sayi == 2) {
                System.out.println("Asal sayıdır");
            } else if (sayi == 1) {
                System.out.println("Asal Sayı Değildir");

            } else {
                for (int i = sayi - 1; i > 1; i--) {
                    if (sayi % i == 0) {
                        counter++;
                    }
                }
                if (counter > 0) {
                    System.out.println("Asal Sayı Değildir");
                } else System.out.println("Asal Sayıdır");
            }

        }
    }

}
