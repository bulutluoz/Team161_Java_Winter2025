package day55_maps;

import java.util.TreeMap;

public class C07_TreeMapMethodlari {

    public static void main(String[] args) {
        TreeMap<String,Integer> harfler = new TreeMap<>();
        harfler.put("A",20);
        harfler.put("B",40);
        harfler.put("T",25);
        harfler.put("R",30);
        harfler.put("Z",2);

        TreeMap<String,Integer> harfler2 = new TreeMap<>();


        // TreeMap DOGAL SIRALI oldugundan
        // bir elemanin sirada onundekiler veya arkasindakiler ile ilgili
        // pek cok method vardir

        System.out.println(harfler); // {A=20, B=40, R=30, T=25, Z=2}
        // 1- headMap verilen Key'den basa kadar olan tum map'i verir
        //    girdigimiz key bitis degeri oldugundan map'e dahil olmaz
        //    eger olmayan bir key verilirse, o key olsaydi nerede olurdu diye bakar
        //    ve o konumdan basa kadar olan map'i verir
        //    Eger 2.parametre olarak true girilirse, girilen key bitis key'i olmasina ragmen dahil eder

        System.out.println(harfler.headMap("R"));  // {A=20, B=40}

        System.out.println(harfler.headMap("Y")); // {A=20, B=40, R=30, T=25}

        System.out.println(harfler.headMap("R", true)); // {A=20, B=40, R=30}

        // {A=20, B=40, R=30, T=25, Z=2}
        // 2 - tail Map : girilen key dahil, sonrasindeki Entry'leri verir
        //     girilen key baslangic oldugundan dahil olur
        //     eger olmayan bir key verilirse, o key olsaydi nerede olurdu diye bakar
        //     ve o konumdan sona kadar olan map'i verir
        //    Eger 2.parametre olarak false girilirse, girilen key baslangic key'i olmasina ragmen dahil etmez


        System.out.println(harfler.tailMap("B")); // {B=40, R=30, T=25, Z=2}
        System.out.println(harfler.tailMap("K")); // {R=30, T=25, Z=2}
        System.out.println(harfler.tailMap("B",false)); // {R=30, T=25, Z=2}


        // 3- lowerKey : verilen key'den kucuk olan key'lerin en buyugu
        //               diger bir deyisle verilen key'den bir onceki key
        //    floorKey : verilen key'den kucuk veya esit olan tum key'ler icinde en buyugu verir
        //               diger deyisle verilen key'i asagi dogru yuvarlar

        // {A=20, B=40, R=30, T=25, Z=2}

        System.out.println(harfler.lowerKey("R")); // B   kucuk olan
        System.out.println(harfler.lowerKey("Y")); // T   kucuk olan

        System.out.println(harfler.floorKey("R")); // R    kucuk esit olan
        System.out.println(harfler.floorKey("Y")); // T    kucuk esit olan



        // 4- higherKey : verilen key'den buyuk olan key'ler icerisinde en kucuk olani verir
        //    ceilingKey : verilen key'den buyuk esit olan key'ler icerisinde en kucuk olani verir
        // {A=20, B=40, R=30, T=25, Z=2}

        System.out.println(harfler.higherKey("R")); // T   buyuk olan
        System.out.println(harfler.higherKey("Y")); // Z   buyuk olan

        System.out.println(harfler.ceilingKey("R")); // R    buyuk esit olan
        System.out.println(harfler.ceilingKey("Y")); // Z    buyuk esit olan


        // 5- pollFirstEntry() ilk entry'yi siler ve bize getirir
        //    map bossa null getirir

        // {A=20, B=40, R=30, T=25, Z=2}

        System.out.println(harfler.pollFirstEntry()); // A=20

        System.out.println(harfler); // {B=40, R=30, T=25, Z=2}

        System.out.println(harfler.pollLastEntry()); // Z=2

        System.out.println(harfler); // {B=40, R=30, T=25}

        System.out.println(harfler2.pollFirstEntry()); // null

        System.out.println(harfler2.pollLastEntry()); // null

        // {B=40, R=30, T=25}
        System.out.println(harfler.descendingMap()); //  {T=25, R=30, B=40}

        // harfler = harfler.descendingMap();
        // harfler treeMap yani elementleri dogal sirali olarak tutar
        // tersten siralanmis bir map'i treemap kabul etymez


        // Java'nin genel kabulu
        // baslangic degerleri dahil, bitis degerleri haric olur
        // baslangic ve bitis'in bu genel kurala uymamasini isterseniz
        // parametre olarak true ve false yazarak duzenleyebilirsiniz
        System.out.println(harfler.subMap("R", "T")); // {R=30}

        System.out.println(harfler.subMap("K","Y")); // {R=30, T=25}

        System.out.println(harfler.subMap("B", false, "T", true)); // {R=30, T=25}

    }

}
