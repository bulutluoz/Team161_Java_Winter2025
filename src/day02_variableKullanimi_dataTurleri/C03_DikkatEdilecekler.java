package day02_variableKullanimi_dataTurleri;

public class C03_DikkatEdilecekler {

    public static void main(String[] args) {

        // 1-
        // variable 1 kere deklare edilir ama
        // istedigimiz kadar yeniden deger atamasi yapabiliriz

        int b = 20;

        // int b = 30; // b zaten tanimlanmisti

        // String b = "Java candir"; // Variable 'b' is already defined in the scope

        b = 25;

        b = b + 10;

        b = 2 * b -3;


        // 2- esitligin sol tarafinda SADECE variable olabilir

        int sayi = 20;

        // 10 = int c;

        sayi = sayi + 5;

        // sayi + 10 = sayi ;



        // 3- deger atamadan sadece deklarasyon yapilabilir
        //    ancak deger atamadigimiz variable'i KULLANAMAYIZ

        int yas;

        // System.out.println( yas  );
        // Variable 'yas' might not have been initialized
        // Variable 'yas' a deger atanmamis olabilir


        yas = 29;

        System.out.println( yas  );


        // 4-
        //     Java'da  = assignment(atama) isaretidir
        //     Java = gordugunde once ='in sagina bakar
        //     ='in sagindaki islemi yapar
        //     islem bittikten sonra
        //     bulunan degeri variable'a atama yapar
























    }
}
