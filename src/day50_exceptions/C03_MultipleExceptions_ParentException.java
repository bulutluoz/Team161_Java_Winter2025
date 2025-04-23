package day50_exceptions;

import java.util.Scanner;

public class C03_MultipleExceptions_ParentException {

    public static void main(String[] args) {
        String str = "Java candir";
        int[] arr = {1,2,3,4,5,3,4,2,3,4,5,6,7,5,4,3,4,5,7,6,5,9};

        // kullanicidan index olarak bir tamsayi isteyin
        // verilen negatif olmayan bir tamsayiyi index olarak kabul edip
        // yukardaki str ve arr'deki o index'de bulunan harfi ve sayiyi yazdirin
        // eger kullanici negatif veya index'den buyuk sayi girerse
        // hata mesaji ve son index'i yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen index olarak negatif olmayan bir tamsayi giriniz...");

        int index = scanner.nextInt();  // kullanicinin int girmeme riski bu soruda ignore edildi

        /*
            Birden fazla exception olasiligi oldugunda
            try catch'i 4 farkli sekilde dizayn edebiliriz

            3- Eger muhtemel exception'larin
               tamamini kapsayan, genel bir exception varsa
               tek tek exception'lari yazmak yerine
               tek bir parent exception yazilabilir

               bu soruda risk olan
               StringIndexOutOfBoundsException ve ArrayIndexOutOfBoundsException
               ikisi de run time'da ortaya cikiyor

               o zaman ikisi de RunTimeException'in
               ve dogal olarak Exception'in child class'laridir

               SIOOB ve AIOOB exception'larini ayri ayri yazmak yerine
               tek bir catch yapip
               RunTimeException veya Exception kullanabiliriz

               EGER amac sadece sorunu yakalamak ve kontrol altina almak ise
               bu yontem daha derli toplu ve sade oldugu icin tercih edilebilir

               AMMMMAAAA hatayi bulmak ve cozmek istiyorsaniz
               bu yontem tavsiye edilmez

               4- Nested try-catch
                  try catch bloklari ic ice de olusturulabilir

                  ancak nested yapilar daha karmasik oldugu icin
                  cok tercih edilmez
                  (Kod okuma sorularinda ornek cozulecek)

         */


        try {

            System.out.println("Array'de verilen index'deki sayi : " + arr[index]);
            System.out.println("String'de verilen index'deki karakter : " + str.charAt(index));

        } catch (Exception e) {
            System.out.println("Index gecersiz,");
            System.out.println("String icin index 0 - "+ (str.length()-1) + " arasinda olmalidir" );
            System.out.println("Array icin index 0 - "+ (arr.length-1) + " arasinda olmalidir" );
        }

    }
}
