package day05_wrapperClass_MatematikselIslemler_Concatenation;

public class C07_Concatenation {

    public static void main(String[] args) {


        // Sadece verilen variable'lari kullanarak
        // istenen String'leri yazdirin

        String s1 = "Java";
        String s2 = " ";
        String s3 = "Candir";
        String s4 = "";

        int a = 3;
        int b = 4;


        // 34Java
        System.out.println(  a + b + s1 ); // 7Java
        System.out.println(  s4 + a + b + s1 ); // "3" + 4 ==> "34" + Java ==> "34Java"
        System.out.println(  a + s4 + b + s1 ); // "34Java"


        // Java34
        System.out.println( s1 + a + b  );


        // Java7Candir
        System.out.println(  s1 + a + b + s3  ); // Java34Candir
        System.out.println(  s1 + (a + b) + s3  ); // Java7Candir

        // Java12Candir
        System.out.println(  s1 + a * b + s3  );


        // 12 Candir
        System.out.println( a * b + s2 + s3  );


        // Java 7
        System.out.println(  s1 + s2 + (a+b)   );


        // Java Candir 34
        System.out.println( s1 + s2 + s3 + s2 + a + b   );



        /*
            Casting islemi ile hicbir data turunu String'e cast edemezsiniz
            ama "" ile toplayarak herseyi String'lestirebiliriz
         */

        boolean bl = true;
        int sayi = 4;
        char chr = 'r';
        double dbl = 34.67;

//        String str1 = sayi;
//        String str2 = bl;
//        String str3 = chr;
//        String str4 = dbl;

//        String str1 = (String)sayi;
//        String str2 = (String)bl;
//        String str3 = (String)chr;
//        String str4 = (String)dbl;

        String str1 = sayi + "";
        String str2 = "" + bl;
        String str3 = chr + "";
        String str4 = "" + dbl;

    }
}
