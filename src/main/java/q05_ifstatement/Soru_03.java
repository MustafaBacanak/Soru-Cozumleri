package q05_ifstatement;

public class Soru_03 {

    /*
        Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb
    */

    public static void main(String[] args) {

        int x=5;

        if(x==1){
            System.out.println("Ocak");
        }else if(x==2){
            System.out.println("Şubat");
        }else if(x==3){
            System.out.println("Mart");
        }else if(x==4){
            System.out.println("Nisan");
        }else if(x==5){
            System.out.println("Mayıs");
        }else if(x==6){
            System.out.println("Haziran");
        }else if(x==7){
            System.out.println("Temmuz");
        }else if(x==8){
            System.out.println("Ağustos");
        }else if(x==9){
            System.out.println("Eylül");
        }else if(x==10){
            System.out.println("Ekim");
        }else if(x==11){
            System.out.println("Kasım");
        }else if(x==12){
            System.out.println("Aralık");
        }else {
            System.out.println("Geçersiz giriş yaptınız");
        }

    }
}
