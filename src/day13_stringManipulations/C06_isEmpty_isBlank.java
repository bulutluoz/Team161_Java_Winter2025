package day13_stringManipulations;

public class C06_isEmpty_isBlank {

    public static void main(String[] args) {


        String str1 = "";
        String str2 = " ";
        String str3 = "     ";
        String str4 = "  Ali  ";


        System.out.println(  str1.isEmpty() ); // true
        // isEmpty() ==> Returns true if, and only if, length() is 0.

        System.out.println(  str1.isBlank()  ); // true
        // Returns true if the string is empty
        // or contains only white space codepoints,
        // otherwise false.

        System.out.println("=========");

        System.out.println(  str2.isEmpty() ); // false
        System.out.println(  str2.isBlank() ); // true

        System.out.println("=========");

        System.out.println(  str3.isEmpty() ); // false
        System.out.println(  str3.isBlank() ); // true

        System.out.println("=========");

        System.out.println(  str4.isEmpty() ); // false
        System.out.println(  str4.isBlank() ); // false

    }
}
