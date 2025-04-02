package day36_staticBlocks_passByValue;

public class C03_PassByValue {


    public static void main(String[] args) {

        int number = 3;

        int sayi = 12;

        kareAl(number);
        /*
            Java'da bir kod blogundan
            baska bir kod bloguna variable yollandiginda

            Java gonderilen variable'in KENDISINI DEGIL
            DEGERINI (value) gonderir

            YANI variable'in kendisi degil value'su GECIS YAPAR

            buna Pass By Value denir
         */

        System.out.println(sayi); // 12
    }

    public static void kareAl(int sayi){


        System.out.println("sayinin karesi : " + sayi*sayi); // 9

        // number'in scope'u main method'dur
        // number local variable oldugu icin kareAl method'undan kullanilamaz
        // System.out.println(number);

        System.out.println(sayi);// 3
        // 24.satirda kullanilan sayi variable'i main method'daki sayi variable'i degil
        // 15.satirda method'un parametresi olarak olusturulan sayidir

    }
}
