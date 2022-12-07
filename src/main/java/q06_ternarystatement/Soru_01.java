package q06_ternarystatement;

public class Soru_01 {

    public static void main(String[] args) {

    /*
        Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
    */
        String parola = "asb256 yd";

        //1.YOL

        boolean parola1=parola.replaceAll(" ","").length()>7;

        System.out.println(parola1 ? "Geçerli Parola" : "Geçersiz Parola");

        //2.YOL
        System.out.println(parola.replaceAll(" ","").length()>7 ? "Geçerli Parola" : "Geçersiz Parola");

    }
}
