package d02_wrapperclass;

public class Soru_02 {

    public static void main(String[] args) {

        //Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.

        String x="103";
        byte a = Byte.parseByte(x);

        String y = "2351";
        short b=Short.parseShort(y);

        System.out.println(b-a);



    }
}
