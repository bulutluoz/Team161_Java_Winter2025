package day50_exceptions;

import java.util.Scanner;

public class C04_CatchBlogundakiEninKullanimi {

    public static void main(String[] args) {

        /*
            catch blogunda yakalan exception
            e objesine kaydedilir
            objenin ismi e olmak zorunda degildir
            ama genelde e kullanilir

            e objesi olusturuldugu exception class'ina bagli olarak
            bazi hazir method'lara sahiptir

            exception yakalandiginda ne yapilacagi bize verilen goreve gore duzenlenir

            eger istenirse sadece bir hata mesaji yazdirilabilirken
            istenirse e objesi kullanilarak hataya ait bazi ipuclari da
            kullaniciya verilebilir
         */

        // kullanicidan bir tamsayi isteyip
        // karesini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");

        int sayi = 0;
        try {

            sayi = scanner.nextInt();
            System.out.println("Girilen sayinin karesi : " + sayi*sayi);
        } catch (Exception e) {
            // System.out.println("Tamsayi girmenizi istemistim....");


            /*
            e.printStackTrace();
                tum hatayi yazririr
                java.util.InputMismatchException
                at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                at java.base/java.util.Scanner.next(Scanner.java:1594)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
                at day50_exceptions.C04_CatchBlogundakiEninKullanimi.main(C04_CatchBlogundakiEninKullanimi.java:35)
             */

            System.out.println(e.getMessage()); // null

            System.out.println(e.toString()); // java.util.InputMismatchException

            System.out.println(e.getCause()); // null

        }




    }
}
