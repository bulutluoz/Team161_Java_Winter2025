package day32_constructors;

public class C04_KodOkumadaHatayaDusurulecekDurumlar {

    int sayi = 30;
    String isim = "Ali";

    C04_KodOkumadaHatayaDusurulecekDurumlar(){
        sayi = 20;
        isim = "Can";
    }

    C04_KodOkumadaHatayaDusurulecekDurumlar(String str){
        isim = isim.toUpperCase();
        sayi /= 2;
    }

    C04_KodOkumadaHatayaDusurulecekDurumlar(String a, int b){

        isim = a.substring(2);
        sayi = a.length();
    }


    public static void main(String[] args) {

        C04_KodOkumadaHatayaDusurulecekDurumlar obj3 = new C04_KodOkumadaHatayaDusurulecekDurumlar("Serpil",5);
        System.out.println(obj3.isim); // rpil
        System.out.println(obj3.sayi); // 6



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

        C04_KodOkumadaHatayaDusurulecekDurumlar obj2 = new C04_KodOkumadaHatayaDusurulecekDurumlar("Veli");

        System.out.println(obj2.isim); // ALI
        System.out.println(obj2.sayi); // 15
    }


}
