package day13_stringManipulations;

public class C07_nullPointer {

    public static void main(String[] args) {


        String ogrenci1 = "Yusuf";
        String ogrenci4 ;

        System.out.println(ogrenci1);
        // System.out.println(ogrenci4);
        // Java'da method icerisinde deger atamadan
        // variable deklare edebiliriz
        // ANCAKKKK deger atamadan o variable'i KULLANAMAYIZ


        String ogrenci5 = "";
        System.out.println(ogrenci5); // bos bir satir yazdirir
        // yazdirabilmek icin "" atamak iyi bir cozum olabilir
        // AMMMAAA bu durumda ogrenci5'e bir isim atanmis olur
        // Java bu degerin ne oldugu ile ilgilenmez
        // atama yapildigi icin bu ogrenci kaydedilmis gibi degerlendirir


        /*
            java non-primitive bir variable'i
            HEM bos birakip (deger atamayip)
            HEM de yazdirabilmemiz icin
            null pointer'i olusturmustur

            ONEMLI NOT :
            Java null olarak isaretlenen variable'lari
            SADECE yazdirmaya izin verir
            yazdirma disinda bir islem icin kullanirsaniz
            NullPointerException verir

         */


        String ogrenci6 = null;

        // int sayi = null;   primitive oldugu icin null kullanilamaz
        Integer sayi2 = null;

        System.out.println(ogrenci6); // null

        System.out.println("Ogrenci6 ismi : " + ogrenci6); // null

        System.out.println(ogrenci6.toUpperCase()); // NullPointerException



    }
}
