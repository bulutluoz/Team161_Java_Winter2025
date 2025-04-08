package day41_encapsulation;

import day40_stringBuilder_accessModifier.C04_AccessModifier;

public class C01_BaskaPackageChildClassdanUlasma extends C04_AccessModifier {

    public static void main(String[] args) {

        C01_BaskaPackageChildClassdanUlasma obj = new C01_BaskaPackageChildClassdanUlasma();

        //System.out.println(obj.strSPri); // sadece variable'in oldugu class'dan kullanilabilir
        //obj.strSPri = "Hava guzel"; // sadece variable'in oldugu class'dan kullanilabilir

        //System.out.println(obj.intSDef);// sadece variable'in oldugu package'dan kullanilabilir
        //obj.intSDef = 89; // sadece variable'in oldugu package'dan kullanilabilir

        System.out.println(obj.intIPro);
        obj.intIPro = 67;

        obj.strIPub = "Yan";
        System.out.println(obj.strIPub);

        //obj.methodPrivate(); // sadece method'un oldugu class'dan kullanilabilir
        //obj.methodDefaultAccMod(); // sadece method'un oldugu package'dan kullanilabilir
        obj.methodProtected();
        obj.methodPublic();


    }
}
