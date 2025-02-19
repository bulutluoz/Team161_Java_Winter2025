package day08_ifElseStatements;

import java.util.Scanner;

public class C07_IfElse_BuyukHarfKontrolu {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char karakter = scanner.nextLine().charAt(0);


        // 1.yontem ASCII table

        if ( karakter >= 'A' && karakter <= 'Z'   ){
            System.out.println("Buyuk harf");
        } else System.out.println("Buyuk harf degil");


        // 2.yontem Character Wrapper Class

        if (  Character.isUpperCase(karakter) ){
            System.out.println("Buyuk harf");
        } else {
            System.out.println("Buyuk harf degil");
        }


    }
}
