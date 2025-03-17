package day26_arrays;

import java.util.Arrays;

public class C01_ArrayeYeniDegerAtama {

    public static void main(String[] args) {

        // olusturulan bir array'in uzunlugu
        // sonradan eleman ekleyerek veya eleman silinerek DEGISTIRILEMEZ

        int[] sayilar = {3,4,5};

        // 4.eleman olarak 10 ekleyin

        // sayilar[3] = 10;
        // ArrayIndexOutOfBoundsException



        // AMMA array'e tamamen yeni bir deger atamasi yapabiliriz

        // var olan bir array'e yeni liste seklinde atama YAPILAMAZ
        // sayilar = {5,6,7,8};

        // ya once array'i baska bir isimle olusturup sonra atama yapabiliriz
        int[] yenArr = {5,6,7,8};

        sayilar = yenArr;

        System.out.println(Arrays.toString(sayilar)); // [5, 6, 7, 8]


        // ya da icinde default degerlerin oldugu array'i direkt sayilar'a atama yapabiliriz
        sayilar = new int[6];
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0]



    }
}
