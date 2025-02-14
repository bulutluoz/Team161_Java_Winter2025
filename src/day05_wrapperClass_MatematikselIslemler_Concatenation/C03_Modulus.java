package day05_wrapperClass_MatematikselIslemler_Concatenation;

import java.util.Scanner;

public class C03_Modulus {

    public static void main(String[] args) {


        // Kullanicidan bir tam sayi alin
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();


        // eger bize sayinin cift mi tek mi oldugu sorulursa

        System.out.println(  girilenSayi % 2   );
        // bu islemin sonucunu kontrol ederiz
        // sonuc 0 ise sayi cifttir, sonuc 0 degilse sayi tektir


        // eger girilen sayinin 5'in kati olup olmadigi sorulursa

        System.out.println(  girilenSayi % 5  );
        // bu islemin sonucunu kontrol ederiz
        // sonuc 0 ise sayi 5'in katidir, sonuc 0 degilse sayi 5'in kati degildir


        // eger girilen sayinin birler basamagini bulmamiz istenirse
        System.out.println(  girilenSayi % 10   );

        System.out.println("===================");
        //   sayi / 10     ile      sayi % 10  ayni sey degildir

        int sayi  = 245;

        System.out.println(  sayi % 10     ); // 5

        System.out.println(  sayi / 10     ); // 24

        System.out.println(   sayi  ); // 245

        // sayiyi 24 olarak kaydetmek istersek

        sayi = sayi / 10 ;

        System.out.println("sayinin yeni hali : " + sayi);

    }
}
