package day37_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Mutable_ImmutableClasses {

    public static void main(String[] args) {

        /*
            String ve Chracter class'larindan olusturdugumuz variable'larda
            hazir method'larla yapilan islemler
            kalici degisiklik YAPMAZ iken

            Array ve List olarak olusturdugumuz variable'larda
            hazir method'larla yapilan islemler
            kalici degisiklik YAPIYOR

            Java String ve Wrapper class'lari IMMUTABLE (Degistirilemez) olarak,
            List ve Array'leri ise MUTABLE (degistirilebilir) olarak olusturmustur

            Mutable class'lardan olusturulan variable'lar
            hazir method'larla degistirildiginde KALICI OLARAK DEGISIR,
            AMMMAAA Immutable class'lardan olusturulan variable'lar
            hazir method'larla degistirildiginde KALICI DEGISIKLIK OLMAZ
         */


        String str = "Java Candir";

        System.out.println(  str.toLowerCase() ); // java candir

        System.out.println(str); // Java Candir


        Character chr = 'a';

        System.out.println(Character.toUpperCase(chr)); // A

        System.out.println(chr); // a


        String[] isimler = {"Yusuf","Kivanc","Sevda","Cennet"};

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler)); // [Cennet, Kivanc, Sevda, Yusuf]


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,6,8,2));

        sayilar.add(4); // [3,6,8,2,4]
        sayilar.set(0,5); // [5,6,8,2,4]
        sayilar.remove(2); // [5,6,2,4]

        System.out.println(sayilar); // [5,6,2,4]


    }
}
