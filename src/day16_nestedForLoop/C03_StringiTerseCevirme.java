package day16_nestedForLoop;

import java.util.Scanner;

public class C03_StringiTerseCevirme {

    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve
        // String’i tersine cevirip tersMetin isminde bir variable'a kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        String tersMetin = "" ;


        for (int i = metin.length()-1 ; i>=0 ; i--) {

            tersMetin += metin.charAt(i);
        }

        System.out.println("Girilen metnin tersi : " + tersMetin);


        // girilen metnin Palindrome olup olmadigini yazdirin
        // Palindrome : tersten yazilisi ile duz yazilisi ayni olan metin

        if (metin.equalsIgnoreCase(tersMetin)) {
            System.out.println("Girilen metin Palindrome");
        } else {
            System.out.println("Girilen metin Palindrome degil");

        }


    }
}
