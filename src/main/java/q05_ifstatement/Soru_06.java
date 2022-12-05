package q05_ifstatement;

import java.util.Scanner;

public class Soru_06 {

    public static void main(String[] args) {

    /*
        Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
        kod yazınız. Google'dan dönüşümler için formülleri bulunuz.

            a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde,
               konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
            b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
               kodunuz "2" yazmalıdır (sayı dinamik olacak)
            c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
               konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. milden-Km'ye\n2. saniyeden-Saate\n3. fahrenaytdan-Santigarata\nDeğeri hangi birime dönüştürmek istersiniz: ");
        int secim = scan.nextInt();
        System.out.print("Dönüştereceğiniz değeri giriniz: ");
        double deger = scan.nextDouble();

        if (secim == 1) {
            System.out.println(deger + " mil " + deger * 1.6 + " km'dir.");
        } else if (secim == 2) {
            System.out.println(deger + " saniye " + deger / 3600 + " saat'tir.");
        } else if (secim == 3) {
            System.out.println(deger + " fahrenheit " + (deger - 32) * 5 / 9 + " santigarat'tır.");
        } else {
            System.out.println("Geçersiz bir değer girdiniz.");
        }
    }
}
