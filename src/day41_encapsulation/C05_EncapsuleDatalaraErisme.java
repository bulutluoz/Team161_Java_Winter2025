package day41_encapsulation;

public class C05_EncapsuleDatalaraErisme {


    public static void main(String[] args) {

        /*
            Eger hicbir islem yapmazsak

            int satisTutari;
            int toplamSatisTutari;

            bu variable'larin access modifier'i
            default access modifier oldugu icin
            bu variable'lara deger atama (write) yetkisi ile
            variable'larin degerini goruntuleme (read) yekisini
            birbirinden ayiramayiz



        C04_EncapsuleDatalar obj = new C04_EncapsuleDatalar();

        obj.satisTutari = 4500;  // write yetkisi
        System.out.println(obj.satisTutari); // read yetkisi

        obj.toplamSatisTutari = 345000000;
        System.out.println(obj.toplamSatisTutari);

         */

        /*
            Write ve read yetkilerini ayirmamiz GEREKTIGINDE

            oncelikle access modifier ile
            bu class uyelerine erisimi ENGELLEMELISINIZ

            bu variable'lari private yaparsak
            SADECE kendi class'indaki method'lar
            bu variable'lari kullanabilir

            simdi bize verilen goreve uygun olarak
            write ve read yetkileri icin
            ozel method'lar olusturacagiz

            read yetkisi icin getter()
            write yetkisi icin setter()

         */

        C04_EncapsuleDatalar obj = new C04_EncapsuleDatalar();

        // obj.satisTutari = 4500;  // write yetkisi
        // System.out.println(obj.satisTutari); // read yetkisi

        obj.setSatisTutari(100);
        obj.setSatisTutari(500);
        obj.setSatisTutari(300);

        // System.out.println(obj.setSatisTutari(200));
        // Cannot resolve method 'println(void)'



        //obj.toplamSatisTutari = 345000000;
        //System.out.println(obj.toplamSatisTutari);

        System.out.println(obj.getToplamSatisTutari()); // 900

        // obj.getToplamSatisTutari() = 45;

        // boylece getToplamSatisTutari() sayesinde
        // baska class'dan toplam satis tutari degerine ulasabiliyoruz
        // ama deger atamasi yapamiyoruz
        // read ==> evet , write==> hayir

    }
}
