package q08_loops;

public class Soru_02 {

    /*
    B!r Str!ng’ de tekrarlanan karakterler! yazdırmak !ç!n kod yazınız.
    Örneg!n; accessor!es ´ ces
     */

    public static void main(String[] args) {
        String str = "accessories";
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            String str1 = str.substring(i, i + 1);
            if (str.indexOf(str1) != str.lastIndexOf(str1)) {
                if (!str2.contains(str1)) {
                    str2 = str2 + str1;
                }
            }
        }
        System.out.println(str2);

    }
}
