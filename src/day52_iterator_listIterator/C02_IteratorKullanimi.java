package day52_iterator_listIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_IteratorKullanimi {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,5,8,1,0));


        // Iterator ile index kullanmadan, sayilar listesindeki elemanlari yazdirin

        // Iterator iterator = new Iterator();
        // 'Iterator' is abstract; cannot be instantiated
        // Iterator abstract bir yapidir, obje olusturulamaz

        Iterator iterator = sayilar.iterator();


        System.out.println(iterator.hasNext()); // true

        System.out.println(    iterator.next()  ); // 3

        System.out.println(iterator.hasNext() ); // true

        System.out.println(  iterator.next() + " ");

        int sayi = (Integer)iterator.next();

        System.out.println(iterator.next()); // 1

        iterator.next();


        System.out.println(iterator.hasNext()); // false

        System.out.println(iterator.next()); // NoSuchElementException
















    }
}
