package day06_increment_decrement;

public class C01_preIncrement_postIncrement {

    public static void main(String[] args) {

        /*
            EGER bulundugu satirda yanliz ise
            a++ ile ++a
            b-- ile --b
            arasinda bir fark yoktur.
         */

        int a = 10;

        int b = 20;

        a++;

        System.out.println( "13. satirda a : " + a); // 13. satirda a : 11

        ++a;

        System.out.println( "17. satirda a : " + a); // 17. satirda a : 12


        b--;

        System.out.println( "22. satirda b : " + b); // 22. satirda b : 19

        --b;

        System.out.println( "26. satirda b : " + b); // 26. satirda b : 18



    }
}
