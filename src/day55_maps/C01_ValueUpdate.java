package day55_maps;

import day54_maps.MapDepo;

public class C01_ValueUpdate extends MapDepo {

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


        // Tum ogrencilerin isimlerini ilk harfi buyuk, kalan harfler kucuk harf,
        // soyisimlerinin tamami buyuk harf olacak sekilde update edin

        tumIsimVeSoyisimleriDuzenle();

        System.out.println(ogrenciMap);

        /*
              {
                101=Ali-CAN-11-H-MF,
                102=Veli-CEM-10-K-TM,
                103=Ali-CEM-11-K-TM,
                104=Ayse-CAN-10-H-MF,
                105=Sevgi-CEM-11-M-TM,
                106=Sevgi-CAN-10-K-MF,
                107=Esra-HAN-11-M-SOZ
                }
         */


    }
}
