package q05_ifstatement;

public class Soru_10 {

    public static void main(String[] args) {

    /*
        Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
        yazınız.

        Geçersiz BMI değeri < 0
        Zayıf = <18.5
        Normal ağırlık = 18.5–24.9
        Fazla kilolu = 25–29.9
        Obezite = 30 veya daha büyük BMI

    */

        double bmi =29.9;

        if (bmi<0) {
            System.out.println("Geçersiz deger girdiğiniz");
        }else if (bmi<18.5){
            System.out.println("Zayıf");
        }else if (bmi>18.4 && bmi < 25){
            System.out.println("Normal Seviye");
        }else if (bmi>24.9 && bmi< 30){
            System.out.println("Fazla Kilolu");
        }else {
            System.out.println("Obezsin. Az ye azzzzzz ");
        }



    }
}
