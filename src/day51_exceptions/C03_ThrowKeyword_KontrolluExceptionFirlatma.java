package day51_exceptions;

import java.util.Random;
import java.util.Scanner;

public class C03_ThrowKeyword_KontrolluExceptionFirlatma {

    public static void main(String[] args) {

        // throws(firlatir) keyword : bir method'da exception riski bulundugunu
        //                            ve istenmeyen bir deger girilirse exception firlatacagini bildirir
        //                            method signature'da yazilir
        //                            bir method'da sadece 1 throws yazilir, risk birden fazla ise
        //                             virgulle tum exception'lar yazilabilir


        // throw(firlat) keyword   : bir method icinde istendigi durumda
        //                          riskli bir kod olmadan exception firlatmamizi saglar


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();

        // kullanim sebebi
        // 1- kod icerisinde istenmeyen bir durum oldugunda kodun calismasini durdurmak

        /*
        if (yas >= 0){
            // kodun calismasi icin 300 satir kodu buraya yazmamiz gerekir
            // ama bu clean kod acisindan cok guzel olmaz
            // bunun yerine sadece 1 satir calismasini istedigim kodu buraya yaziyorum
            System.out.println("10 sene sonra " + (yas +10) + " yasinda olacaksiniz");
        } else {
            // buraya "bu satirdan sonrasini calistirma " demek istiyorum
            throw new RuntimeException("Kardesim yas negatif olur mu ?");
        }

        System.out.println("if elsin disi1");
        System.out.println("if elsin disi2");
        System.out.println("if elsin disi3");
        // devaminda 300 satir daha kod var
        // eger kullanici negatif bir sayi girerse sonraki 300 satiri calistirmasin ve
        // kodun calismasini durdursun


         */


        // 2- kod'un calismasi durmasin ama kullaniciya guclu bir uyari verelim
        /*
        try {
            if (yas<0) throw new IllegalArgumentException("Yas'in eksi oldugu nerede gorulmus...");

        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }

        System.out.println("try-catch disi 1");
        System.out.println("try-catch disi 2");
        System.out.println("try-catch disi 3");
        */


        // 3- belirli satirlarin calistirilmamasini isterseniz
        //    ornek sonraki class'da




    }
}
