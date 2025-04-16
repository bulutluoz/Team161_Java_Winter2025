package day45_dataTypeKullanimi_overriding;

public class C04_Runner {

    public static void main(String[] args) {

        // AvciKuslar class'indan bir obje olusturun
        C03_AvciKuslar avciKartal = new C03_AvciKuslar();
        // avciKartal C03_AvciKuslar() class'inin objesidir
        // avciKartal'in data turu : C03_AvciKuslar
        // cumlemiz soyle baslar : avciKartal da butun avciKuslar gibi....
        avciKartal.gaga(); // AV sivri gagali
        avciKartal.pence(); // AV pencelidir
        avciKartal.beslenme(); // AV et yerler
        avciKartal.hareket(); // AV ucarlar
        avciKartal.cogalma(); // K yumurtayla cogalir
        avciKartal.solunum(); // K akcigerle nefes alir
        avciKartal.kanat(); // K kanatlidirlar
        avciKartal.omur(); // H yasar ve olurler


        C02_Kuslar kusgillerdenAvciKartal = new C03_AvciKuslar();
        // kusgillerdenAvciKartal C03_AvciKuslar() class'inin objesidir
        // kusgillerdenAvciKartal'in data turu : kusgillerdenAvciKartal

        // cumlemiz soyle olacak :
        // kusgillerdenAvciKartal da butun Kuslar gibi  ....
        // hem de daha guncel olarak ....

        kusgillerdenAvciKartal.gaga(); // AV sivri gagali
        kusgillerdenAvciKartal.pence(); // AV pencelidir
        kusgillerdenAvciKartal.beslenme(); // AV et yerler
        kusgillerdenAvciKartal.hareket(); // AV ucarlar
        kusgillerdenAvciKartal.cogalma(); // K yumurtayla cogalir
        kusgillerdenAvciKartal.solunum(); // K akcigerle nefes alir
        kusgillerdenAvciKartal.kanat(); // K kanatlidirlar
        kusgillerdenAvciKartal.omur(); // H yasar ve olurler














        C01_Hayvanlar hayvangillerdenAvciKartal = new C03_AvciKuslar();


        // Kuslar class'indan bir obje olusturun

        C02_Kuslar kusKartal = new C02_Kuslar();

        C01_Hayvanlar hayvangillerdenKusKartal = new C02_Kuslar();


        // Hayvanlar class'sindan bir obje olusturun

        C01_Hayvanlar hayvanKartal = new C01_Hayvanlar();

    }
}
