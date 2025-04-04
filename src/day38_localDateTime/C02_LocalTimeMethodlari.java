package day38_localDateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTimeMethodlari {

    public static void main(String[] args) {

        LocalTime yerelSaat = LocalTime.now(); // calistigi sistemdeki zamani getirir
        System.out.println("yerel zaman : " + yerelSaat);

        LocalTime yerelSaatJaponya = LocalTime.now(ZoneId.of("Japan"));
        System.out.println("Japonya saati : " + yerelSaatJaponya);

        LocalTime yerelSaatNewyork = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println("Newyork saati : " + yerelSaatNewyork);

        LocalTime yerelSaatTurkiye= LocalTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Turkiye saati : " + yerelSaatTurkiye);


        // get...() method'lari
        // saatin istenen bolumunu getirir
        System.out.println(yerelSaat.getHour());
        System.out.println(yerelSaat.getMinute());


        // with...() method'lari
        // saatin istenen bolumunu verilen deger olarak degistirir
        System.out.println(yerelSaat.withMinute(0)); // 20:00:24.913199
        System.out.println(yerelSaat.withSecond(0).withNano(0)); // 20:22

        // plus...() ve minus...() method'lari
        // zamanda istenen kadar ileri veya geri goturur
        System.out.println(yerelSaat.plusHours(100).plusMinutes(12));
        System.out.println(yerelSaat.minusMinutes(12500));


        System.out.println(yerelSaatTurkiye.isBefore(yerelSaatNewyork)); // false
        System.out.println(yerelSaatTurkiye.isAfter(yerelSaatNewyork)); // true

    }
}
