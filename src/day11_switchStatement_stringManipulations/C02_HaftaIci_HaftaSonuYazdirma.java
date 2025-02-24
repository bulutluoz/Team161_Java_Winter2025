package day11_switchStatement_stringManipulations;

import java.util.Scanner;

public class C02_HaftaIci_HaftaSonuYazdirma {

    public static void main(String[] args) {


        // Kullanicidan gun numarasi girmesini isteyin
        // girilen sayiya gore 1- pazartesi ..... 7 - pazar olacak sekilde
        // istenen gunun hafta ici veya hafta sonu oldugunu yazdirin
        // kullanici 1-7 arasindaki sayilar disinda bir deger girerse
        // hata mesaji verin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz...");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Girilen gun numarasi yanlis");

        }

    }
}
