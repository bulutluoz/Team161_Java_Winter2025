package day49_interface_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class K04_IfElseIleCozulemeyenExceptionlar {

    public static void main(String[] args) {

        /*
            Iyi bir kod yazari
            kodu yazdiktan sonra
            kullanicinin hangi giciklik haklarini kullanabilecegini ongorur
            ve bu giciklik haklari icin cozum uretir

            bu soruyu dusunecek olursak
            2 risk goruyoruz
            1- bolecek sayi olarak 0 girilmesi (ArithmeticException)

            2- int istedigimiz halde
               int disinda bir data turunden deger girilmesi
               (InputMissmatchException)


            1.riski if-else ile kontrol altina alabiliriz (Handle edebiliriz)
            ammmaaa 2.riski if-else ile handle etmemiz mumkun degil

            if else ile cozemedigimiz riskleri
            try-catch bloklari ile handle edebiliriz
         */

        // Kullanicidan iki tamsayi isteyip
        // 1. sayiyi 2.sayiya bolup,
        // islem sonucunun tamsayi kismini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bolme islemi icin 2 tamsayi giriniz....");

        try {
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();

            if (sayi2!=0) {
                System.out.println("Bolme islemi sonucu : " + sayi1 / sayi2);
            }else{
                System.out.println("2.sayi 0 olamaz");
            }
        } catch (InputMismatchException e) {
            System.out.println("Tamsayi girmelisiniz...");
        }


    }
}
