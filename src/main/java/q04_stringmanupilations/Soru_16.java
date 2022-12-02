package q04_stringmanupilations;

public class Soru_16 {

    public static void main(String[] args) {

    /*
        Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        Not: İkinci isim kapsam dışındadır.
        Örnek: Tom Hanks ==> TH, Mary Star ==> MS
    */

        String x = "Tom Hanks";
        char isim = x.charAt(0);
        char soyIsim = x.split(" ")[1].charAt(0);
        System.out.println("" + isim+soyIsim);


        //2.Yol

        String str ="Freddy Mercury";
        str=str.substring(0,1)+ str.split(" ")[1].charAt(0);
        System.out.println(str);
    }
}
