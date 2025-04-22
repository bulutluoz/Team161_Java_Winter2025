package day48_abstractClasses_interface;

import java.util.ArrayList;
import java.util.List;

public class K07_MultipleInheritance extends K06_ConcreteParent
                                     implements I05_Interface,I03_Interface{




    public static void main(String[] args) {

        // Java'da multiple inheritance yoktur
        // Yani bir class extends ile birden fazla class'i
        // INHERIT EDEMEZ
        // ANCAKKK implements keyword ile birden fazla
        // Interface'e implement edebilir
        // (Ayni isimde farkli return type'a sahip method'lar olmadigi surec e)


        // System.out.println(sayi1);
        // Reference to 'sayi1' is ambiguous, both 'K06_ConcreteParent.sayi1' and 'I05_Interface.sayi1' match

        System.out.println(I03_Interface.sayi1);
        System.out.println(I05_Interface.sayi1);
        K06_ConcreteParent.sayi1 = 45;

        // birden fazla interface'de veya parent class'da ayni isimde variable'lar varsa
        // Java hangisini tercih ettigimizi bilmek ister
        // tek basina sayi1 degil I03.sayi1 veya K06.sayi1 yazmaliyiz

        System.out.println(sayi9);
        // variable tek ise , cakisma olmayacagi icin
        // direk variable ismi ile kullanabiliriz


        // K07 constructor'i ile kac farkli sekilde obje olusturabiliriz?
        K07_MultipleInheritance obj1 = new K07_MultipleInheritance();
        K06_ConcreteParent obj2 = new K07_MultipleInheritance();
        I03_Interface obj3 = new K07_MultipleInheritance();



    }



    /*
            Method'lara gelince...

            multiple interface'de sorun olmaz
            I05 ===> child class'larda method1() olsun diyor
            I03 ===> child class'larda method1() olsun diyor
            child class method1() olusturursa
            iki interface'de mutlu olur


            ANCAKKKKKK
            2 interface'de ayni isimde ama farkli return type'i olan
            method OLAMAZ
            I05 ===> gezmeye git ama donuste MUTLAKA int getir diyor
            I03 ===> gezmeye git ama sakin bir sey alip gelme diyor
            ikisini birden mutlu etmek mumkun degil

         */
    @Override
    public void method1() {


    }


    @Override
    public String method3() {
        return null;
    }

    @Override
    public void method5() {

    }


    @Override
    public int method8() {
        return 0;
    }

    @Override
    public void method2() {

    }

}
