package day11_switchStatement_stringManipulations;

import java.util.Scanner;

public class C08_SM_length {

    public static void main(String[] args) {

        /*
            Eger kodlarimizi yazarken
            index olarak DIREKT deger yazmak yerine
            verilen kelimeden alinan bilgiyi kullanirsak
            kodumuzu DINAMIK HALE getirmis oluruz

            boylece verilen str ne olursa olsun
            kodumuz sorunsuz calisir
         */

        String str = "Ali Yataruyuroglu";

        System.out.println(str.length()); // bize str'daki karakter sayisini verir  25


        // son karakteri yazdirin
        System.out.println(str.charAt(  str.length() -1));



        // Kullanicidan ismini isteyin
        // ismin ilk ve son harflerini yan yana yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();

        System.out.println( "" + isim.charAt(0) + isim.charAt(isim.length()-1) ); // 'm' + 'n'


        // System.out.println(isim.charAt(isim.length())); // StringIndexOutOfBoundsException
        // System.out.println(isim.charAt(isim.length() + 1)); // StringIndexOutOfBoundsException
        // System.out.println(isim.charAt(isim.length() + 5)); // StringIndexOutOfBoundsException


    }
}
