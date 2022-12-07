package q07_switch_onstatement;

import java.util.Locale;

public class Soru_08 {

    public static void main(String[] args) {

/*
        Bir Enum oluşturun ve içine CHROME, SAFARI, IE, FIREFOX, YANDEX gibi tarayıcı adlarını koyunuz.
        Switch ifadesini kullanın ve CHROME için 'CHROME kullanıyorum', SAFARI için
        'SAFARI kullanıyorum', 'IE için IE kullanıyorum', 'FIREFOX için FIREFOX kullanıyorum' ve
        YANDEX için 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
        tarayıcılar için 'Geçersiz tarayıcı' yazınız.

        Not: Geliştirici konsolunda enum oluşturmalısınız.
 */
        String tarayici=Soru_08_Enum.CHROME.toString();

        switch (tarayici){
            case "CHROME":
                System.out.println("CHROME Kullaniyorum");
                break;
            case "SAFARI":
                System.out.println("SAFARI Kullaniyorum");
                break;
            case "IE":
                System.out.println("IE Kullaniyorum");
                break;
            case "FIREFOX":
                System.out.println("FIREFOX Kullaniyorum");
                break;
            case "YANDEX":
                System.out.println("YANDEX Kullaniyorum");
                break;
            default:
                System.out.println("Geçersiz Tarayıcı");
        }
    }
}
