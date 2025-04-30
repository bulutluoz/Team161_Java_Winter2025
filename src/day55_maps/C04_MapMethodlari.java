package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C04_MapMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("A",45);
        harfler.put("J",32);
        harfler.put("L",78);
        harfler.put("Z",12);
        harfler.put("B",66);
        harfler.put("G",24);


        System.out.println(harfler); //  {A=45, B=66, G=24, J=32, L=78, Z=12}

        harfler.remove("A",56);

        System.out.println(harfler); //  {A=45, B=66, G=24, J=32, L=78, Z=12}

        harfler.remove("A",45);

        System.out.println(harfler); //  {B=66, G=24, J=32, L=78, Z=12}

        harfler.remove("J");

        System.out.println(harfler); //  {B=66, G=24, L=78, Z=12}

        // Eger map'de A yoksa degeri 56 olacak sekilde ekleyin

        //harfler.put("A",56); // var olup olmadigina bakmaksizin ekler
                             // yoksa eklemis olur, varsa eski degeri update eder
                             // biz bunu istemiyoruz

        harfler.putIfAbsent("A",56);

        System.out.println(harfler); //  {A=56, B=66, G=24, L=78, Z=12}


        // Eger map'de A varsa degerini 44 olarak update edin

        harfler.replace("A", 44);
        System.out.println(harfler); //  {A=44, B=66, G=24, L=78, Z=12}


        // Eger map'de M varsa degerini 22 yapin
        harfler.replace("M",22);

        System.out.println(harfler); //  {A=44, B=66, G=24, L=78, Z=12}

    }
}
