package day38_localDateTime;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {


        LocalTime yerelSaat = LocalTime.now();

        /*
         LocalTime Class'indaki now() method'u
         calistigi bilgisayardaki zamani alip kodun calistigi satira getirir

         ANCAAAAAKKKK bu method calistigi andaki degeri bize getirir
         bir kronometre gibi zamani tutmaya devam etmez

         yerelSaat degeri yeni bir atama olmadikca degismez
         */



        System.out.println("loop'dan once yerel saat : " + yerelSaat); // 19:48:48.559684   19:49:04.903377

        // asagidaki islemin kac saniyede bitirildigini yazdirin

        LocalTime baslangicSaati = LocalTime.now();
        System.out.println("loop'dan once baslangicSaati : " + baslangicSaati);

        String str = "";

        for (int i = 0; i <200000 ; i++) {
            str+=i;
        }

        LocalTime bitisSaati = LocalTime.now();
        System.out.println("loop'dan sonra yerel saat : " + yerelSaat);
        System.out.println("loop'dan sonra bitisSaati : " + bitisSaati);


    }
}
