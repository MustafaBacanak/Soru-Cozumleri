package q06_ternarystatement;

public class Soru_08 {

    public static void main(String[] args) {

/*
        Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
        kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.

 */

        int sayi = -999;

        System.out.println((sayi > 99 && sayi < 1000) || (sayi < -99 && sayi > -1000) ?
                        "Bu sayı 3 basamaklıdır " : "Bu sayı 3 basamaklı değildir");
    }
}
