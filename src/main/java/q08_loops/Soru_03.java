package q08_loops;

public class Soru_03 {

    /*
       Bir String‘in palindrom olup olmadıgını kontrol etmek için kod yazınız. Bir String, tersi ile
       aynıysa, buna palindrom denir.
       Örnegin; “anna”, “123321” palindromlardır.
    */

    public static void main(String[] args) {
        String str ="anna";
        String tersStr ="";
        for (int i = str.length()-1; i>-1;i--){
            String harf = str.substring(i,i+1);
            tersStr=tersStr+harf;
        }
        if (str.equals(tersStr)){
            System.out.println("Palindromdur");
        }else System.out.println("Palindrom değildir");

    }

}
