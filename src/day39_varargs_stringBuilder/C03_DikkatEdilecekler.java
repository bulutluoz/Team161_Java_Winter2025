package day39_varargs_stringBuilder;

public class C03_DikkatEdilecekler {

    public static void main(String[] args) {
        // Kac tane argument yazarsak yazalim
        // ilk argument haric geriye kalanlari toplayip
        // bulunan toplam ile ilk argumanin carpimini yazdiran bir method olusturun

        islemYap(3,5,2); // (5+2) * 3 ==> 21
        islemYap(3,1); // (1) * 3 ==> 3
        islemYap(0,3,4,5,6,7,8); // (3+4+5+6+7+8) * 0 ==> 0



        islemYap(4); // geriyekalanlar ={}   Verilen argumentler islem yapmak icin uygun degil
        // islemYap();
        /*
            parametre olarak kullanilan bir varargs istenen sayida argument kabul eder
            eger varargs'a hic eleman yollanmazsa
            varargs'in degeri bos bir array olur
            CTE vermez (16 satir)

            AMMMAAAA varargs disindaki parametrelere deger atanmadiginda CTE olur
            (17 satir)
         */

    }


    public static void islemYap( int ilkSayi, int... geriyeKalanlar  ){

        int toplam = 0;

        for (int each:geriyeKalanlar){
            toplam+=each;
        }

        if (geriyeKalanlar.length == 0){
            System.out.println("Verilen argumentler islem yapmak icin uygun degil ");
        } else
            System.out.println("islem sonucu : " + ilkSayi*toplam);


    }
}
