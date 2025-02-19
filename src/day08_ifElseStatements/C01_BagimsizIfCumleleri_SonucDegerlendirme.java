package day08_ifElseStatements;

import java.util.Scanner;

public class C01_BagimsizIfCumleleri_SonucDegerlendirme {

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



        // girilen tamsayi 5'in kati ise "sayi 5'e bolunuyor" yazdirin
        if ( sayi % 5 == 0){
            System.out.println("sayi 5'e bolunuyor");
        }

        // sayi 100'den buyukse "buyuk sayi girdiniz" yazdirin
        if (  sayi > 100 ){
            System.out.println("buyuk sayi girdiniz");
        }

        // sayi 1000'den buyukse "guzel sayi" yazdirin
        boolean sonuc = sayi > 1000;
        if (sonuc) {
            System.out.println("guzel sayi");
        }

        // sayi cift sayi ise "Cift sayilari severim" yazdirin
        if (  sayi % 2 == 0 ){
            System.out.println("Cift sayilari severim");
        }

        // 1. yontem TUM sartlarin tersini (!) tek bir if ile kontrol edebiliriz

        if (  !(sayi % 5 == 0) && !(sayi > 100) &&  !sonuc  &&   !(sayi % 2 == 0)   ){
            System.out.println("Nasil sayi sectin, hicbir sarti saglamiyor");
        }


    }
}
