package day49_interface_exception;

public interface I01_Interface {

    /*
        interface full abstraction saglar

        method'larin basina abstract yazmasak da
        java interface icinde olusturulan method'lari abstract olarak tanimlar

        AMMMMAAAA
        istisnai olarak
        child class'larin implement etmesi zorunlu olmayan
        method'lar olusturmak isterseniz
        Java'nin belirledigi iki anahtar kelimeyi kullanabilirsiniz

        Bu anahtar kelimeleri kullandiginizda
        Java onlarin istisnai method oldugunu bilir
        child class'larin implement etmesi mecbur olmasin diye
        bu method'lar body olusturulmasina izin verir

        bu iki keyword : default ve static'dir
        bu iki keyword'u kullandiginiz method'lar
        abstract olarak tanimlanamaz
        ve body'leri olmak zorundadir
     */

    // void method1(){}
    // Interface abstract methods cannot have body

    void method2();
    int method3();
    public String method4();
    abstract double method5();

    void yeniMethod();


    public default void method7(){
        System.out.println("bu method default keyword kullandigi icin, " +
                "child class'larin implement etmesi zorunlu degil");
    }

    public static void method8(){
        System.out.println("Bu method static keyword kullandigi icin," +
                "interface icinde olmasina ragmen body'si vardir");
    }

    // public static abstract void method9();
    // Illegal combination of modifiers: 'abstract' and 'static'

    // public static void method9();
    // Static methods in interfaces should have a body
}
