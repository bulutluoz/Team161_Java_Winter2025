package day12_stringManipulations;

public class C02_substring_2Parametre {

    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.substring(1, 3));  // beginIndex , endIndex   av

        /*
            Java'da genel bir kural olarak
            baslangic index'leri inclusive(dahil)
            bitis index'leri exclusive(haric) olur

            str.substring(1, 3) yazildiginda
            1.index'deki karakter dahil, 3.index'deki karakter haric olarak
            1-3 arasindaki karakterleri verir
            av


            ya da
            str.substring(1, 3)
            1.index'den basla
            (3-1) adet karakter getir seklinde de okunabilir
         */


        System.out.println(str.substring(6, 10)); // uzel

        // str'in bastan 4 karakterini yazdirin

        System.out.println(str.charAt(3)); // a

        System.out.println( str.substring(3) ); // a Guzeldir

        System.out.println(str.substring(0, 4)); // Java


        str = "Java cok guzeldir";

        // sadece 2.kelimeyi yazdirin
        System.out.println( str.substring(5,8) ); // cok


        // bastan 2.harf ile sondan 2.harf(dahil) arasindaki metni yazdirin
        // ava cok guzeldi
        System.out.println(str.substring(1, str.length() - 1));

        // bastan 5.harf ile sondan 5.harf(haric) arasindaki karakterleri yazdirin
        System.out.println(str.substring(4, str.length() - 5)); // "  cok guz"


        System.out.println(str.substring(0, 1)); // J
        System.out.println(str.substring(1, 2)); // a
        System.out.println(str.substring(2, 3)); // v
        System.out.println(str.substring(3, 4)); // a

        System.out.println(str.charAt(0)); // J

        /*
            str.charAt(0)   ve   str.substring(0, 1)
            ikisi de 0.index'deki J harfini verir

            aralarindaki fark

            charAt() bir char getirdigi icin bu method'dan sonra String method'lari calismaz
            str.charAt() bir String getirdiginden bu method'dan sonra String method'lari calisir
         */

        // 7. karakteri buyuk harf olarak yazdirin
        // "Java cok guzeldir"  ==> o

        System.out.println(str.substring(6, 7).toUpperCase()); // O

        System.out.println(str.toUpperCase().charAt(6)); // O


        System.out.println(str.substring(3, 3)); // hiclik
        System.out.println(str.substring(7, 7)); // hiclik

        // baslangic ve bitis index'i ayni olursa,
        // sonuc HICLIK olur


        // System.out.println(str.substring(5, 2)); // StringIndexOutOfBoundsException: begin 5, end 2, length 17

    }
}
