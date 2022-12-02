package q05_ifstatement;

public class Soru_01 {

    public static void main(String[] args) {

    /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.

        a) Aralık, Ocak, Şubat için "Kış"
        b) Mart, Nisan, Mayıs için "İlkbahar"
        c) Haziran, Temmuz, Ağustos için "Yaz"
        d) Eylül, Ekim, Kasım için "Sonbahar"
        e) Diğerleri için "Geçersiz ay adı"
   */

        String x = "MART";
        x = x.toLowerCase();
        if (x.equals("aralık") || x.equals("ocak") || x.equals("şubat")) {
            System.out.println("Kış");
        } else if (x.equals("mart") || x.equals("nisan") || x.equals("mayıs")) {
            System.out.println("İlkbahar");
        } else if (x.equals("haziran") || x.equals("temmuz") || x.equals("ağustos")) {
            System.out.println("Yaz");
        } else if (x.equals("eylül") || x.equals("ekim") || x.equals("kasım")) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("Geçersiz ay adı");
        }
    }
}
