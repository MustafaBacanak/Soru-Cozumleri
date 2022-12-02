package q02_typecasting;

public class Soru_04 {

    public static void main(String[] args) {

        // Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        //Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.

        double x=15.9;
        short y = (short) x;

        System.out.println(y);

    }
}
