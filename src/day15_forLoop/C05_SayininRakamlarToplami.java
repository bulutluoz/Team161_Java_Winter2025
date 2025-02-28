package day15_forLoop;

import java.util.Scanner;

public class C05_SayininRakamlarToplami {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini asagidaki gibi yazdirin.
        // input : 1453 output => 1+4+5+3 = 13
        // output :  "Girilen 1453 sayisinin rakamlar toplami : 13"

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();
        int sayi = girilenSayi;

        int rakam = 0;
        int rakamlarToplami = 0;

        int basamakSayisi  = (girilenSayi+"").length();


        for (int i = 1; i <=basamakSayisi ; i++) {
            rakam = sayi % 10;
            rakamlarToplami +=rakam;
            sayi /= 10;
        }



        System.out.println("Girilen " + girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);


    }
}
