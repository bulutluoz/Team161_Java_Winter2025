package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_SayilariToplama {

    public static void main(String[] args) {
        // Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        //         Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        //         toplam 500'u gecerse veya kullanici 0'a basarsa
        //         kac adet pozitif tam sayi girdigini
        //         ve bunlarin toplaminin kac oldugunu yazdirin
        //         Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        //         bu negatif sayiyi, sayi adedine ve toplama eklemeyin

        /*
            While loop'da dikkat etmemiz gereken 2 onemli konu var
            1- dongunun devamini saglayan deger (bu soruda sayi ve sayilarin toplami)
               dongu icerisinde degistirilmezse sonsuz loop olusur

            2- Eger dongunun devamini saglayan degiskene
               donguden once BIZ deger atamasi yapiyorsak
               verdigimiz degerin dongunun calismasini saglayacak bir deger olmasini saglamaliyiz
               aksi takdirde dongu calisir ama loop body'si hic devreye girmeden loop biter
         */

        Scanner scanner = new Scanner(System.in);
        int sayi = 10;
        int sayilarinToplami = 0;
        int sayac = 0;

        while ( sayilarinToplami<=500 && sayi !=0 ){ // calismasi icin gerekli sarti yaziyoruz

            System.out.println("Toplanmak uzere pozitif tamsayi giriniz,\nbitirmek icin 0'a basiniz");
            sayi = scanner.nextInt(); // burada kullanicidan yeni bir sayi aldik
                                      // alinan sayiyi yeniden gozden gecirip
                                      // durumuna gore uygun islemi yapmaliyiz

            if (sayi > 0){
                sayilarinToplami += sayi;
                sayac++;
            } else if (sayi<0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }

        }

        System.out.println("Girilen " + sayac + " adet pozitif sayinin toplami : " + sayilarinToplami);



    }
}
