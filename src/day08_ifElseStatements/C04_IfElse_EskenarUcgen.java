package day08_ifElseStatements;

import java.util.Scanner;

public class C04_IfElse_EskenarUcgen {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        // Not : kenar uzunluklari pozitif olmalidir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz...");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        if ( kenar1 == kenar2 && kenar2 == kenar3 && kenar3 > 0){
            System.out.println("Eskenar ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }

    }
}
