package q06_ternarystatement;

public class Soru_03 {

    public static void main(String[] args) {

    /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
        Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
        125 yukarı yuvarlanacak ve değer 130 olacaktır.
        123 aşağı yuvarlanacak ve değer 120 olacaktır.
    */

        // 1.YOL
        int sayi1 = 125;
        int sonuc =sayi1%10>=5 ? (sayi1/10+1)*10 : (sayi1/10)*10;
        System.out.println("sonuc = " + sonuc);

        //2.YOL
        int sayi =127;
        double sayi2=sayi/10;

        System.out.println(sayi % 10 >= 5 ? Math.ceil(sayi2) * 10 : Math.floor(sayi2) * 10);

        /*
            Math.ceil() --> Sayiyi kendinen büyük bir üst kademeye yuvarlar. Ondalıklı sayi ile calisir.
            Math.floor() --> Sayiyi kendinen kücük bir alt kademeye yuvarlar. Ondalıklı sayi ile calisir.
         */




    }
}
