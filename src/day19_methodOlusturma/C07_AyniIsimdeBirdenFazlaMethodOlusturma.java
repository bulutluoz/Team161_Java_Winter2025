package day19_methodOlusturma;

public class C07_AyniIsimdeBirdenFazlaMethodOlusturma {

    /*
        1- Bir class'da birbiri ile tamamen ayni olan
           birden fazla method OLUSTURULAMAZ

        2- method'da parametre olarak kullanilan
           variable'larin isimlerinin degisik olmasi
           method'lari birbirinden farkli hale GETIRMEZ

        3- Java bir method'u method SIGNATURE'i ile tanimlar
           java'daki signature = method ismi + parametrelerin data turlerinin siralamasi
           olarak tanimlanabilir

        4- Bir class'da ayni isimde birden fazla method olusturabilmek icin
           method'larin signature'larini farklilastirmaliyiz

        5- Bir class'da signature'i farklilastirarak
           AYNI ISIMDE birden fazla method olusturmaya
           OVERLOADING denir

           diger bir deyisle

           Overloading, bir class'da ismi ayni, signature'lari farkli
           method'lar olusturmak demektir.
     */

    public static void main(String[] args) {

        toplama(4,5);


    }

    // bir class'da ayni isimde birden fazla method olusturulailir mi ?

    public static void toplama(int sayi1 , int sayi2){ // toplama int int
        System.out.println("2 int toplami : " + (sayi1+sayi2));
    }

//    public static void toplama(int a , int b){ // toplama int int
//        System.out.println("2 int toplami : " + (a+b));
//    }

    public static void toplama(int a ){ // toplama int
        System.out.println("1 int toplami : " + (a+a));
    }

    public static void toplama(int a , int b, int c){ // toplama int int int
        System.out.println("3 int toplami : " + (a+b));
    }

    public static void toplama(int a , double b){ // toplama int double
        System.out.println("int ve double toplami : " + (a+b));
    }

    public static void toplama(double a , int b){ // toplama double int
        System.out.println("double ve int toplami : " + (a+b));
    }

    public static void toplama(double a , double b){ // toplama int int
        System.out.println("2 double toplami : " + (a+b));
    }


}
