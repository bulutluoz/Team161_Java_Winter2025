package day36_staticBlocks_passByValue;

public class C04_PassByValue {

    public static void main(String[] args) {

        String str = "Java Candir";


        System.out.println(str.toLowerCase()); // java candir

        // method'da yapilan degisiklik method'da kalir
        System.out.println(str); // Java Candir


        // degisikligi kalici yapmak istersek atama yapmaliyiz

        str = str.toLowerCase();
        System.out.println(str); // java candir



    }



}
