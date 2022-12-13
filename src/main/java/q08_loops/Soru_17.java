package q08_loops;

public class Soru_17 {

    /*
    Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
    */
    public static void main(String[] args) {
        int x = 869;
        int sum = 0;

        for (int i = x; i > 0; i = i / 10) {
            sum = sum + i % 10;
        }
        System.out.println(sum);
    }
}
