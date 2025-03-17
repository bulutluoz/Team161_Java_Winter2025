package day26_arrays;

import java.util.Arrays;

public class C05_Split {

    public static void main(String[] args) {

        int[] arr = {1,    2,3,4,5};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        String str = "Ali topu at, at Ali at";

        System.out.println(Arrays.toString(  str.split("t")    )); // [Ali , opu a, , a,  Ali a]


        System.out.println(Arrays.toString(  str.split("topu")    )); // [Ali ,  at, at Ali at]


        // cumledeki en uzun kelimeyi yazdirin

        str = str.replace(",", ""); // "Ali topu at at Ali at"

        String[] cumledekiKelimeler = str.split(" "); // [Ali, topu, at, at, Ali, at]

        // ODEV : bu array'deki en uzun kelimeyi bulun







        // "Ali topu at at Ali at"

        System.out.println(Arrays.toString(str.split("")));
        // [A, l, i,  , t, o, p, u,  , a, t,  , a, t,  , A, l, i,  , a, t]



        // ODEV : cumledeki kucuk harfleri dogal siralasak
        //        en sonda hangi kucuk harf olur?






    }
}
