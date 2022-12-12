package q08_loops;

public class Soru_05 {

    /*
        Asagıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                                    A
                                    A A
                                    A A A
                                    A A A A
   */
    public static void main(String[] args) {

        int satir=4;
        for(int i=1; i<=satir; i++){
            for(int j=i;j>0; j--){
                System.out.print("A ");
            }
            System.out.println();
        }
    }
}
