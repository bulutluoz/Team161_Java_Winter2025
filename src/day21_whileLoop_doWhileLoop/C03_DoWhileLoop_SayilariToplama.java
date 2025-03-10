package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_DoWhileLoop_SayilariToplama {

    public static void main(String[] args) {
        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         toplam 500'u gecerse veya kullanici 0'a basarsa
        //         kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int sayilarinToplami = 0;
        int sayac = 0;

        /*
            Eger dongumuz kullanicidan alinan bir degere bagli iken
            donguden once biz o variable'a yanlis deger atamasi yaparsak
            loopBody hic devreye GIRMEYEBILIR

            Bu durumun onune gecmek icin
            Java Do While loop'u olusturmustur

            Do while loop'da kontrol yapilmadan once loop body 1 kez calisir
            boylece biz yanlis deger versek bile
            kullanicidan deger alinmis olur
         */


        do {

            System.out.println("Toplanmak uzere pozitif tamsayi giriniz,\nbitirmek icin 0'a basiniz");
            sayi = scanner.nextInt();
            if (sayi > 0){
                sayilarinToplami += sayi;
                sayac++;
            } else if (sayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }

        }while(sayilarinToplami<=500 && sayi !=0);

        System.out.println("Girilen " + sayac + " adet pozitif sayinin toplami : " + sayilarinToplami);


    }
}
