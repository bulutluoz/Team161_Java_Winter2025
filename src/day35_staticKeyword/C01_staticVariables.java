package day35_staticKeyword;

import day34_constructorCall.C02_Hastane;

public class C01_staticVariables {


    public static void main(String[] args) {

        // static variable'lar clas variable'lari olarak da adlandirilir
        // baska class'lardan kullanirken
        // classIsmi ile kullanabilirsiniz

        System.out.println(C02_Hastane.hastaneAdresi);
        C02_Hastane.bashekim = "Dr Sinan";

        // instance variable'lar obje'ye baglidir
        // ve classIsmi ile kullanilamaz
        //
        // C02_Hastane.perIsmi = "Merve";

        C02_Hastane per1 = new C02_Hastane();
        per1.persIsmi = "Merve";

        C02_Hastane per2 = new C02_Hastane();
        per2.persIsmi = "Fulya";

        per2.bashekim = "Cennet";
        // Static member 'bashekim' accessed via instance reference



    }
}
