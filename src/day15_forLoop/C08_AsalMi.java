package day15_forLoop;

import java.util.Scanner;

public class C08_AsalMi {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        for (int i = 2; i <= girilenSayi-1 ; i++) {


            if (girilenSayi % i == 0){
                System.out.println("Asal degil, " + i + "'ye bolunuyor");
                // eger for loop bir sart saglandiginda bitsin istiyorsak
                break;
            }

            if(i == girilenSayi-1){
                System.out.println("Girilen " + girilenSayi + " sayisi asal.");
            }



        }

    }
}
