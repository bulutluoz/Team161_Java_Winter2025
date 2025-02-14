package day05_wrapperClass_MatematikselIslemler_Concatenation;

public class C06_Concatenation {

    public static void main(String[] args) {

        // Java String ile + islemini kullanmamiza izin verir
        // ancak bu + islemi String soz konusu oldugunda
        // TOPLAMA degil BIRLESTIRME (concatenation) anlami tasir

        System.out.println( "Java" + true    ); // "Javatrue"

        System.out.println( "Java" + '4'); // "Java4"

        System.out.println( "Java" + 65.765 ); // "Java65.765"


        // String ile + isareti kullanilir
        // ama bu matematiksel anlamda degildir
        // String ile -, *, / KULLANILAMAZ

        // System.out.println(  "Java" - "Ali"); // Operator '-' cannot be applied to 'String', 'String'
        // System.out.println(  "Java" * 5); // Operator '*' cannot be applied to 'String', int
        // System.out.println(  "Java" / true); // Operator '/' cannot be applied to 'String', boolean



    }
}
