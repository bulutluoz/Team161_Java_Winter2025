package day06_increment_decrement;

public class C03_KarsilastirmaOperatorleri {

    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        int c = 25;

        System.out.println( a >= b  ); // 10 >= 15   false

        System.out.println( c == a +b ); // 25 == 25  true

        System.out.println(  c != b ); // 25 != 15  true

        System.out.println( c = b ); // b'nin degerini c'ye atama yapar ve c'yi yazdirir 15


        // Eger karsilastirma operatorleri char degerler icin kullanilirsa
        // ASCII table'daki degerlerine gore karsilastirir
        // - kucuk harfler her zaman buyuk harflerden daha buyuk degerlere sahiptir
        // - ascii degerini bilmesek bile < icin daha once, > icin daha sonra gibi dusunebiliriz


        System.out.println( 'f' > 'c'   );  // 102 > 99  true

        System.out.println(  'B' < 'z'  ); // 66 < 122 true

        System.out.println(  'q' != 'q'); // false

        System.out.println(  'm' < 't' ); // m t'den daha once mi ? true



    }
}
