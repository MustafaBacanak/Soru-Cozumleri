package q06_ternarystatement;

public class Soru_02 {

    public static void main(String[] args) {

/*
                Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
                b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
                c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "

 */
        int a = 3;
        int b = 3;
        int c = 5;

        // 1.YOL
        boolean ikizkenar = ((a==b) && (a!=c)) || ((b==c) && (c!=a)) || ((a==c)&&(a!=b));
        boolean eskenar = a==b && a==c;

        System.out.println(ikizkenar ? "ikizkenar" : (eskenar ? "Eşkenar" : "Ceşitkenar"));

        //2.YOL

        System.out.println((a == b) && (b == c) ? "eşkenar üçgen" : ((a == b) && (b!=c) ||
                (b == c) && (b!=a)  || (a == c) && (b!=c)? "ikizkenar üçgen" : "çeşitkenar üçgen"));



    }
}
