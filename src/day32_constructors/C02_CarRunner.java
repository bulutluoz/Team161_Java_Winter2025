package day32_constructors;

public class C02_CarRunner {

    public static void main(String[] args) {


        C01_Car car1 = new C01_Car();

        // car1'in tum ozelliklerini yazdirin
        // Eger Car class'inda toString() yoksa
        // car1 objesini direkt yazdirirsaniz
        // objenin ozelliklerini degil, referansini yazdirir
        // objenin ozeliklerini isterseniz  TEK TEK yazdirmak gerekir

        // System.out.println(car1); // C01_Car@e580929
        System.out.println(car1.ilanNo);
        System.out.println(car1.marka);


        // Eger Car class'inda toString() olusturulursa
        // objeyi direkt yazdirdiginizda
        // secilen ozelliklerini yazdirir

        System.out.println(car1);

        car1.yil = 2010;
        car1.marka = "Volvo";

        System.out.println(car1);


        C01_Car car2 = new C01_Car();
        System.out.println("Car2 " + car2);

        // Car2 Ozellikler ==> ilanNo=0, marka='Marka atanmadi', model='Model atanmadi', yil=1900, fiyat=0

    }
}
