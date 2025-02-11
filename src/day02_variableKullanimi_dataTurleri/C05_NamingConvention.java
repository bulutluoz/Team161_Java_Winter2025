package day02_variableKullanimi_dataTurleri;

public class C05_NamingConvention {

    public static void main(String[] args) {

        // 1- variable isimleri buyuk-kucuk harf duyarlidir
        //    case sensitive

        int not = 70;
        int noT = 90;
        int nOT = 50;
        int Not = 67;
        int NOT = 43;

        System.out.println(  not  ); // 70
        // System.out.println(  NoT   ); bu haliyle olusturulmus bir variable yok, hata verir


        // 2- variable isimleri kucuk harfle baslar
        //    bu uygulanmasa Java hata vermez ANCAK genel kabullere aykiri olur


        // 3- variable isminde harf, sayi veya $,_ sembolleri olabilir
        //    ANCAK bosluk veya ozel karakterler OLAMAZ

        // int ogrenci yasi = 12;     bosluk hata verir
        // int ogrenci%yasi = 12;     ozel karakter hata verir
        int ogrenci1yasi = 12;
        int ogrenci_yasi = 12;
        int ogrenci$yasi = 12;


        // 4- variable isimlerinde $ veya _ kullanilabilir
        //    ama ismin bunlarla baslamasi ISTENMEZ

        String _okul = "Yildiz Koleji";
        String $okul = "Yildiz Koleji";

        // 5- variable isminde rakam kullanilabilir
        //    ama ismin rakamla baslamasi mumkun degildir

        String okul1ismi = "Yildiz";
        // String 1okulismi = "Yildiz";


        // 6- Eger variable ismi birden fazla kelimeden olusuyorsa
        //    camelCase kullanilir

        double ogrenciYasOrtalamasi = 12.5;

        System.out.println(okul1ismi.toUpperCase());


        // 7- isim olarak anahtar kelimeler kullanilamaz
        // int int = 8 ;

        // String class = "ali";

        // boolean for = true;
    }
}
