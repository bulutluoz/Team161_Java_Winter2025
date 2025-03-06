package day19_methodOlusturma;

public class C05_VkeKullanma {

    public static void main(String[] args) {

        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        //         kilo*10000 / (boy *boy)
        //         vucut kitle endeksi
        //         30’dan buyukse obez,
        //         25-30 arasi ise kilolu,
        //         20-25 arasi ise normal,
        //         20’den kucukse zayif yazdirin.


        double vke = C04_VucutKitleEndexiHesapla.vucutKitleEndeksiHesapla();

        System.out.println("Vucut kitle endeksiniz : " + vke);

        if (vke>30)
            System.out.println("obez");
        else if (vke>25) {
            System.out.println("kilolu");
        } else if (vke>20) {
            System.out.println("normal");
        }
        else System.out.println("zayıf");


    }
}
