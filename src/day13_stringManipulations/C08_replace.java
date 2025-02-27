package day13_stringManipulations;

public class C08_replace {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.replace('a', 'A')); // JAvA CAndir

        System.out.println(str.replace('J','H')); // Hava Candir

        System.out.println(str.replace("Java", "tava")); // tava candir

        System.out.println( str.replace("Java" , "Python")); // Python Candir

        System.out.println( str.replace("a","") ); // Jv Cndir



    }
}
