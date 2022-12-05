package q05_ifstatement;

public class Soru_04 {

    public static void main(String[] args) {

    /*
        Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
            a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
            b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
    */

        int x = 126;
        if (x%10>=5){
            System.out.println("Son basamağı bir üst ondalığa yuvarla: " + (x/10+1) * 10);
        }else{
            System.out.println("Son basamağı bir alt ondalığa yuvarla: " + (x/10) * 10);
        }
    }
}
