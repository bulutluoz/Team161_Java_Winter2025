package day08_ifElseStatements;

import java.util.Scanner;

public class C06_IfElse_Emeklilik {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        if ( yas >= 65 ) {
            System.out.println("Emekli olabilirsin");
        } else {
            // emekli olmak icin daha 12 yil calismalisin

            System.out.println("emekli olmak icin daha " +  (65-yas) +  " yil calismalisin"  );

        }

    }
}
