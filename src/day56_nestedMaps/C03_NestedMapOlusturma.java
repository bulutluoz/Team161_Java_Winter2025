package day56_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMapOlusturma {

    public static void main(String[] args) {

        /*
            Map olusturmaya baslamadan su sorulari cevaplamaliyiz
            1- hangi bilgiler tutulacak
               no, isim, soyisim, sinif, sube, bolum

            2- hangi bilgi key olacak?
               unique olabilecek ogrenviNo key olsun

            3- Kalan bilgileri nasil tek bir value haline getireceksiniz?
              kalan bilgileri inner bir map olarak olusturacagiz
              {isim= ali, soyisim=can, sinif=10, sube=H, bolum=MF}

         */

        Map<Integer, Map<String,String> > ogrenciNestedMap = new HashMap<>();

        // ogrenciNestedMap'e bir ogrenciyi ekleyebilmek icin
        // once o ogrencinin valueMap'ini olusturmaliyiz

        Map<String,String> ogrenci101ValueMap = new HashMap<>();
        ogrenci101ValueMap.put("isim","Ali");
        ogrenci101ValueMap.put("soyisim","Can");
        ogrenci101ValueMap.put("sinif","11");
        ogrenci101ValueMap.put("sube","H");
        ogrenci101ValueMap.put("bolum","MF");

        ogrenciNestedMap.put(101,ogrenci101ValueMap);

        Map<String,String> ogrenci102ValueMap = new HashMap<>();
        ogrenci102ValueMap.put("isim","Veli");
        ogrenci102ValueMap.put("soyisim","Cem");
        ogrenci102ValueMap.put("sinif","10");
        ogrenci102ValueMap.put("sube","K");
        ogrenci102ValueMap.put("bolum","TM");

        ogrenciNestedMap.put(102,ogrenci102ValueMap);


        System.out.println(ogrenciNestedMap);
        /*
            {
                101= {sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
                102= {sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli}
                }
         */



        // 101 numarali ogrencinin sinifini yazdirin
        // once ogrenciNestedMap'den 101 numarali ogrencinin valuesunu alip
        // onun icinden de ogrencinin sinifini alacagiz

        System.out.println(ogrenciNestedMap.get(101).get("sinif")); // 11

        // 102 numarali ogrencinin soyismini yazdirin
        System.out.println(ogrenciNestedMap.get(102).get("soyisim")); // Cem

        // 101 numarali ogrencinin subesini P yapin
        System.out.println(ogrenciNestedMap.get(101)); // {sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali}

        ogrenciNestedMap.get(101).put("sube","P");

        System.out.println(ogrenciNestedMap);


    }
}
