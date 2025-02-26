package day13_stringManipulations;

public class C04_LastIndexOf {

    public static void main(String[] args) {

        String str = "Hersey cok guzel olacak, cok";

        System.out.println(str.indexOf("e")); // 1

        // 2. e'nin index'ini yazdirin

        System.out.println( str.indexOf('e', 2) ); // 4

        // cumlede kullanilan son a'nin index'ini yazdirin

        // Eger bir char veya metnin son kullanim index'ini isterseniz
        // indexOf() yerine lastIndexOf()

        System.out.println(str.lastIndexOf('a'));  // 21


        str = "Java ile kod yaz, kod yazmak cok guzel";

        System.out.println(str.indexOf("Java")); // 0
        System.out.println(str.lastIndexOf("Java")); // 0

        System.out.println(str.indexOf("kod")); // 9
        System.out.println(str.lastIndexOf("kod")); // 18

        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.lastIndexOf("a")); // 26

        System.out.println(str.indexOf("yaz")); // 13
        System.out.println(str.lastIndexOf("yaz")); // 22

        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.lastIndexOf("x")); // -1


        System.out.println(str.lastIndexOf('a', 15));  // 14

        System.out.println(str.lastIndexOf('a', 13));  // 3


    }
}
