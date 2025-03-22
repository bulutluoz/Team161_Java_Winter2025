package day30_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_OrtalamaUstundekiOgrenciSayisi {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız,
        // bitirmek icin negatif bir sayi girmelidir
        // not girme islemi bitince
        // ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner scanner = new Scanner(System.in);
        List<Double> notlarListesi = new ArrayList<>();
        int sayac = 0;
        double girilenNot = 0;
        double notToplami = 0;


        do {
            System.out.println("Ortalama hesaplamak icin not giriniz..." +
                                "\nBitirmek icin negatif bir sayi giriniz...");
            girilenNot = scanner.nextDouble();

            if (girilenNot>=0){
                notlarListesi.add(girilenNot);
                notToplami += girilenNot;
                sayac++;
            }

        } while ( girilenNot >= 0  ); // devam etmesi icin gerekli sart


        double notOrtalamasi = notToplami / sayac ;

        sayac = 0;

        for (int i = 0; i <notlarListesi.size() ; i++) {

            if (notlarListesi.get(i) > notOrtalamasi){
                sayac++;
            }

        }

        System.out.println("Not ortalamasi : " + notOrtalamasi +
                            "\nOrtalama uzerindeki ogrenci sayisi : " + sayac);
    }
}
