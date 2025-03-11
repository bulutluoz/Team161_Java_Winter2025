package day21_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_KarekokBulma {

    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulun,
        //         tamkare ise true değilse false yazdırın.
        //	Ornek :  input : 16 (4*4) , output: true


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();
        int karekok = 1;

        while(karekok*karekok <= sayi){

            if (karekok*karekok == sayi){
                System.out.println(true);
                break;
            }

            karekok++;

            if (karekok*karekok > sayi){
                System.out.println(false);
                break;
            }

        }


    }
}
