package day49_interface_exception;

import java.util.Scanner;

public class K03_Bolme {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyip
        // 1. sayiyi 2.sayiya bolup,
        // islem sonucunun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolme islemi icin 2 tamsayi giriniz....");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 != 0 ){
            System.out.println("Bolme islemi sonucu : " + sayi1/sayi2);
        }

        System.out.println("exception olursa bu satir calismaz");


    }

}
