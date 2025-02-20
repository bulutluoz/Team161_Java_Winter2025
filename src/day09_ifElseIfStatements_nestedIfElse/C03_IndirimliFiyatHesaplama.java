package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C03_IndirimliFiyatHesaplama {

    public static void main(String[] args) {

        // Kullaniciya kac adet urun aldigini ve bir urunun fiyatini sorun
        // eger kullanici 100 adet veya daha fazla aldiysa %25,
        // eger 50 adet veya daha fazla aldiysa %20
        // eger 10 adet veya daha fazla aldiysa %10 indirim yaparak
        // odeyecegi toplam miktari yazdirin
        // Kullanici negatif bir fiyat veya adet girerse uyari verin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aldiginiz urun adedini giriniz...");
        int adet = scanner.nextInt();

        System.out.println("Aldiginiz urunun birim fiyatini giriniz...");
        double birimFiyati = scanner.nextDouble();

        double indirimsizToplamFiyat = adet * birimFiyati ;

        if (adet >= 100) System.out.println("%25 indirimli toplam fiyat : " + indirimsizToplamFiyat * 75 /100);
        else if (adet >= 50) System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat * 80 /100);
        else if (adet >= 10) System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat * 90 /100);
        else if (adet >= 0) System.out.println("Indirimsiz toplam fiyat : " + indirimsizToplamFiyat);
        else System.out.println("Girilen adet hatali");



    }
}
