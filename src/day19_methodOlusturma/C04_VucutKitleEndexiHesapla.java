package day19_methodOlusturma;

import java.util.Scanner;

public class C04_VucutKitleEndexiHesapla {

    public static void main(String[] args) {

        System.out.println(vucutKitleEndeksiHesapla());

    }


    // Soru 2- Kullanicidan kilo(kg) ve boyunu(cm) isteyip
    //         vucut kitle endeksini hesaplayan ve sonucu donduren bir method olusturun
    //         kilo*10000 / (boy *boy)

    public static double vucutKitleEndeksiHesapla(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu kg olarak giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Boyunuzu cm olarak giriniz...");
        double boy = scanner.nextDouble();

        return  kilo*10000 / (boy *boy) ;
    }
}
