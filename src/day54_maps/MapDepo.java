package day54_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {

    protected static Map<Integer,String> ogrenciMap = new HashMap<>();

     static{
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
    }


    // tum ogrencilerin soyisimlerini yazdiran bir method olusturalim
    protected static void tumSoyisimleriYazdir(){

         // 1.adim tum key'leri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet();
        // [101, 102, 103, 104, 105, 106, 107]

        System.out.println("Tum ogrencilerin soyisimleri : ");
        // 2.adim : her bir key'i tek tek ele alip,

        for ( Integer  eachKey :tumOgrenciNoSeti){ // 106

            // 3.adim : eachKey bize her bir key'i getirecek
            //          biz de o key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF

            // 4.adim : bilgilere ulasabilmek icin value'yu split edelim
            String[] eachValueArr = eachValue.split("-"); //  [Sevgi, Can, 10, K, MF]

            // 5.adim : istenen bilgiyi yazdirin
            System.out.print(eachValueArr[1] + ", ");


        }
        System.out.println("");

    }

    // Tum ogrencilerin no, isim ve soyisimlerini yazdiran bir method olusturun
    protected static void tumOgrencilerNoIsimSoyisimYazdir(){
        // 1.adim tum key'leri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet();

        // 2.adim : her bir key'i tek tek ele alip,
        System.out.println("Ogrenci No, isim ve soyisim listesi");

        for ( Integer  eachKey :tumOgrenciNoSeti) { // 106

            // 3.adim : eachKey bize her bir key'i getirecek
            //          biz de o key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF


            // 4.adim : bilgilere ulasabilmek icin value'yu split edelim
            String[] eachValueArr = eachValue.split("-"); //  [Sevgi, Can, 10, K, MF]

            // 5.adim : istenen bilgiyi yazdirin
            System.out.println( eachKey + " " + eachValueArr[0] + " " + eachValueArr[1]  );

        }
    }

    // baslangic ve bitis no verildiginde
    // bu numaralar ve arasindaki numaralarin no, isim, soyisim , sinif ve sube'lerini yazdiran
    // bir method olusturun

    protected static void numaraAraligindakiOgrenciBilgileriniYazdir(int baslangicNo, int bitisNo){

        // 1.adim tum key'leri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet();

        // 2.adim : her bir key'i tek tek ele alip,
        System.out.println("Verilen araliktaki ogrenci bilgileri : ");

        for ( Integer  eachKey :tumOgrenciNoSeti) { // 106

            // 3.adim : eachKey bize her bir key'i getirecek
            //          biz de o key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF


            // 4.adim : bilgilere ulasabilmek icin value'yu split edelim
            String[] eachValueArr = eachValue.split("-"); //  [Sevgi, Can, 10, K, MF]

            // 5.adim : istenen bilgiyi yazdirin
            if (baslangicNo<=eachKey && eachKey<=bitisNo){
                System.out.println(eachKey + " " + eachValueArr[0] + " " + eachValueArr[1] +
                        " " + eachValueArr[2] +" " + eachValueArr[3] );
            }

        }





    }



}
