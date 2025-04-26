package day53_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList_List {

    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        /*
            Eger bir List olusturmak istersek
            List bir interface oldugundan
            direkt olarak new List<>() kullanamayiz

            bunun yerine List'in concrete child'i olan
            ArrayList<>() veya LinkedList<>() constructor'larini kullanabiliriz

            Her ne kadar farkli constructor kullansak da
            new LinkedList<>() ile olusturdugumuz bir liste
            data turu List<> secildigi icin
            ArrayList'ler ile ayni method'lari barindirir
         */

        /*
            Java olusturdugu her variable veya objeye
            bir hash code verir

            hashCode'un bizim icin anlamli olmasi sart degildir
            ama Java o hash code'un anlamini bilir
            ve o elemana kolayca ulasir




            120106108039
            12 --> giris yili
            01 -> fakulte --> muhendislik fakultesi
            06 -> bolum --> Biomedikal Muh.
            108039 -> ogrenci no
         */

        System.out.println(isimler.hashCode()); // 1

        isimler.add("Ali");

        System.out.println(isimler.hashCode()); // 65949

        isimler.add("10 dakika ara");

        System.out.println(isimler.hashCode()); // 692097413



    }
}
