package day19_methodOlusturma;

public class C02_FaktoryelDegeriDondurme {

    public static void main(String[] args) {

//        System.out.println(faktoryelDegeri(3)); // 6
//        System.out.println(faktoryelDegeri(5)); // 120
        // verilen gorevde method'un calistigini kontrol edin demedigine gore
        // 7. ve 8.satirin kalmasina gerek yok
        // kodun calistigini gormek icin bu tur denemeler yapabiliriz
        // ama calistigini anladiktan sonra bu denemeleri silmek daha guzeldir

    }



    // verilen 17'den kucuk pozitif bir tamsayi icin
    // faktoryel degerini hesaplayip donduren bir method olusturun

    public static int faktoryelDegeri(int sayi){

        int faktoryel = 1 ;

        for (int i = sayi; i >=1 ; i--) {

            faktoryel *= i;

        }

        return faktoryel;

    }
}
