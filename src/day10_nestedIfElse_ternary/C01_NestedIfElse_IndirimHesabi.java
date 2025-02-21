package day10_nestedIfElse_ternary;

import java.util.Scanner;

public class C01_NestedIfElse_IndirimHesabi {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedini ve indirimsiz birim fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        //                        az alirsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        //                        az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urun adedini girin...");
        int adet = scanner.nextInt();

        System.out.println("Lutfen aldiginiz urunun birim fiyatini girin...");
        double birimFiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ?  E : Evet, H : Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = adet * birimFiyat;

        // ana degisken urun adedi olsun

        if (adet >10){
            // 10 urunden fazla alanlar bolgesi
            if (kartVarMi == 'E')
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat * 80/100);
            else if (kartVarMi == 'H')
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85/100);
            else
                System.out.println("kart var mi sorusuna verilen yanit gecersiz");


        } else if (adet>0) {
            // 0'dan fazla 10 adete kadar urun alanlar bolgesi
            if (kartVarMi == 'E')
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat * 85/100);
            else if (kartVarMi == 'H')
                System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat * 90/100);
            else
                System.out.println("kart var mi sorusuna verilen yanit gecersiz");


        } else {
            // urun adedi olarak 0 veya negatif girenlerin bolgesi


        }

    }
}
