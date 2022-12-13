package q08_loops;

public class Soru_15 {

    /*
       Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için kod yazınız.
    */
    public static void main(String[] args) {
        char c = 'C';
        do {
            System.out.print(c + " ");
            c--;
        } while (c >= 'A');
    }
}
