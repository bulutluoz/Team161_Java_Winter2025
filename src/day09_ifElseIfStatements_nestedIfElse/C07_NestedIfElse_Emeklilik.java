package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C07_NestedIfElse_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin
        // kullanici yas olarak 15'den kucuk veya 80'den buyuk deger girerse
        // ve K veya E disinda cinsiyet girerse hata mesaji yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz...");
        double yas = scanner.nextDouble();

        System.out.println("Cinsiyetinizi giriniz... K : kadin , E : erkek");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        /*
            Eger bir if else'de birden fazla degisken varsa
            Nested If Else Kullanilabilir

            nested if else icin
            1 - once hangi degiskeni ana degisken yapacaginiza karar verin
            2 - Sanki sadece ana degisken varmis gibi bir if - else if olusturun
            3 - artik gruplara ayirdigimiz icin
                her bolgede o bolgeye gore 2.degiskene bagli if-else olusturun

         */


        // Cinsiyet ana degisken olsun

        if (cinsiyet == 'K'){
            // Bu bolgede SADECE kadinlar var
            // Bu bolgede kadinlar icin yasa bagli bir if-else olusturalim
            if (yas<15 || yas>80)
                System.out.println("Girdiginiz yas degeri uygun degil");
            else if (yas >= 60)
                System.out.println("Kadin ve yas 60'dan fazla, emekli olabilir");
            else
                System.out.println("Kadinlar 60 yasinda emekli olur, daha " + (60-yas) + " yıl calısman lazım");

        } else if (cinsiyet == 'E') {
            // Bu bolgede SADECE erkekler var
            if (yas<15 || yas>80)
                System.out.println("Girdiginiz yas degeri uygun degil");
            else if (yas >= 65)
                System.out.println("Erkek ve yas 65'den fazla, emekli olabilir");
            else
                System.out.println("Erkekler 65 yasinda emekli olabilir, daha " + (65-yas) + " yıl calısman lazım");

        } else
            System.out.println("Cinsiyet olarak girilen deger hatali");

    }
}
