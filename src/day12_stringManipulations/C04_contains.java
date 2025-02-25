package day12_stringManipulations;

public class C04_contains {

    public static void main(String[] args) {

        String str = "Java ogrenen pisman olmaz.";

        System.out.println(str.contains("a")); // true

        System.out.println( str.contains( "a o")  ); // true

        System.out.println(str.contains("J    o")); // false

        System.out.println(str.contains("Java og")); // true

    }
}
