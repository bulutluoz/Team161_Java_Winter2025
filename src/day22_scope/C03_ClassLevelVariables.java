package day22_scope;

public class C03_ClassLevelVariables {
    /*
        Class level'da olusturulan variable'larin scope'u TUM CLASS'dir
        yani biz tum class'dan bu variable'lari kullanabiliriz

        ANCAAAAKKKK class level variable'lar
        tanimlanirken static keyword kullanilip kullanilmamasina gore
        class icerisinden erisim yontemleri DEGISIR

        static keyword kullanmayan variable'lar Instance olarak adlandirilir.

        NOT : local variable'larda static keyword KULLANILAMAZ

        EGER variable static ise her method'dan direkt kullanilabilir
        strS, sayiS, chrS, blS static olan veya olmayan tum method'lardan kullanilabiliyor

        AMA variable static degilse
        o zaman secim hakki method'a gecer
        method static ise, static olmayan hicbir seyi sinirlarindan iceri sokmaz
        main method ve method1'de strI, sayiI, chrI, blI

        static olmayan method'larin secim hakki olmaz
        tum variable'lar static olmayan method'lardan kullanilabilir
     */

    String strI;
    static String strS = "Ali";
    int sayiI = 10;
    static int sayiS;
    char chrI;
    static char chrS = '#';
    boolean blI = true;
    static boolean blS;

    public static void main(String[] args) {
//        System.out.println(
//               strS + " " + strI + " " + sayiS + " " + sayiI + " " + chrS + " " + chrI
//               + " " + blS + " " + blI
//        );
        method1();
        //method2(); // main method static oldugundan, static olmayan method2'yi sinirlari icinde istemez
    }

    public static void method1(){
//        System.out.println(
//                strS + " " + strI + " " + sayiS + " " + sayiI + " " + chrS + " " + chrI
//                + " " + blS + " " + blI
//        );
        //method2();// method1 static oldugundan, static olmayan method2'yi sinirlari icinde istemez
    }

    public void method2(){
        System.out.println(
                strS + " " + strI + " " + sayiS + " " + sayiI + " " + chrS + " " + chrI
                + " " + blS + " " + blI
        );
        method1();
    }
}
