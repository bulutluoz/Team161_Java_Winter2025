package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C05_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",45);
        harfler.put("J",32);
        harfler.put("L",78);
        harfler.put("Z",12);
        harfler.put("B",66);
        harfler.put("G",24);


        System.out.println(harfler); //  {A=45, B=66, G=24, J=32, L=78, Z=12}

        // A nin degerini 2 katina cikarin

        harfler.replace("A",2* harfler.get("A") );
        System.out.println(harfler); //  {A=90, B=66, G=24, J=32, L=78, Z=12}


        // K'nin degerini 2 katina cikarin

        if (harfler.containsKey("K")){
            harfler.replace("K",2* harfler.get("K") );
        }

        System.out.println(harfler); //  {A=90, B=66, G=24, J=32, L=78, Z=12}


        // eger map'de L yoksa degeri 60 olacak sekilde ekleyin

        // harfler.putIfAbsent("L",60); // 1. yontem

        if (!harfler.containsKey("L")){ // 2.yontem
            harfler.put("L",60);
        }
        System.out.println(harfler); //  {A=90, B=66, G=24, J=32, L=78, Z=12}


        // G'nin degerini 10 artirin
        // gorevde soylememis ama G'nin var oldugunu kontrol edip sonra artirma islemini yapmaliyiz

        if (harfler.containsKey("G")){

            harfler.replace("G", harfler.get("G") + 10);
        }
        System.out.println(harfler); //  {A=90, B=66, G=34, J=32, L=78, Z=12}


        // G'nin degerini 10 artirin
        // gorevde soylememis ama G'nin var oldugunu kontrol edip sonra artirma islemini yapmaliyiz

        harfler.computeIfPresent( "G" , (k,v) -> v+10  );
        System.out.println(harfler); //  {A=90, B=66, G=44, J=32, L=78, Z=12}


        // H varsa degerini 5 azaltin
        harfler.computeIfPresent("H", (k,v) -> v-5);

        System.out.println(harfler); //  {A=90, B=66, G=44, J=32, L=78, Z=12}


        // K yoksa degeri 10 olacak sekilde ekleyin

        //1.yontem put if absent
        //  harfler.putIfAbsent("K",10);

        //2.yontem computeIfAbsent
        harfler.computeIfAbsent("K" , v-> 10);


        System.out.println(harfler); //  {A=90, B=66, G=44, J=32, K=10, L=78, Z=12}


        // A'nin degerini 2 katinin 4 fazlasi yapin

        // eger A'nin varligini sorgulamadan direk islem yapmak istersek
        harfler.compute("A", (a,b) -> 2*b+4);
        // Unboxing of 'b' may produce 'NullPointerException'
        // sariya boyayip uyari veriyor, ya A yoksa diye

        System.out.println(harfler); //  {A=184, B=66, G=44, J=32, K=10, L=78, Z=12}


        // risk almamak icin A nin varligini kontrol etmek daha iyi olacaktir

        harfler.computeIfPresent("A", (k,v)-> 2*v+4);
        System.out.println(harfler); //  {A=372, B=66, G=44, J=32, K=10, L=78, Z=12}



    }
}
