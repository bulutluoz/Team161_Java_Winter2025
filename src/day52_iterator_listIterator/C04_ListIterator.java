package day52_iterator_listIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,8,1,6,0,6,9,1,3,7,0,8,6,4,2));


        // ListIterator, Iterator'in child'idir

        ListIterator lit = sayilar.listIterator();

        // index kullanmadan 7'den buyuk sayilari silin
        // iterator ile yapalim

        while (lit.hasNext()){

            if ((Integer)lit.next()>7){
                lit.remove();
            }
        }

        System.out.println("Ilk islemden sonra sayilar : " + sayilar);
        // Ilk islemden sonra sayilar : [3, 1, 6, 0, 6, 1, 3, 7, 0, 6, 4, 2]


        // ayni iterator'i kullanarak, listeden 5'den buyuk olanlari silin
        /*
            Iterator ile islem yaparken
            dikkat etmemiz gereken EN ONEMLI 2 sey
            1- iterator'i nerede biraktik
            2- her dongude sadece 1 kere next() kullanmak
         */

        // iterator su an sonda

        while (lit.hasPrevious()){
            if ((Integer)lit.previous()>5){
                lit.remove();
            }
        }

        System.out.println("Ikinci islemden sonra sayilar : " + sayilar);
        // Ikinci islemden sonra sayilar : [3, 1, 0, 1, 3, 0, 4, 2]



        // Ayni iterator'i kullanarak
        // sayilar listesindeki elemanlari Sondan basa dogru yazdirin

    }
}
