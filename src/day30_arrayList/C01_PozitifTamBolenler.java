package day30_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_PozitifTamBolenler {

    public static void main(String[] args) {
        // Verilen pozitif bir tamsayiyi,
        // tam bolebilen tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun.
        // ornek input : 20   return ==> [1, 2, 4, 5, 10, 20]

        System.out.println(getPozitifTamBolenler(20)); // [1, 2, 4, 5, 10, 20]

        System.out.println(getPozitifTamBolenler(100)); // [1, 2, 4, 5, 10, 20, 25, 50, 100]

        // verilen bir sayinin asal olup olmadigini
        // getPozitifTamBolenler( int sayi  ) method'u ile bulalim



        if (getPozitifTamBolenler(23).size() == 2) {
            System.out.println("verilen sayi asal");
        } else {
            System.out.println("verilen sayi asal degil");
        }

        if (getPozitifTamBolenler(105).size() == 2) {
            System.out.println("verilen sayi asal");
        } else {
            System.out.println("verilen sayi asal degil");
        }

    }


    public static List<Integer> getPozitifTamBolenler( int sayi  ){

        List<Integer> tamBolenlerListesi = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {

            if ( sayi % i == 0  ){
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;
    }

}
