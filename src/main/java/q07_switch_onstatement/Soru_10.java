package q07_switch_onstatement;

public class Soru_10 {

    public static void main(String[] args) {

/*
        Size rastgele bir alfabetik karakter veren bir method oluşturun
        ve olusturdugunuz methodu kullanarak aşağıdakileri yazdırınız.

        'A' ve 'a' için "İlk Karakter" yazdırınız.
        'B' ve 'b' için "İkinci Karakter" yazdırınız.
        'C' ve 'c' için "Üçüncü Karakter" yazdırınız.
        'D' ve 'd' için "Dördüncü Karakter" yazdırınız.
         Diğerleri için "Diğer Karakterleri" yazdırınız.
 */

        String alfabe =getRandomAlphabet().toLowerCase();
        switch(alfabe){
            case "a":
                System.out.println("Ilk Karakter");
                break;
            case "b":
                System.out.println("Ikinci Karakter");
                break;
            case "c":
                System.out.println("Ucuncu Karakter");
                break;
            case "d":
                System.out.println("Dorduncu Karakter");
                break;
            default:
                System.out.println("Diger Karakterler");
        }

    }

    public static String getRandomAlphabet(){
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alfabe.length()-1;
        int randomIndex = (int)Math.round(Math.random()*maxIndex);
        return alfabe.substring(randomIndex, randomIndex+1);
    }
}