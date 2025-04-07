package day39_varargs_stringBuilder;

import day33_parametreliConstructor.C01_Araba;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_StringBuilder {

    public static void main(String[] args) {

        String str = "Java Candir";

        Scanner scanner = new Scanner(System.in);

        List<Integer> liste = new ArrayList<>();

        LocalDate tarih = LocalDate.of(2025,9,23);

        C01_Araba araba = new C01_Araba(101,"Toyota","Corolla",2020,15000);

        /*
            String deger atamanin kolay olmasi acisindan cok kullanislidir
            ANNCCCAAAKKK String immutable oldugundan dolayi
            her yeni deger atandiginda eski obje cope gider
            ve yeni obje olusturulur
            bu durum cok data kullanan uygulamalar icin negatif bir sonuc olusturur
         */

        StringBuilder sb = new StringBuilder("Java guzeldir");
        StringBuffer sbf = new StringBuffer("Hem de cok guzel");

    }
}
