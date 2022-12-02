package q04_stringmanupilations;

public class Soru_17 {
    public static void main(String[] args) {

    /*
        Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
    */

        String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";

        s=s.replaceAll("[^\\p{Punct}]","");
        System.out.println(s);
        System.out.println(s.length());


    }
}
