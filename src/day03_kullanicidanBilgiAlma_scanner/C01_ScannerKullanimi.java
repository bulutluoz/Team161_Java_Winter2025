package day03_kullanicidanBilgiAlma_scanner;


import java.util.Scanner;

public class C01_ScannerKullanimi {

    public static void main(String[] args) {

        // kullanicidan bir tam sayi alin
        // ve girilen tamsayinin 10 katini asagidaki sekilde yazdirin
        // orn :   input => 5   ouput => girilen sayinin 10 kati : 50


        // 1.adim : Bir scanner objesi olusturun
        Scanner scanner = new Scanner(System.in);

        // 2.adim : kullaniciya ne istediginizi yazdirin
        System.out.println("Lutfen bir tamsayi giriniz...");

        // 3.adim : olusturdugumuz scanner objesini kullanarak
        //          kullanicinin girdigi bilgiyi konsol'dan alip
        //          olusturdugumuz uygun bir variable'a kaydedelim

        int girilenSayi = scanner.nextInt();


        // orn :   input => 5   ouput => girilen sayinin 10 kati : 50

        System.out.println( "girilen sayinin 10 kati : "  +  (girilenSayi*10)   );


    }
}
