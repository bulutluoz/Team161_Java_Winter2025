package day12_stringManipulations;

public class C07_endsWith {

    public static void main(String[] args) {

        String str = "Java ahhh java";

        System.out.println(str.endsWith("Java")); // str'in son 4 karakteri "Java" mi ? ==> false

        System.out.println(str.endsWith("java")); // str'in son 4 karakteri "java" mi ? ==> true

        System.out.println(str.endsWith("ava")); // str'in son 3 karakteri "ava" mi ? ==> true

        System.out.println(str.endsWith(" ava")); // str'in son 4 karakteri " ava" mi ? ==> false

        System.out.println(str.endsWith("")); // str'in sonu "" mi ? ==> true

        System.out.println(str.endsWith("Java ahhh java")); // true


        System.out.println("===============");

        System.out.println(str.equals("Java ahhh java")); // true

        System.out.println(str.equalsIgnoreCase("Java ahhh java")); // true

        System.out.println(str.contains("Java ahhh java")); // true

        System.out.println(str.startsWith("Java ahhh java")); // true

        System.out.println(str.endsWith("Java ahhh java")); // true

        System.out.println("===============");

        // "Java ahhh java"

        System.out.println(str.equals("Java")); // false

        System.out.println(str.equalsIgnoreCase("Java")); // false

        System.out.println(str.contains("Java")); // true

        System.out.println(str.startsWith("Java")); // true

        System.out.println(str.endsWith("Java")); // false



    }
}
