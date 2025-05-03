package day56_nestedMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FarkliDataTurleriniBirlikteKullanma {

    public static void main(String[] args) {

        // Bir listenin icinde farkli data turlerinden degerler yazilabilir mi ?

        // List<String> seyler = new ArrayList<>();
        // seyler listesinin kullanacagi data turu olarak String secersek
        // Java icine sadece String veriler eklememize izin verir, baska hicbir data turunu kabul etmez

        List<Object> seyler = new ArrayList<>();


        seyler.add("Ali");
        seyler.add(20);
        seyler.add(true);
        seyler.add('a');

        Integer[] arr = {3,6,8};
        seyler.add(arr);

        /*
            Data turu olarak Object sectigimizde
            Object tum data turlerinin parent'i oldugundan
            her turlu datayi bu listeye ekleyebiliriz

            ANCAKKK baslangicta herseyi ekleyebilmek buyuk bir avantaj gibi gorukse de
                    sira elemanlari kullanmaya geldiginde
                    Object class'i en parent oldugu icin
                    child class'lara ait olan guncel method'lari barindirmaz
                    bu durumda
         */


        // seyler listesini yazdirin
        System.out.println(seyler); // [Ali, 20, true, a, [I@e580929]

        // listenin ilk elemani olan Ali'nin karakter sayisini yazdirin

        System.out.println(((String)seyler.get(0)).length()); // 3

        // listenin ikinci elemani olan 20'nin 2 katini yazdirin

        System.out.println((Integer)seyler.get(1) * 2); // 40

        // 4.index'deki array'i yazdirin
        System.out.println(Arrays.toString((Integer[]) seyler.get(4))); // [3, 6, 8]

    }
}
