package q06_ternarystatement;

public class Soru_06 {

    public static void main(String[] args) {
/*
        Bir sayının mutlak değerini hesaplamak için kodu yazınız.
        Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
        Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız.

 */
        int sayi =0;
        int mutlakDeger = sayi>=0 ? sayi : (sayi*-1);
        System.out.println("Mutlak Deger = " + mutlakDeger);

    }
}
