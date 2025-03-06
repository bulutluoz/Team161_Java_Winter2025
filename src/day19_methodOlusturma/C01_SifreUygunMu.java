package day19_methodOlusturma;

public class C01_SifreUygunMu {

    //Soru 4 : verilen bir sifre icin
    //         asagidaki sartlari kontrol eden
    //         ve sifre uygun ise true,
    //         sifre uygun degilse false donduren bir method olusturun
    //         - ilk harf kucuk harf olmali
    //         - son karakter rakam olmali
    //         - sifre bosluk icermemeli
    //         - uzunlugu en az 10 karakter olmali

    public static void main(String[] args) {

        sifreUygunMu("sanane");
       // 16.satir sifreUygunMu() method'unu calistirir
       // method calisir , verilen "sanane" sifresinin uygun olup olmadigini inceler
       // ve true veya false dondurur
       // ama sout yapmadigimiz icin konsolda goremeyiz
       // bir degere atamadigimiz icin kodun devaminda kullanamayiz


        System.out.println(sifreUygunMu("naber?")); // false
        // 24.satir sifreUygunMu() method'unu calistirir
        // method calisir , verilen "naber?" sifresinin uygun olup olmadigini inceler
        // ve true veya false dondurur
        // method sout icinde cagrildigi icin sonucu konsolda goruruz
        // ama bir degere atamadigimiz icin kodun devaminda kullanamayiz


        boolean sonuc = sifreUygunMu("cennetBahcesi11");
        // 32.satir sifreUygunMu() method'unu calistirir
        // method calisir , verilen "cennetBahcesi11" sifresinin uygun olup olmadigini inceler
        // ve true veya false dondurur
        // sout yapmadigimiz icin sonucu konsolda goremeyiz
        // ama bir degere atadigimiz icin kodun devaminda ister yazdirir,
        // istersek de farkli amaclar icin kullanabiliriz

        System.out.println("cennetBahcesi11 icin inceleme sonucu : " + sonuc);

    }


    public static boolean sifreUygunMu(String sifre){
        int flag = 10;

        //         - ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if ( ! Character.isLowerCase(ilkHarf) ){
            flag = 11;
        }

        //         - son karakter rakam olmali
        char sonKarakter = sifre.charAt(  sifre.length() -1 );

        if ( sonKarakter<'0' || sonKarakter>'9' ){
            flag = 11;
        }

        //         - sifre bosluk icermemeli
       if ( sifre.contains(" ") ){
            flag = 11;
        }

        //         - uzunlugu en az 10 karakter olmali
        if (  !(sifre.length() >= 10)  ){
            flag =11;
        }

        /*
            Sona gelindiginde, flag 10 veya 11 degerini alabilir
            flag == 10 ==> hic bir hata mesaji yazdirilmadi demektir
            flag == 11 ==> hata mesaji yazdirildi, ama kac mesaj yazdirildigini bilemeyiz
         */


        // return type void disinda bir data turu secilmis ise
        // method'un sonunda secilen data turune uygun BIR DEGER return edilmelidir
        if (flag == 10) {
            return true;
        }else {
            return false;
        }

    }

}
