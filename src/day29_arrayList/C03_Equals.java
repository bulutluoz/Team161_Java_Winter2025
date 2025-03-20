package day29_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C03_Equals {
    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<>(Arrays.asList("Merve","Cennet","Buse","Serpil"));
        List<String> liste2 = new ArrayList<>(Arrays.asList("Merve","Serpil","Buse","Cennet"));

        System.out.println(liste1.equals(liste2)); // false


        // equals() her bir index'deki elemanlari karsilastirir
        // tum index'lerdeki elemanlar karsilikli olarak esit ise
        // true dondurur


        // elemanlar ayni ama siralama farkli oldugunda equals() false dondurur
        // siralamayi duzenlemek istersek

        Collections.sort(liste1);
        Collections.sort(liste2);
        // atama yapmasak da List'lerde yapilan degisiklikler kalici olur

        System.out.println(liste1); // [Buse, Cennet, Merve, Serpil]
        System.out.println(liste2); // [Buse, Cennet, Merve, Serpil]

        System.out.println(liste1.equals(liste2)); // true

    }
}
