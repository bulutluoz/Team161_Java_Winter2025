package day26_arrays;

import java.util.Arrays;

public class C06_MethodlariKullanma {

    public static void main(String[] args) {


        int[] arr = {5,8,1,3};

        // arr'ye 5.eleman olarak 9 ekleyin
        arr = C02_ArrayeKaliciOlarakBirElemanEkleme.arrayeElemanEkle(arr,9);

        System.out.println(Arrays.toString(arr)); //  [5, 8, 1, 3, 9]

        // 6.eleman olarak 4 ekleyin

        arr = C02_ArrayeKaliciOlarakBirElemanEkleme.arrayeElemanEkle(arr,4);

        System.out.println(Arrays.toString(arr)); // [5, 8, 1, 3, 9, 4]

    }
}
