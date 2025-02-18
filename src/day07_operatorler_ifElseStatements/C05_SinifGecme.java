package day07_operatorler_ifElseStatements;

import java.util.Scanner;

public class C05_SinifGecme {

    public static void main(String[] args) {

        // kullanicidan notunu alin
        // notu 50 veya daha buyukse "sinifi gectin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();

        if ( not >= 50 ){
            System.out.println("sinifi gectin");
        }



    }
}
