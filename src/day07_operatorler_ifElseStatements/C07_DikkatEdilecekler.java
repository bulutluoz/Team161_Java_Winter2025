package day07_operatorler_ifElseStatements;

import java.util.Scanner;

public class C07_DikkatEdilecekler {

    public static void main(String[] args) {


        // Soru 3- Kullanicidan bir tamsayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        /*
            if body'si birden fazla satira sahip olabilir

            if body'sinde suslu parantez kullanilmayabilir

            ANNNCCCAAAAKKK suslu parentez kullanilmazsa
            if body'si olarak ilk ;'e kadar olan kisim alinir
            ilk ;'den sonrasi if ile baglantili olmaz


            YANIII
            eger if body'si TEK satirsa {} kullanmasak da olur
            ama if body'si birden fazla satirdan olusuyorsa
            MUTLAKA {} kullanilmalidir.
         */


        if (sayi % 3 == 0)
            System.out.println("Uc ile bolunebilen sayi");
            System.out.println("3'un kati 2.satir");
            System.out.println("3'un kati 3.satir");



        if (sayi % 5 == 0){
            System.out.println("Bes ile bolunebilen sayi");
            System.out.println("5'in kati 2.satir");
            System.out.println("5'in kati 3.satir");
        }



    }
}
