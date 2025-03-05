package day18_methodOlusturma;

public class C05_SifreKontrolu {

    //Soru 4 : verilen bir sifre icin
    //         asagidaki sartlari kontrol eden
    //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyen bir method olusturun
    //         eger sifre tum sartlari saglarsa,
    //         method "sifre basariyla kaydedildi" yazdirmalidir
    //         - ilk harf kucuk harf olmali
    //         - son karakter rakam olmali
    //         - sifre bosluk icermemeli
    //         - uzunlugu en az 10 karakter olmali

    public static void main(String[] args) {

        sifreKontrolEt("Yalan bunlar");
        //ilk harf kucuk harf olmali
        //son karakter rakam olmali
        //sifre bosluk icermemeli
        System.out.println("========");

        sifreKontrolEt("ne diyorsak o");
        //son karakter rakam olmali
        //sifre bosluk icermemeli

        System.out.println("========");

        sifreKontrolEt("javaKraldir44");
        // sifre basariyla kaydedildi

    }

    public static void sifreKontrolEt(String sifre){

        int flag = 10;

        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);

        if ( ! Character.isLowerCase(ilkHarf) ){

            System.out.println("ilk harf kucuk harf olmali");
            flag = 11;
        }

        //         - son karakter rakam olmali

        char sonKarakter = sifre.charAt(  sifre.length() -1 );

        if ( sonKarakter<'0' || sonKarakter>'9' ){
            System.out.println("son karakter rakam olmali");
            flag = 11;
        }

        //         - sifre bosluk icermemeli

        if ( sifre.contains(" ") ){
            System.out.println("sifre bosluk icermemeli");
            flag = 11;
        }

        //         - uzunlugu en az 10 karakter olmali

        if (  !(sifre.length() >= 10)  ){

            System.out.println("uzunlugu en az 10 karakter olmali");
            flag =11;
        }

        /*
            Sona gelindiginde, flag 10 veya 11 degerini alabilir
            flag == 10 ==> hic bir hata mesaji yazdirilmadi demektir
            flag == 11 ==> hata mesaji yazdirildi, ama kac mesaj yazdirildigini bilemeyiz
         */

        if ( flag == 10) System.out.println("sifre basariyla kaydedildi");


    }
}
