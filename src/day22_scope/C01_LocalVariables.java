package day22_scope;

public class C01_LocalVariables {

    public static void main(String[] args) {
        /*
            Bir kod blogu icerisinde olusturulan variable'lara LOCAL VARIABLE denir
            1- Local variable'lar sadece icerisinde olusturulduklari
               kod blogu icerisinde kullanilabilirler.
            2- bir kod blogu icerisinde ayni isimde 2 variable deklare EDILEMEZ
               farkli kod bloklari ayni isimde variable'lar bulundurabilir
               her variable kendi kod blogunda gecerli olur
            3- Loop'larin da kendi scope'lari { } vardir
               ve loop icerisinde olusturulan bir variable'in scope'u
               loop'un { } arasidir, loop disinda kullanilamaz
            4- Main method icerisinde olusturulan variable'lar
               yine main method icerisinde olusturulan loop'larin icerisinde de kullanilabilir

         */

        int sayiMain = 23;

        int sayi = 10;
        //int sayi = 23; // Variable 'sayi' is already defined in the scope


        for (int i = 0; i <5 ; i++) {
            System.out.print(i + " ");
            String str = "Java candir";
            System.out.println(str);
            System.out.println(sayi);
            System.out.println(sayiMain);
        }

        // System.out.println(i);
        // System.out.println(str);


    }


    public static void method1(){

        // System.out.println(sayiMain);
        int sayi = 45;


    }


    public void method2(){

        // System.out.println(sayiMain);
        int sayi = 50;

    }

}
