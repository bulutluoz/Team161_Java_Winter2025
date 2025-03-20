package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_RemoveAll {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>(Arrays.asList("a","d","r","t","a","g","l","d","r","t","a"));

        List<String> silinecekler1 = new ArrayList<>(Arrays.asList("a","r","l"));


        List<String> silinecekler2 = new ArrayList<>(Arrays.asList("a","x","l"));


        List<String> silinecekler3 = new ArrayList<>(Arrays.asList("a","x","y"));


        List<String> silinecekler4 = new ArrayList<>(Arrays.asList("b","x","y"));


        System.out.println(harfler); // [a, d, r, t, a, g, l, d, r, t, a]

        System.out.println(harfler.removeAll(silinecekler4)); // false
        System.out.println(harfler); // [a, d, r, t, a, g, l, d, r, t, a]



        //System.out.println(harfler.removeAll(silinecekler3)); // true
        //System.out.println(harfler); // [d, r, t, g, l, d, r, t]


        //System.out.println(harfler.removeAll(silinecekler2)); // true
        //System.out.println(harfler); // [d, r, t, g, d, r, t]



        //System.out.println(harfler.removeAll(silinecekler1)); // true
        // remove method'unun amaci silmekdir
        // removeAll() verilen silinecek harfleri ana listeden siler
        // ve sildim demek icin
        // ana liste degisti ise true dondurur,
        // ana listeden hic eleman silemezse, yani ana liste degismezse false dondurur
        //System.out.println(harfler); // [d, t, g, d, t]


    }
}
