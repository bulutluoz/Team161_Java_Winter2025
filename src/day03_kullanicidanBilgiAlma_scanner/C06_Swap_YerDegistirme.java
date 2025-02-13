package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C06_Swap_YerDegistirme {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tamsayiyi giriniz ...");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz ...");
        int sayi2 = scanner.nextInt();

        int temp = 0;

        temp = sayi2 ;

        sayi2 = sayi1 ;

        sayi1 = temp;

        System.out.println("Sayilarin yerini degistirdim, \nsayi1 : " + sayi1 + ", sayi2 : " + sayi2);

        // bos kova olmadan variable'larin degerini degistirin


    }
}
