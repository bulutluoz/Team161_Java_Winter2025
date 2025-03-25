package day32_constructors;

public class C03_CarRunner {

    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println("Car1 " + car1);
        // Car1 Ozellikler ==> ilanNo=0, marka='Marka atanmadi', model='Model atanmadi', yil=1900, fiyat=0
        // obje olusturulurken default constructor kullanilirsa
        // C01 class'indaki instance variable degerlerine sahip
        // bir obje olusturur

        // car1 objesine ozellikleri tek tek atamaliyiz
        car1.marka = "Toyota";
        car1.model = "Corolla";
        car1.yil = 2010;
        car1.fiyat = 5000;
        car1.ilanNo = 1001;

        System.out.println("Car1 atanan " +car1);
        // Car1 atanan Ozellikler ==> ilanNo=1001, marka='Toyota', model='Corolla', yil=2010, fiyat=5000


        /*
            Olusturulan objenin istenen ozelliklere sahip olmasi icin
            MUTLAKA atama yapilmalidir

            ANCAKKKKK
            bu atamayi her obje icin tek tek yapmak yerine
            argument olarak constructor'a yollayip
            obje constructor'da olusturulurken
            atama islemini de aradan cikarabiliriz
         */

        C01_Car car2 = new C01_Car("Mercedes","E200",2000,3000,1002);

        System.out.println("Car2 "+car2);
        // Car2 Ozellikler ==> ilanNo=1002, marka='Mercedes', model='E200', yil=2000, fiyat=3000


        C01_Car car3 = new C01_Car("Opel","Corsa",2015, 5000,1003);
        System.out.println("Car3 " + car3);


    }
}
