package day10_nestedIfElse_ternary;

import java.util.Scanner;

public class C08_NestedTernary {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi isteyin
        // pozitif, negatif veya notr seceneklerinden uygun olani yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();


        System.out.println( sayi > 0 ? "pozitif" : "Burasi negatif veya notr olabilir"     );


        System.out.println( sayi > 0 ? "pozitif" : ( sayi < 0 ? "negatif" : "notr"  )    );

        System.out.println( sayi > 0 ? "pozitif" :  sayi < 0 ? "negatif" : "notr"   );


        // sayi tek ise "3'un kati" veya "3'un kati degil" yazdirin
        // sayi cift ise "5'in kati" veya "5'in kati degil" yazdirin

        System.out.println(

                sayi % 2 == 0
                ?
                //"sayi cift"
                sayi % 5 == 0 ? "5'in kati" : "5'in kati degil"
                :
                //"sayi tek"
                sayi % 3 == 0 ? "3'un kati" : "3'un kati degil"

        );


        System.out.println( sayi % 2 == 0 ? sayi % 5 == 0 ? "5'in kati" : "5'in kati degil" : sayi % 3 == 0 ? "3'un kati" : "3'un kati degil"

        );

    }
}
