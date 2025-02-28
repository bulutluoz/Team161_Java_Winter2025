package day15_forLoop;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

        // 2 basamakli 5 ile bolunebilen sayilarin toplamini yazdirin

        int toplam = 0;


        for (int i = 10; i <100 ; i+=5) {

            toplam += i;

        }

        System.out.println(toplam); // 945



        // kullanicidan baslangic ve bitis degerlerini alip
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri toplayin
        // ve toplami yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen baslangic degerini giriniz...");
        int baslangic = scanner.nextInt();

        System.out.println("Lutfen bitis degerini giriniz...");
        int bitis = scanner.nextInt();

        toplam = 0 ;

        for (int i = baslangic; i <=bitis ; i++) {

            if ( i % 5 == 0){
                toplam += i;
            }

        }

        System.out.println("Verilen sayilarin arasindaki 5 ile bolunen sayilarin toplami : " + toplam);

    }
}
