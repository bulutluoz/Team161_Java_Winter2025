package day38_localDateTime;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {


        LocalTime yerelSaat = LocalTime.now();

        // LocalTime Class'indaki now() method'u
        // calistigi bilgisayardaki zamani alip kodun calistigi satira getirir

        System.out.println(yerelSaat); // 19:48:48.559684   19:49:04.903377

        // asagidaki islemin kac saniyede bitirildigini yazdirin

        String str = "";

        for (int i = 0; i <100000 ; i++) {
            str+=i;
        }



    }
}
