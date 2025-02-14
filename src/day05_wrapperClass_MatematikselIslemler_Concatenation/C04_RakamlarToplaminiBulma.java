package day05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C04_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi alip
        // girilen sayinin rakamlar toplamini yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();  // 234

        int rakam = 0;
        int rakamlarToplami = 0;



        rakam = sayi % 10;
        rakamlarToplami = rakamlarToplami + rakam ;

        sayi = sayi / 10;  // sayi artik 2 basamakli oldu



        rakam = sayi % 10;

        rakamlarToplami = rakamlarToplami + rakam;

        sayi = sayi / 10;  // artik sayi tek basamakli


        rakamlarToplami = rakamlarToplami + sayi ;

        System.out.println("girilen sayinin rakamlar toplami : " + rakamlarToplami);



















    }
}
