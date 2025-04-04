package day38_localDateTime;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class C04_LocalDate {

    public static void main(String[] args) {

        LocalDate tarihAmsterdam = LocalDate.now();
        System.out.println("Tarih Amsterdam : " + tarihAmsterdam);


        LocalDate tarihTokyo = LocalDate.now(ZoneId.of("Japan"));
        System.out.println("Tarih Tokyo : " + tarihTokyo);


        LocalDate tarihNewyork = LocalDate.now(ZoneId.of("America/New_York"));
        System.out.println("Tarih Newyork : " + tarihNewyork);

        // verilen iki dogum tarihinin hangisinin once oldugu bulalim

        LocalDate dogumTarihi1 = LocalDate.of(1990,3,23);
        LocalDate dogumTarihi2 = LocalDate.of(1990, Month.MARCH,15);

        System.out.println(dogumTarihi2.isBefore(dogumTarihi1)); // true


        // 1980 artik yil mi ?
        LocalDate tarih3 = LocalDate.of(1980,1,23);
        System.out.println(tarih3.isLeapYear()); // true



        // dogum tarihi verilen kisinin yasini bulun
        System.out.println(tarih3.until(tarihAmsterdam)); // P 45Y 2M 12D

        System.out.println(tarihAmsterdam.getMonth()); // APRIL
        System.out.println(tarihAmsterdam.getMonthValue()); // 4
        System.out.println(tarihAmsterdam.getDayOfYear()); // 94

        System.out.println(tarihAmsterdam.lengthOfMonth()); // 30

        System.out.println(tarihAmsterdam.lengthOfYear()); // 365
        System.out.println(tarih3.lengthOfYear()); // 366




    }
}
