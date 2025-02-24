package day11_switchStatement_stringManipulations;

import java.util.Locale;

public class C06_SM_toLowerCase_toUpperCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR
        System.out.println(str.toLowerCase()); // java candir


        // String'de atama yapmadigimiz muddetce
        // method'larla yapilan degisiklikler KALICI olmaz

        System.out.println( str ); // Java Candir


        // kalici degisiklik icin atama yapmalisiniz

        // str'i BUYUK harflerden olusacak sekilde degistirin

        str = str.toUpperCase();

        System.out.println("Kalici degisiklikten sonra str : " + str);
        // Kalici degisiklikten sonra str : JAVA CANDIR


        str = "Bütün bağ bahçe, bağcınındır.";

        System.out.println(str.toUpperCase()); //  BÜTÜN BAĞ BAHÇE, BAĞCININDIR.

        str = str.toUpperCase();  //  BÜTÜN BAĞ BAHÇE, BAĞCININDIR.

        // str'i kucuk harf olarak yazdiralim
        System.out.println(str.toLowerCase()); // bütün bağ bahçe, bağcinindir.

        /*
            ingilizce disindaki dillerde olan local harfler icin
            buyuk kucuk harf cevirirken otomatik olarak o dile gore ceviriyor
            AMMMMAAAA
            I harfi ingilizcede i'nin buyuk halidir
            dolayisiyla I'yi kucultmek istedigimizde ingilizce olarak karsiligi olan i getiriyor

            EGER I icin turkce ı seklinde kucultmesini isterseniz
            Locale tercihimizi java'ya soylemeliyiz
         */


        //  BÜTÜN BAĞ BAHÇE, BAĞCININDIR.

        System.out.println(  str.toLowerCase(Locale.forLanguageTag("Tr")) );
        // bütün bağ bahçe, bağcınındır.




    }
}
