package day24_arrays;

import java.util.Arrays;

public class C02_ArraydekiElemanlariKullanma {

    public static void main(String[] args) {


        int[] sayilar = {3,      7,9,12,54,16,89};

        // sayilar array'ideki ilk sayi olan 3'u yazdirin
        System.out.println(  sayilar[0]  ); // 3


        // sayilar array'indeki 9'u 29 olarak update edin
        sayilar[2] = 29;

        System.out.println(sayilar[2]); // 29

        // array'deki tum elemanlari yanyana yazdirin

        for (int i = 0; i < sayilar.length ; i++) {

            System.out.print( sayilar[i] + " ");
        }

        System.out.println();

        // {3,7,9,12,54,16,89};
        // sayilar array'ine yeni bir eleman eklemek istiyoruz
        // 7.index'e 20 degerini ekleyin

        // sayilar[7] = 20; // ArrayIndexOutOfBoundsException

        // Array'in uzunlugu sonradan degistirilmez
        // bir array'e sonradan eleman ekleyemeyiz
        // veya var olan bir elementi silemeyiz


        // Array'i yazdirin

        System.out.println(sayilar); // [I@6bf256fa

        // Bir array'i direkt olarak yazdirmak isterseniz
        // Java array'in referansini yazdirir

        // Array'i yazdirmak icin Arrays class'indan hazir method kullaniriz

        System.out.println(Arrays.toString(sayilar)); // [3, 7, 29, 12, 54, 16, 89]



    }
}
