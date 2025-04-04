package day38_localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_LocalDateTimeVeIstenenFormattaYazdirma {

    public static void main(String[] args) {


        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2025-04-04T21:18:35.189805


        // tarihi 4 April 25 formatinda yazdirin

        System.out.println(ldt.getDayOfMonth() + " " +
                           ldt.getMonth() + " " +
                           (ldt.getYear()-2000) ); // 4 APRIL 25


         /*
            format icin oncelikle istenen yazim biciminin
            String olarak bir modelini (pattern) olusturmalisiniz,
            sonrasinda istediginiz tarihi hazirladiginiz pattern'e uygun formatta yazdirabilirsiniz.

            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */



        // tarihi 04/04/2025 seklinde yazdirin
        // once istedigimiz zaman formatini Java'ya bildirmemiz gerekir
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldt.format(format1)); // 04/04/2025


        // tarihi 04 Apr 2025 seklinde yazdirin
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd MMM yyyy");

        System.out.println(ldt.format(format2)); // 04 Apr 2025


        // tarihi 4 4 25 seklinde yazdirin

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("d M yy");

        System.out.println(ldt.format(format3)); // 4 4 25


        // tarihi 04 Apr 2025 Friday seklinde yazdirin

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("dd MMM yyyy EEEE");

        System.out.println(ldt.format(format4)); // 04 Apr 2025 Friday


        // saati 21:23 seklinde yazdirin
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(ldt.format(format5)); // 21:38




        // saati 09:23 PM seklinde yazdirin
        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(ldt.format(format6)); // 09:40 PM


        // saati 9:23:35 PM seklinde yazdirin


        DateTimeFormatter format7 = DateTimeFormatter.ofPattern("h:mm:ss a");

        System.out.println(ldt.format(format7)); // 9:40:51 PM





    }
}
