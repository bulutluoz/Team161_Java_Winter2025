package day26_arrays;

import java.util.Arrays;

public class C02_ArrayeKaliciOlarakBirElemanEkleme {

    public static void main(String[] args) {

        int[] sayilar = {3,4,5,8,1};
        // 4.eleman olarak 10 ekleyin

        // 1.adim : uzunlugu sayilar'dan 1 fazla olan yeni bir array olusturalim


        // 2.adim : sayilar array'indeki eski elemanlari yeni array'e kopyalayalim
        int[] yeniArr  = Arrays.copyOf(sayilar,sayilar.length+1);  // [3, 4, 5, 0]

        // 3.adim : eklenmek istenen sayiyi son eleman olarak atayalim
        yeniArr[yeniArr.length-1] = 10; // [3, 4, 5, 10]

        // 4.adim : sayilar array'ine yeniArr'yi deger olarak atayalim
        sayilar = yeniArr;



        System.out.println("sayilar array'inin son hali : "+ Arrays.toString(sayilar));


    }


    // verilen int bir array'in sonuna
    // verilen int bir elementi ekleyip
    // yeni halini donduren bir method olusturun

    public static int[] arrayeElemanEkle( int[] eskiArr , int eklenecekSayi  ){

        int[] yeniArr  = Arrays.copyOf(eskiArr,eskiArr.length+1);
        yeniArr[yeniArr.length-1] = eklenecekSayi;

        return yeniArr;

    }


}
