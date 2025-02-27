package day14_stringmanipulations;

import java.util.Scanner;

public class C05_SifreKontrolu {

    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        int flag = 10;

        /*
            Tum hatalari yazdirmamizi istediginden
            bagimsiz if cumleleri kullanmaliyiz

            bagimsiz if cumlelerinde
            sona gelindiginde tum sartlari sagladigini kontrol edebilmek icin
            flag veya sayac yontemlerini kullanabiliriz

            biz flag yapmaya karar verdik

         */

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
