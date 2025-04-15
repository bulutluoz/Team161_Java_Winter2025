package day44_inheritanceDataTypeKullanimi;

public class C03_AvciKuslar extends C02_Kuslar {
    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        String name = "Ali";
        // String data turu mudur? yoksa bir Class midir ?
        // String Java'nin olusturdugu bir class'dir
        // ammmaaa AYNI ZAMANDA name variable icin data turudur

        /*
            Bir objenin hangi class'dan olusturuldugunu
            Constructor'a bakarak anlayabiliriz

            ama objenin hangi ozellikleri tasidigini anlamak icin
            sadece constructor yetmez
            data turu de onemli olur
         */
        // AvciKuslar class'indan bir obje olusturun
        C03_AvciKuslar avciKartal = new C03_AvciKuslar();
        C02_Kuslar kusgillerdenAvciKartal = new C03_AvciKuslar();
        C01_Hayvanlar hayvangillerdenAvciKartal = new C03_AvciKuslar();


        // Kuslar class'indan bir obje olusturun
        C02_Kuslar kusKartal = new C02_Kuslar();
        C02_Kuslar hayvangillerdenKusKartal = new C02_Kuslar();



        // Hayvanlar class'indan bir obje olusturun
        C01_Hayvanlar hayvanKartal = new C01_Hayvanlar();





    }
}
