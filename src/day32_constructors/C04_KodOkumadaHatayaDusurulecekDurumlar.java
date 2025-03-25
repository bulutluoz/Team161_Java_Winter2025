package day32_constructors;

public class C04_KodOkumadaHatayaDusurulecekDurumlar {

    int sayi = 30;
    String isim = "Ali";

    C04_KodOkumadaHatayaDusurulecekDurumlar(){
        sayi = 20;
        isim = "Can";
    }


    public static void main(String[] args) {

        C04_KodOkumadaHatayaDusurulecekDurumlar obj1 = new C04_KodOkumadaHatayaDusurulecekDurumlar();

        /*
            Normal sartlarda
            parametresiz constructor gorunce
            "demek ki class level'da atanan degerlere sahip" diye dusunebilirsiniz

            AMMMMAAAA
            Kod okuma sorularinda
            kodlari satir satir takip etmedikce
            variable'larin degerlerinin ne olacagini bilemeyiz
         */

        System.out.println(obj1.isim); // Can
        System.out.println(obj1.sayi); // 20


    }


}
