package day47_abstraction_abstractClasses;

public class C04_Child extends C03_KuralciParent{
    public void method1() {

    }

    @Override
    public void method3() {

    }

    // public void method5();
    // Missing method body, or declare abstract
    // Ya body ekle ya da class'i abstract yap
    // Kural : Concrete class icinde abstract method OLMAZ
    // Class kuralci olarak (abstract) tanimlanmadan
    // kural (abstract method) KOYAMAZ


    // Class 'C04_Child' must either be declared abstract
    // or implement abstract method 'method1()' in 'C03_KuralciParent'

    // C03 abstract bir yapi oldugu icin
    // YA C03'deki zorunlu method'lari kendine uyarla
    // YA DA C04'u de abstract yap


}
