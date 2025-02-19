package day08_ifElseStatements;

import java.util.Scanner;

public class C08_IfElse_BuyukHarfeCevir {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.nextLine().charAt(0);


        // 1.ASCII table

            if ( karakter >= 'a'  && karakter <= 'z'){
                // karakter kucuk harf ise
                System.out.println(  (char)(karakter - 32) );
            } else {
                // karakter kucuk harf degil ise
                System.out.println(karakter);

            }


        // 2. Character Wrapper Class

        if ( Character.isLowerCase(karakter)   ){
            // karakter kucuk harf ise
            System.out.println(  Character.toUpperCase(karakter)   );

        } else {
            // karakter kucuk harf degil ise
            System.out.println(karakter);

        }




    }
}
