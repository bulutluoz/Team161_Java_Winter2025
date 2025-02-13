package day04_dataCasting;

public class C01_AutoWidening {

    public static void main(String[] args) {

        /*
            Java daha dar kapsamli data turundeki DEGERI
            daha genis kapsamli VARIABLE'a
            otomatik olarak atama yapar
            ve buna Auto-Widening (otomatik genisletme) denir
         */

        boolean bl = true;
        char chr = 'a';
        byte byt = 24;
        short shrt = 23;
        int sayiInt = 30;
        long lng = 40;
        float flt = 3.5F;
        double dbl = 4.5;
        String str = "Java Candir";


//        bl = chr;
//        bl = sayiInt;
//        bl = str;

//        str = bl;
//        str = chr;
//        str = lng;
//        str = dbl;



        // boolean ve String data turundeki bir variable'a
        // baska data turundeki bir degeri ATAYAMAZSINIZ
        //char data turunun spesifik bir durumu var, ilerde bagimsiz olarak inceleyecegiz


//        byt = shrt; // 23
//        byt = sayiInt; // 30
//        byt = lng; // 40
//        byt = flt; // 3.5F
//        byt = dbl; // 4.5


        shrt = byt;
//        shrt = sayiInt;
//        shrt = lng;
//        shrt = flt;
//        shrt = dbl;


        sayiInt = byt;
        sayiInt = shrt;
//        sayiInt = lng;
//        sayiInt = flt;
//        sayiInt = dbl;

        lng = byt;
        lng = shrt;
        lng = sayiInt;
//        lng = flt;
//        lng = dbl;

        flt = byt;
        flt = shrt;
        flt = sayiInt;
        flt = lng;
//        flt = dbl;

        dbl = byt;
        dbl = shrt;
        dbl = sayiInt;
        dbl = lng;
        dbl = flt;


        int sayi1 = 20;

        int sayi2 = sayi1 ;

        /*
            Casting bir variable'a farkli data turunden deger atamak demektir
            int bir variable'a , int bir deger atamasi yaparsaniz
            bu CASTING degil ATAMA'dir.
         */

    }
}
