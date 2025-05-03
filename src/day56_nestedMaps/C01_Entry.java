package day56_nestedMaps;

import day54_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_Entry extends MapDepo {

    public static void main(String[] args) {


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

        System.out.println(ogrenciMap.size()); // 7

        /*
            ogrenci map'inde 7 eleman var
            AMMAAA her bir elemanin key'i ve value'su ayri ayri ayri

            ogrenci map'indeki elemanlarin 1., 3., 5. gibi tek index'de olanlari yazdirin

            map index kullanmaz, dolayisiyla map'den index ile eleman cagiramayiz

            daha onceki gorevlerde
            map'deki herbir elemana ulasmak icin
            ONCE keySet() ile key'leri aldik,
            SONRA bir for-each loop ile eachKey'i ele alip
            eachKey ve o key'e ait value'yu cagirip
            key ve value'yu AYRI AYRI yonettik

            EGER
            Key ve Value'yu birlikte kullanmak isterseniz
            Java'nin olusturdugu Entry<> class'ini kullanabiliriz

         */

         Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        System.out.println(ogrenciEntrySeti);

        /*
            [
                101=Ali-Can-11-H-MF,
                102=Veli-Cem-10-K-TM,
                103=Ali-Cem-11-K-TM,
                104=Ayse-Can-10-H-MF,
                105=Sevgi-Cem-11-M-TM,
                106=Sevgi-Can-10-K-MF,
                107=Esra-Han-11-M-SOZ
                ]

            Gorunuste map ile EntrySet arasinda tek fark {} yerine [] gelmesi gibi goruksede
            EN BUYUK 2 FARK
            1- Map key ve value'yu ayri ayri tutarken, Entry ikisini birlikte tutar
            2- Entry'leri bir Set olarak kaydedebildigimiz icin
               for-each loop kullanarak
               tum key ve value'leri elden gecirebiliriz
         */

        for ( Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){
            System.out.println(eachEntry);

        }

        /*
            101=Ali-Can-11-H-MF
            102=Veli-Cem-10-K-TM
            103=Ali-Cem-11-K-TM
            104=Ayse-Can-10-H-MF
            105=Sevgi-Cem-11-M-TM
            106=Sevgi-Can-10-K-MF
            107=Esra-Han-11-M-SOZ
         */

        // value'deki tum bilgileri buyuk harfe cevirin

        for ( Map.Entry<Integer,String> eachEntry : ogrenciEntrySeti){

            String eskiValue = eachEntry.getValue();
            String yeniValue = eskiValue.toUpperCase();

            eachEntry.setValue(yeniValue);

            // 3 satir kodu tek satir halinde de yazabiliriz
            //eachEntry.setValue(eachEntry.getValue().toUpperCase());
        }
        /*
            Entry kullaninca
            Entry ile gelen
            getKey(), getValue() ile Entry'e ait key ve value'yu goruntuleyebilir
            setValue(yeniDeger) ile ogrenci map'ini kullanmadan, ogrenci map'ini update edebilirsiniz
         */


        System.out.println(ogrenciEntrySeti);
        /*
            [
                101=ALI-CAN-11-H-MF,
                102=VELI-CEM-10-K-TM,
                103=ALI-CEM-11-K-TM,
                104=AYSE-CAN-10-H-MF,
                105=SEVGI-CEM-11-M-TM,
                106=SEVGI-CAN-10-K-MF,
                107=ESRA-HAN-11-M-SOZ
                ]

         */
    }
}
