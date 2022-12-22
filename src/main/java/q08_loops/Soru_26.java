package q08_loops;

public class Soru_26 {

    public static void main(String[] args) {

 /*
    26) Kullanıcıdan bir String ve bir karakter alınız.
        String'de verilen karakterin ilk olduğu index ile son tekrarlandığı index arasındaki karakter
        sayısını sayınız.
        Boşluk karakterlerini saymayınız.
        Kod, kullanıcının seçtiği karakter String ‘de sadece bir kez varsa konsolda -1,
        Kod, kullanıcının seçtiği karakter String ‘de yoksa konsolda -1 döndürsün.
        Örneğin; "Java is easy" - 'a' ==> 5
        "Java is easy" - 'w' ==> -1
        "Java is easy" - 'e' ==> -1
 */

        String str = "Java is easy";
        str = str.replaceAll(" ", "");
        char ch = 's';
        if (str.indexOf(ch) == -1) {
            System.out.println(-1);
        } else if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(-1);

        } else {
            System.out.println((str.lastIndexOf(ch) - str.indexOf(ch) - 1));
        }
    }
}
