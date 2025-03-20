package day29_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        List<String> sinifList =    getIsimList();

        System.out.println(sinifList);

    }


    //  Kullanicidan istedigi kadar isim alip,
    //  Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
    //  bir method olusturun.

    public static List<String> getIsimList(){

        Scanner scanner = new Scanner(System.in);
        List<String> isimlerListesi = new ArrayList<>();
        String girilenIsim = "";

        do {
            System.out.println("Listeye eklemek icin bir isim girin," +
                               "\n    Bitirmek icin Q'ya basin");

            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimlerListesi.add(girilenIsim);
            }




        }while ( !girilenIsim.equalsIgnoreCase("Q")   );
        // calismaya devam etmesi icin gerekli sart


        return isimlerListesi;

    }




}
