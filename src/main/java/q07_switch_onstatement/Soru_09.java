package q07_switch_onstatement;

public class Soru_09 {

    public static void main(String[] args) {

/*
        Adı 'Soru_09_Enum' olan bir Enum oluşturun ve Enum da switch-on deyimini kullanarak aşağıdakileri yazdırınız.
        Kış için 'Snowboard yapmak'
        Yaz ve bahar için 'Balık tutmak'
        Sonbahar için 'Doğa yürüyüşü yapmak

 */
        String mevsim = Soru_09_Enum.BAHAR.toString();

        switch (mevsim) {
            case "YAZ":
                System.out.println("Balık tutmak");
                break;
            case "KIS":
                System.out.println("Snowboard yapmak");
                break;
            case "BAHAR":
                System.out.println("Balık tutmak");
                break;
            case "SONBAHAR":
                System.out.println("Doga yürüyüşü");
                break;
            default:
                System.out.println("Geçersiz giriş");
        }
    }
}
