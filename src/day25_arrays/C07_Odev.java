package day25_arrays;

public class C07_Odev {

    // Kullanicidan deger alarak String bir array olusturun
    // String array'deki en uzun ve en kisa ismi yazdirin

    public static void main(String[] args) {

        String[] kelimeler = C05_KullaniciyaArrayOlusturtma.kullaniciyaArrayOlusturt();

        String enKisaKelime = kelimeler[0];
        String enUzunKelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length() < enKisaKelime.length()){
                // loop'un getirdigi isim en kisa isimden daha kisa
                enKisaKelime = kelimeler[i];
            }

            if (kelimeler[i].length() > enUzunKelime.length()){
                // loop'un getirdigi isim en uzun isimden daha uzun
                enUzunKelime = kelimeler[i];
            }

        }

        System.out.println("Girilen kelimelerden en uzun olan : " + enUzunKelime);
        System.out.println("Girilen kelimelerden en kisa olan : " + enKisaKelime);


    }
}
