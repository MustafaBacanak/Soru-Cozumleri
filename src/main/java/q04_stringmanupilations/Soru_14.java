package q04_stringmanupilations;

public class Soru_14 {

    public static void main(String[] args) {

   /*
        Bir String’ in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız.
        String s = "Java";
    */

        String str = "Java";
        //1. Yol
        boolean x = str.contains("v");
        System.out.println(x);

        //2. Yol
        int idx = str.indexOf("v");
        boolean y = idx >=0;
        System.out.println(y);

        //3. Yol
        String harf = str.replaceAll("v", "");
        boolean z = !str.equals(harf);
        System.out.println(z);


    }
}
