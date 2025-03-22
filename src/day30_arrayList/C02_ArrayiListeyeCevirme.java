package day30_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayiListeyeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,5,7,8,2,3,4,5,1,9};

        // arr 'yi arrayList'e cevirin

        List<Integer> arrList = new ArrayList<>(Arrays.asList(3,5,7,8,2,3,4,5,1,9));

        arrList.add(5);

        System.out.println(arrList);


        /*
            verilen array'i copy paste yapmak disinda
            arrayList'e cevirmek isterseniz asList() kulllanilabilir
            ama 2 buyuk negatif yan etkisi olur
            1- her ne kadar hazirMethodList bir List olsa da
               ekleme ve silme gibi uzunlugu etkileyen method'lari kullanamazsiniz

            2- hazir methodla cevrilen list ve array ortak hareket ederler
               birinde yapilan degisiklik
               otomatik olarak otekine de islenir

             Bu yuzden bu yontem cok kullanilmaz

         */

        List<Integer> hazirMethodList = Arrays.asList(arr);

        System.out.println(hazirMethodList); // [3, 5, 7, 8, 2, 3, 4, 5, 1, 9, 5]


        // hazir method ile cevirdigimiz listenin sonuna 10 ekleyin
        // hazirMethodList.add(10);

        // System.out.println(hazirMethodList); // UnsupportedOperationException


        System.out.println(Arrays.toString(arr)); // [3, 5, 7, 8, 2, 3, 4, 5, 1, 9]
        System.out.println(hazirMethodList); // [3, 5, 7, 8, 2, 3, 4, 5, 1, 9]

        // arr'in 0. index'indeki elemani 10 yapin
        arr[0] = 10;
        System.out.println(Arrays.toString(arr)); // [10, 5, 7, 8, 2, 3, 4, 5, 1, 9]

        System.out.println(hazirMethodList); // [10, 5, 7, 8, 2, 3, 4, 5, 1, 9]


        // peki bir array'i list'e cevirmemiz gerekirse
        // ne yapmaliyiz?

        String[] harfler = {"a","b","r","t","p"};

        // bos bir list olusturup
        // array'deki elementleri loop ile arrayList'e kopyalariz

        List<String> harflerListesi = new ArrayList<>();

        for (int i = 0; i <harfler.length ; i++) {

            harflerListesi.add(harfler[i]);

        }


        System.out.println(harflerListesi); // [a, b, r, t, p]

        harflerListesi.add("z");
        harflerListesi.remove(0);

        System.out.println(harflerListesi); // [b, r, t, p, z]







    }
}
