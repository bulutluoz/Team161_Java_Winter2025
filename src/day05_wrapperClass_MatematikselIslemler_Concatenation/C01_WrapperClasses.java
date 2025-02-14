package day05_wrapperClass_MatematikselIslemler_Concatenation;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        /*
            primitive data turleri
            boolean, char,      byte, short, int,     long, float, double
            Boolean, Character, Byte, Short, Integer, Long, Float, Double
         */


        // 1- ayni data turundeki primitive ve Wrapper class'dan
        //    olusturulan variable'lari birbirlerine direkt atayabiliriz

        int sayiInt = 10;
        Integer sayiWrapperInt = sayiInt;

        sayiWrapperInt = 40;
        sayiInt = sayiWrapperInt ;

        // 2- Wrapper class'lar non-primitive olduklarindan hazir method'lari vardir

        // String olarak verilen bir sayiyi, matematiksel islem yapabilecegimiz
        // dataya cevirme

        String fiyat1 = "9.94";
        String fiyat2 = "21.74";
        String fiyat3 = "14.86";

        // String olarak verilen yukardaki 3 fiyatin ortalamasini bulun

        System.out.println( fiyat1 + fiyat2 + fiyat3   ); // 9.9421.7414.86

        double fyt1Dob = Double.parseDouble(fiyat1) ;
        double fyt2Dob = Double.parseDouble(fiyat2) ;
        double fyt3Dob = Double.parseDouble(fiyat3) ;

        System.out.println(  "Ortalama fiyat : " +   ( fyt1Dob +fyt2Dob +fyt3Dob)/3   );


        // int data turunun alabilecegi en buyuk degeri yazdirin
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308

        char chr = 'a';

        // verilen chr degeri buyuk harf ise true, degilse false yazdirin
        System.out.println(Character.isUpperCase(chr)); // false

        // verilen chr degeri sayi ise true, degilse false yazdirin
        System.out.println(Character.isDigit(chr)); // false

        // verilen chr degeri harf ise true, degilse false yazdirin
        System.out.println(Character.isLetter(chr)); // true
        System.out.println(Character.isAlphabetic(chr)); // true


        String str = "Java Candir";

        // str'i buyuk harflerle yazdirin
        System.out.println(   str.toUpperCase()   ); // JAVA CANDIR


        chr = 'c';

        // chr variable'inin degerini buyuk harf olarak yazdirin
        System.out.println(Character.toUpperCase(chr)); // C


    }
}
