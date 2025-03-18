package day27_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA_Kullanma {

    public static void main(String[] args) {

        int[][] sayilar = {{3,5,4},{2,3,6,8},{2,4},{10},{3,9,0,2,7}};


        // sayilar array'inin kac elemani var?

        System.out.println(sayilar.length); // 5

        // sayilar array'indeki 9'u yazdirin
        System.out.println(sayilar[4][1]); // 9


        // sayilar array'inin icinde 2.index'deki inner array'i yazdirin
        System.out.println(  sayilar[2]   ); // [I@2752f6e2
        System.out.println(   Arrays.toString(  sayilar[2] )   ); // [2, 4]

        // sayilar[3] 'un eleman sayisi kactir?
        System.out.println( sayilar[3].length); // 1

        // sayilar[3] 'u yazdirin
        System.out.println( Arrays.toString(sayilar[3])); // [10]

        // sayilar[3]'un icindeki sayiyi yazdirin
        System.out.println(sayilar[3][0]); // 10

        // {{3,5,4},{2,3,6,8},{2,4},{10},{3,9,0,2,7}};
        // sayilar[1] 'i yazdirin

        System.out.println( Arrays.toString(sayilar[1])); // [2, 3, 6, 8]

        // sayilardaki eleman olan 8'i yazdirin
        System.out.println(sayilar[1][3]); // 8

        // tum array'i yazdirin
        System.out.println(sayilar); // [[I@e580929

        System.out.println(Arrays.toString(sayilar));
        // [[I@1cd072a9, [I@7c75222b, [I@2752f6e2, [I@4c203ea1, [I@27f674d]

        // Multidimensional array'leri yazdirmak icin
        System.out.println( Arrays.deepToString(sayilar)  );
        //   [[3, 5, 4], [2, 3, 6, 8], [2, 4], [10], [3, 9, 0, 2, 7]]



    }
}
