package day18_methodOlusturma;

public class C04_StringFiyatlariToplama {

    public static void main(String[] args) {

        // belirli bir formatta verilen String 2 fiyati
        // toplayip yazdiran bir method olusturun
        //		input1 : “15.30 €” , input2 : “11.45 €”
        //		output : 26.75 €
        // NOT : sondaki para birimi degisken olmalidir


        fiyatToplaminiYazdir("15.30 €","11.45 €"); // 26.75 €
        fiyatToplaminiYazdir("245.55 Tl", "345.51 Tl"); // 591.06 Tl
        fiyatToplaminiYazdir("23.12 $", "11.12 $"); // 34.24 $

    }

    public static void fiyatToplaminiYazdir( String fiyatS1 , String fiyatS2 ){

        // once para birimini kaydedelim
        int sonBoslukIndexi = fiyatS1.lastIndexOf(" ");
        String paraBirimi = fiyatS1.substring(sonBoslukIndexi);  //  " €"


        // sayi olmayan herseyi yok edelim
        fiyatS1 = fiyatS1.replaceAll("\\D","");  // "1530"
        fiyatS2 = fiyatS2.replaceAll("\\D","");  // "1145"


        // sayilardan olusan String'i toplama islemi yapabilmek icin double'a cevirelim
        double fiyatD1 = Double.parseDouble(fiyatS1) / 100 ; // 15.30
        double fiyatD2 = Double.parseDouble(fiyatS2) / 100 ; // 11.45


        // double'a cevirdigimiz fiyatlari toplayip, yanina basta kaydettigimiz para birimini yazdiralim

        System.out.println(fiyatD1 + fiyatD2 + paraBirimi);

    }
}
