package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop_NegatifYonu {

    public static void main(String[] args) {

        /*
            Do While Loop'un avantaji :
                Loop body'sinin en az bir kere calismasidir

            Do While Loop'un dezavantaji :
                Loop body'sinin en az bir kere calismasidir

            Ornegin asagidaki gorevde
            kullanici 0 girdiginde loop body'sinin hic calismamasi gerekirken
            while kontrolunden once do body'si calistigi icin
            yapmamasi gerektigi halde 0 yazdirdi
         */

        // kullanicidan alinan pozitif tamsayidan baslayarak
        // 1'e kadar olan sayilari aralarinda 1 bosluk olacak sekilde
        // yan yana yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        do {
            System.out.print(sayi + " ");
            sayi--;
        }while (sayi >= 1);




    }
}
