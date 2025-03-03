package day16_nestedForLoop;

import java.util.Scanner;

public class C02_StringiTerstenYazdirma {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String’i tersten yazdirin.
        // orn input : Sabri output : irbaS


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        System.out.print("Girilen metnin tersten yazilisi : ");

        for (int i = metin.length()-1 ; i >=0 ; i--) {
            System.out.print(metin.charAt(i));
        }

    }
}
