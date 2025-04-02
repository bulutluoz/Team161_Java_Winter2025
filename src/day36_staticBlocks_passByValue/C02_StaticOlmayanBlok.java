package day36_staticBlocks_passByValue;

public class C02_StaticOlmayanBlok {


    C02_StaticOlmayanBlok(){
        System.out.println("constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");

        C02_StaticOlmayanBlok obj1 = new C02_StaticOlmayanBlok();

        System.out.println("obj1 olusturma islemi tamamlandi");

        C02_StaticOlmayanBlok obj2 = new C02_StaticOlmayanBlok();

        System.out.println("obj2 olusturma islemi tamamlandi");

        C02_StaticOlmayanBlok obj3 = new C02_StaticOlmayanBlok();
    }


    public static void method1(){
        System.out.println("method1 calisti");
    }

    static {
        System.out.println("static blok calisti");
    }

    {
        System.out.println("static olmayan blok calisti");
    }
    /*
        static bloklar CLASS CALISMAYA BASLAMADAN yapilacak on hazirliklar icin kullanilir

        ayni sekilde, static olmayan bloklar da
        OBJE OLUSTURMADAN YAPILMASI GEREKEN on hazirliklar icin kullanilir
     */



}
