package q08_loops;

public class Soru_19 {

    /*
    Bir String’deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
     */
    public static void main(String[] args) {
        String s = "Annesinin Mustafa'sı, bugün annesini aradı. :)!!!";
        String a = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 32 && ch <= 64) {
                continue;
            }
            a += ch;
        }
        System.out.println(a.length());
    }
}
