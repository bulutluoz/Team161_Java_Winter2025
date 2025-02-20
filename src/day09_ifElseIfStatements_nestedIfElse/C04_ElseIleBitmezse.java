package day09_ifElseIfStatements_nestedIfElse;

import java.util.Scanner;

public class C04_ElseIleBitmezse {

    public static void main(String[] args) {

        /*
            ONEMLI NOTLAR
            1- bir elek sisteminde siralama dogru olmazsa
               sonuc da hatali OLABILIR
               elekleri siralarken en dar olandan baslamaliyiz

            2- else ile birbirine baglanan if cumlelerinden
               sadece 1'i calisir
               (bir meyve sadece 1 elekden duser)

            3- if - else if .... cumleleri else ile bitmek ZORUNDA DEGILDIR
               ANNNCCCAAAAKKK else ile bitmeyen kodlarin
               bazi durumlarda hicbir sonuc uretmeyecegini UNUTMAMAMIZ GEREKIR


         */

        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi hem 3 hem 5 ile bolunuyorsa "super",
        // sayi sadece 3 ile bolunuyorsa "3'un kati"
        // sayi sadece 5 ile bolunuyorsa "5'in kati" yazdirin
        // (Not: 3 veya 5'e bolunemeyen 23 gibi sayilar bu gorevde hic bir sey yazdirmaz)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi % 5 == 0 && sayi % 3 == 0) System.out.println("super");
        else if ( sayi % 5 == 0) System.out.println("5'in kati");
        else if ( sayi % 3 == 0) System.out.println("3'un kati");








    }
}
