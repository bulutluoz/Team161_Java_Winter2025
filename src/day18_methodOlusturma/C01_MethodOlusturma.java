package day18_methodOlusturma;

public class C01_MethodOlusturma {

    public static void main(String[] args) {

        // verilen 2 sayidan buyuk olmayani yazdiran bir method olusturun

        int sayi1 = 40;
        int sayi2 = 40;

        buyukOlmayaniYazdir(34,25);
        buyukOlmayaniYazdir(sayi1,sayi2);



    }

    public static void buyukOlmayaniYazdir( int a , int b ){

        System.out.println( a>b ?  b  : a );

    }


}
