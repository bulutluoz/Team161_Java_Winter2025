package day54_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_OgrenciBilgileriniUpdateEtme {

    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");


        // 102 numarali ogrencinin sinifini 11/M yapin

        // Map'de islemleri kademelendirmemiz gerekir
        // once 102 numarali ogrencinin sinif ve subesine nasil ulasabilirim diye dusunelim

        // 1.adim 102 numarali ogrencinin value'sunu kaydedelim
        String ogrenci102Value = ogrenciMap.get(102);  // "Veli-Cem-10-K-TM"

        // 2.adim value bir bilgiler butunu oldugundan
        //        bilgilere ulasmak icin split yapmaliyiz
        String[] ogrenci102ValueArr = ogrenci102Value.split("-"); // [Veli, Cem, 10, K, TM]

        // 3.adim istenen update'i array'de yapalim
        ogrenci102ValueArr[2] = "11";
        ogrenci102ValueArr[3] = "M";
        // [Veli, Cem, 11, M, TM]


        // 4.adim  biz array'i update ettik, bizden istenen map'i update etme
        //         bunun icin array'i yeniden yeniValue olarak kaydedelim

        String yeniValue = String.join("-",ogrenci102ValueArr);

        System.out.println(yeniValue); // Veli-Cem-11-M-TM

        // 5.adim yeni value ile map'de 102 numarali ogrenciyi update edelim

        ogrenciMap.put(102,yeniValue);
        // ogrenciMap.replace(102,yeniValue);

        System.out.println(ogrenciMap);




    }
}
