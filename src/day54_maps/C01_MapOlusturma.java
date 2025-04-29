package day54_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        for (int each : ogrenciMap.keySet()){
            if (each >105){
                System.out.print(each +" ");
            }
        }

        // 106 107
        System.out.println("");


        // map'deki ogrencilerin numaralari olmadan sadece value'lerini yazdirin

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        // ogrenci numaralarini bir Set olarak kaydedin
        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet();

        // map'deki ogrencilerin numaralari olmadan sadece value'lerini kaydedin
        Collection<String> ogrenciValueCollection = ogrenciMap.values();


        // map'de 102 numarasina sahip bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsKey(102)); // true


        // map'de 110 numarasina sahip bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsKey(110)); // false


        // ismi Ali olan bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // her bir elemanin 1 key, 1 value'su bulunur
        // ve value'su sadece "Ali" olan bir eleman yok


        // bilgileri "Ali-Can-11-H-MF" olan bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsValue("Ali-Can-11-H-MF")); // true


        // bilgileri "Veli-Cem-10-K-TM" olan bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsValue("Veli-Cem-10-K-TM")); // true


        // bilgileri "Veli-Cem-11-K-TM" olan bir ogrenci var mi ?
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-K-TM")); // false

        // Value icin bilgileri birlestirip tek bir String yaptik
        // value ile bir ogrencinin sadece ismi veya sadece soyismi ayni sey degildir
        // value tum bilgileri iceren tek bir yapidir



    }
}
