package day06_increment_decrement;

public class C02_preIncrement_postIncrement {

    public static void main(String[] args) {

        // 1.ihtimal ayni satirda yazdirma islemi olursa

        int a = 20;
        int b = 40;


        System.out.println(  a++ ); // 20


        System.out.println("16.satirda a : " + a); // 21


        a= 20;

        System.out.println(  ++a   ); // 21


        System.out.println("24.satirda a : " + a); // 21

        b= 40;

        System.out.println( b-- ); //40

        System.out.println("30.satirda b : " + b); // 39


        b= 40;

        System.out.println(  --b  );// 39

        System.out.println("37.satirda b : " + b); // 39


        // 2.ihtimal ayni satirda atama islemi olursa


        a= 20;

        int c = a++;

        System.out.println("47.satirda a : " + a + ", c : " + c);
        // 47.satirda a : 21, c : 20


        a = 20;


        c = ++a;


        System.out.println("57.satirda a : " + a + ", c : " + c);
        // 57.satirda a : 21, c : 21


        b = 40;

        c = b--;


        System.out.println("66.satirda b : " + b + ", c : " + c);
        // 66.satirda b : 39, c : 40


        b = 40;

        c = --b;


        System.out.println("75.satirda b : " + b + ", c : " + c);
        // 75.satirda b : 39, c : 39




        // 3.ihtimal ayni satirda matematiksel islem olursa

        a= 20;


        c = 2 * a++ -3 ;

        System.out.println("88.satirda a : " + a + ", c : " + c);
        // 88.satirda a : 21, c : 37


        a = 20;


        c = ++a + 20;



        System.out.println("99.satirda a : " + a + ", c : " + c);
        // 99.satirda a : 21, c : 41


        b = 40;


        c = 3 * (b-- - 2);


        System.out.println("109.satirda b : " + b + ", c : " + c);
        // 109.satirda b : 39, c : 114


        b = 40;


        c = 2 * --b + 3 ;


        System.out.println("109.satirda b : " + b + ", c : " + c);
        // 109.satirda b : 39, c : 81




    }
}
