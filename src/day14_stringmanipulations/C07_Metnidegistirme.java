package day14_stringmanipulations;

import java.util.Scanner;

public class C07_Metnidegistirme {

    public static void main(String[] args) {

        //  Kullanicidan bir String alin,
        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine();

        int uzunluk = metin.length();


        if (  uzunluk % 2 == 0){
            // ismin uzunlugu cift sayi
            // tam ortasina :) ekleyin



        } else {
            // ismin uzunlugu tek sayi
            // ortadaki harfi silin ve yerine :( yazdirin.



        }


    }
}
