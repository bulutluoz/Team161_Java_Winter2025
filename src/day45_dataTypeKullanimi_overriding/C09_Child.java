package day45_dataTypeKullanimi_overriding;

public class C09_Child extends C08_Parent{

    public void method1(){
        // Aralarinda parent-child iliskisi olan
        // iki class icerisinde
        // AYNI isim ve AYNI signature'a sahip
        // method'lar olusturulmasina
        // OVERRIDING denir
    }

    public void method3(){
        // ismi veya signature'i farkli olan method'lar icin
        // overriding'den bahsedilemez
    }

    public void method4(int sayi){
        // ismi veya signature'i farkli olan method'lar icin
        // overriding'den bahsedilemez
    }


    // overriding'in amaci
    // parent class'da var olan bir method'u
    // child class'in kendisine uyarlama ihtiyacidir

    // child class'daki method'a
    // overriding (gecersiz kilan) method denirken
    // parent class'daki method'a
    // overridden (gecersiz kilinan) method denir

    // parent class'daki method asagi yonlu ok ile isaretlenirken
    // child class'daki method yukari yonlu ok ile isaretlenir


    @Override
    public void method5() {
        // istersek overriding method'u intelliJ'e olusturtabiliriz
        // bu durumda intelliJ @Override notasyonu koyar
        // bu notasyon zorunlu degildir
        // ama faydali bir gorevi vardir
    }


    public void method6() {
        // @Override notasyonu
        // parent class'daki overridden method'u takip eder
        // Eger overridden method silinir
        // veya override etmeyi engelleyecek bir degisiklik yapilirsa
        // @Override notasyonu CTE verir

    }















}
