package day14_stringmanipulations;

import java.util.Scanner;

public class C06_IsmiDegistirme {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini ayri ayri alin.
        //	- ismi daha uzun ise,
        //    isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        //  - soyisim daha uzun ise,
        //    ismi ilk harf buyuk digerleri kucuk, soyismin tamamini buyuk harflerle yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz...");
        String soyisim = scanner.nextLine();

    }
}
