package day40_stringBuilder_accessModifier;

public class C03_FarkliMethodlarKullanma {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");


        // sb1 a harfi iceriyor mu ?

        System.out.println(sb1.toString().contains("a")); //  true


        /*
            StringBuilder'da olmayip
            String'de olan bir method'u kullanmak istersek

            once toString() ile StringBuilder'i String'e cevirir
            sonra da istedigimiz String method'unu kullaniriz

            NOT : StringBuilder mutable olsa da
                  toString() ile String'e donusturdugumuz icin
                  sonrasinda kullanilan method'lar kalici degisiklik YAPMAZ
         */

    }
}
