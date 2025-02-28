package day15_forLoop;

import java.util.Scanner;

public class C01_BasitDonguler {

    public static void main(String[] args) {

        // 1'den 5'e kadar olan sayilari yanyana
        // aralarinda bir bosluk olacak sekilde yazdirin

        System.out.println("1 2 3 4 5");

        // 1000'den 5000'e kadar olan sayilari yanyana
        // aralarinda bir bosluk olacak sekilde yazdirin


        // 101'den 145'e kadar(sinirlar dahil) olan sayilari yanyana
        // aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 1501; i <=1575 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // 2 basamakli cift sayilari yazdirin

        for (int i = 10; i <=99 ; i=i+2  ) {
            System.out.print(i + " ");
        }

        System.out.println("");

        // 100'den baslayarak 245'e kadar(dahil)
        // 9'ar 9'ar artirarak yazdirin

        for (int i = 100; i <=245 ; i+=9) {
            System.out.print(i + " ");

        }
        System.out.println("");

        // 100'den baslayarak geriye dogru 3'er 3'er azaltarak
        // 0'a kadar olan sayilari yazdirin

        for (int i = 100; i >= 0  ; i-=3) {
            System.out.print(i + " ");

        }

        System.out.println("");


        // kullanicidan baslangic be bitis degerlerini alip
        // bu degerleri ve aralarindaki tum sayilari
        // yanyana aralarinda bir bosluk olacak sekilde yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic degerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degerini giriniz...");
        int bitis = scanner.nextInt();

        for (int i = baslangic ; i <=bitis ; i++) {

            System.out.print(i + " ");

        }


    }
}
