package day55_maps;

import day54_maps.MapDepo;

public class C03_YilSonuSinifUpdate extends MapDepo {

    public static void main(String[] args) {

        // Yil sonunda calisacak sekilde
        // tum ogrencileri sube ayni kalacak sekilde bir ust sinifa tasiyin
        // Not : 12.siniftakiler ==> mezun olacak
        //       mezun olanlar ayni kalacak

        System.out.println(ogrenciMap);


        yilSonuSinifArtir();
        System.out.println(ogrenciMap);


        yilSonuSinifArtir();
        System.out.println(ogrenciMap);

    }
}
