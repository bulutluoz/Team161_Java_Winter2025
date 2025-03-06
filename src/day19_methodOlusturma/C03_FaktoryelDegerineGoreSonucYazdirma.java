package day19_methodOlusturma;

import java.util.Scanner;

public class C03_FaktoryelDegerineGoreSonucYazdirma {

    public static void main(String[] args) {

        // kullanicidan 17'den kucuk bir pozitif tamsayi isteyin
        // girilen sayi icin faktoryel degerini hesaplayin
        // faktoryel degeri 1000000'dan kucukse "iyi sayi yazmissin"
        // faktoryel degeri 1000000 veya daha buyukse, "bu sayiyi nerden buldun?" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 17'den kucuk, pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();


        int faktoryel = C02_FaktoryelDegeriDondurme.faktoryelDegeri(girilenSayi);

        if (faktoryel<1000000) System.out.println("iyi sayi yazmissin");
        else System.out.println("bu sayiyi nerden buldun?");


    }
}
