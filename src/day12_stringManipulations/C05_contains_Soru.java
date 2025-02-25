package day12_stringManipulations;

import java.util.Scanner;

public class C05_contains_Soru {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metin ev iceriyorsa "Ev gibisi var mi?",
        // metin is iceriyorsa "Calismak ne guzel",
        // metin hem ev hem is iceriyorsa "Evden calismak gibisi yok"
        // metin bu iki kelimeyi de icermiyorsa "Cok calismak lazim, coook" yazdirin

        Scanner input=new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String metin=input.nextLine();

        if (metin.contains("ev") && metin.contains("is")){
            System.out.println("Evden calismak gibisi yok");
        } else if (metin.contains("ev")) {
            System.out.println("Ev gibisi var mi?");
        } else if (metin.contains("is")) {
            System.out.println("Calismak ne guzel");
        } else {
            System.out.println("Cok calismak lazim, coook");
        }


    }
}
