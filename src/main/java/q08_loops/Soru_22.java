package q08_loops;

public class Soru_22 {

    /*
        5 hariç 3'ten 9'a kadar olan tam sayıları yazdırmak için kod yazınız.
    */
    public static void main(String[] args) {
        for (int i = 3; i < 10 ; i++) {
            if(i==5){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
