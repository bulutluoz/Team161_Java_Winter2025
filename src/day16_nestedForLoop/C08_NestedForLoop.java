package day16_nestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {

    public static void main(String[] args) {
        /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 5

                *
                * *
                * * *
                * * * *
                * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sekildeki satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) { // satirlari
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
