package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C02_KullanicidanDegerAlma {

    public static void main(String[] args) {

        // Kullanicidan bir double,
        // bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir ondalikli sayi giriniz...");
        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenTamsayi = scanner.nextInt();

        // girilen sayilarin toplamini yazdiralim
        System.out.println("Girilen sayilarin toplami : " +  (girilenOndalikliSayi + girilenTamsayi) );


        // girilen sayilarin carpimlarini yazdiralim

        System.out.println("Girilen sayilarin carpimi : " +  (girilenOndalikliSayi * girilenTamsayi) );


    }
}
