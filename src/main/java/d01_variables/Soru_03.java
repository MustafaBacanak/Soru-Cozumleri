package d01_variables;

public class Soru_03 {
    public static void main(String[] args) {

        //Basit faizi bulmak için bir kod yazınız.
        //Not: Basit faiz formülü = anapara * oran * yılDegeri /100

        int anaPara =940;
        double oran =2.9;
        int yil = 3;

        double faiz = (anaPara*oran*yil)/100;
        System.out.println("Basit Faiz :"+faiz);

    }
}
