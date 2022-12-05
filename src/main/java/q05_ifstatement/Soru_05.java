package q05_ifstatement;

public class Soru_05 {

    public static void main(String[] args) {

    /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
            a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
            b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
            c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
    */

        int kenar1 = 7;
        int kenar2 = 7;
        int kenar3 = 5;

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Eşkenar üçgen");
        }else if(kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
            System.out.println("İkizkenar üçgen");
        }else{
            System.out.println("Çeşit kenar üçgen");
        }
    }
}
