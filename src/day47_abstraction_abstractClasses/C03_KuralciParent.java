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
    public void method1(){

    }

    // method2'yi child class'larin istegine birakiyoruz
    // isterlerse direkt parent class'dan kullansinlar
    // isterlerse override etsinler
    public void method2(){

    }

    // method 3 child class'lar tarafindan
    // MUTLAKA override edilsin
    public void method3(){

    }

}
