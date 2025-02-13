package day04_dataCasting;

public class C02_ExplicitNarrowing {

    public static void main(String[] args) {


        int a  = 13;
        int b  = 4567;


//        byte c = a ;
//        byte d = b ;


        /*
            Java kodlari compile ederken (kodlari gozden gecirip, bilgisayarin anlayacagi 1 ve 0'lara dondururken)
            yani Run tusuna basmadan once
            SADECE syntax (yazim sekli) ile ilgilenir
            DEGERLERE bakmaz

            daha genis kapsamli data turundeki DEGERI
            daha dar kapsamli data turundeki VARIABLE'a atamak isterseniz
            Java bu islemi OTOMATIK OLARAK yapmaz

            EGER illa da yapalim derseniz
            Java sorumlulugu almanizi ister
            ve ne yapip eder, buyuk degeri kucuk kaba sigdirir

         */

        byte c = (byte)a ; // a'nin data turu int ama biz byte'a atamak istiyoruz
        byte d = (byte)b ;

        System.out.println("13'un byte variable'a atanmis hali : " + c); // 13
        System.out.println("4567'un byte variable'a atanmis hali : " + d); // -41


        double dbl1 = 74.3;
        float fl1 = 57.98F;

        int sayi1 = (int)dbl1;

        int sayi2 = (int)fl1;


        System.out.println("74.3'un int variable'a atanmis hali : " + sayi1); // 74
        System.out.println("57.98'in int variable'a atanmis hali : " + sayi2); // 57







    }
}
