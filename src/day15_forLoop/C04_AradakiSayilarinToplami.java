package day15_forLoop;

import java.util.Scanner;

public class C04_AradakiSayilarinToplami {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da kod calismali


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic degerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degerini giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0 ;


        if (baslangic < bitis ){

            for (int i = baslangic; i <= bitis ; i++) {
                toplam += i ;
            }

        } else {
            // baslangic > bitis
            for (int i = baslangic; i >= bitis ; i--) {
                toplam += i ;
            }


        }

        System.out.println("Aradaki sayilarin toplami : " + toplam);

    }
}
