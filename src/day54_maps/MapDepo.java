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

    // Tum ogrencilerin isimlerini ilk harfi buyuk, kalan harfler kucuk harf,
    // soyisimlerinin tamami buyuk harf olacak sekilde update eden bir method olusturun

    protected static void tumIsimVeSoyisimleriDuzenle(){

        // 1.adim tum key'leri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet();

        // 2.adim : her bir key'i tek tek ele alip,
        for ( Integer  eachKey :tumOgrenciNoSeti) { // 106

            // 3.adim : eachKey bize her bir key'i getirecek
            //          biz de o key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF


            // 4.adim : bilgilere ulasabilmek icin value'yu split edelim
            String[] eachValueArr = eachValue.split("-"); //  [Sevgi, Can, 10, K, MF]

            // 5.adim : istenen update'i yapin
            String eskiIsim = eachValueArr[0];
            String eskiSoyisim = eachValueArr[1];

            String yeniIsim = eskiIsim.substring(0, 1).toUpperCase() +
                    eskiIsim.substring(1).toLowerCase();
            String yeniSoyisim = eskiSoyisim.toUpperCase();

            // array'i yeni isimlerle update edelim
            eachValueArr[0] = yeniIsim;
            eachValueArr[1] = yeniSoyisim;
            //  [Sevgi, CAN, 10, K, MF]

            // update'i array'de yaptik
            // yapilan update'i map'e islemeliyiz
            // 6.adim array'i value olacak sekilde birlestirip
            //        yeni value olarak kaydedelim

            String yeniValue = String.join("-",eachValueArr);  // Sevgi-CAN-10-K-MF

            // 7.adim : yeni value ile map'i update edelim

            ogrenciMap.put(eachKey,yeniValue);

        }
    }


    // verilen sinif ve sube'de egitim goren tum ogrencilerin
    // sinif ve subelerini yeni verilen degerler ile update edin
    // Orn : 10/K subesindeki ogrencileri 10/P olarak guncelleyin

    protected static void sinifVeSubeUpdate(int eskiSinif, String eskiSube, int yeniSinif, String yeniSube){

        // 1.adim tum key'leri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet();

        // 2.adim : her bir key'i tek tek ele alip,

        for ( Integer  eachKey :tumOgrenciNoSeti) { // 106

            // 3.adim : eachKey bize her bir key'i getirecek
            //          biz de o key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF


            // 4.adim : bilgilere ulasabilmek icin value'yu split edelim
            String[] eachValueArr = eachValue.split("-"); //  [Sevgi, Can, 10, K, MF]

            // 5.adim : istenen update'i yapin
            // verilen sinif ve sube'de egitim goren tum ogrencilerin
            // sinif ve subelerini yeni verilen degerler ile update edin
            // eski sinif ve subeyi kontrol etmeli, degismesi gereken sinif ve sube ise degistirmeliyiz

            String ogrencininSinifi = eachValueArr[2];
            String ogrencininSubesi = eachValueArr[3];

            if (ogrencininSinifi.equalsIgnoreCase(eskiSinif+"") && ogrencininSubesi.equalsIgnoreCase(eskiSube)){
                // eger ogrencinin sinif ve subesi degismesi gerekiyorsa
                // array'i update edelim
                eachValueArr[2] = yeniSinif+"" ;
                eachValueArr[3] = yeniSube ;

            }

            // update'i array'de yaptik
            // yapilan update'i map'e islemeliyiz
            // 6.adim array'i value olacak sekilde birlestirip
            //        yeni value olarak kaydedelim

            String yeniValue = String.join("-",eachValueArr);  // Sevgi-CAN-10-K-MF

            // 7.adim : yeni value ile map'i update edelim

            ogrenciMap.put(eachKey,yeniValue);

        }



    }


    // Yil sonunda calisacak sekilde
    // tum ogrencileri sube ayni kalacak sekilde bir ust sinifa tasiyin
    // Not : 12.siniftakiler ==> mezun olacak
    //       mezun olanlar ayni kalacak

    protected static void yilSonuSinifArtir(){
        // 1.adim tum key'leri kaydedin
        Set<Integer> tumOgrenciNoSeti = ogrenciMap.keySet();

        // 2.adim : her bir key'i tek tek ele alip,

        for ( Integer  eachKey :tumOgrenciNoSeti) { // 106

            // 3.adim : eachKey bize her bir key'i getirecek
            //          biz de o key'e ait value'yu kaydedelim
            String eachValue = ogrenciMap.get(eachKey); // Sevgi-Can-10-K-MF


            // 4.adim : bilgilere ulasabilmek icin value'yu split edelim
            String[] eachValueArr = eachValue.split("-"); //  [Sevgi, Can, 10, K, MF]

            // 5.adim : istenen update'i yapin
            // verilen sinif ve sube'de egitim goren tum ogrencilerin
            // tum ogrencileri sube ayni kalacak sekilde bir ust sinifa tasiyin
            // Not : 12.siniftakiler ==> mezun olacak
            //       mezun olanlar ayni kalacak

            String ogrecininSinifi = eachValueArr[2];

            switch (ogrecininSinifi){

                case "9" :
                    eachValueArr[2] = "10";
                    break;
                case "10" :
                    eachValueArr[2] = "11";
                    break;
                case "11" :
                    eachValueArr[2] = "12";
                    break;
                case "12" :
                    eachValueArr[2] = "Mezun";
                    break;
                case "Mezun" :
                    // degisiklik yapilmadi
                    break;
            }


            // update'i array'de yaptik
            // yapilan update'i map'e islemeliyiz
            // 6.adim array'i value olacak sekilde birlestirip
            //        yeni value olarak kaydedelim

            String yeniValue = String.join("-",eachValueArr);  // Sevgi-CAN-10-K-MF

            // 7.adim : yeni value ile map'i update edelim

            ogrenciMap.put(eachKey,yeniValue);

        }



    }
}
