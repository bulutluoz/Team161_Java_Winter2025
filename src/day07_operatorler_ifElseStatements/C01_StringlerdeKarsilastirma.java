package day07_operatorler_ifElseStatements;

public class C01_StringlerdeKarsilastirma {

    public static void main(String[] args) {

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "l" + "i";
        String s4 = "A";
        String s5 = "li";
        String s6 = s4+s5;  // Ali
        String s7 = new String("Ali");

        System.out.println( s1 == s2 ); // Ali == Ali ==> true
        System.out.println( s1 == s3 ); // Ali == Ali ==> true
        System.out.println( s1 == s6 ); // Ali == Ali ==> false
        System.out.println( s1 == s7 ); // Ali == Ali ==> false
        System.out.println( s1 == "Ali" ); // Ali == Ali ==> true

        /*
         SIMDILIK =='i String'leri karsilastirmak icin kullanmayacagiz

         == hem metin degerine hem de referans'a bakar
         bu sebeple metinler ayni olsa bile
         bazi karsilastirmalarda false verir
         (bunu ilerde String Havuzu konusunda anlatacagiz)

         eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek
         equals() kullanmaliyiz

         equals() SADECE metinlere bakar
         metinler ayni ise true
         metinler farkli ise false verir
         farkli karakter kullaniminda veya kucuk/buyuk harf farkliliklarinda
         sonuc false olur
         */
        System.out.println("==================");
        System.out.println( s1.equals(s2) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals(s3) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals(s6) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals(s7) ); // "Ali" equals "Ali" ==> true
        System.out.println( s1.equals("Ali") ); // "Ali" equals "Ali" ==> true

        System.out.println( s1.equals("ali") ); // "Ali" equals "ali" ==> false
        System.out.println( s1.equals("ALI") ); // "Ali" equals "ALI" ==> false
        System.out.println( s1.equals("ALi") ); // "Ali" equals "ali" ==> false
        System.out.println( s1.equals("Ali ") ); // "Ali" equals "Ali " ==> false
        System.out.println( s1.equals("Alo") ); // "Ali" equals "Alo" ==> false





    }
}
