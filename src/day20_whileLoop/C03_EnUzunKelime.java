package day20_whileLoop;

import java.util.Scanner;

public class C03_EnUzunKelime {

    public static void main(String[] args) {

        // asagidaki gorevi yapan bir method olusturun

        // kullanicidan istedigi kadar isim girmesini isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir (q veya Q olabilir)
        // (ilk harfi Q olan bir kelime degil, sadece Q'ya basmalidir)
        // girilen her ismin uzunlugunu kontrol edin ve
        // islem bitirildiginde en cok harfe sahip olan (en uzun) ismi yazdirin
        // esit sayida harfe sahip isimlerden herhangi biri olabilir

        enUzunIsmiYazdir();


    }

    public static void enUzunIsmiYazdir(){
        Scanner scanner = new Scanner(System.in);

        String girilenIsim = "";
        String enUzunIsim = "";

        while ( !girilenIsim.equalsIgnoreCase("q") ){

            System.out.println("Lutfen bir isim giriniz... \nBitirmek icin Q'ya basiniz...");

            girilenIsim = scanner.nextLine();


            if ( girilenIsim.length() > enUzunIsim.length()  ){
                enUzunIsim = girilenIsim;
            }

        }

        System.out.println("Girilen en uzun isim : " + enUzunIsim);
    }

    // ayni gorevi yapip
    // en sonda en uzun kelimeyi yazdirmak yerine donduren bir method olusturun

    public static String getEnUzunIsim(){

        Scanner scanner = new Scanner(System.in);

        String girilenIsim = "";
        String enUzunIsim = "";

        while ( !girilenIsim.equalsIgnoreCase("q") ){

            System.out.println("Lutfen bir isim giriniz... \nBitirmek icin Q'ya basiniz...");

            girilenIsim = scanner.nextLine();


            if ( girilenIsim.length() > enUzunIsim.length()  ){
                enUzunIsim = girilenIsim;
            }

        }

        return enUzunIsim;


    }
}
