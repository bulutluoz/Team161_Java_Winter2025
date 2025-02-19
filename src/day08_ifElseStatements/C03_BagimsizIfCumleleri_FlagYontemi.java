package day08_ifElseStatements;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri_FlagYontemi {

    public static void main(String[] args) {


         /*
            Kullanicidan bir tamsayi isteyip
            asagida verilen 4 sarti kontrol edin
            ve istenenleri yazdirin

            Eger 4 kontrolden HICBIRI'nde if body calisip mesaj yazdirilmazsa
            "Nasil sayi sectin, hicbir sarti saglamiyor" yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int flag = 20;

        // girilen tamsayi 5'in kati ise "sayi 5'e bolunuyor" yazdirin
        if ( sayi % 5 == 0){
            System.out.println("sayi 5'e bolunuyor");
            flag = 40;
        }

        // sayi 100'den buyukse "buyuk sayi girdiniz" yazdirin
        if (  sayi > 100 ){
            System.out.println("buyuk sayi girdiniz");
            flag = 40;
        }

        // sayi 1000'den buyukse "guzel sayi" yazdirin
        boolean sonuc = sayi > 1000;
        if (sonuc) {
            System.out.println("guzel sayi");
            flag = 40;
        }

        // sayi cift sayi ise "Cift sayilari severim" yazdirin
        if (  sayi % 2 == 0 ){
            System.out.println("Cift sayilari severim");
            flag = 40;
        }

        /*
            Basta flag variable'ina 20 degerini verdik
            bagimsiz if cumlelerinin body'lerinde ise hep flaf'a 40 degerini atadik

            sona geldigimizde
            flag 20 veya 40 degerlerinden birine esit olacaktir

            flag == 20 ==> hicbir if body devreye girmedi
            flag == 40 ==> if body'lerinden calisan oldu AMMMAAA kac tanesinin calistigini bilmiyoruz
         */


        //            Eger 4 kontrolden HICBIRI'nde if body calisip mesaj yazdirilmazsa
        //            "Nasil sayi sectin, hicbir sarti saglamiyor" yazdirin

        if (  flag == 20 ) System.out.println("Nasil sayi sectin, hicbir sarti saglamiyor");

    }
}
