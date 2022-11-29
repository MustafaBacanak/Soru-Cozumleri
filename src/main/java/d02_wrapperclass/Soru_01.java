package d02_wrapperclass;

public class Soru_01 {

    public static void main(String[] args) {

        //Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
        //bulmak için bir kod yazınız.

        int min = Byte.MIN_VALUE;
        int max = Short.MAX_VALUE;

        System.out.println(min+max);
    }
}
