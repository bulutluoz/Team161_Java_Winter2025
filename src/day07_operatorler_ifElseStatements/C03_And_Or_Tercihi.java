package day07_operatorler_ifElseStatements;

public class C03_And_Or_Tercihi {

    public static void main(String[] args) {

        /*
            Verilen bir degerin
            verilen bir aralikta olup olmadigini kontrol etmemiz istenirse
            And kullanilir
         */

        int sayi = 999;

        // verilen sayi 2 basamakli pozitif sayi ise true, degilse false yazdirin

        System.out.println( sayi >= 10  && sayi <= 99  );


        // verilen sayi 97'den buyuk, 212'den kucuk ise true
        // bu sarti saglamiyorsa false yazdirin

        System.out.println( sayi > 97 & sayi < 212  );


        char karakter = 'j';

        // verilen karakter kucuk harf ise true, kucuk harf degilse false yazdirin

        System.out.println( karakter >= 'a'  && karakter <= 'z');

        // Wrapper class ile de bu soruyu cozebiliriz

        System.out.println(  Character.isLowerCase(karakter)  );



        /*
            Verilen bir degerin
            verilen aralik disinda olmasi isteniyorsa
            || kullanilir
         */


        sayi = 154 ;

        // Verilen sayi, 2 basamakli pozitif sayi degilse true,
        // yoksa false yazdirin


        System.out.println( sayi < 10 || sayi > 99    );

        System.out.println("==============");
        karakter = ')';

        // verilen karakter buyuk harf ise false
        // buyuk harf degilse true yazdirin


        System.out.println(  karakter < 'A'  || karakter > 'Z' );

        System.out.println( ! Character.isUpperCase(karakter)   );

        System.out.println(  ! (karakter >= 'A' && karakter <= 'Z')  );








    }
}
