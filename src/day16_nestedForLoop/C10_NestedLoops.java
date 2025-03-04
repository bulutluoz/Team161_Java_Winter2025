package day16_nestedForLoop;

import java.util.Scanner;

public class C10_NestedLoops {

    public static void main(String[] args) {

        /*

        kullanicidan satir sayisini alip asagidaki sekli cizdirin
        orn satir = 9

                0
                0 1
                0 1 2
                0 1 2 3
                0 1 2 3 4
                0 1 2 3
                0 1 2
                0 1
                0

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sekildeki satir sayisini giriniz...");
        int satirSayisi = scanner.nextInt();


        if (satirSayisi%2 == 0){
            System.out.println("Satir sayisi cift olamaz");
        } else{

            for (int i = 1; i <=satirSayisi/2+1 ; i++) { // satirlari
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j-1 + " ");
                }
                System.out.println();
            }

            // 5.satira kadar her satirda satir sayisi kadar olacak sekilde ucgeni cizdik
            // 6. satirda 4, 7.satirda 3, 8.satirda 2, 9.satirda 1, 10.satirda(2 * satir sayisi) 0
            // olacak sekilde azaltarak 2.bolumu yazdiracak
            // ayri bir nested for loop yazmaliyiz

            for (int i = satirSayisi/2; i >=1 ; i--) { // satirlari
                for (int j = 1; j <=i ; j++) {
                    System.out.print(j-1 + " ");
                }
                System.out.println();
            }



        }

    }
}
