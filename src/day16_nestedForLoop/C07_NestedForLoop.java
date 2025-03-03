package day16_nestedForLoop;

import java.util.Scanner;

public class C07_NestedForLoop {

    public static void main(String[] args) {

        /*

        kullanicidan satir ve sutun sayisini alip asagidaki sekli cizdirin
        orn satir = 3 , sutun= 6 oldugunda

                * * * * * *
                * * * * * *
                * * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sekildeki satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();

        System.out.println("Lutfen sekildeki her satirdaki eleman sayisini giriniz...");
        int satirdakiElemanSayisi = scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) { // satirlar

            for (int j = 1; j <=satirdakiElemanSayisi ; j++) { // her satirdaki eleman sayisi

                System.out.print("* " );
            }

            System.out.println();
        }




    }
}
