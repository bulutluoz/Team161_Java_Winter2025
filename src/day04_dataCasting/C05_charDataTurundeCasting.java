package day04_dataCasting;

public class C05_charDataTurundeCasting {

    public static void main(String[] args) {

        /*
            char data turu ASCII table'daki kodlari kullanir
            her bir char karakterin matematiksel bir karsiligi OLDUGU ICIN

            char data turu MATEMATIKSEL ISLEMDE kullanilirsa
            ASCII table'daki sayisal degeri ile isleme girer
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


//        chr = bl;
//        chr = (char)bl;
//
//        chr = str;
//        chr = (char)str;

        chr = (char)byt;
        chr = (char)shrt;
        chr = (char)sayiInt;
        chr = (char)lng;
        chr = (char)flt;
        chr = (char)dbl;


        byt = (byte)chr;
        shrt = (short)chr;
        sayiInt = chr;
        lng = chr;
        flt = chr;
        dbl = chr;


        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println( chr1 + chr2  ); // 97 + 98 ==> 195


        System.out.println(  'H'  > 'C'  ); //  72 > 67 ==> true

        System.out.println(  'b' > 'B' ); // 98 > 66 ==> true


        // verilen bir char karakterden sonraki 3 karakteri yazdirin
        // orn :   input = 'm'  ise output => n o p

        char verilenKarakter = 'K';

        System.out.println(  (char)(verilenKarakter+1 ) );
        System.out.println(  (char)(verilenKarakter+2)  );
        System.out.println(  (char)(verilenKarakter+3)  );



    }
}
