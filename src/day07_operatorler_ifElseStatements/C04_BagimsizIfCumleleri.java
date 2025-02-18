package day07_operatorler_ifElseStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // girilen sayi ciftsayi ise "Cift sayi girdiniz" yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        if (  sayi % 2 == 0  ){
            System.out.println("Cift sayi girdiniz");
        }

        /*
            Bagimsiz if cumleleri
            boolean sarta odaklanmistir
            boolean sart, girilen deger icin true ise IF BODY calisir
                          girilen deger icin false ise IF BODY calismaz

           if body'nin calismamasi
           if statement'in calismadigi anlamina gelmez

           bagimsiz if cumleleri
           adindan da anlasilacagi gibi
           kodun geriye kalanindan BAGIMSIZDIR


         */

        // girilen tamsayi 5'in kati ise "sayi 5'e bolunuyor" yazdirin

        if ( sayi % 5 == 0){
            System.out.println("sayi 5'e bolunuyor");
        }


        // sayi 100'den buyukse "buyuk sayi girdiniz" yazdirin

        if (  sayi > 100 ){
            System.out.println("buyuk sayi girdiniz");
        }


        // sayi 1000'den kucukse "guzel sayi" yazdirin
        boolean sonuc = sayi < 1000;

        if (sonuc) {
            System.out.println("guzel sayi");
        }


        String str = "java candir";


//        if (str){  // Required type: boolean   Provided: String
//            System.out.println("if parantezinin icinde SADECE boolean veriable veya boolean deger olabilir");
//        }



    }
}
