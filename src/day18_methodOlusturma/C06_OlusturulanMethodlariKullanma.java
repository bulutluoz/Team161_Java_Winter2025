package day18_methodOlusturma;

import java.util.Scanner;

public class C06_OlusturulanMethodlariKullanma {


    public static void main(String[] args) {

        // 23 ile 34 'den buyuk olmayani yazdirin

        C01_MethodOlusturma.buyukOlmayaniYazdir(23,34);

        // Kullanicidan 2 tamsayi isteyin ve buyuk olmayani yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 tamsayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        C01_MethodOlusturma.buyukOlmayaniYazdir(sayi1,sayi2);


    }
}
