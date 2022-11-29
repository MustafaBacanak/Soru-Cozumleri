package d02_wrapperclass;

public class Soru_03 {

    ///valueOf(String s) ile parseByte(String s) methodları arasındaki farklar nelerdir?
    /*

    //Fark 1.
    //valueOf() methodu, non-primitive bir veri döndürür.
    //parseByte() methodu ise, primitive bir veri döndürür.

    //Fark 2.
    //valueOf() methodu, instance method'dur.
    //parseByte() methodu ise, statik bir method'dur.

    Integer.valueOf() ile Integer.parseInt() metotları arasında temel fark valueOf() metodu Integer tipinde bir nesne,
    parseInt() metodu ise int tipinde bir veri tipi döndürür.
    parseInt() metodu temel veri tipi döndürdüğü için daha hızlı çalışır. Bu diğer metotlar içinde geçerlidir.

    e parseInt() metodu temel veri tipi döndürdügü için daha hızlı çalışır.
    (Aynı durum
    Byte.valueOf()-Byte.parseByte(),
    Short.valueOf()-Short.parseShort(),
    Long.valueOf()-Long.parseLong(),
    Float.valueOf()-Float.parseFloat(),
    Double.valueOf()-Doble.parseDouble() için de geçerlidir)

     */
}
