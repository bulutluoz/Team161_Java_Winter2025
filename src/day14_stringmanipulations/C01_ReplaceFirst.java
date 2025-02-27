package day14_stringmanipulations;

import java.util.Scanner;

public class C01_ReplaceFirst {

    public static void main(String[] args) {

        String str = "java candir, selenium heyecan";

        System.out.println(str.replace("a", "A"));
        // jAvA cAndir, selenium heyecAn



        // sadece ilk "a" harfini buyuk A yapin

        System.out.println(str.replaceFirst("a", "A"));
        // jAva candir, selenium heyecan

        // System.out.println(str.replaceFirst('a', 'A'));
        // replace() parametre olarak char data turunden degerler kabul eder
        // ANNNCAAAKKK replaceFirst() char parametre kabul etmez


        // kullanicidan bir metin isteyin
        // girilen metinde rakam varsa
        // ilk rakam yerine * yazdirin
        // ornek input : Java 84512
        //      output : Java *4512

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        /*
            Regex : regular expresions (belirlenmis kisaltmalar)

         */

        System.out.println(metin.replaceFirst("\\d", "*"));


        // girilen metinde ilk space yerine "X" yazdirin
        System.out.println(metin.replaceFirst(" ", "X"));
        System.out.println(metin.replaceFirst("\\s","X"));





    }
}
