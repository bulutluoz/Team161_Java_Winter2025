package day12_stringManipulations;

public class C03_concat {

    public static void main(String[] args) {


        String s1 = "java";
        String s2 = " ";
        String s3 = "guzeldir";
        String s4 = "";

        int sayi1 = 4;
        int sayi2 = 5;

        // sadece variable'lari kullanarak asagidaki metinleri yazdirin

        // java guzeldir

        System.out.println( s1 + s2 + s3  ); // java guzeldir

        System.out.println( s1.concat(s2).concat(s3)   ); // java guzeldir


        // java 54

        System.out.println(  s1 + s2 +  sayi2 + sayi1  ); // java 54

        System.out.println(  s1.concat(s2).concat(sayi2+s4).concat(sayi1+s4)); // java 54



    }
}
