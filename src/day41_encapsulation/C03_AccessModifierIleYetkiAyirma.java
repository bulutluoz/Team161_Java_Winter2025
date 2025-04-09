package day41_encapsulation;

import day40_stringBuilder_accessModifier.C04_AccessModifier;

public class C03_AccessModifierIleYetkiAyirma {

    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();

        /*
            Access modifier ile

            bir class uyesine deger atama yetkisi ile
            o class uyesini goruntuleme yetkisini
            birbirinden AYIRAMAYIZ
         */

        // baska bir class'dan private class uyelerine ulasilamaz
        // System.out.println(obj.strSPri);
        // obj.strSPri = "";
        // obj.methodPrivate();


        // Default access modifier'a sahip olan class uyelerine
        // package disindan Ulasilamaz
        // Cannot be accessed from outside package
        // System.out.println(obj.intSDef);
        // obj.intSDef = 23;
        // obj.methodDefaultAccMod();


        // Protected access modifier'a sahip class uyelerine
        // kendi package'indakiler ve
        // baska package'daki child class'lar ulasabilir
        // bu class baska package altinda ve child class degil
        // System.out.println(obj.intIPro);
        // obj.intIPro = 45;


        obj.strIPub = "Tava";
        System.out.println(obj.strIPub);

    }
}
