package day38_localDateTime;

import java.time.LocalTime;

public class C03_IslemSuresiBulma {

    public static void main(String[] args) {

        // asagidaki islem icin islem suresini yazdirin

        // 1.yontem : loop'dan once ve sonra yerel saat olusturup farklarini bulalim

        LocalTime baslangic = LocalTime.now();


        String str = "";

        for (int i = 0; i <150000 ; i++) {
            str+=i;
        }

        LocalTime bitis = LocalTime.now();


        System.out.println("Baslangic saati : " + baslangic);
        System.out.println("Bitis saati : " + bitis);

        System.out.println("Saniye olarak fark : " +  (bitis.getSecond() - baslangic.getSecond())  );
        // Bu yontem saglikli calismayabilir
        // dakika ya da saat gecisi oldugunda -55 saniye gibi bir fark verebilir



        // 2.yontem :  gunun baslangicina gore saniyeler arasindaki farki bulabiliriz
        // gece yarisi 00:00'dan kodun calistigi zamana kadar gecen saniye miktarini verir

        System.out.println(baslangic.toSecondOfDay()); // 74397
        System.out.println(bitis.toSecondOfDay()); // 74399

        System.out.println("Calisma suresi saniye olarak : " + (bitis.toSecondOfDay() - baslangic.toSecondOfDay()));


        // 3.yontem :  Eger zaman farkini daha hassas olarak bulmak isterseniz
        // nanosaniye farkina bakabilirsiniz

        System.out.println("Calisma suresi nanosaniye olarak : " +
                (bitis.toNanoOfDay() - baslangic.toNanoOfDay()));



    }
}
