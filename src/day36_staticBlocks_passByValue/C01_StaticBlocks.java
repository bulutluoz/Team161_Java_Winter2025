package day36_staticBlocks_passByValue;

public class C01_StaticBlocks {

    static {
        System.out.println("yukardaki static blok calisti");
        /*
            eger birden fazla static blok varsa
            tum static bloklar main method'dan once calisir

            static bloklar kendi aralarinda
            ustteki oncve calisacak sekilde siralanir
         */
    }


    C01_StaticBlocks(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        /*
            java calismaya main method'dan baslar

            constructor obje olusturuldugunda,
            method ise method call oldugunda calisir
            yoksa calismaz
         */
        // C01_StaticBlocks obj = new C01_StaticBlocks();
        // method1();

    }

    public static void method1(){
        System.out.println("method calisti");
    }

    static {
        System.out.println("static blok calisti");

        /*
            static bloklar class'daki herseyden
            hatta main method'dan bile ONCE CALISIR

            EGER class calismaya baslamadan ONCE
            yapilmasi gereken bir ayar
            veya deger atanmasi gereken bir variable varsa
            (pre-condition) bunlari yapabilmek icin static blok kullanilir.
         */
    }




}
