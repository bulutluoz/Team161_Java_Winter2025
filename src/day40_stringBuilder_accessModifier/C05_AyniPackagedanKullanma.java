package day40_stringBuilder_accessModifier;

public class C05_AyniPackagedanKullanma {


    public static void main(String[] args) {

        C04_AccessModifier obj = new C04_AccessModifier();

        //System.out.println(obj.strSPri); // sadece variable'in oldugu class'dan kullanilabilir
        //obj.strSPri = "Hava guzel"; // sadece variable'in oldugu class'dan kullanilabilir

        System.out.println(obj.intSDef);
        obj.intSDef = 89;

        System.out.println(obj.intIPro);
        obj.intIPro = 67;

        obj.strIPub = "Yan";
        System.out.println(obj.strIPub);

        // obj.methodPrivate(); // sadece method'un oldugu class'dan kullanilabilir
        obj.methodDefaultAccMod();
        obj.methodProtected();
        obj.methodPublic();


    }
}
