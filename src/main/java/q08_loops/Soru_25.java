package q08_loops;

public class Soru_25 {

    public static void main(String[] args) {

     /*
         25) Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır.
             Örneğin, 153, her basamağın küpüne eşit olan 153= 1 + 125 + 27 olduğundan bir
             Armstrong sayısıdır. Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek
             için bir kod yazınız
     */

        int sum = 0;
        int sayi = 407;
        for (int i = sayi; i > 0; i = i / 10) {
            int a = i % 10;
            sum += (a * a * a);
        }
        if (sum == sayi) {
            System.out.println("Armstrong sayısıdır");
        } else
            System.out.println("Armstrong sayısı Değildir");
    }
}

