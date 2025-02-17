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




    }
}
