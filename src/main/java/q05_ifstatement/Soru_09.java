package q05_ifstatement;

import java.util.Scanner;

public class Soru_09 {

    public static void main(String[] args) {

      /*
        Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesioluşturmak için kod yazınız.
            a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
            b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
            c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
            d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
            double a = 10.2, b=5
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("İki sayı giriniz");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        System.out.println("\nToplama içi +\nÇıkarma için -\nÇarpma için *\nBölme için /\nBir işlem seçiniz: ");
        String islem = scan.next();

        if (islem.equals("+")) {
            System.out.println("Sonuç= " + (s1 + s2));
        } else if (islem.equals("-")) {
            System.out.println("Sonuç= " + (s1 - s2));
        } else if (islem.equals("*")) {
            System.out.println("Sonuç= " + (s1 * s2));
        } else if (islem.equals("/")) {
            System.out.println("Sonuç= " + (s1 / s2));
        } else {
            System.out.println("Geçersiz işlem");
        }

    }
}
