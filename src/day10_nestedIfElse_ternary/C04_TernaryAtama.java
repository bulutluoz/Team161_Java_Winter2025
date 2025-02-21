package day10_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_TernaryAtama {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin
        // sayi 100'den buyukse degerini 10 azaltin
        // sayi 100'den buyuk degilse dagerini 2 katina cikarin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi > 100) {
            sayi -= 10;
        }else {
            sayi *= 2;
        }

        System.out.println("If else'den sonra sayi : " + sayi);


        sayi = sayi > 100 ?  sayi-10 : sayi*2 ;


        System.out.println("Ternary'den sonra sayi : " + sayi);






    }
}
