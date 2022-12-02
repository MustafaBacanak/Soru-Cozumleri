package q01_variables;

public class Soru_04 {

    public static void main(String[] args) {

        //Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
        //toplamını ve çarpımını String ile yazdırınız.

        String s="";
        long a = 545649;
        long b = 54646876;
        long top = a+b;
        long carp = a*b;
        System.out.println(s+top);
        System.out.println(s+carp);

        String sonuc = String.valueOf(top);
        String sonuc1 = String.valueOf(carp);
        System.out.println(sonuc);
        System.out.println(sonuc1);

    }
}
