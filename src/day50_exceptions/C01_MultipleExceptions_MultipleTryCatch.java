package day50_exceptions;

import java.util.Scanner;

public class C01_MultipleExceptions_MultipleTryCatch {

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

            1- En temel haliyle
               riskli kodlari ayri ayri ele alabiliriz
         */


        try {
            System.out.println("Array'de verilen index'deki sayi : " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index gecersiz, Array icin index 0 - "+ (arr.length-1) + " arasinda olmalidir" );
        }


        try {
            System.out.println("String'de verilen index'deki karakter : " + str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index gecersiz, String icin index 0 - "+ (str.length()-1) + " arasinda olmalidir" );
        }

    }
}
