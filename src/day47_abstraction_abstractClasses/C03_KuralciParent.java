package day47_abstraction_abstractClasses;

public abstract class C03_KuralciParent {

    /*
        Bir Class'i kendisini parent edinecek child class'lar icin
        Kural koyabilen bir hale getirmek icin
        oncelikle bu durumu class deklarasyonuna eklemeliyiz

        bunun icin class deklarasyonuna abstract keyword'u eklemeliyiz
     */

    // method 1 child class'lar tarafindan
    // MUTLAKA override edilsin
    /*
        Child class'larin mutlaka bulundurmasi gereken method'lar
        bildigimiz klasik method'lardan farkli olmalidir

        bu method'lar method olmaktan ziyade
        child class'larin uyacaklari kurallari belirten
        bir cumle gibi dusunulebilir

        biz burada sunu demek istiyoruz :
        Her child class'da MUTLAKA method1() olsun

     */
    public abstract void method1();
    // Abstract methods cannot have a body


    // method2'yi child class'larin istegine birakiyoruz
    // isterlerse direkt parent class'dan kullansinlar
    // isterlerse override etsinler
    public void method2(){

    }

    /*
        method'larda abstraction kullaninca
        method'lari abstract method'lar
        ve abstract olmayan method'lar diye ayirmak yerine

        abstract olmayan yapilara bunu belirten bir isim verelim denmis
        bu yapilari anlatirken "concrete" diyebiliriz
     */

    // method 3 child class'lar tarafindan
    // MUTLAKA override edilsin
    public abstract void method3();

}
