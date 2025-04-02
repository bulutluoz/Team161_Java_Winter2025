package day36_staticBlocks_passByValue;

import java.util.Arrays;

public class C07_CokluYapilardaPassByValue {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        arrayiDegistir(arr); // method'da sayilar array'inin son hali : [1, 2, 3]

        System.out.println("method call'dan sonra main method'da arr : " + Arrays.toString(arr));
        // method call'dan sonra main method'da arr : [1, 2, 3, 4, 5, 6, 7, 8]

        // method'da array'in elemanlarina DEGIL,
        // direkt array'in kendisine atama yapilmis
        // Java bunu kabul etmez
        // o method'da yapilan degisiklik orada kalir


    }


    // verilen int elemanlari olan bir array'i
    // icinde 1,2 ve 3'un oldugu yeni bir array'e donusturup
    // son halini yazdiran bir method olusturun

    public static void arrayiDegistir( int[] sayilar  ){

        int[] yeniArr = {1,2,3};

        sayilar = yeniArr;

        System.out.println("method'da sayilar array'inin son hali : " + Arrays.toString(sayilar));


    }
}
