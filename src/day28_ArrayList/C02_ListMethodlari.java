package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ListMethodlari {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList( "Cennet", "Yusuf", "Mertcan", "Eda" ) );

        // isimler listesindeki element sayisini yazdirin
        System.out.println(isimler.size()); // 4


        // isimler listesindeki ilk elementi yazdirin
        System.out.println(isimler.get(0)); // Cennet

        // isimler listesindeki son elementi yazdirin
        System.out.println( isimler.get(  isimler.size()-1 ) ); // Eda


        // isimler listesindeki tum elementleri, yan yana yazdirin
        // ArrayList'de tum elementleri gozden gecirmek istersek
        // for loop kullaniriz
        // bizim oglan isimler.get(i) olur

        for (int i = 0; i < isimler.size() ; i++) {

            System.out.print( isimler.get(i)  + " " );
        }


        System.out.println();


        // isimler listesinde Serpil var mi ?
        System.out.println(isimler.contains("Serpil")); // false
        System.out.println(isimler.contains("Eda")); // true
        System.out.println(isimler.contains("eda")); // false



        // isimler listesinin 1.index'ine Ali ekleyin

        System.out.println(isimler); // [Cennet, Yusuf, Mertcan, Eda]

        isimler.add(1,"Ali");

        System.out.println(isimler); // [Cennet, Ali, Yusuf, Mertcan, Eda]


        // Java'da set() method'lari UPDATE yapar

        isimler.set(1,"Serpil");

        System.out.println(isimler); // [Cennet, Serpil, Yusuf, Mertcan, Eda]

        System.out.println(isimler.set(3, "Hasan")); // Mertcan

        System.out.println(isimler); // [Cennet, Serpil, Yusuf, Hasan, Eda]






    }
}
