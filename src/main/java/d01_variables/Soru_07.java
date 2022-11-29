package d01_variables;

public class Soru_07 {
    public static void main(String[] args) {

        //İki tamsayıyı değiştirmek için bir kod yazınız.

        int a = 5;
        int b = 10;
        System.out.println(a+ " "+ b);

//        int c = b; // degisken tanimladim.
//        b=a;
//        a=c;
//        System.out.println(a + " " + b);

        // 2.Yol

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
}
