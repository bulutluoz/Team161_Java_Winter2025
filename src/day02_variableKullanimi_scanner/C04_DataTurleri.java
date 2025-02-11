package day02_variableKullanimi_scanner;

public class C04_DataTurleri {

    public static void main(String[] args) {


        boolean bl1 = true;
        boolean bl2 = false;

        // boolean bl3 = "true"; Java "" icindeki herseyi String yani metin olarak kabul eder


        char chr1 = 'e';
        char chr2 = '5';
        char chr3 = '$';
        //char chr4 = 'a '; // Too many characters in character literal
                          // char tek bir karaktere izin verir

        char chr5 = ' ';
        //char chr6 = "s"; // char ' kullanir


        byte byt1 = 20;     // hafizada 8 bit yer isgal eder
        short shr1 = 20;    // hafizada 16 bit yer isgal eder
        int sayi1 = 20;     // hafizada 32 bit yer isgal eder
        long lng1 = 20;     // hafizada 64 bit yer isgal eder


        int sayi2 = -1987654321;    // hafizada 32 bit yer isgal eder
        int sayi3 = -234567;        // hafizada 32 bit yer isgal eder
        int sayi4 = 0;              // hafizada 32 bit yer isgal eder
        int sayi5 = 45678910;       // hafizada 32 bit yer isgal eder


        float fl1 = 4.6f;
        float fl2 = 5678.8765F;

        double dbl1 = 34.678;
        double dbl2 = 45;

        float fl3 = 20;
        float fl4 = 3;

        System.out.println(  fl3 / fl4    );  // 6,666666666666666666666 ==> 6.6666665
        // float virgulden sonra 6 veya 7 karakter tutar



        double dbl3 = 20;
        double dbl4 = 3;

        System.out.println(  dbl3 / dbl4  ); // 6.666666666666667
        // double virgulden sonra 15 veya 16 karakter tutar


        String str1 = "Java Candir";

        System.out.println(  str1.toLowerCase()  ); // java candir

        System.out.println( str1.toUpperCase() ); // JAVA CANDIR

        int sayi8 = 66;

        /*
            non-primitive data turundeki variable'lar
            deger ile birlikte HAZIR METHOD'lar da barindirirlar

            ama primitive data turundeki variable'lar
            SADECE deger barindirirlar
         */




    }
}
