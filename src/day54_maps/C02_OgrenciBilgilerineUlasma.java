package day54_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_OgrenciBilgilerineUlasma {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);

        // 103 numarali ogrencinin value'sunu yazdirin
        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // 103 numarali ogrencinin value'sunu kaydedin
        String ogrenci103Value = ogrenciMap.get(103);

        // 103 numarali ogrencinin soyismini yazdirin
        System.out.println(ogrenci103Value); // Ali-Cem-11-K-TM

        // value icerisinde spesifik bir bilgiye ulasmak icin
        // value'yu bilgilere parcalamak (split) lazim

        String ogrenci103ValueArr[] = ogrenci103Value.split("-"); // [Ali, Cem, 11, K, TM]

        System.out.println("ogrenci 103 isim : " + ogrenci103ValueArr[0]);
        System.out.println("ogrenci 103 soyisim : " + ogrenci103ValueArr[1]);




    }
}
