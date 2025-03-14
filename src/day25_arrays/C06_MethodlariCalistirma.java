package day25_arrays;

import day19_methodOlusturma.C02_FaktoryelDegeriDondurme;

public class C06_MethodlariCalistirma {

    public static void main(String[] args) {

        int[] sayilar = {1,2,3,4,5,6,7,8,13,12};


        // sayilar array'indeki tum elementlerin toplamini yazdirin
        C01_ArrayinElemanlariniToplama.elementToplaminiYazdir(sayilar);


        // sayilar array'indeki tum elementleri toplayin
        // Eger toplam cift sayi ise "Ne guzel array" ,
        // toplam tek sayi ise "Bu array'i begenmedim" yazdirin

        // elementToplaminiYazdir(sayilar)  method'u void oldugundan
        // toplam degerini karsilastiramayiz
        // int sonuc = C01_ArrayinElemanlariniToplama.elementToplaminiYazdir(sayilar);

        int toplamSonucu = C01_ArrayinElemanlariniToplama.getElementlerinToplami(sayilar);

        if (toplamSonucu % 2 == 0){
            System.out.println("Ne guzel array");
        } else {
            System.out.println("Bu array'i begenmedim");
        }

        // verilen int bir array'deki en buyuk sayiyi bulun
        // sayi 15'den kucuk pozitif bir tamsayi ise sayinin faktoryel degerini yazdirin
        // sayi 15'den kucuk pozitif bir tamsayi degilse en buyuk sayiyi yazdirin

        int enBuyukEleman = C02_EnBuyukElemaniBulma.getEnBuyukEleman(sayilar);

        if (enBuyukEleman>0 && enBuyukEleman<15){
            System.out.println("En buyuk sayinin faktoryel degeri : " + C02_FaktoryelDegeriDondurme.faktoryelDegeri(enBuyukEleman));
        } else {
            System.out.println("En buyuk sayi : " + enBuyukEleman);
        }


    }
}
