package day13_stringManipulations;

import java.util.Scanner;

public class C01_indexOf {

    public static void main(String[] args) {

        /*
            verilen str'da
            aranan bir char veya metnin HANGI INDEX'de oldugu bilgisini getirir
            eger aranan char veya metin str'da birden fazla varsa
            ilkinin index'ini getirir
         */

        String str = "Java cok guzel";

        System.out.println(str.contains("cok")); // true

        System.out.println(str.startsWith("cok")); // false
        System.out.println(str.endsWith("cok")); // false
        System.out.println(str.equals("cok")); // false


        // peki bu "cok" nerede ?
        System.out.println(str.indexOf("cok")); // 5
        // "cok"  kelimesi str icinde 5.index'den itibaren var

        System.out.println(str.indexOf('a')); // 1

        str = "Ali topu at, at Ali at";

        System.out.println(str.indexOf("at")); // 9
        System.out.println(str.indexOf("Ali")); // 0
        System.out.println(str.indexOf('a')); // 9


        System.out.println(str.indexOf("k")); // indexOf() bize int bir sonuc getirir
                                              // eger aranan metin veya char yoksa -1 sonucunu verir

        System.out.println(str.contains("k")); // false

        // contains()'in false getirmesi ile, indexOf()'un -1 getirmesi ayni anlama gelir



        // Kullanicidan bir metin isteyin
        // metnin Java icerip icermedigini indexOf()'dan faydalanarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        if ( metin.indexOf("Java") != -1  ){
            System.out.println("Yazilan metin Java iceriyor...");
        } else {
            System.out.println("Yazilan metin Java icermiyor...");
        }




    }
}
