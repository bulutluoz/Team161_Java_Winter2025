package day10_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_TernaryVsIfElse {

    public static void main(String[] args) {

        // Kullanicidan uc basamakli pozitif bir tamsayi isteyin
        // sayi 500 veya daha buyukse rakamlar toplamini hesaplayip yazdirin
        // sayi 500'den kucukse sayinin 10'lar basamagindaki rakamin karesini yazdirin


        /*
            sayinin 500'den buyuk olup olmadigini
            ternary ile ayirt edebiliriz
            ANCAAAKKKK sayinin rakamlari toplamini bulmak
            veya 10'lar basamagindaki rakami bulup karesini almak
            tek satirda basitce yazabilecegimiz kodlar olmadigindan
            BU gorevde TERNARY KULLANILAMAZ
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uc basamakli pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt(); // 347

        int rakam = 0;
        int rakamlarToplami = 0;


        if (sayi > 500){

            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi /=10;

            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi /=10;

            rakam = sayi % 10 ;
            rakamlarToplami += rakam;
            sayi /=10;

            System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);

        } else { // sayi 500'den buyuk degilse     547

            // birler basamagindan kurtulalim  54
            sayi /= 10;

            rakam = sayi % 10;

            System.out.println("10'lar basamagindaki rakamin karesi : " + rakam * rakam);

        }


    }
}
