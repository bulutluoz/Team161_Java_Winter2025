package day53_collections;

import java.util.HashSet;
import java.util.Set;

public class C04_Set {

    public static void main(String[] args) {

        // matematik'deki kume gibidir
        // her elemandan SADECE 1 tane bulunur.
        // index desteklemez


        Set<String> isimler = new HashSet<>();

        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Can");

        System.out.println(isimler); // [Can, Veli, Ali]

        isimler.add("Kemal");
        // ismin nereye eklenecegini bilemeyiz
        // Set index kullanmaz ve siralamayi onemsemez

        System.out.println(isimler); // [Can, Veli, Kemal, Ali]

        isimler.add("Veli");
        isimler.add("Can");

        System.out.println(isimler); // [Can, Veli, Kemal, Ali]





    }
}
