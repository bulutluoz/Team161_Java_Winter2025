package day11_switchStatement_stringManipulations;

import java.util.Scanner;

public class C01_GunIsminiYazdirma {

    public static void main(String[] args) {

        // Kullanicidan gun numarasi girmesini isteyin
        // girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
        // gun ismini yazdirin
        // kullanici 1-7 arasindaki sayilar disinda bir sayi girerse
        // hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz...");
        int gunNo = scanner.nextInt();


        if (gunNo == 1){
            System.out.println("Pazartesi");
        } else if (gunNo == 2){
            System.out.println("Sali");
        } else if (gunNo == 3){
            System.out.println("Carsamba");
        } else if (gunNo == 4){
            System.out.println("Persembe");
        } else if (gunNo == 5){
            System.out.println("Cuma");
        } else if (gunNo == 6){
            System.out.println("Cumartesi");
        } else if (gunNo == 7){
            System.out.println("Pazar");
        } else System.out.println("Girilen gun numarasi yanlis");


        System.out.println("=================");


        // ayni islemi switch ile yapalim

        switch (gunNo){ // gunNo 'ya gore calisacak kodu degistir

            case 1 :   // gunNo'nun 1 olmasi durumunda calisacak kod
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Sali"); // case'ler tek bir satir olmak zorunda degil
                                            // menu yapisi olusturup, case'lerde daha kompleks kodlar yazabiliriz
                break;
            case 3 :
                System.out.println("Carsamba");
                break;
            case 4 :
                System.out.println("Persembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default: // if, else-if 'lerin sonundaki else gibidir
                System.out.println("Girilen gun numarasi yanlis");

        }

        /*
            switch parantezine yazilan variable'in aldigi degere gore
            uygun case'den calismaya baslar
            break gorurse durur,
            break gormezse switch statement'in sonuna kadar calisir
         */

    }
}
