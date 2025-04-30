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


    }
}
