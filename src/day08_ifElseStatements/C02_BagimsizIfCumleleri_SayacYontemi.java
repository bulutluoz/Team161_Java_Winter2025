package day08_ifElseStatements;

import java.util.Scanner;

public class C02_BagimsizIfCumleleri_SayacYontemi {

    public static void main(String[] args) {

         /*
            Kullanicidan bir tamsayi isteyip
            asagida verilen 4 sarti kontrol edin
            ve istenenleri yazdirin

            Eger 4 kontrolden HICBIRI'nde if body calisip mesaj yazdirilmazsa
            "Nasil sayi sectin, hicbir sarti saglamiyor" yazdirin

            Eger 4 kontrolun HEPSINDE if body calisirsa
            "Aferin cok guzel sayi secmissin" yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();
        int sayac = 0;



        // girilen tamsayi 5'in kati ise "sayi 5'e bolunuyor" yazdirin
        if ( sayi % 5 == 0){
            System.out.println("sayi 5'e bolunuyor");
            sayac++;
        }

        // sayi 100'den buyukse "buyuk sayi girdiniz" yazdirin
        if (  sayi > 100 ){
            System.out.println("buyuk sayi girdiniz");
            sayac++;
        }

        // sayi 1000'den buyukse "guzel sayi" yazdirin
        boolean sonuc = sayi > 1000;
        if (sonuc) {
            System.out.println("guzel sayi");
            sayac++;
        }

        // sayi cift sayi ise "Cift sayilari severim" yazdirin
        if (  sayi % 2 == 0 ){
            System.out.println("Cift sayilari severim");
            sayac++;
        }

        /*
         2.yontem sayac yontemi
         baslangicta sayac variable'ina 0 degeri atadik
         sona geldigimizde sayac 0, 1, 2, 3, 4 olabilir
         eger sayac sonda 0 ise ==> hicbir if body'si devreye girmedi
         eger sayac sonda 4 ise ==> butun if body'leri devreye girdi

         sona geldigimizde sayacin degerine gore
         kac tane if body'sinin devreye girdigini bulabiliriz

         */




        //            Eger 4 kontrolden HICBIRI'nde if body calisip mesaj yazdirilmazsa
        //            "Nasil sayi sectin, hicbir sarti saglamiyor" yazdirin

        if (sayac == 0) System.out.println("Nasil sayi sectin, hicbir sarti saglamiyor");


        //            Eger 4 kontrolun HEPSINDE if body calisirsa
        //            "Aferin cok guzel sayi secmissin" yazdirin

        if (sayac == 4) System.out.println("Aferin cok guzel sayi secmissin");


    }
}
