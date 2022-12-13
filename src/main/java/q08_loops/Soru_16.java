package q08_loops;

public class Soru_16 {

    /*
      Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
  */
    public static void main(String[] args) {
        String s = "Annemin Mustafası"; //Anne
        String c = "";
        for (int i = 0; i < s.length(); i++) {
            c = s.substring(i, i + 1);
            if (c.equals("m")) {
                break;
            }
            System.out.print(c);
        }
    }
}
