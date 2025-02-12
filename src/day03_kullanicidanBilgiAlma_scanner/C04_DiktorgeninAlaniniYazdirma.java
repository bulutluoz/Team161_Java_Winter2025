package day03_kullanicidanBilgiAlma_scanner;

import java.util.Scanner;

public class C04_DiktorgeninAlaniniYazdirma {

    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lütfen Dikdörtgenin Kenar Ölçülerini Girin..");
        double uzunkenar= scanner.nextDouble();
        double kisakenar= scanner.nextDouble();

        System.out.println("Dikdörtgenin Alan Ölçüsü = " + (kisakenar*uzunkenar));


    }
}
