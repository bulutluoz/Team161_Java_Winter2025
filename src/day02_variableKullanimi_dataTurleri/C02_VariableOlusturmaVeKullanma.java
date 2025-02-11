package day02_variableKullanimi_dataTurleri;

public class C02_VariableOlusturmaVeKullanma {

    public static void main(String[] args) {


        int sayi = 20;

        System.out.println( "10.satirda sayi'nin degeri : " + sayi   );
        // 10.satirda sayi'nin degeri : 20


        // sayi variable'ina yeni bir deger atayalim

        // int sayi = 30;
        // Variable 'sayi' is already defined in the scope
        // sayi variable'i zaten olusturuldu, bir daha olusturamazsin


        sayi = 30;

        System.out.println( "23.satirda sayi'nin degeri : " + sayi  );
        // 23.satirda sayi'nin degeri : 30

        /*
            Java'da  = assignment(atama) isaretidir
            Java = gordugunde once ='in sagina bakar
            ='in sagindaki islemi yapar
            islem bittikten sonra
            bulunan degeri variable'a atama yapar
         */
        sayi = sayi + 5 ;


        System.out.println("36.satirda sayi'nin degeri : " +  sayi );
        // 36.satirda sayi'nin degeri : 35



        int a = 10;

        a = 2 * a + 1 ;

        System.out.println("a'nin degeri : " + a );  // 21



    }
}
