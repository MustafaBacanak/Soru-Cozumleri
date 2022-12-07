package q07_switch_onstatement;

public class Soru_04 {

    public static void main(String[] args) {

/*
        Cinsiyet "Erkek" ise "Erkek" yazdırınız.
        Cinsiyet "Kadın" ise "Kız" yazdırınız.
        Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.

        Not : Bu seçenekler dışındakilerini yoksayınız.
 */
        String cinsiyet = "asas";

        switch (cinsiyet.toLowerCase()){
            case "erkek":
                System.out.println("Erkek");
                break;
            case "kadin":
                System.out.println("Kız");
                break;
            default:
                System.out.println("Diğerleri");
        }
    }
}
