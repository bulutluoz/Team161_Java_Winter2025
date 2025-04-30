package day55_maps;

import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMapMethodlari {

    public static void main(String[] args) {


        Map<String,Integer>  harfler = new TreeMap<>();

        harfler.put("A",45);
        harfler.put("J",32);
        harfler.put("L",78);
        harfler.put("Z",12);
        harfler.put("B",66);
        harfler.put("G",24);

        // Data turu Map secildigi icin harfler map'i tum Map'lerle ayni ozellikleri tasir
        // Ama biz Child class'larin daha fazla ve daha guncel method'lara sahip olabilecegini biliyoruz



        TreeMap<String,Integer>  harfler1 = new TreeMap<>();

        harfler1.put("A",45);
        harfler1.put("J",32);
        harfler1.put("L",78);
        harfler1.put("Z",12);
        harfler1.put("B",66);
        harfler1.put("G",24);

        // Eger data turunu de TreeMap secersek
        // TreeMap'lere ozel pekcok method'un var oladugunu goruyoruz




    }
}
