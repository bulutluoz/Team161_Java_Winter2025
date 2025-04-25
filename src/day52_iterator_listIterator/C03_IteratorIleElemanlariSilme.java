package day52_iterator_listIterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C03_IteratorIleElemanlariSilme {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,8,1,6,0,6,9,1,3,7,0,8,6,4,2));

        // iterator ile listedeki cift sayilari silin

        Iterator iterator = sayilar.iterator();// itr 3,8,1,6,0,6,9,1,3,7,0,8,6,4,2

        // iterator.hasNext()
        // iterator.next()
        // iterator.remove();

        while (iterator.hasNext()){ // iterator.hasNext() == true
            // iterator.hasNext() == true  bu boolean kontrol
            // iterator'in yaninda eleman oldugu muddetce while loop'u calistirir

            if ( (Integer)iterator.next() % 2 == 0){
                iterator.remove();
            }

        }

        System.out.println("sayilar listesinin son hali : " + sayilar);

        // yukardaki loop ile iterator'i en sona kadar goturduk

        // 3,8,1,6,0,6,9,1,3,7,0,8,6,4,2



        // sayilar listesinin yeni halinde
        // 5'den buyuk olan sayilari silin
        // iterator en sonda oldugu icin
        // tekrar ayni iterator ile elemanlari bastan sona elden geciremeyiz
        // yeniden baslamak icin iterator'a yeni deger atamaliyiz

        iterator = sayilar.iterator();

        while (iterator.hasNext()) { // iterator.hasNext() == true

            if ((Integer) iterator.next() > 5) {
                iterator.remove();
            }

        }

        System.out.println("sayilar listesinin en son hali : " + sayilar);
    }
}
