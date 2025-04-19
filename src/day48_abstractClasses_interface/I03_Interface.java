package day48_abstractClasses_interface;

public interface I03_Interface {

    // tum variable'lar public, static ve final'dir
    // basinda bu keyword'ler kullanilmasa da tum variable'lar
    // bu ozellikleri tasir

    public static final int SAYI1 = 10; // public static final
    public final int sayi2 = 30; // public static final
    static final int sayi3 = 230; // public static final
    public static int sayi4 = 40; // public static final
    public int sayi5= 56; // public static final
    int sayi6 = 89; // public static final

    // int sayi7;
    // Variable 'sayi7' might not have been initialized
    // interface'de tum variable'lar final oldugundan
    // sonradan deger atanamaz
    // baslangicta da deger atanmazsa
    // variable anlamsiz olur


    // tum method'lar public ve abstract'dir
    // basinda bu keyword'lerin kullanilmadigi tum method'lar
    // da bu ozellikleri tasir

    public abstract void method1();
    abstract void method2();
    public void method3();
    // void method4(){};
    // Interface abstract methods cannot have body
    void method5();



}
