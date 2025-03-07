package day20_whileLoop;

public class C04_EnUzunIsmiBulupDegistirme {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim girmesini isteyin
        // Kullanici bitirmek icin Q'ya basmalidir
        // girilen isimler icerisinde en uzun olani asagidaki sekilde yazdirin

        //  String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        //  String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        String enUzunIsim = C03_EnUzunKelime.getEnUzunIsim();

        int uzunluk = enUzunIsim.length();


        if (  uzunluk % 2 == 0){
            // ismin uzunlugu cift sayi
            // tam ortasina :) ekleyin

            System.out.println(
                            enUzunIsim.substring(0, uzunluk/2)+
                            ":)" +
                            enUzunIsim.substring(uzunluk/2)
            );
        } else {
            // ismin uzunlugu tek sayi
            // ortadaki harfi silin ve yerine :( yazdirin.

            System.out.println(
                            enUzunIsim.substring(0, uzunluk/2)+
                            ":(" +
                            enUzunIsim.substring(uzunluk/2 +1)
            );
        }

    }
}
