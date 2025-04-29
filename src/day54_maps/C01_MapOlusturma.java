package day54_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapOlusturma {

    public static void main(String[] args) {

        // Map olusturmadan once bazi seyleri netlestirmek gereklidir
        // 1- tutulacak bilgiler icinde key hangisi olacak  (ogr No)
        // 2- Value olarak hangi bilgiler tutulacak ( isim, soyisim, sinif, sube, bolum)
        // 3- bu bilgiler standart olarak nasil tek bir value haline getirilecek
        //    bilgiler aralarinda - olacak sekilde bir String olarak birlestirilecek
        //    bilgi siralamasi   "isim-soyisim-sinif-sube-bolum"

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);

        /*
            {
                    101=Ali-Can-11-H-MF,
                    102=Veli-Cem-10-K-TM,
                    103=Ali-Cem-11-K-TM,
                    104=Ayse-Can-10-H-MF,
                    105=Sevgi-Cem-11-M-TM,
                    106=Sevgi-Can-10-K-MF,
                    107=Esra-Han-11-M-SOZ
              }

         */

        // map'in eleman sayisini yazdirin

        System.out.println(ogrenciMap.size()); // 7


        // ogrenci numaralarini yazdirin

        System.out.println(ogrenciMap.keySet());  //  [101, 102, 103, 104, 105, 106, 107]


        // numarasi 105'den buyuk olan ogrenci numaralarini yazdirin


    }
}
