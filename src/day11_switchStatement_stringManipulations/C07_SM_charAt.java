package day11_switchStatement_stringManipulations;

public class C07_SM_charAt {

    public static void main(String[] args) {

        /*
            charAt(index)
            Java'da index 0'dan baslar
            1.harf icin index==> 0
            4.harf icin index==> 3

            karakter sayisi -1 son harfin index'idir

            eger charAt(karakterSayisi) veya daha buyuk bir index yazarsaniz
            StringIndexOutOfBoundsException hatasi verir

         */


        String str = "Java guzeldir";

        // ilk harfi yazdirin
        System.out.println(str.charAt(0)); // J


        // 4.harfi yazdirin
        System.out.println(str.charAt(3)); // a


        // son harfi yazdirin
        // str'da 13 karakter var

        System.out.println( str.charAt(13-1)  ); // r

        // karakter sayisinin 13 oldugunu biliyorsak
        // sondan 3. karakteri yazdirin

        System.out.println( str.charAt(10)); // d   10 ==> 13-3


        // Java guzeldir

        // karakter sayisinin 13 oldugunu biliyorsak
        // 13.index'deki karakteri yazdirin

        // System.out.println(str.charAt(43)); // StringIndexOutOfBoundsException
                                               // String index out of range: 13


    }
}
