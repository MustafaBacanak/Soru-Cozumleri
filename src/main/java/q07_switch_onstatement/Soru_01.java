package q07_switch_onstatement;

public class Soru_01 {

    public static void main(String[] args) {

/*
       Yazdırmak için switch ifadesini kullanınız.

        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "Bahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Güz"
        e) Diğerleri için "Geçersiz ay adı"
*/
        String ay="subat";
        ay=ay.toLowerCase();

        switch (ay){
            case "ocak":
            case "subat":
            case "aralik":
                System.out.println("Kış");
                break;
            case "mart":
            case "nisan":
            case "mayis":
                System.out.println("Bahar");
                break;
            case "haziran":
            case "temmuz":
            case "agustos":
                System.out.println("Yaz");
                break;
            case "eylul":
            case "ekim":
            case "kasim":
                System.out.println("Güz");
                break;
            default:
                System.out.println("Geçersiz Ay İsmi Girdiniz");
                break;
        }


    }
}
