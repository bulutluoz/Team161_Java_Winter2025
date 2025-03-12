package day23_scope;

import java.util.Scanner;

public class C01_ClasLevelVariables {

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    /*
        main method static oldugu icin
        static olmayan variable'larin main method'dan direkt kullanilmasina IZIN VERMEZ

        eger static bir method'un icinden
        static olmayan bir variable'i kullanmak isterseniz
        kullanmak istediginiz instance variable'in icinde oldugu class'dan bir obje olusturmalisiniz

        local variable'lar deger atamasi yapilmadan deklare edilebilir
        ANCAKK deger atamasi yapilmadan KULLANILAMAZ

        Class level variable'lar ister static ister instance olsun
        deger atamasi yapilmadan deklare edilebilir ve KULLANILABILIR

        Class level bir variable'a kodu yazan kisi deger atamasi yapmazsa
        Java default(varsayilan) deger kullanir

        Java'nin belirledigi default degerler sunlardir :
        String ve diger tum non-primitive'ler icin : null
        sayisal primitive'ler icin : 0   (byte, short, int, long, float, double)
        boolean : false
        char : hiclik


     */


    public static void main(String[] args) {
        System.out.println("strS : " + strS); // Ali
        System.out.println("sayiS : " +sayiS); // 0
        System.out.println("chrS : " + chrS); // #
        System.out.println("blS : " +blS); // false

        C01_ClasLevelVariables obj = new C01_ClasLevelVariables();

        System.out.println("strI : "  + obj.strI); // null
        System.out.println("sayiI : "  +obj.sayiI); // 10
        System.out.println("chrI : "  +obj.chrI); // hiclik
        System.out.println("blI : "  +obj.blI); // true


    }

    public static void method1(){
        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);

        C01_ClasLevelVariables obj1 = new C01_ClasLevelVariables();
        System.out.println(obj1.strI);
        System.out.println(obj1.sayiI);
        System.out.println(obj1.chrI);
        System.out.println(obj1.blI);
    }

    public void method2(){

        System.out.println(strS);
        System.out.println(sayiS);
        System.out.println(chrS);
        System.out.println(blS);

        System.out.println(strI);
        System.out.println(sayiI);
        System.out.println(chrI);
        System.out.println(blI);
    }


}
