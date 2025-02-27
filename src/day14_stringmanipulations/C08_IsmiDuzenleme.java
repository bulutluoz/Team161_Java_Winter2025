package day14_stringmanipulations;

import java.util.Scanner;

public class C08_IsmiDuzenleme {

    public static void main(String[] args) {

        // Kullanicidan ismini alin
        // Kullanici 3 isimli olsa da
        // isimlerin ilk harfi buyuk harf, kalanlar * olacak sekilde yazdirin
        // Ornek input  : ali mert can  , aysel yilmaz ,  Kemal
        //       output : A** M*** C**  , A**** Y***** ,  K****


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz...");
        String isim = scanner.nextLine();


        // once ismi inceleyip
        // kac kelimeden olustugunu bulmaliyiz

        int ilkSpaceIndex = isim.indexOf(" ");
        int ikinciSpaceIndex = isim.indexOf(" ",ilkSpaceIndex+1);

        if ( ilkSpaceIndex == -1  ){
           // isim tek kelime
            System.out.println(
                     isim.substring(0, 1).toUpperCase()
                   + isim.substring(1).replaceAll("\\w","*")
            );

        } else if ( ikinciSpaceIndex ==-1 ) { //  ilkSpaceIndex>=0  &&
            // isim 2 kelime

            System.out.println(
                   isim.substring(0,1).toUpperCase() + // ilk ismin ilk harfi
                   isim.substring(1,ilkSpaceIndex) .replaceAll("\\w","*") + // ilk kelimenin space'e kadar olan kismi
                   " " +
                   isim.substring(ilkSpaceIndex+1, ilkSpaceIndex+2).toUpperCase() + // 2.ismin ilk harfi
                   isim.substring(ilkSpaceIndex+2).replaceAll("\\w","*")  // ikinci kelimenin 1.index'inden sona kadar

            );


        } else {
            // isim 2 kelimeden fazla
            System.out.println(
                    isim.substring(0,1).toUpperCase() + // ilk ismin ilk harfi
                    isim.substring(1,ilkSpaceIndex) .replaceAll("\\w","*") + // ilk kelimenin space'e kadar olan kismi
                    " " +
                    isim.substring(ilkSpaceIndex+1, ilkSpaceIndex+2).toUpperCase() + // 2.ismin ilk harfi
                    isim.substring(ilkSpaceIndex+2,ikinciSpaceIndex).replaceAll("\\w","*") +
                    " " +
                    isim.substring(ikinciSpaceIndex+1, ikinciSpaceIndex+2).toUpperCase() +
                    isim.substring(ikinciSpaceIndex+2).replaceAll("\\w","*")

            );


        }


    }
}
