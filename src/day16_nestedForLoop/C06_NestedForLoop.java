package day16_nestedForLoop;

import java.util.Scanner;

public class C06_NestedForLoop {

            /*
            kullanicidan satir ve sutun sayisini alip asagidaki sekli yazdirin
            orn satir = 4 , sutun= 5 oldugunda
             1 2 3 4 5
             2 3 4 5 6
             3 4 5 6 7
             4 5 6 7 8

         */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sekildeki satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();

        System.out.println("Lutfen sekildeki her satirdaki eleman sayisini giriniz...");
        int satirdakiElemanSayisi = scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) { // satirlar
            for (int j = 1; j <=satirdakiElemanSayisi ; j++) { // her satirdaki elemanlar

                System.out.print(    );
            }
            System.out.println();
        }




    }
}
