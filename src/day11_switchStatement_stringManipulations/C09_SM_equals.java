package day11_switchStatement_stringManipulations;

public class C09_SM_equals {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "A" + "l" + "i";
        String str3 = new String("Ali");

        // String'de farkli 2 metnin ayni oldugunu kontrol etmek icin == kullanmiyoruz (simdilik)
        // String de bu islem icin equals() kullanilir

        System.out.println( str1.equals(str2) ); // true
        System.out.println( str1.equals(str3)); // true

        String str4 = "ali";
        String str5 = "ALI";
        String str6 = "ALi";
        String str7 = "Ali ";
        String str8 = "A li";

        /*
            equals() metinleri karsilastirirken
            karakter sayisina  ve
            ayni index'deki karakterlerin ayni olmasina bakar

            eger farklilik varsa false verir
            eger karakter sayisi ve tum karakterler ayni ise true verir
         */
        System.out.println( str1.equals(str4)); // Ali <==> ali  ==> false
        System.out.println( str1.equals(str5)); // Ali <==> ALI  ==> false
        System.out.println( str1.equals(str6)); // Ali <==> ALi  ==> false
        System.out.println( str1.equals(str7)); // Ali <==> "Ali " ==> false
        System.out.println( str1.equals(str8)); // Ali <==> A li  ==> false


        /*
            Esitligi kontrol ederken
            sadece kucuk buyuk harf farkliliklarini onemsememesini isterseniz
         */

        System.out.println("================");
        System.out.println(  str1.equalsIgnoreCase(str4)); // Ali <==> ali  ==> true
        System.out.println(  str1.equalsIgnoreCase(str5)); // Ali <==> ALI  ==> true
        System.out.println(  str1.equalsIgnoreCase(str6)); // Ali <==> ALi  ==> true
        System.out.println(  str1.equalsIgnoreCase(str7)); // Ali <==> "ALi "  ==> false
        System.out.println(  str1.equalsIgnoreCase(str8)); // Ali <==> "A li"  ==> false



    }
}
