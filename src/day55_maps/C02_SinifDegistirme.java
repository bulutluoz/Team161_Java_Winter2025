package day55_maps;

import day54_maps.MapDepo;

public class C02_SinifDegistirme extends MapDepo {

    public static void main(String[] args) {

        // verilen sinif ve sube'de egitim goren tum ogrencilerin
        // sinif ve subelerini yeni verilen degerler ile update edin
        // Orn : 10/K subesindeki ogrencileri 10/P olarak guncelleyin

        System.out.println(ogrenciMap);

        sinifVeSubeUpdate(10,"K",10,"P");

        System.out.println(ogrenciMap);

    }
}
