package day13_stringManipulations;

import java.util.Scanner;

public class C05_Soru {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Cumlede aranacak metni giriniz...");
        String metin = scanner.nextLine();

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);


        if ( ilkIndex == -1  ){
            System.out.println("Aranan metin cumlede kullanilmamis");
        } else if ( ilkIndex == sonIndex ) {
            System.out.println("Aranan metin cumlede sadece 1 kere kullanilmis");
        } else {
            System.out.println("Aranan metin cumlede 1'den fazla kere kullanilmis");
        }


    }
}
