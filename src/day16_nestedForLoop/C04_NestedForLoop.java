package day16_nestedForLoop;

public class C04_NestedForLoop {

    public static void main(String[] args) {

        // bir for loop ile 1 2 3 4 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print( 1*i + " ");
        }
        System.out.println();
        // Ayni loop'u kullanarak 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print( 2*i + " ");
        }
        System.out.println();

        // Ayni loop'u kullanarak 3 6 9 12 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print( 3*i + " ");
        }
        System.out.println();


        // Ayni loop'u kullanarak 4 8 12 16 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print( 4*i + " ");
        }
        System.out.println();


        /*
            tek bir islem ile asagidaki sekli yazdirin
            1  2  3  4
            2  4  6  8
            3  6  9 12
            4  8 12 16

            Eger farkli satirlar ve her satirda esit miktarda eleman yazdirilacaksa
            ic ice (nested) loop'lar kullanabiliriz

            Eger olusturulacak sekil dikdortgen seklinde ise
            disardaki loop ile kac satir olacagini,
            icerdeki loop ile her satirda kac eleman olacagini belirleriz
         */

        for (int i = 1; i <=4 ; i++) {  // Outer loop , kac satir olacagini belirler

            for (int j = 1; j <=4 ; j++) { // inner loop, her satirda kac eleman olacagini belirler

                System.out.print( i*j + "  "  );
            }

            System.out.println();

        }




    }
}
