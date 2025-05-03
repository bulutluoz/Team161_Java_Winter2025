package day56_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class NestedMapDepo {

    static Map<Integer, Map<String,String>> ogrenciNestedMap = new HashMap();

    static {
        mapeOgrenciEkle(101,"Ali","Can","11","H","MF");
        mapeOgrenciEkle(102,"Veli","Cem","10","K","TM");
        mapeOgrenciEkle(103,"Ali","Cem","11","K","TM");
        mapeOgrenciEkle(104,"Ayse","Can","10","H","MF");
        mapeOgrenciEkle(105,"Sevgi","Cem","11","M","TM");
        mapeOgrenciEkle(106,"Sevgi","Can","10","K","MF");
        mapeOgrenciEkle(107,"Esra","Han","11","M","SOZ");
    }

    protected static void mapeOgrenciEkle(int ogrNo, String isim, String soyisim, String sinif, String sube, String bolum) {

        Map<String,String> valueMap = new HashMap<>();
        valueMap.put("isim",isim);
        valueMap.put("soyisim",soyisim);
        valueMap.put("sinif",sinif);
        valueMap.put("sube",sube);
        valueMap.put("bolum",bolum);

        ogrenciNestedMap.put(ogrNo,valueMap);

    }



}
