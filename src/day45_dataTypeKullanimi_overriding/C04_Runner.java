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
        // kusgillerdenAvciKartal'in data turu : C02_Kuslar

        // cumlemiz soyle olacak :
        // kusgillerdenAvciKartal da butun Kuslar gibi  ....
        // hem de daha guncel olarak ....

        kusgillerdenAvciKartal.gaga(); // AV sivri gagali
        // kusgillerdenAvciKartal.pence(); // Kuslar'da yok CTE
        // kusgillerdenAvciKartal butun kuslar gibi pencelidir DIYEMEYIZ
        kusgillerdenAvciKartal.beslenme(); // AV et yerler
        kusgillerdenAvciKartal.hareket(); // AV ucarlar
        kusgillerdenAvciKartal.cogalma(); // K yumurtayla cogalir
        kusgillerdenAvciKartal.solunum(); // K akcigerle nefes alir
        kusgillerdenAvciKartal.kanat(); // K kanatlidirlar
        kusgillerdenAvciKartal.omur(); // H yasar ve olurler


        C01_Hayvanlar hayvangillerdenAvciKartal = new C03_AvciKuslar();
        // hayvangillerdenAvciKartal C03_AvciKuslar() class'inin objesidir
        // hayvangillerdenAvciKartal'in data turu : C01_Hayvanlar

        // cumlemiz soyle olacak :
        // hayvangillerdenAvciKartal da butun Hayvanlar gibi  ....
        // hem de daha guncel olarak ....

        // hayvangillerdenAvciKartal.gaga(); // Hayvanlar class'inda yok CTE
        // hayvangillerdenAvciKartal butun hayvanlar gibi gagalidir DIYEMEYIZ
        // hayvangillerdenAvciKartal.pence(); // Hayvanlar class'inda yok CTE
        hayvangillerdenAvciKartal.beslenme(); // AV et yerler
        hayvangillerdenAvciKartal.hareket(); // AV ucarlar
        hayvangillerdenAvciKartal.cogalma(); // K yumurtayla cogalir
        hayvangillerdenAvciKartal.solunum(); // K akcigerle nefes alir
        // hayvangillerdenAvciKartal.kanat(); // Hayvanlar class'inda yok CTE
        hayvangillerdenAvciKartal.omur(); // H yasar ve olurler

        /*
            Onceki gun
            ozellikleri VARIABLE olarak olusturdugumuzda
            onemli olan DATA TURU'dur demistik

            DATA TURU ayni olan objelerin
            constructor'i farkli olsa bile
            ayni ozelliklere sahip oldugunu gormustuk

            Ozellikler method olarak olusturuldugunda
            constructor daha onemli hale geliyor

            constructor'i ayni olan objeler
            ya ayni sonucu verir
            ya da CTE olusur

         */



        // Kuslar class'indan bir obje olusturun

        C02_Kuslar kusKartal = new C02_Kuslar();
        // kusKartal C02_Kuslar class'inin objesidir
        // kusKartal'in data turu : C02_Kuslar
        // cumlemiz soyle baslar : kusKartal da butun KUSLAR gibi....
        kusKartal.gaga(); // K gagalari vardir
        // kusKartal.pence(); // Kuslar'da yok CTE
        // kuskartal da butun kuslar gibi PENCELIDIR diyemeyiz
        kusKartal.beslenme(); // H beslenirler
        kusKartal.hareket(); // H hareket ederler
        kusKartal.cogalma(); // K yumurtayla cogalir
        kusKartal.solunum(); // K akcigerle nefes alir
        kusKartal.kanat(); // K kanatlidirlar
        kusKartal.omur(); // H yasar ve olurler


        C01_Hayvanlar hayvangillerdenKusKartal = new C02_Kuslar();
        // hayvangillerdenKusKartal C02_Kuslar() class'inin objesidir
        // hayvangillerdenKusKartal'in data turu : C01_Hayvanlar

        // cumlemiz soyle olacak :
        // hayvangillerdenKusKartal da butun Hayvanlar gibi  ....
        // hem de daha guncel olarak ....

        //hayvangillerdenKusKartal.gaga(); // Hayvanlar class'inda yok CTE
        // hayvangillerdenKusKartal butun hayvanlar gibi gagalidir DIYEMEYIZ
        //hayvangillerdenKusKartal.pence(); // Hayvanlar class'inda yok CTE
        hayvangillerdenKusKartal.beslenme(); // H beslenirler
        hayvangillerdenKusKartal.hareket(); // H hareket ederler
        hayvangillerdenKusKartal.cogalma(); // K yumurtayla cogalir
        hayvangillerdenKusKartal.solunum(); // K akcigerle nefes alir
        //hayvangillerdenKusKartal.kanat(); // Hayvanlar class'inda yok CTE
        hayvangillerdenKusKartal.omur(); // H yasar ve olurler

        /*
            ONEMLI NOT

            ozelligin guncel halini ararken
            inebilecegimiz son class
            Constructor'in class'idir

            daha asagida guncel bilgi olsa da
            asagiya INILMEZ
         */

        // Hayvanlar class'sindan bir obje olusturun

        C01_Hayvanlar hayvanKartal = new C01_Hayvanlar();

        // hayvanKartal.gaga(); // Hayvanlar class'inda yok CTE
        // hayvanKartal butun hayvanlar gibi gagalidir DIYEMEYIZ
        // hayvanKartal.pence(); // Hayvanlar class'inda yok CTE
        hayvanKartal.beslenme(); // H beslenirler
        hayvanKartal.hareket(); // H hareket ederler
        hayvanKartal.cogalma(); // H cogalirlar
        hayvanKartal.solunum(); // H nefes alirlar
        // hayvanKartal.kanat(); // Hayvanlar class'inda yok CTE
        hayvanKartal.omur(); // H yasar ve olurler













    }
}
