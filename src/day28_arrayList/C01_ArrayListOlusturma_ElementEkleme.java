package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayListOlusturma_ElementEkleme {

    public static void main(String[] args) {

        int[] arr = {3,4,5,6};

        ArrayList<Integer> sayilar1 = new ArrayList<>();
        // data turu olarak int yazdigimizda : Type argument cannot be of primitive type

        // Array list 3 sekilde deklare edilebilir
        ArrayList<Integer> sayilar2 = new ArrayList<>();
        List<Integer> sayilar3 = new ArrayList<>();
        List<Integer> sayilar4 = new ArrayList<Integer>();

        // GENEL OLARAK data turunun List secilmesi tercih edilir
        List<Integer> sayilar5 = new ArrayList<>();

        // ArrayList direkt olarak yazdirilabilir
        System.out.println(sayilar5); // []

        // ArrayList'e elemanlari tek tek ekleyebiliriz
        sayilar5.add(5);
        sayilar5.add(1);
        sayilar5.add(8);
        sayilar5.add(3);

        System.out.println(sayilar5); // [5, 1, 8, 3]

        sayilar5.add(2,9);
        System.out.println(sayilar5); // [5, 1, 9, 8, 3]


        sayilar1.add(10);
        sayilar1.add(20);
        System.out.println(sayilar1); // [10, 20]


        sayilar5.addAll(sayilar1);

        System.out.println(sayilar5); // [5, 1, 9, 8, 3, 10, 20]
        System.out.println(sayilar1); // [10, 20]


        sayilar5.addAll(1,sayilar1);

        System.out.println(sayilar5); // [5, 10, 20, 1, 9, 8, 3, 10, 20]


        // icinde "Cennet", "Yusuf", "Mertcan", "Eda" isimlerinin oldugu bir ArrayList olusturun

        /*
            Array List olusturulurken
            eklenecek elementler belli ise
            Arrays.asList() kullanilarak toptan eklenebilir
         */

        List<String> isimler = new ArrayList<>(Arrays.asList( "Cennet", "Yusuf", "Mertcan", "Eda" ) );

        System.out.println(isimler); // [Cennet, Yusuf, Mertcan, Eda]




    }
}
