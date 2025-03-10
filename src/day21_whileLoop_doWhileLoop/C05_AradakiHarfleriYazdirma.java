package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_AradakiHarfleriYazdirma {

    public static void main(String[] args) {

        // Soru 1- Kullanicidan baslangic ve bitis karakterlerini alip,
        //         o karakterleri ve aralarindaki karakterleri yazdirin.
        //         kullanici bir karakter degil bir metin girerse
        //         uyari verip, yeniden bir karakter girmesini isteyin
        //         kullanici karakter girinceye kadar tekrar isteyin


        Scanner scanner = new Scanner(System.in);
        char baslangic = 'a';
        char bitis = 'c';
        String girilenMetinBaslangic;
        String girilenMetinBitis;

        do {

            System.out.println("Baslangic degeri olarak bir karakter girin");
            girilenMetinBaslangic = scanner.nextLine();

            if (girilenMetinBaslangic.length() == 1){
                baslangic = girilenMetinBaslangic.charAt(0);
            } else {
                System.out.println("Baslangic olarak karakter girmelisiniz... ");
            }


            System.out.println("Bitis degeri olarak bir karakter giriniz...");
            girilenMetinBitis = scanner.nextLine();

            if (girilenMetinBitis.length() == 1){
                bitis = girilenMetinBitis.charAt(0);
            } else {
                System.out.println("Bitis olarak karakter girmelisiniz...");
            }


        }while ( girilenMetinBaslangic.length() !=1 || girilenMetinBitis.length() != 1   ); // loop'un tekrar calismasi icin sart


        // while loop bitti ise kullanici baslangic ve bitis olarak
        // bir karakter girdi demektir
        // simdi bu karakterleri ve aralarindaki karakterleri yazdirabiliriz

        if (baslangic < bitis){

            for (char i = baslangic; i <=bitis ; i++) {
                System.out.print(i + " ");
            }

        } else { // bitis <= baslangic

            for (char i = baslangic; i >=bitis ; i--) {
                System.out.print(i + " ");
            }

        }



    }
}
