package day04_dataCasting;

import java.util.Scanner;

public class C04_Casting {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // ve 1.sayiyi, 2.sayiya bolup bolme isleminin sonucunu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 adet tamsayi giriniz...");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        System.out.println( sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2)   );

        // Java 2 tamsayiyi bolerse sonucu da tamsayi olarak verir



        // girilen iki sayiyi birbirine bolup
        // sonucu ondalik olarak yazdirin

        double sonuc = sayi1 / sayi2 ;

        System.out.println( "sonucu double variable'a atama yaparsak : " + sonuc);



        double sonuc2 = (double)sayi1 / sayi2 ;

        System.out.println("sayi1'i double'a cast edersek : " + sonuc2);


    }
}
