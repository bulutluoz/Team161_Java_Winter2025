package day33_parametreliConstructor;

public class C02_Runner {

    public static void main(String[] args) {


        C01_Araba araba1 = new C01_Araba();

        System.out.println("araba1 " +araba1);
        // araba1 Ozellikler  : ilanNo=0, marka='Marka atanmadi', model='Model atanmadi', yil=1900, fiyat=0


        C01_Araba araba2 = new C01_Araba("BMW","5.20");
        System.out.println(araba2);


        C01_Araba araba3 = new C01_Araba(1001,"Nissan","Note");

        System.out.println("araba 3 " + araba3);

    }
}
