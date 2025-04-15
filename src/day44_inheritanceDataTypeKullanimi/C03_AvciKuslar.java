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

            *** EGER OZELLIKLER variable olarak olusturulmussa
                alimlerin tartismasindaki 1.gorus gecerli olur
                OBJE HANGI data turunu kullaniyorsa
                AYNI DATA TURUNE sahip TUM OBJELERLE ortak ozellikler gosterir

                orn : data turu hayvanlar class'i secilmisse
                      butun hayvanlarla ORTAK OZELLIKLERE sahip olur
         */
        // AvciKuslar class'indan bir obje olusturun
        C03_AvciKuslar avciKartal = new C03_AvciKuslar();
        // avciKartal C03_AvciKuslar class'inin OBJESIDIR
        // avciKartal'in data turu C03_AvciKuslar

        System.out.println(avciKartal.gaga); // AV  sivri gagali
        System.out.println(avciKartal.pence); // AV  pencelidir
        System.out.println(avciKartal.beslenme); // AV et yerler
        System.out.println(avciKartal.hareket); // AV  ucarlar

        System.out.println(avciKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(avciKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(avciKartal.kanat); // K kanatlidirlar

        System.out.println(avciKartal.omur); // H yasar ve olurler



        C02_Kuslar kusgillerdenAvciKartal = new C03_AvciKuslar();

        // kusgillerdenAvciKartal C03_AvciKuslar class'inin OBJESIDIR
        // kusgillerdenAvciKartal'in data turu C02_Kuslar

        System.out.println(kusgillerdenAvciKartal.gaga); // K  gagalari vardir
        // System.out.println(kusgillerdenAvciKartal.pence); // Kuslar class'inda yok CTE
        System.out.println(kusgillerdenAvciKartal.beslenme); // H beslenirler
        System.out.println(kusgillerdenAvciKartal.hareket); // H hareket ederler

        System.out.println(kusgillerdenAvciKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(kusgillerdenAvciKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(kusgillerdenAvciKartal.kanat); // K kanatlidirlar

        System.out.println(kusgillerdenAvciKartal.omur); // H yasar ve olurler


        C01_Hayvanlar hayvangillerdenAvciKartal = new C03_AvciKuslar();
        // hayvangillerdenAvciKartal C03_AvciKuslar class'inin OBJESIDIR
        // hayvangillerdenAvciKartal'in data turu C01_Hayvanlar

        //System.out.println(hayvangillerdenAvciKartal.gaga); // Hayvanlar Class'inda yok CTE
        //System.out.println(hayvangillerdenAvciKartal.pence); // Hayvanlar Class'inda yok CTE
        System.out.println(hayvangillerdenAvciKartal.beslenme); // H beslenirler
        System.out.println(hayvangillerdenAvciKartal.hareket); // H hareket ederler

        System.out.println(hayvangillerdenAvciKartal.cogalma); // H cogalirlar
        System.out.println(hayvangillerdenAvciKartal.solunum); // H nefes alirlar
        //System.out.println(hayvangillerdenAvciKartal.kanat); // Hayvanlar Class'inda yok CTE

        System.out.println(hayvangillerdenAvciKartal.omur); // H yasar ve olurler


        // Kuslar class'indan bir obje olusturun
        C02_Kuslar kusKartal = new C02_Kuslar();
        // kusKartal C02_Kuslar() class'inin OBJESIDIR
        // kusKartal'in data turu C02_Kuslar

        System.out.println(kusKartal.gaga); // K  gagalari vardir
        //System.out.println(kusKartal.pence); // Kuslar class'inda yok CTE
        System.out.println(kusKartal.beslenme); // H beslenirler
        System.out.println(kusKartal.hareket); // H hareket ederler

        System.out.println(kusKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(kusKartal.solunum); // K akcigerle nefes alirlar
        System.out.println(kusKartal.kanat); // K kanatlidirlar

        System.out.println(kusKartal.omur); // H yasar ve olurler



        C01_Hayvanlar hayvangillerdenKusKartal = new C02_Kuslar();

        // hayvangillerdenKusKartal C02_Kuslar() class'inin OBJESIDIR
        // hayvangillerdenKusKartal'in data turu C01_Hayvanlar

        //System.out.println(hayvangillerdenKusKartal.gaga); // Hayvanlar Class'inda yok CTE
        //System.out.println(hayvangillerdenKusKartal.pence); // Hayvanlar Class'inda yok CTE
        System.out.println(hayvangillerdenKusKartal.beslenme); // H beslenirler
        System.out.println(hayvangillerdenKusKartal.hareket); // H hareket ederler

        System.out.println(hayvangillerdenKusKartal.cogalma); // H cogalirlar
        System.out.println(hayvangillerdenKusKartal.solunum); // H nefes alirlar
        //System.out.println(hayvangillerdenKusKartal.kanat); // Hayvanlar Class'inda yok CTE

        System.out.println(hayvangillerdenKusKartal.omur); // H yasar ve olurler




        // Hayvanlar class'indan bir obje olusturun
        C01_Hayvanlar hayvanKartal = new C01_Hayvanlar();

        // hayvanKartal C01_Hayvanlar() class'inin OBJESIDIR
        // hayvanKartal'in data turu C01_Hayvanlar

        //System.out.println(hayvanKartal.gaga); // Hayvanlar Class'inda yok CTE
        //System.out.println(hayvanKartal.pence); // Hayvanlar Class'inda yok CTE
        System.out.println(hayvanKartal.beslenme); // H beslenirler
        System.out.println(hayvanKartal.hareket); // H hareket ederler

        System.out.println(hayvanKartal.cogalma); // H cogalirlar
        System.out.println(hayvanKartal.solunum); // H nefes alirlar
        //System.out.println(hayvanKartal.kanat); // Hayvanlar Class'inda yok CTE

        System.out.println(hayvanKartal.omur); // H yasar ve olurler









    }
}
