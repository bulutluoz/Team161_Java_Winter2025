package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ListdenElemanSilme {

    public static void main(String[] args) {


        List<String> isimler = new ArrayList<>(Arrays.asList( "Cennet", "Yusuf", "Mertcan", "Eda" ) );

        System.out.println(isimler); //  [Cennet, Yusuf, Mertcan, Eda]

        isimler.remove("Cennet");

        System.out.println(isimler); // [Yusuf, Mertcan, Eda]

        isimler.remove(2);

        System.out.println(isimler); // [Yusuf, Mertcan]

        /*
            remove() ister index verelim istersek de silinecek elementi verelim
            silme islemini yapar

            aralarindaki fark
            remove islemini yaparken bize getirdikleri "delil" dir


         */

        // [Yusuf, Mertcan]
        System.out.println(isimler.remove("mertcan")); // false
        System.out.println(isimler.remove("Mertcan")); // true

        System.out.println(isimler); // [Yusuf]

        // System.out.println(isimler.remove(10)); // IndexOutOfBoundsException
        System.out.println(isimler.remove(0)); // Yusuf

        System.out.println(isimler); // []


        System.out.println(isimler.isEmpty()); // true

    }
}
