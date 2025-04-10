package day42_inheritance;

public class C01_KissadanHisseler {

    /*
        Hayvanlar class'indan cikardigimiz sonuclar
        1- Baslangic itibariyle
           Child class'daki her obje
           Parent class'daki TUM OZELLIKLERE sahip olur

        2- Child class'lar
           parent class'daki ozellikleri
           kendilerine uyarlayip
           daha guncel hale getirebilirler

        3- Child class'lar
           parent class'da olmayan
           ama kendilerinde ortak olarak bulunan
           yeni ozellikler ekleyebilirler


           Bu ozellikler sonucunda

           parent class'da daha genel (Generic) ozellikler bulunurken
           child class'da Daha Guncel ve Daha Fazla bilgi OLABILIR
     */

    /*
        Mary'den cikardigimiz sonuclar
        1- Bir obje'nin tarif edildigi yere gore
           farkli isim veya sifatlari olabilir
           (Anne, kiz cocugu, hala, yonetici ... )

        2- Bir obje aldigi farkli sifatlara gore
           farkli ozellikler ( hak, yetki, sorumluluk)
           barindirabilirler
     */

    /*
        hastane orneginden cikan sonuclar

        1- IK ve Muhasebe gibi parent class'lar
           Child class'larin ortak ozelliklerini tutmak
           ve tekrarlardan kacinmak icin olusturulur

        2- Bu parent class'lardan obje olusturulmaz
           objeler en alttaki child class'lardan olusur
           (doktor, bashemsire, servis hemsiresi, poliklinik hemsiresi...)

        3- Parent class'lar guncel bilgiler tasimasa da
           tum child class'lari kapsarlar
           parent class'larda yapilacak degisiklikler
           butun child class'lari da kapsarlar

        4- Child class'daki bir obje
           ayni zamanda parent class'a da aittir
           eger child class'daki bir obje
           PARENT class'la ilgili bir islem yapiyorsa
           child class'daki ozelliklerini bir tarafa birakip
           parent class'daki tum objelerle ortak ozelliklerini kullanir
     */
}
