package day25_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_KullaniciyaArrayOlusturtma {

    // Kullanicidan array’in boyutunu ve String elementlerini alip array’i olusturan
    // ve olusturulan array'i donduren bir method olusturun.

    public static void main(String[] args) {

        System.out.println(  Arrays.toString(kullaniciyaArrayOlusturt()) );


    }

    public static String[] kullaniciyaArrayOlusturt(){

        // array'i olusturmak icin oncelikle length'i almaliyiz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'in kac elemanli olacagini giriniz...");
        int elemanSayisi = scanner.nextInt();  // 3

        scanner.nextLine();

        String[] arr = new String[elemanSayisi]; // [null, null, null]

        for (int i = 0; i <elemanSayisi ; i++) {

            System.out.println("Lutfen " + i +". index icin bir metin giriniz...");
            arr[i] = scanner.nextLine();

        }

        return arr;
    }
}
