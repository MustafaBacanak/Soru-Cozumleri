package q06_ternarystatement;

public class Soru_04 {

    public static void main(String[] args) {

 /*
        Nested Ternary kullanarak Apex kodunu yazınız.
        Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
        Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
 */
        int yil = 1870;

        System.out.println(yil % 100 == 0 ? (yil % 400 == 0 ? "Artik Yil" : "Artik Yil Değil") : (yil % 4 == 0 ? "Artik Yil" : "Artik Yil Değil"));


    }
}
