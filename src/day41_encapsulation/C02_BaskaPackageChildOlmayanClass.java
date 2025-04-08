package day41_encapsulation;

import day40_stringBuilder_accessModifier.C04_AccessModifier;

public class C02_BaskaPackageChildOlmayanClass {

    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();

        //System.out.println(obj.strSPri); // sadece variable'in oldugu class'dan kullanilabilir
        //obj.strSPri = "Hava guzel"; // sadece variable'in oldugu class'dan kullanilabilir

        //System.out.println(obj.intSDef);
        //System.out.println(obj.intSDef);// sadece variable'in oldugu package'dan kullanilabilir
        //obj.intSDef = 89;
        //System.out.println(obj.intSDef);// sadece variable'in oldugu package'dan kullanilabilir

        //System.out.println(obj.intIPro); // hem baska packa'de hem de child degil
        //obj.intIPro = 67;// hem baska packa'de hem de child degil

        obj.strIPub = "Yan";
        System.out.println(obj.strIPub);

        //obj.methodPrivate(); // sadece method'un oldugu class'dan kullanilabilir
        // obj.methodDefaultAccMod();
        //System.out.println(obj.intSDef);// sadece method'un oldugu package'dan kullanilabilir
        // obj.methodProtected();// hem baska packa'de hem de child degil
        obj.methodPublic();
    }
}
