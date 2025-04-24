package day50_exceptions;

import java.util.Scanner;

public class C05_GirilenSayilariToplama {

    public static void main(String[] args) {

        // Kullanicidan girmek istedigi kadar tamsayi girmesini isteyin.
        // kullanici tamsayi disinda bir input girerse
        // kullaniciya uyari yazdirin ve o input'u isleme almayin.
        // Kullanici islemi bitirmek icin Q veya q'ya basmalidir.
        // Kullanici islemi bitirdiginde,
        // kac gecerli sayi girdigini ve girilen gecerli sayilarin toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);

        int girilenSayi = 0;
        int toplam = 0;
        int sayac = 0;
        String girilenSayiDisiDeger = "";

        // islemin kac kere tekrar edecegi belli olmadigindan while loop'u
        // islem icin kullanicinin oncelikle deger girmesini istedigimizden
        // do-while loop'u tercih ettik

        do {

            try {
                System.out.println("Lutfen toplanmak uzere bir tamsayi giriniz...");
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
                sayac++;

            } catch (Exception e) {
                // kod buraya geldiyse scanner.nextInt(); consola gittiginde tamsayi bulamamis
                // ve islem yapmadan exception firlatmis demektir

                girilenSayiDisiDeger = scanner.nextLine();

                if (girilenSayiDisiDeger.equalsIgnoreCase("q")){
                    break;
                }else {
                    System.out.println("Tamsayi deger girmelisiniz...");
                }


            }


        }while( ! girilenSayiDisiDeger.equalsIgnoreCase("Q")  ); // loop'un devam etmesi icin gerekli sart


        System.out.println("Girilen " + sayac + " adet tamsayinin toplami : " + toplam);
    }
}
