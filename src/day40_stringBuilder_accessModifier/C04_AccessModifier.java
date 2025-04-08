package day40_stringBuilder_accessModifier;

public class C04_AccessModifier {
    /*
        Clas uyeleri (method'lar, constructor'lar veya class level variable)
        olusturulurken MUTLAKA access modifier BELIRTILMELIDIR

     */

    public C04_AccessModifier(){

    }

    private C04_AccessModifier(int sayi){

    }

    public String strIPub = "Java";
    private static String strSPri ;
    protected int intIPro;
    // default static int intS = 20;
    // Modifier 'default' not allowed here
    // default access modifier yazilmaz
    // eger bir class uyesinin onunde public, protected veya private  yazmiyorsa
    // o class uyesinin access modifier'i default access modifier'dir.
    static int intSDef = 20;
    char chrI = 'a';
    static char chrS ;
    boolean blI;
    static  boolean blS = true;

    public static void methodPublic(){

    }

    protected static void methodProtected(){

    }

    static void methodDefaultAccMod(){

    }

    private static void methodPrivate(){

    }

    void method(){
        System.out.println(strSPri);
        strSPri = "Hava guzel";

        System.out.println(intSDef);
        intSDef = 89;

        System.out.println(intIPro);
        intIPro = 67;

        strIPub = "Yan";
        System.out.println(strIPub);

        methodPrivate();
        methodDefaultAccMod();
        methodProtected();
        methodPublic();

    }


}
