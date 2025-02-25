package day12_stringManipulations;

public class C06_startsWith {
    public static void main(String[] args) {

        String str = "Kod yazmak cok guzel";

        System.out.println(str.startsWith("K")); // ilk harfi K mi ? true

        System.out.println(str.startsWith("k")); // ilk harfi k mi ? false

        System.out.println(str.startsWith("Ko")); // ilk 2 harfi Ko mu ? true

        System.out.println(str.startsWith("Kod y")); // ilk 5 harfi Kod y mi ? true

        System.out.println(str.startsWith("Kod  y")); // ilk 6 harfi Kod  y mi ? false

        System.out.println(str.startsWith("")); // str'in basinda "" var mi ? true

        System.out.println(str.startsWith("Kod yazmak cok guzel")); // str'in ilk 19 harfi Kod yazmak cok guzel mu? true


       // "Kod yazmak cok guzel"

        // str "yazmak" ile mi basliyor

        System.out.println(str.startsWith("yazmak")); // str'in ilk 6 harfi "yazmak" mi ? false

        // str'in 4.index ve sonrasi "yazmak" ile mi basliyor
        // yazmak cok guzel

        System.out.println(str.startsWith("yazmak", 4)); // true
        // 2 parametreli kullanimda
        // Java once toffset olarak verilen index ve sonrasindaki tum metni alir
        // ve aldigi bu parca sorulan "yazmak" ile mi basliyor kontrol eder


        System.out.println(str.startsWith("cok", 10)); // " cok guzel"    ==> false

        System.out.println(str.startsWith("cok", 11)); // "cok guzel"    ==> true

        System.out.println(str.startsWith("", 10)); // " cok guzel"    ==> true




    }
}
