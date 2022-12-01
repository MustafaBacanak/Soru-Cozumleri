package d03_stringmanupilations;

public class Soru_02 {

    public static void main(String[] args) {

    /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
    */

        String kisi1="Ali Kemal";
        String kisi2="Mustafa Bugra";
        String kisi3="Gürkay Yavuz";

        System.out.println(kisi1.replaceAll(" ","").length()
                +kisi2.replaceAll(" ","").length()+
                kisi3.replaceAll(" ","").length());
    }
}
